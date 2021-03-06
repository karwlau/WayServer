package com.way.common.plugins.mbg_plugins.service;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.config.Context;

import com.way.common.plugins.mbg_plugins.utils.constants.SType;



public class ServiceIntGenerator extends Interface {

	private ServiceIntGenerator(FullyQualifiedJavaType type) {
		super(type);
	}

	public ServiceIntGenerator(Context context, IntrospectedTable introspectedTable) {
		this(SType.SERVICE.getFQJType());
		
		// import
		this.addImportedType(SType.PAGE.getFQJType());
		this.addImportedType(SType.LIST.getFQJType());
		this.addImportedType(SType.RECORD.getFQJType());

		// method
		this.setVisibility(JavaVisibility.PUBLIC);
		this.findMethodGenerate(introspectedTable);
		this.getMethodGenerate(introspectedTable);
		this.saveMethodGenerate(introspectedTable);
		this.updateMethodGenerate(introspectedTable);
		this.deleteMethodGenerate(introspectedTable);
		this.listMethodGenerate(introspectedTable);
	}

	private void listMethodGenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("findByList");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(SType.LIST.getFQJType());
		method.addParameter(SType.RECORD.getParam());
		this.addMethod(method);
	}

	private void findMethodGenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("findByPage");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(SType.PAGE.getFQJType());
		method.addParameter(SType.PAGE.getParam());
		method.addParameter(SType.RECORD.getParam());
		this.addMethod(method);
	}

	private void getMethodGenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("getById");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(SType.RECORD.getFQJType());
		method.addParameter(SType.LONG.getParam());
		this.addMethod(method);
	}

	private void saveMethodGenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("save");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(SType.RECORD.getFQJType());
		method.addParameter(SType.RECORD.getParam());
		this.addMethod(method);
	}

	private void updateMethodGenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("update");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(SType.RECORD.getFQJType());
		method.addParameter(SType.RECORD.getParam());
		this.addMethod(method);
	}

	private void deleteMethodGenerate(IntrospectedTable introspectedTable) {
		Method method = new Method("delete");
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setReturnType(SType.LONG.getFQJType());
		method.addParameter(SType.LONG.getParam());
		this.addMethod(method);
	}

}
