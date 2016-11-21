package com.way.framework.model.orm.interceptor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.ibatis.binding.BindingException;
import org.apache.ibatis.executor.ErrorContext;
import org.apache.ibatis.executor.ExecutorException;
import org.apache.ibatis.executor.statement.BaseStatementHandler;
import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.ParameterMode;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.property.PropertyTokenizer;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.type.TypeHandler;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.apache.log4j.Logger;

import com.way.framework.model.Pagination;
import com.way.framework.model.parse.SqlParser;
import com.way.framework.model.query.PageQuery;
import com.way.framework.model.utils.SystemUtility;

@Intercepts({
		@Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class, Integer.class }) })
public class PageInterceptor implements Interceptor {

	private static Logger logger = Logger.getLogger(PageInterceptor.class);
	private String dialect = "mysql";

	@Override
	public Object intercept(Invocation ivk) throws Throwable {
		if (!(ivk.getTarget() instanceof RoutingStatementHandler)) {
			return ivk.proceed();
		}
		RoutingStatementHandler handler = (RoutingStatementHandler) ivk.getTarget();
		BaseStatementHandler delegate = (BaseStatementHandler) SystemUtility.getValueByFieldName(handler, "delegate");
		MappedStatement statement = (MappedStatement) SystemUtility.getValueByFieldName(delegate, "mappedStatement");

		BoundSql boundSql = delegate.getBoundSql();

		Object parameterObject = boundSql.getParameterObject();
		Pagination page = null;
		if (parameterObject instanceof PageQuery) {
			PageQuery query = (PageQuery) parameterObject;
			page = query.getDefaultPage();
		} else if (parameterObject instanceof Map) {
			Map<String, Object> query = (Map) parameterObject;
			try {
				page = (Pagination) query.get("page");
			} catch (BindingException e) {
				page = null;
			}
			if (null == page) {
				return ivk.proceed();
			}
		} else {
			return ivk.proceed();
		}
		logger.debug("page sql begin");

		Connection connection = (Connection) ivk.getArgs()[0];
		String sql = boundSql.getSql();

		String countSql = null;
		// FIXME database type
		countSql = SqlParser.getSimpleCountSql(sql);
		PreparedStatement countStmt = connection.prepareStatement(countSql);
		BoundSql countBs = new BoundSql(statement.getConfiguration(), countSql, boundSql.getParameterMappings(),
				parameterObject);
		setParameters(countStmt, statement, countBs, parameterObject);
		ResultSet rs = countStmt.executeQuery();
		int count = 0;
		if (rs.next()) {
			count = rs.getInt(1);
		}
		rs.close();
		countStmt.close();

		page.setTotalNum(count);
		// FIXME adjustPageNo
		// page.adjustPageNo();

		return ivk.proceed();
	}

	@Override
	public Object plugin(Object arg0) {
		return Plugin.wrap(arg0, this);
	}

	@Override
	public void setProperties(Properties p) {

	}

	private void setParameters(PreparedStatement ps, MappedStatement mappedStatement, BoundSql boundSql,
			Object parameterObject) throws SQLException {
		ErrorContext.instance().activity("setting parameters").object(mappedStatement.getParameterMap().getId());
		List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
		if (parameterMappings != null) {
			Configuration configuration = mappedStatement.getConfiguration();
			TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();
			MetaObject metaObject = parameterObject == null ? null : configuration.newMetaObject(parameterObject);
			for (int i = 0; i < parameterMappings.size(); i++) {
				ParameterMapping parameterMapping = (ParameterMapping) parameterMappings.get(i);
				if (parameterMapping.getMode() != ParameterMode.OUT) {
					String propertyName = parameterMapping.getProperty();
					PropertyTokenizer prop = new PropertyTokenizer(propertyName);
					Object value;
					if (parameterObject == null) {
						value = null;
					} else {
						if (typeHandlerRegistry.hasTypeHandler(parameterObject.getClass())) {
							value = parameterObject;
						} else {
							if (boundSql.hasAdditionalParameter(propertyName)) {
								value = boundSql.getAdditionalParameter(propertyName);
							} else if ((propertyName.startsWith("__frch_"))
									&& (boundSql.hasAdditionalParameter(prop.getName()))) {
								value = boundSql.getAdditionalParameter(prop.getName());
								if (value != null) {
									value = configuration.newMetaObject(value)
											.getValue(propertyName.substring(prop.getName().length()));
								}
							} else {
								value = metaObject == null ? null : metaObject.getValue(propertyName);
							}
						}
					}
					TypeHandler typeHandler = parameterMapping.getTypeHandler();
					if (typeHandler == null) {
						throw new ExecutorException("There was no TypeHandler found for parameter " + propertyName
								+ " of statement " + mappedStatement.getId());
					}
					typeHandler.setParameter(ps, i + 1, value, parameterMapping.getJdbcType());
				}
			}
		}
	}
}
