package com.way.common.plugins.mbg_plugins.page;

import java.util.List;

import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

/**
 * 
 * @author Administrator
 * @date 2016-7-21
 * @description page method generate
 */
public class PaginationPlugin extends PluginAdapter {

	@Override
	public boolean validate(List<String> warnings) {
		return true;
	}

	@Override
	public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		// Mapper注解
		interfaze.addAnnotation("@Repository");
		interfaze.addImportedType(new FullyQualifiedJavaType("org.springframework.stereotype.Repository"));

		// 分页方法接口
		Method method = new Method("selectByPage");
		method.setVisibility(JavaVisibility.PUBLIC);
		FullyQualifiedJavaType fqjt = new FullyQualifiedJavaType("java.util.List");
		fqjt.addTypeArgument(new FullyQualifiedJavaType(introspectedTable.getBaseRecordType()));
		method.setReturnType(fqjt);
		method.addParameter(new Parameter(new FullyQualifiedJavaType("com.appleframework.model.page.Pagination"),
				"page", "@Param(\"page\")"));
		method.addParameter(new Parameter(new FullyQualifiedJavaType(introspectedTable.getExampleType()), "example",
				"@Param(\"example\")"));
		interfaze.addMethod(method);
		return true;
	}

	@Override
	public boolean sqlMapGenerated(GeneratedXmlFile sqlMap, IntrospectedTable introspectedTable) {
		// select语句
		XmlElement sql = new XmlElement("select");
		sql.addAttribute(new Attribute("id", "selectByPage"));
		sql.addAttribute(new Attribute("parameterType", "map"));
		sql.addAttribute(new Attribute("resultMap", introspectedTable.getBaseResultMapId()));
		sql.addElement(new TextElement("select * from " + introspectedTable.getFullyQualifiedTableNameAtRuntime()));
		// 查询条件
		XmlElement ifExample = new XmlElement("if");
		ifExample.addAttribute(new Attribute("test", "example != null"));
		XmlElement whereClause = new XmlElement("include");
		whereClause.addAttribute(new Attribute("refid", introspectedTable.getExampleWhereClauseId()));
		ifExample.addElement(whereClause);
		return true;
	}
}
