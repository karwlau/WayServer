package com.way.common.plugins.mbg_plugins.utils.constants;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Parameter;

public enum SType {
	PAGE("com.appleframework.model.page.Pagination", "page"),

	LONG("java.lang.Long", "id"),

	LIST("java.util.List", "list"),
	
	DATE("java.util.Date"),

	ANO_REPOSITORY("org.springframework.stereotype.Repository"),
	
	ANO_PARAM("org.apache.ibatis.annotations.Param"),
	
	ANO_SERVICE("org.springframework.stereotype.Service"),
	
	ANO_RESOURCE("javax.annotation.Resource"),

	RECORD, EXAMPLE, MAPPER, EXT_MAPPER, SERVICE, SERVICE_IMPL;

	private String name;// 实体名
	private String shortType;// 简短类名
	private String type;// 全类名

	public FullyQualifiedJavaType getFQJType() {
		return new FullyQualifiedJavaType(this.type);
	}

	public Parameter getParam() {
		Parameter param = new Parameter(this.getFQJType(), this.getName());
		return param;
	}

	public static void initRecord(IntrospectedTable introspectedTable) {
		RECORD.setTypeName(introspectedTable.getBaseRecordType(), "record");
		EXAMPLE.setTypeName(introspectedTable.getExampleType(), "example");
		MAPPER.setType(introspectedTable.getMyBatis3JavaMapperType());
		// Extend Mapper
		String[] mapperPath = MAPPER.getType().split("\\.");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < mapperPath.length - 1; i++) {
			sb.append(mapperPath[i]);
			sb.append(".");
		}
		sb.append("extend.");
		sb.append(mapperPath[mapperPath.length - 1].replace("Mapper", "ExtendMapper"));
		EXT_MAPPER.setType(sb.toString());
		// Service
		String servicePath = introspectedTable.getContext().getProperty("service_path");
		SERVICE.setType(servicePath + "." + RECORD.getShortType() + "Service");
		// Service Implementation
		String serviceImplPath = introspectedTable.getContext().getProperty("serviceImpl_path");
		SERVICE_IMPL.setType(serviceImplPath + "." + RECORD.getShortType() + "ServiceImpl");

	}

	SType() {
	}

	SType(String type) {
		this.setType(type);
	}

	SType(String type, String name) {
		this.setTypeName(type, name);
	}

	void setTypeName(String type, String name) {
		this.setType(type);
		this.name = name;
	}

	void setType(String type) {
		this.type = type;
		String[] spl = this.type.split("\\.");
		this.shortType = spl[spl.length - 1];
		this.name = this.shortType.substring(0, 1).toLowerCase() + this.shortType.substring(1, this.shortType.length());
	}

	public String getName() {
		return name;
	}

	public String getShortType() {
		return shortType;
	}

	public String getType() {
		return type;
	}
}
