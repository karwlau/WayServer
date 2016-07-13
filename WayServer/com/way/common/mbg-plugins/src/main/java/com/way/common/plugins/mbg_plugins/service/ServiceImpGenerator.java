package com.way.common.plugins.mbg_plugins.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.config.Context;

import com.way.common.plugins.mbg_plugins.service.constants.TypeName;

public class ServiceImpGenerator extends TopLevelClass {

	static Map<TypeName, FullyQualifiedJavaType> TYPES = new HashMap<TypeName, FullyQualifiedJavaType>();
	static String findMethodCode = "List<recordType> list = serviceBean.selectByPage(page,example);page.setList(list);return page;";
	static {
		// 类型
		TYPES.put(TypeName.PAGE, new FullyQualifiedJavaType("com.appleframework.model.page.Pagination"));
		TYPES.put(TypeName.LONG, new FullyQualifiedJavaType("java.lang.Long"));
		// 代码
	}

	private ServiceImpGenerator(FullyQualifiedJavaType type) {
		super(type);
	}

	public ServiceImpGenerator(Context context, IntrospectedTable introspectedTable, String type) {
		this(new FullyQualifiedJavaType(type));

		TYPES.put(TypeName.RECORD, new FullyQualifiedJavaType(introspectedTable.getBaseRecordType()));
		TYPES.put(TypeName.EXAMPLE, new FullyQualifiedJavaType(introspectedTable.getExampleType()));
		
		this.setVisibility(JavaVisibility.PUBLIC);
		this.findMethodGenerate(introspectedTable);
		this.getMethodGenerate(introspectedTable);
		this.saveMethodgeenerate(introspectedTable);
		this.updateMethodgeenerate(introspectedTable);
		this.deleteMethodgeenerate(introspectedTable);
	}

	private void findMethodGenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("findByPage");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(TYPES.get(TypeName.PAGE));
		method.addParameter(new Parameter(TYPES.get(TypeName.PAGE), "page"));
		method.addParameter(new Parameter(TYPES.get(TypeName.RECORD), "info"));
		method.addBodyLine(findMethodCode.replaceAll("recordType", TYPES.get(TypeName.RECORD).getShortName())
				.replaceAll("serviceBean", TYPES.get(TypeName.RECORD).getShortName() + "Service"));
		this.addMethod(method);
	}

	private void getMethodGenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("getById");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(TYPES.get(TypeName.RECORD));
		method.addParameter(new Parameter(TYPES.get(TypeName.LONG), "id"));
		this.addMethod(method);
	}

	private void saveMethodgeenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("save");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(TYPES.get(TypeName.RECORD));
		method.addParameter(new Parameter(TYPES.get(TypeName.RECORD), "record"));
		this.addMethod(method);
	}

	private void updateMethodgeenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("update");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(TYPES.get(TypeName.RECORD));
		method.addParameter(new Parameter(TYPES.get(TypeName.RECORD), "record"));
		this.addMethod(method);
	}

	private void deleteMethodgeenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("delete");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(TYPES.get(TypeName.LONG));
		method.addParameter(new Parameter(TYPES.get(TypeName.LONG), "id"));
		this.addMethod(method);
	}

}
