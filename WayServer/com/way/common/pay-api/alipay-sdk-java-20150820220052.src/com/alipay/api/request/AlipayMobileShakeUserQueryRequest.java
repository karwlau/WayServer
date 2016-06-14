/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayMobileShakeUserQueryResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayMobileShakeUserQueryRequest
/*   9:    */   implements AlipayRequest<AlipayMobileShakeUserQueryResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String dynamicId;
/*  14:    */   private String dynamicIdType;
/*  15:    */   private String terminalType;
/*  16:    */   private String terminalInfo;
/*  17:    */   private String prodCode;
/*  18:    */   private String notifyUrl;
/*  19:    */   
/*  20:    */   public void setDynamicId(String dynamicId)
/*  21:    */   {
/*  22: 34 */     this.dynamicId = dynamicId;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public String getDynamicId()
/*  26:    */   {
/*  27: 37 */     return this.dynamicId;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setDynamicIdType(String dynamicIdType)
/*  31:    */   {
/*  32: 41 */     this.dynamicIdType = dynamicIdType;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getDynamicIdType()
/*  36:    */   {
/*  37: 44 */     return this.dynamicIdType;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getNotifyUrl()
/*  41:    */   {
/*  42: 52 */     return this.notifyUrl;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setNotifyUrl(String notifyUrl)
/*  46:    */   {
/*  47: 56 */     this.notifyUrl = notifyUrl;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getApiVersion()
/*  51:    */   {
/*  52: 60 */     return this.apiVersion;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setApiVersion(String apiVersion)
/*  56:    */   {
/*  57: 64 */     this.apiVersion = apiVersion;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setTerminalType(String terminalType)
/*  61:    */   {
/*  62: 68 */     this.terminalType = terminalType;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getTerminalType()
/*  66:    */   {
/*  67: 72 */     return this.terminalType;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setTerminalInfo(String terminalInfo)
/*  71:    */   {
/*  72: 76 */     this.terminalInfo = terminalInfo;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getTerminalInfo()
/*  76:    */   {
/*  77: 80 */     return this.terminalInfo;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setProdCode(String prodCode)
/*  81:    */   {
/*  82: 84 */     this.prodCode = prodCode;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getProdCode()
/*  86:    */   {
/*  87: 88 */     return this.prodCode;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getApiMethodName()
/*  91:    */   {
/*  92: 92 */     return "alipay.mobile.shake.user.query";
/*  93:    */   }
/*  94:    */   
/*  95:    */   public Map<String, String> getTextParams()
/*  96:    */   {
/*  97: 96 */     AlipayHashMap txtParams = new AlipayHashMap();
/*  98: 97 */     txtParams.put("dynamic_id", this.dynamicId);
/*  99: 98 */     txtParams.put("dynamic_id_type", this.dynamicIdType);
/* 100: 99 */     if (this.udfParams != null) {
/* 101:100 */       txtParams.putAll(this.udfParams);
/* 102:    */     }
/* 103:102 */     return txtParams;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void putOtherTextParam(String key, String value)
/* 107:    */   {
/* 108:106 */     if (this.udfParams == null) {
/* 109:107 */       this.udfParams = new AlipayHashMap();
/* 110:    */     }
/* 111:109 */     this.udfParams.put(key, value);
/* 112:    */   }
/* 113:    */   
/* 114:    */   public Class<AlipayMobileShakeUserQueryResponse> getResponseClass()
/* 115:    */   {
/* 116:113 */     return AlipayMobileShakeUserQueryResponse.class;
/* 117:    */   }
/* 118:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayMobileShakeUserQueryRequest
 * JD-Core Version:    0.7.0.1
 */