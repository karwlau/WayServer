package com.alipay.api;

public abstract interface AlipayParser<T extends AlipayResponse>
{
  public abstract T parse(String paramString)
    throws AlipayApiException;
  
  public abstract Class<T> getResponseClass()
    throws AlipayApiException;
  
  public abstract SignItem getSignItem(AlipayRequest<?> paramAlipayRequest, AlipayResponse paramAlipayResponse)
    throws AlipayApiException;
}


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.AlipayParser
 * JD-Core Version:    0.7.0.1
 */