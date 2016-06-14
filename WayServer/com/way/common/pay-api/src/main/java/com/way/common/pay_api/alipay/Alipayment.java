package com.way.common.pay_api.alipay;

import java.util.Map;

import com.way.common.pay_api.base.PayField;
import com.way.common.pay_api.base.Payment;

public class Alipayment extends Payment {
	public Map<PayField, String> valMap;

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		super.pay();
	}

	@Override
	public String qrPay() {
		// TODO Auto-generated method stub
		return super.qrPay();
	}

}
