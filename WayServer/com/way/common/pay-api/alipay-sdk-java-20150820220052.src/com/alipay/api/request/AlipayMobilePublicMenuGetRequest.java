/*  1:   */ package com.alipay.api.request;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayRequest;
/*  4:   */ import com.alipay.api.internal.util.AlipayHashMap;
/*  5:   */ import com.alipay.api.response.AlipayMobilePublicMenuGetResponse;
/*  6:   */ import java.util.Map;
/*  7:   */ 
/*  8:   */ public class AlipayMobilePublicMenuGetRequest
/*  9:   */   implements AlipayRequest<AlipayMobilePublicMenuGetResponse>
/* 10:   */ {
/* 11:   */   private AlipayHashMap udfParams;
/* 12:18 */   private String apiVersion = "1.0";
/* 13:   */   private String terminalType;
/* 14:   */   private String terminalInfo;
/* 15:   */   private String prodCode;
/* 16:   */   private String notifyUrl;
/* 17:   */   
/* 18:   */   public String getNotifyUrl()
/* 19:   */   {
/* 20:25 */     return this.notifyUrl;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setNotifyUrl(String notifyUrl)
/* 24:   */   {
/* 25:29 */     this.notifyUrl = notifyUrl;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String getApiVersion()
/* 29:   */   {
/* 30:33 */     return this.apiVersion;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setApiVersion(String apiVersion)
/* 34:   */   {
/* 35:37 */     this.apiVersion = apiVersion;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setTerminalType(String terminalType)
/* 39:   */   {
/* 40:41 */     this.terminalType = terminalType;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getTerminalType()
/* 44:   */   {
/* 45:45 */     return this.terminalType;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setTerminalInfo(String terminalInfo)
/* 49:   */   {
/* 50:49 */     this.terminalInfo = terminalInfo;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getTerminalInfo()
/* 54:   */   {
/* 55:53 */     return this.terminalInfo;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setProdCode(String prodCode)
/* 59:   */   {
/* 60:57 */     this.prodCode = prodCode;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getProdCode()
/* 64:   */   {
/* 65:61 */     return this.prodCode;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public String getApiMethodName()
/* 69:   */   {
/* 70:65 */     return "alipay.mobile.public.menu.get";
/* 71:   */   }
/* 72:   */   
/* 73:   */   public Map<String, String> getTextParams()
/* 74:   */   {
/* 75:69 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 76:70 */     if (this.udfParams != null) {
/* 77:71 */       txtParams.putAll(this.udfParams);
/* 78:   */     }
/* 79:73 */     return txtParams;
/* 80:   */   }
/* 81:   */   
/* 82:   */   public void putOtherTextParam(String key, String value)
/* 83:   */   {
/* 84:77 */     if (this.udfParams == null) {
/* 85:78 */       this.udfParams = new AlipayHashMap();
/* 86:   */     }
/* 87:80 */     this.udfParams.put(key, value);
/* 88:   */   }
/* 89:   */   
/* 90:   */   public Class<AlipayMobilePublicMenuGetResponse> getResponseClass()
/* 91:   */   {
/* 92:84 */     return AlipayMobilePublicMenuGetResponse.class;
/* 93:   */   }
/* 94:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayMobilePublicMenuGetRequest
 * JD-Core Version:    0.7.0.1
 */