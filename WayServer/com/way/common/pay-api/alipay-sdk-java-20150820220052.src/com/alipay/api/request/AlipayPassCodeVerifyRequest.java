/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayPassCodeVerifyResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayPassCodeVerifyRequest
/*   9:    */   implements AlipayRequest<AlipayPassCodeVerifyResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String extInfo;
/*  14:    */   private String operatorId;
/*  15:    */   private String operatorType;
/*  16:    */   private String verifyCode;
/*  17:    */   private String terminalType;
/*  18:    */   private String terminalInfo;
/*  19:    */   private String prodCode;
/*  20:    */   private String notifyUrl;
/*  21:    */   
/*  22:    */   public void setExtInfo(String extInfo)
/*  23:    */   {
/*  24: 45 */     this.extInfo = extInfo;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public String getExtInfo()
/*  28:    */   {
/*  29: 48 */     return this.extInfo;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setOperatorId(String operatorId)
/*  33:    */   {
/*  34: 52 */     this.operatorId = operatorId;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getOperatorId()
/*  38:    */   {
/*  39: 55 */     return this.operatorId;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setOperatorType(String operatorType)
/*  43:    */   {
/*  44: 59 */     this.operatorType = operatorType;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getOperatorType()
/*  48:    */   {
/*  49: 62 */     return this.operatorType;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setVerifyCode(String verifyCode)
/*  53:    */   {
/*  54: 66 */     this.verifyCode = verifyCode;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getVerifyCode()
/*  58:    */   {
/*  59: 69 */     return this.verifyCode;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getNotifyUrl()
/*  63:    */   {
/*  64: 77 */     return this.notifyUrl;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setNotifyUrl(String notifyUrl)
/*  68:    */   {
/*  69: 81 */     this.notifyUrl = notifyUrl;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getApiVersion()
/*  73:    */   {
/*  74: 85 */     return this.apiVersion;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setApiVersion(String apiVersion)
/*  78:    */   {
/*  79: 89 */     this.apiVersion = apiVersion;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setTerminalType(String terminalType)
/*  83:    */   {
/*  84: 93 */     this.terminalType = terminalType;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getTerminalType()
/*  88:    */   {
/*  89: 97 */     return this.terminalType;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setTerminalInfo(String terminalInfo)
/*  93:    */   {
/*  94:101 */     this.terminalInfo = terminalInfo;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getTerminalInfo()
/*  98:    */   {
/*  99:105 */     return this.terminalInfo;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setProdCode(String prodCode)
/* 103:    */   {
/* 104:109 */     this.prodCode = prodCode;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getProdCode()
/* 108:    */   {
/* 109:113 */     return this.prodCode;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getApiMethodName()
/* 113:    */   {
/* 114:117 */     return "alipay.pass.code.verify";
/* 115:    */   }
/* 116:    */   
/* 117:    */   public Map<String, String> getTextParams()
/* 118:    */   {
/* 119:121 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 120:122 */     txtParams.put("ext_info", this.extInfo);
/* 121:123 */     txtParams.put("operator_id", this.operatorId);
/* 122:124 */     txtParams.put("operator_type", this.operatorType);
/* 123:125 */     txtParams.put("verify_code", this.verifyCode);
/* 124:126 */     if (this.udfParams != null) {
/* 125:127 */       txtParams.putAll(this.udfParams);
/* 126:    */     }
/* 127:129 */     return txtParams;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void putOtherTextParam(String key, String value)
/* 131:    */   {
/* 132:133 */     if (this.udfParams == null) {
/* 133:134 */       this.udfParams = new AlipayHashMap();
/* 134:    */     }
/* 135:136 */     this.udfParams.put(key, value);
/* 136:    */   }
/* 137:    */   
/* 138:    */   public Class<AlipayPassCodeVerifyResponse> getResponseClass()
/* 139:    */   {
/* 140:140 */     return AlipayPassCodeVerifyResponse.class;
/* 141:    */   }
/* 142:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayPassCodeVerifyRequest
 * JD-Core Version:    0.7.0.1
 */