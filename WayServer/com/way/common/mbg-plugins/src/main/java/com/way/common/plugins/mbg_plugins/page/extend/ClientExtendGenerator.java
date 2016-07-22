package com.way.common.plugins.mbg_plugins.page.extend;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.config.Context;

import com.way.common.plugins.mbg_plugins.utils.constants.SType;

public class ClientExtendGenerator extends Interface {

	private ClientExtendGenerator(FullyQualifiedJavaType type) {
		super(type);
	}

	public ClientExtendGenerator(Context context, IntrospectedTable introspectedTable) {
		this(new FullyQualifiedJavaType(SType.EXT_MAPPER.getType()));
		// import
		this.addImportedType(SType.PAGE.getFQJType());
		this.addImportedType(SType.RECORD.getFQJType());
		this.addImportedType(SType.LIST.getFQJType());
		this.addImportedType(SType.LIST.getFQJType());
		this.addImportedType(SType.ANO_PARAM.getFQJType());

		// general
		this.setVisibility(JavaVisibility.PUBLIC);

		// method
		this.methodSelectByPageGenerated(introspectedTable);
	}

	public void methodSelectByPageGenerated(IntrospectedTable introspectedTable) {
		// Mapper annotation
		this.addAnnotation("@Repository");
		this.addImportedType(SType.ANO_REPOSITORY.getFQJType());

		Method method = new Method("selectByPage");
		method.setVisibility(JavaVisibility.PUBLIC);
		FullyQualifiedJavaType listType = SType.LIST.getFQJType();
		listType.addTypeArgument(SType.RECORD.getFQJType());
		method.setReturnType(listType);
		method.addParameter(new Parameter(SType.PAGE.getFQJType(), "page", "@Param(\"page\")"));
		method.addParameter(new Parameter(SType.RECORD.getFQJType(), "info", "@Param(\"info\")"));
		this.addMethod(method);
		return;
	}
}
