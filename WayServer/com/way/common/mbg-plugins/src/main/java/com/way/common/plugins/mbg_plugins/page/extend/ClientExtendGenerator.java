package com.way.common.plugins.mbg_plugins.page.extend;

import java.util.Map;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.config.Context;

import com.way.common.plugins.mbg_plugins.service.constants.MbgType;
import com.way.common.plugins.mbg_plugins.service.constants.TypeName;

public class ClientExtendGenerator extends Interface {

	Map<TypeName, MbgType> MTYPES;

	private ClientExtendGenerator(FullyQualifiedJavaType type) {
		super(type);
	}

	public ClientExtendGenerator(Context context, IntrospectedTable introspectedTable, Map<TypeName, MbgType> MTYPES) {
		this(new FullyQualifiedJavaType(MTYPES.get(TypeName.EXT_MAPPER).getType()));
		this.MTYPES = MTYPES;

		// import
		this.addImportedType(MTYPES.get(TypeName.PAGE).getFQJType());
		this.addImportedType(MTYPES.get(TypeName.RECORD).getFQJType());
		this.addImportedType(MTYPES.get(TypeName.LIST).getFQJType());

		// general
		this.setVisibility(JavaVisibility.PUBLIC);

		// method
		this.methodSelectByPageGenerated(introspectedTable);
	}

	public void methodSelectByPageGenerated(IntrospectedTable introspectedTable) {
		// Mapper annotation
		this.addAnnotation("@Repository");
		this.addImportedType(new FullyQualifiedJavaType("org.springframework.stereotype.Repository"));

		Method method = new Method("selectByPage");
		method.setVisibility(JavaVisibility.PUBLIC);
		FullyQualifiedJavaType listType = MTYPES.get(TypeName.LIST).getFQJType();
		listType.addTypeArgument(new FullyQualifiedJavaType(introspectedTable.getBaseRecordType()));
		method.setReturnType(listType);
		method.addParameter(new Parameter(MTYPES.get(TypeName.PAGE).getFQJType(), "page", "@Param(\"page\")"));
		method.addParameter(new Parameter(MTYPES.get(TypeName.RECORD).getFQJType(), "info", "@Param(\"info\")"));
		this.addMethod(method);
		return;
	}
}
