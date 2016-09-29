package com.way.utils.poi.model;

public class Value {
	public enum ValueType {
		NUMBER, STRING, DATE, TIME, DATETIME, PERCNET, SPECIFY_DATE
	}

	public String value;
	public ValueType vType;
	public String format;

	public Value(String value, ValueType vType) {
		this.value = value;
		this.vType = vType;
	}

	public Value(String value, ValueType vType, String format) {
		this.value = value;
		this.vType = vType;
		this.format = format;
	}
}
