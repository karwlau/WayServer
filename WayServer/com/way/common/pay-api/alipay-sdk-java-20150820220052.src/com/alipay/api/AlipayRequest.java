package com.alipay.api;

import java.util.Map;

public abstract interface AlipayRequest<T extends AlipayResponse>
{
  public abstract String getApiMethodName();
  
  public abstract Map<String, String> getTextParams();
  
  public abstract String getApiVersion();
  
  public abstract void setApiVersion(String paramString);
  
  public abstract String getTerminalType();
  
  public abstract void setTerminalType(String paramString);
  
  public abstract String getTerminalInfo();
  
  public abstract void setTerminalInfo(String paramString);
  
  public abstract String getProdCode();
  
  public abstract void setProdCode(String paramString);
  
  public abstract String getNotifyUrl();
  
  public abstract void setNotifyUrl(String paramString);
  
  public abstract Class<T> getResponseClass();
}


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.AlipayRequest
 * JD-Core Version:    0.7.0.1
 */