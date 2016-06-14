/*  1:   */ package com.alipay.api.request;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayRequest;
/*  4:   */ import com.alipay.api.internal.util.AlipayHashMap;
/*  5:   */ import com.alipay.api.response.AlipayMobilePublicMenuUserUpdateResponse;
/*  6:   */ import java.util.Map;
/*  7:   */ 
/*  8:   */ public class AlipayMobilePublicMenuUserUpdateRequest
/*  9:   */   implements AlipayRequest<AlipayMobilePublicMenuUserUpdateResponse>
/* 10:   */ {
/* 11:   */   private AlipayHashMap udfParams;
/* 12:18 */   private String apiVersion = "1.0";
/* 13:   */   private String bizContent;
/* 14:   */   private String terminalType;
/* 15:   */   private String terminalInfo;
/* 16:   */   private String prodCode;
/* 17:   */   private String notifyUrl;
/* 18:   */   
/* 19:   */   public void setBizContent(String bizContent)
/* 20:   */   {
/* 21:26 */     this.bizContent = bizContent;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public String getBizContent()
/* 25:   */   {
/* 26:29 */     return this.bizContent;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getNotifyUrl()
/* 30:   */   {
/* 31:37 */     return this.notifyUrl;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setNotifyUrl(String notifyUrl)
/* 35:   */   {
/* 36:41 */     this.notifyUrl = notifyUrl;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getApiVersion()
/* 40:   */   {
/* 41:45 */     return this.apiVersion;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setApiVersion(String apiVersion)
/* 45:   */   {
/* 46:49 */     this.apiVersion = apiVersion;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setTerminalType(String terminalType)
/* 50:   */   {
/* 51:53 */     this.terminalType = terminalType;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getTerminalType()
/* 55:   */   {
/* 56:57 */     return this.terminalType;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void setTerminalInfo(String terminalInfo)
/* 60:   */   {
/* 61:61 */     this.terminalInfo = terminalInfo;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public String getTerminalInfo()
/* 65:   */   {
/* 66:65 */     return this.terminalInfo;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public void setProdCode(String prodCode)
/* 70:   */   {
/* 71:69 */     this.prodCode = prodCode;
/* 72:   */   }
/* 73:   */   
/* 74:   */   public String getProdCode()
/* 75:   */   {
/* 76:73 */     return this.prodCode;
/* 77:   */   }
/* 78:   */   
/* 79:   */   public String getApiMethodName()
/* 80:   */   {
/* 81:77 */     return "alipay.mobile.public.menu.user.update";
/* 82:   */   }
/* 83:   */   
/* 84:   */   public Map<String, String> getTextParams()
/* 85:   */   {
/* 86:81 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 87:82 */     txtParams.put("biz_content", this.bizContent);
/* 88:83 */     if (this.udfParams != null) {
/* 89:84 */       txtParams.putAll(this.udfParams);
/* 90:   */     }
/* 91:86 */     return txtParams;
/* 92:   */   }
/* 93:   */   
/* 94:   */   public void putOtherTextParam(String key, String value)
/* 95:   */   {
/* 96:90 */     if (this.udfParams == null) {
/* 97:91 */       this.udfParams = new AlipayHashMap();
/* 98:   */     }
/* 99:93 */     this.udfParams.put(key, value);
/* :0:   */   }
/* :1:   */   
/* :2:   */   public Class<AlipayMobilePublicMenuUserUpdateResponse> getResponseClass()
/* :3:   */   {
/* :4:97 */     return AlipayMobilePublicMenuUserUpdateResponse.class;
/* :5:   */   }
/* :6:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayMobilePublicMenuUserUpdateRequest
 * JD-Core Version:    0.7.0.1
 */