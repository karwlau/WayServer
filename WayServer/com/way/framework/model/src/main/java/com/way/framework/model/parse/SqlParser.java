package com.way.framework.model.parse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import net.sf.jsqlparser.expression.Alias;
import net.sf.jsqlparser.expression.Function;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.select.FromItem;
import net.sf.jsqlparser.statement.select.Join;
import net.sf.jsqlparser.statement.select.LateralSubSelect;
import net.sf.jsqlparser.statement.select.OrderByElement;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.select.SelectBody;
import net.sf.jsqlparser.statement.select.SelectExpressionItem;
import net.sf.jsqlparser.statement.select.SelectItem;
import net.sf.jsqlparser.statement.select.SetOperationList;
import net.sf.jsqlparser.statement.select.SubJoin;
import net.sf.jsqlparser.statement.select.SubSelect;
import net.sf.jsqlparser.statement.select.ValuesList;
import net.sf.jsqlparser.statement.select.WithItem;

public class SqlParser {

	public static final String MYSQL_CACHE_CHAR = "/*!SQL_CACHE */";
	private static final List<SelectItem> COUNT_ITEM = new ArrayList();
	private static final Alias TABLE_ALIAS;

	static {
		COUNT_ITEM.add(new SelectExpressionItem(new Column("count(*)")));

		TABLE_ALIAS = new Alias("table_count");
		TABLE_ALIAS.setUseAs(false);
	}

	private static Map<String, String> CACHE = new ConcurrentHashMap();

	public static void isSupportedSql(String sql) {
		if (sql.trim().toUpperCase().endsWith("FOR UPDATE")) {
			throw new RuntimeException("分页插件不支持包含for update的sql");
		}
	}

	public static String getSmartCountSql(String sql) {
		isSupportedSql(sql);
		if (CACHE.get(sql) != null) {
			return (String) CACHE.get(sql);
		}
		Statement stmt = null;
		try {
			stmt = CCJSqlParserUtil.parse(sql);
		} catch (Throwable e) {
			String countSql = getSimpleCountSql(sql);
			CACHE.put(sql, countSql);
			return countSql;
		}
		Select select = (Select) stmt;
		SelectBody selectBody = select.getSelectBody();

		processSelectBody(selectBody);

		processWithItemsList(select.getWithItemsList());

		sqlToCount(select);
		String result = select.toString();
		CACHE.put(sql, result);
		return result;
	}

	public static String getSimpleCountSql(String sql) {
		isSupportedSql(sql);
		StringBuilder stringBuilder = new StringBuilder(sql.length() + 40);
		stringBuilder.append("select count(*) from (");
		stringBuilder.append(sql);
		stringBuilder.append(") tmp_count");
		return stringBuilder.toString();
	}

	public static String getCacheCountSql(String sql) {
		isSupportedSql(sql);
		StringBuilder stringBuilder = new StringBuilder(sql.length() + 40);
		stringBuilder.append("select ");
		stringBuilder.append("/*!SQL_CACHE */");
		stringBuilder.append(" count(*) from (");
		stringBuilder.append(sql);
		stringBuilder.append(") tmp_count");
		return stringBuilder.toString();
	}

	public static void sqlToCount(Select select) {
		SelectBody selectBody = select.getSelectBody();
		if (((selectBody instanceof PlainSelect)) && (isSimpleCount((PlainSelect) selectBody))) {
			((PlainSelect) selectBody).setSelectItems(COUNT_ITEM);
		} else {
			PlainSelect plainSelect = new PlainSelect();
			SubSelect subSelect = new SubSelect();
			subSelect.setSelectBody(selectBody);
			subSelect.setAlias(TABLE_ALIAS);
			plainSelect.setFromItem(subSelect);
			plainSelect.setSelectItems(COUNT_ITEM);
			select.setSelectBody(plainSelect);
		}
	}

	public static boolean isSimpleCount(PlainSelect select) {
		if (select.getGroupByColumnReferences() != null) {
			return false;
		}
		if (select.getDistinct() != null) {
			return false;
		}
		for (SelectItem item : select.getSelectItems()) {
			if (item.toString().contains("?")) {
				return false;
			}
			if (((item instanceof SelectExpressionItem))
					&& ((((SelectExpressionItem) item).getExpression() instanceof Function))) {
				return false;
			}
		}
		return true;
	}

	public static void processSelectBody(SelectBody selectBody) {
		if ((selectBody instanceof PlainSelect)) {
			processPlainSelect((PlainSelect) selectBody);
		} else if ((selectBody instanceof WithItem)) {
			WithItem withItem = (WithItem) selectBody;
			if (withItem.getSelectBody() != null) {
				processSelectBody(withItem.getSelectBody());
			}
		} else {
			SetOperationList operationList = (SetOperationList) selectBody;
			if ((operationList.getSelects() != null) && (operationList.getSelects().size() > 0)) {
				List<SelectBody> plainSelects = operationList.getSelects();
				for (SelectBody plainSelect : plainSelects) {
					processPlainSelect((PlainSelect) plainSelect);
				}
			}
			if (!orderByHashParameters(operationList.getOrderByElements())) {
				operationList.setOrderByElements(null);
			}
		}
	}

	public static void processPlainSelect(PlainSelect plainSelect) {
		if (!orderByHashParameters(plainSelect.getOrderByElements())) {
			plainSelect.setOrderByElements(null);
		}
		if (plainSelect.getFromItem() != null) {
			processFromItem(plainSelect.getFromItem());
		}
		if ((plainSelect.getJoins() != null) && (plainSelect.getJoins().size() > 0)) {
			List<Join> joins = plainSelect.getJoins();
			for (Join join : joins) {
				if (join.getRightItem() != null) {
					processFromItem(join.getRightItem());
				}
			}
		}
	}

	public static void processWithItemsList(List<WithItem> withItemsList) {
		if ((withItemsList != null) && (withItemsList.size() > 0)) {
			for (WithItem item : withItemsList) {
				processSelectBody(item.getSelectBody());
			}
		}
	}

	public static void processFromItem(FromItem fromItem) {
		if ((fromItem instanceof SubJoin)) {
			SubJoin subJoin = (SubJoin) fromItem;
			if ((subJoin.getJoin() != null) && (subJoin.getJoin().getRightItem() != null)) {
				processFromItem(subJoin.getJoin().getRightItem());
			}
			if (subJoin.getLeft() != null) {
				processFromItem(subJoin.getLeft());
			}
		} else if ((fromItem instanceof SubSelect)) {
			SubSelect subSelect = (SubSelect) fromItem;
			if (subSelect.getSelectBody() != null) {
				processSelectBody(subSelect.getSelectBody());
			}
		} else if (!(fromItem instanceof ValuesList)) {
			if ((fromItem instanceof LateralSubSelect)) {
				LateralSubSelect lateralSubSelect = (LateralSubSelect) fromItem;
				if (lateralSubSelect.getSubSelect() != null) {
					SubSelect subSelect = lateralSubSelect.getSubSelect();
					if (subSelect.getSelectBody() != null) {
						processSelectBody(subSelect.getSelectBody());
					}
				}
			}
		}
	}

	public static boolean orderByHashParameters(List<OrderByElement> orderByElements) {
		if (orderByElements == null) {
			return false;
		}
		for (OrderByElement orderByElement : orderByElements) {
			if (orderByElement.toString().contains("?")) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String sql = "select * from c_contacts where is_delete=0 order by company_id asc ";
		System.out.println(getSimpleCountSql(sql));
		System.out.println(getSmartCountSql(sql));
		System.out.println(getCacheCountSql(sql));
	}
}
