/*  1:   */ package com.alipay.api.request;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayRequest;
/*  4:   */ import com.alipay.api.internal.util.AlipayHashMap;
/*  5:   */ import com.alipay.api.response.AlipayUserTestResponse;
/*  6:   */ import java.util.List;
/*  7:   */ import java.util.Map;
/*  8:   */ 
/*  9:   */ public class AlipayUserTestRequest
/* 10:   */   implements AlipayRequest<AlipayUserTestResponse>
/* 11:   */ {
/* 12:   */   private AlipayHashMap udfParams;
/* 13:19 */   private String apiVersion = "1.0";
/* 14:   */   private List<String> userinfo;
/* 15:   */   private String terminalType;
/* 16:   */   private String terminalInfo;
/* 17:   */   private String prodCode;
/* 18:   */   private String notifyUrl;
/* 19:   */   
/* 20:   */   public void setUserinfo(List<String> userinfo)
/* 21:   */   {
/* 22:27 */     this.userinfo = userinfo;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public List<String> getUserinfo()
/* 26:   */   {
/* 27:30 */     return this.userinfo;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getNotifyUrl()
/* 31:   */   {
/* 32:38 */     return this.notifyUrl;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setNotifyUrl(String notifyUrl)
/* 36:   */   {
/* 37:42 */     this.notifyUrl = notifyUrl;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String getApiVersion()
/* 41:   */   {
/* 42:46 */     return this.apiVersion;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setApiVersion(String apiVersion)
/* 46:   */   {
/* 47:50 */     this.apiVersion = apiVersion;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public void setTerminalType(String terminalType)
/* 51:   */   {
/* 52:54 */     this.terminalType = terminalType;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public String getTerminalType()
/* 56:   */   {
/* 57:58 */     return this.terminalType;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public void setTerminalInfo(String terminalInfo)
/* 61:   */   {
/* 62:62 */     this.terminalInfo = terminalInfo;
/* 63:   */   }
/* 64:   */   
/* 65:   */   public String getTerminalInfo()
/* 66:   */   {
/* 67:66 */     return this.terminalInfo;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public void setProdCode(String prodCode)
/* 71:   */   {
/* 72:70 */     this.prodCode = prodCode;
/* 73:   */   }
/* 74:   */   
/* 75:   */   public String getProdCode()
/* 76:   */   {
/* 77:74 */     return this.prodCode;
/* 78:   */   }
/* 79:   */   
/* 80:   */   public String getApiMethodName()
/* 81:   */   {
/* 82:78 */     return "alipay.user.test";
/* 83:   */   }
/* 84:   */   
/* 85:   */   public Map<String, String> getTextParams()
/* 86:   */   {
/* 87:82 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 88:83 */     txtParams.put("userinfo", this.userinfo);
/* 89:84 */     if (this.udfParams != null) {
/* 90:85 */       txtParams.putAll(this.udfParams);
/* 91:   */     }
/* 92:87 */     return txtParams;
/* 93:   */   }
/* 94:   */   
/* 95:   */   public void putOtherTextParam(String key, String value)
/* 96:   */   {
/* 97:91 */     if (this.udfParams == null) {
/* 98:92 */       this.udfParams = new AlipayHashMap();
/* 99:   */     }
/* :0:94 */     this.udfParams.put(key, value);
/* :1:   */   }
/* :2:   */   
/* :3:   */   public Class<AlipayUserTestResponse> getResponseClass()
/* :4:   */   {
/* :5:98 */     return AlipayUserTestResponse.class;
/* :6:   */   }
/* :7:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayUserTestRequest
 * JD-Core Version:    0.7.0.1
 */