package com.way.common.plugins.mbg_plugins.service;

import java.util.Map;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.config.Context;

import com.way.common.plugins.mbg_plugins.service.constants.MbgType;
import com.way.common.plugins.mbg_plugins.service.constants.TypeName;

public class ServiceIntGenerator extends Interface {

	Map<TypeName, MbgType> MTYPES;

	private ServiceIntGenerator(FullyQualifiedJavaType type) {
		super(type);
	}

	public ServiceIntGenerator(Context context, IntrospectedTable introspectedTable, Map<TypeName, MbgType> MTYPES) {
		this(new FullyQualifiedJavaType(MTYPES.get(TypeName.SERVICE).getType()));
		this.MTYPES = MTYPES;

		// import
		this.addImportedType(MTYPES.get(TypeName.PAGE).getFQJType());
		this.addImportedType(MTYPES.get(TypeName.RECORD).getFQJType());

		// method
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
		method.setReturnType(MTYPES.get(TypeName.PAGE).getFQJType());
		method.addParameter(MTYPES.get(TypeName.PAGE).getParam());
		method.addParameter(MTYPES.get(TypeName.RECORD).getParam());
		this.addMethod(method);
	}

	private void getMethodGenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("getById");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(MTYPES.get(TypeName.RECORD).getFQJType());
		method.addParameter(MTYPES.get(TypeName.LONG).getParam());
		this.addMethod(method);
	}

	private void saveMethodgeenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("save");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(MTYPES.get(TypeName.RECORD).getFQJType());
		method.addParameter(MTYPES.get(TypeName.RECORD).getParam());
		this.addMethod(method);
	}

	private void updateMethodgeenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("update");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(MTYPES.get(TypeName.RECORD).getFQJType());
		method.addParameter(MTYPES.get(TypeName.RECORD).getParam());
		this.addMethod(method);
	}

	private void deleteMethodgeenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("delete");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(MTYPES.get(TypeName.LONG).getFQJType());
		method.addParameter(MTYPES.get(TypeName.LONG).getParam());
		this.addMethod(method);
	}

}
