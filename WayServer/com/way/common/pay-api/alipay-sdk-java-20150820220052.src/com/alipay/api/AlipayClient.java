package com.alipay.api;

public abstract interface AlipayClient
{
  public abstract <T extends AlipayResponse> T execute(AlipayRequest<T> paramAlipayRequest)
    throws AlipayApiException;
  
  public abstract <T extends AlipayResponse> T execute(AlipayRequest<T> paramAlipayRequest, String paramString)
    throws AlipayApiException;
}


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.AlipayClient
 * JD-Core Version:    0.7.0.1
 */