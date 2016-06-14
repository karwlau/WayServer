package com.way.common.pay_api.alipay.constants;

import java.util.Arrays;
import java.util.List;

public enum AlipayFields {
	BAR_PAY_NOTIFY_REQ(Arrays.asList(AlipayField.OUT_TRADE_NO, AlipayField.SCENE, AlipayField.AUTH_CODE)),
	BAR_PAY_NOTIFY_OP(Arrays.asList(AlipayField.SELLER_ID, AlipayField.TOTAL_AMOUNT, AlipayField.DISCOUNTABLE_AMOUNT,
			AlipayField.UNDISCOUNTABLE_AMOUNT, AlipayField.SUBJECT, AlipayField.BODY, AlipayField.GOODS_DETAIL,
			AlipayField.OPERATOR_ID, AlipayField.STORE_ID, AlipayField.TERMINAL_ID, AlipayField.ALIPAY_STORE_ID,
			AlipayField.EXTEND_PARAMS, AlipayField.TIMEOUT_EXPRESS, AlipayField.ROYALTY_INFO));

	private List<AlipayField> fields;

	AlipayFields(List<AlipayField> fields) {
		this.fields = fields;
	}

	List<AlipayField> getFields() {
		return this.fields;
	}
}
