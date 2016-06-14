package com.alipay.api;

import java.util.Map;

public abstract interface AlipayUploadRequest<T extends AlipayResponse>
  extends AlipayRequest<T>
{
  public abstract Map<String, FileItem> getFileParams();
}


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.AlipayUploadRequest
 * JD-Core Version:    0.7.0.1
 */