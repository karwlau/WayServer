package com.way.common.plugins.mbg_plugins.service.constants;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Parameter;

public class MbgType {
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

	public MbgType(String type) {
		this.type = type;
		String[] spl = this.type.split("\\.");
		this.shortType = spl[spl.length - 1];
		this.name = this.shortType.substring(0, 1).toLowerCase() + this.shortType.substring(1, this.shortType.length());
	}

	public MbgType(String type, String name) {
		this.type = type;
		String[] spl = this.type.split("\\.");
		this.shortType = spl[spl.length - 1];
		this.name = name;
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
