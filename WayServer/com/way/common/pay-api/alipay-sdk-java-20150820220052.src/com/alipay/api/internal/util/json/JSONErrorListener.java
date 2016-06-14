package com.alipay.api.internal.util.json;

public abstract interface JSONErrorListener
{
  public abstract void start(String paramString);
  
  public abstract void error(String paramString, int paramInt);
  
  public abstract void end();
}


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.json.JSONErrorListener
 * JD-Core Version:    0.7.0.1
 */