package com.way.common.pay_api.alipay.constants;

import com.way.common.pay_api.base.PayField;

public final class AlipayField extends PayField {
	private AlipayField(String code, String name) {
		super(code, name);
	}

	public final static AlipayField APP_ID = new AlipayField("app_id", "");
	public final static AlipayField METHOD = new AlipayField("method", "");
	public final static AlipayField FORMAT = new AlipayField("format", "");
	public final static AlipayField CHARSET = new AlipayField("charset", "");
	public final static AlipayField SIGN_TYPE = new AlipayField("sign_type", "");
	public final static AlipayField SIGN = new AlipayField("sign", "");
	public final static AlipayField TIMESTAMP = new AlipayField("timestamp", "");
	public final static AlipayField VERSION = new AlipayField("version", "");
	public final static AlipayField NOTIFY_URL = new AlipayField("notify_url", "");
	public final static AlipayField APP_AUTH_TOKEN = new AlipayField("app_auth_token", "");

	public final static AlipayField OUT_TRADE_NO = new AlipayField("out_trade_no", "");
	public final static AlipayField SCENE = new AlipayField("scene", "");
	public final static AlipayField AUTH_CODE = new AlipayField("auth_code", "");
	public final static AlipayField SELLER_ID = new AlipayField("seller_id", "");
	public final static AlipayField TOTAL_AMOUNT = new AlipayField("total_amount", "");
	public final static AlipayField DISCOUNTABLE_AMOUNT = new AlipayField("discountable_amount", "");
	public final static AlipayField UNDISCOUNTABLE_AMOUNT = new AlipayField("undiscountable_amount", "");
	public final static AlipayField SUBJECT = new AlipayField("subject", "");
	public final static AlipayField BODY = new AlipayField("body", "");
	public final static AlipayField GOODS_DETAIL = new AlipayField("goods_detail", "");
	public final static AlipayField OPERATOR_ID = new AlipayField("operator_id", "");
	public final static AlipayField STORE_ID = new AlipayField("store_id", "");
	public final static AlipayField TERMINAL_ID = new AlipayField("terminal_id", "");
	public final static AlipayField ALIPAY_STORE_ID = new AlipayField("alipay_store_id", "");
	public final static AlipayField EXTEND_PARAMS = new AlipayField("extend_params", "");
	public final static AlipayField TIMEOUT_EXPRESS = new AlipayField("timeout_express", "");
	public final static AlipayField ROYALTY_INFO = new AlipayField("royalty_info", "");
}
