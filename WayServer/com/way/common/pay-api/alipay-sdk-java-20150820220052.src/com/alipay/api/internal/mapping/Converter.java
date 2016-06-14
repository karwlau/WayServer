package com.alipay.api.internal.mapping;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayRequest;
import com.alipay.api.AlipayResponse;
import com.alipay.api.SignItem;

public abstract interface Converter
{
  public abstract <T extends AlipayResponse> T toResponse(String paramString, Class<T> paramClass)
    throws AlipayApiException;
  
  public abstract SignItem getSignItem(AlipayRequest<?> paramAlipayRequest, AlipayResponse paramAlipayResponse)
    throws AlipayApiException;
}


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.mapping.Converter
 * JD-Core Version:    0.7.0.1
 */