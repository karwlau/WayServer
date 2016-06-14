package com.way.common.pay_api.base;

public abstract class PayField {
	public String code;
	public String name;

	protected PayField(String code, String name) {
		this.code = code;
		this.name = name;
	}
}
