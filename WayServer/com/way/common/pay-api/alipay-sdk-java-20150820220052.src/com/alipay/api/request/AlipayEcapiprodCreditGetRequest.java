/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayEcapiprodCreditGetResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayEcapiprodCreditGetRequest
/*   9:    */   implements AlipayRequest<AlipayEcapiprodCreditGetResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String creditNo;
/*  14:    */   private String entityCode;
/*  15:    */   private String entityName;
/*  16:    */   private String isvCode;
/*  17:    */   private String orgCode;
/*  18:    */   private String terminalType;
/*  19:    */   private String terminalInfo;
/*  20:    */   private String prodCode;
/*  21:    */   private String notifyUrl;
/*  22:    */   
/*  23:    */   public void setCreditNo(String creditNo)
/*  24:    */   {
/*  25: 46 */     this.creditNo = creditNo;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public String getCreditNo()
/*  29:    */   {
/*  30: 49 */     return this.creditNo;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setEntityCode(String entityCode)
/*  34:    */   {
/*  35: 53 */     this.entityCode = entityCode;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getEntityCode()
/*  39:    */   {
/*  40: 56 */     return this.entityCode;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setEntityName(String entityName)
/*  44:    */   {
/*  45: 60 */     this.entityName = entityName;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getEntityName()
/*  49:    */   {
/*  50: 63 */     return this.entityName;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setIsvCode(String isvCode)
/*  54:    */   {
/*  55: 67 */     this.isvCode = isvCode;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getIsvCode()
/*  59:    */   {
/*  60: 70 */     return this.isvCode;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setOrgCode(String orgCode)
/*  64:    */   {
/*  65: 74 */     this.orgCode = orgCode;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getOrgCode()
/*  69:    */   {
/*  70: 77 */     return this.orgCode;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getNotifyUrl()
/*  74:    */   {
/*  75: 85 */     return this.notifyUrl;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setNotifyUrl(String notifyUrl)
/*  79:    */   {
/*  80: 89 */     this.notifyUrl = notifyUrl;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public String getApiVersion()
/*  84:    */   {
/*  85: 93 */     return this.apiVersion;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setApiVersion(String apiVersion)
/*  89:    */   {
/*  90: 97 */     this.apiVersion = apiVersion;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setTerminalType(String terminalType)
/*  94:    */   {
/*  95:101 */     this.terminalType = terminalType;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getTerminalType()
/*  99:    */   {
/* 100:105 */     return this.terminalType;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setTerminalInfo(String terminalInfo)
/* 104:    */   {
/* 105:109 */     this.terminalInfo = terminalInfo;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public String getTerminalInfo()
/* 109:    */   {
/* 110:113 */     return this.terminalInfo;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setProdCode(String prodCode)
/* 114:    */   {
/* 115:117 */     this.prodCode = prodCode;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getProdCode()
/* 119:    */   {
/* 120:121 */     return this.prodCode;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getApiMethodName()
/* 124:    */   {
/* 125:125 */     return "alipay.ecapiprod.credit.get";
/* 126:    */   }
/* 127:    */   
/* 128:    */   public Map<String, String> getTextParams()
/* 129:    */   {
/* 130:129 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 131:130 */     txtParams.put("credit_no", this.creditNo);
/* 132:131 */     txtParams.put("entity_code", this.entityCode);
/* 133:132 */     txtParams.put("entity_name", this.entityName);
/* 134:133 */     txtParams.put("isv_code", this.isvCode);
/* 135:134 */     txtParams.put("org_code", this.orgCode);
/* 136:135 */     if (this.udfParams != null) {
/* 137:136 */       txtParams.putAll(this.udfParams);
/* 138:    */     }
/* 139:138 */     return txtParams;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void putOtherTextParam(String key, String value)
/* 143:    */   {
/* 144:142 */     if (this.udfParams == null) {
/* 145:143 */       this.udfParams = new AlipayHashMap();
/* 146:    */     }
/* 147:145 */     this.udfParams.put(key, value);
/* 148:    */   }
/* 149:    */   
/* 150:    */   public Class<AlipayEcapiprodCreditGetResponse> getResponseClass()
/* 151:    */   {
/* 152:149 */     return AlipayEcapiprodCreditGetResponse.class;
/* 153:    */   }
/* 154:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayEcapiprodCreditGetRequest
 * JD-Core Version:    0.7.0.1
 */