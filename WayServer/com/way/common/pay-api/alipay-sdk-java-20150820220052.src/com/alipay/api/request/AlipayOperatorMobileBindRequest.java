/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayOperatorMobileBindResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayOperatorMobileBindRequest
/*   9:    */   implements AlipayRequest<AlipayOperatorMobileBindResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String checkSigncard;
/*  14:    */   private String fReturnUrl;
/*  15:    */   private String hasSpi;
/*  16:    */   private String operatorName;
/*  17:    */   private String provinceName;
/*  18:    */   private String sReturnUrl;
/*  19:    */   private String terminalType;
/*  20:    */   private String terminalInfo;
/*  21:    */   private String prodCode;
/*  22:    */   private String notifyUrl;
/*  23:    */   
/*  24:    */   public void setCheckSigncard(String checkSigncard)
/*  25:    */   {
/*  26: 55 */     this.checkSigncard = checkSigncard;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String getCheckSigncard()
/*  30:    */   {
/*  31: 58 */     return this.checkSigncard;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setfReturnUrl(String fReturnUrl)
/*  35:    */   {
/*  36: 62 */     this.fReturnUrl = fReturnUrl;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getfReturnUrl()
/*  40:    */   {
/*  41: 65 */     return this.fReturnUrl;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setHasSpi(String hasSpi)
/*  45:    */   {
/*  46: 69 */     this.hasSpi = hasSpi;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getHasSpi()
/*  50:    */   {
/*  51: 72 */     return this.hasSpi;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setOperatorName(String operatorName)
/*  55:    */   {
/*  56: 76 */     this.operatorName = operatorName;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getOperatorName()
/*  60:    */   {
/*  61: 79 */     return this.operatorName;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setProvinceName(String provinceName)
/*  65:    */   {
/*  66: 83 */     this.provinceName = provinceName;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getProvinceName()
/*  70:    */   {
/*  71: 86 */     return this.provinceName;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setsReturnUrl(String sReturnUrl)
/*  75:    */   {
/*  76: 90 */     this.sReturnUrl = sReturnUrl;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getsReturnUrl()
/*  80:    */   {
/*  81: 93 */     return this.sReturnUrl;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getNotifyUrl()
/*  85:    */   {
/*  86:101 */     return this.notifyUrl;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setNotifyUrl(String notifyUrl)
/*  90:    */   {
/*  91:105 */     this.notifyUrl = notifyUrl;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getApiVersion()
/*  95:    */   {
/*  96:109 */     return this.apiVersion;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setApiVersion(String apiVersion)
/* 100:    */   {
/* 101:113 */     this.apiVersion = apiVersion;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setTerminalType(String terminalType)
/* 105:    */   {
/* 106:117 */     this.terminalType = terminalType;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getTerminalType()
/* 110:    */   {
/* 111:121 */     return this.terminalType;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setTerminalInfo(String terminalInfo)
/* 115:    */   {
/* 116:125 */     this.terminalInfo = terminalInfo;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public String getTerminalInfo()
/* 120:    */   {
/* 121:129 */     return this.terminalInfo;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setProdCode(String prodCode)
/* 125:    */   {
/* 126:133 */     this.prodCode = prodCode;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public String getProdCode()
/* 130:    */   {
/* 131:137 */     return this.prodCode;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getApiMethodName()
/* 135:    */   {
/* 136:141 */     return "alipay.operator.mobile.bind";
/* 137:    */   }
/* 138:    */   
/* 139:    */   public Map<String, String> getTextParams()
/* 140:    */   {
/* 141:145 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 142:146 */     txtParams.put("check_signcard", this.checkSigncard);
/* 143:147 */     txtParams.put("f_return_url", this.fReturnUrl);
/* 144:148 */     txtParams.put("has_spi", this.hasSpi);
/* 145:149 */     txtParams.put("operator_name", this.operatorName);
/* 146:150 */     txtParams.put("province_name", this.provinceName);
/* 147:151 */     txtParams.put("s_return_url", this.sReturnUrl);
/* 148:152 */     if (this.udfParams != null) {
/* 149:153 */       txtParams.putAll(this.udfParams);
/* 150:    */     }
/* 151:155 */     return txtParams;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void putOtherTextParam(String key, String value)
/* 155:    */   {
/* 156:159 */     if (this.udfParams == null) {
/* 157:160 */       this.udfParams = new AlipayHashMap();
/* 158:    */     }
/* 159:162 */     this.udfParams.put(key, value);
/* 160:    */   }
/* 161:    */   
/* 162:    */   public Class<AlipayOperatorMobileBindResponse> getResponseClass()
/* 163:    */   {
/* 164:166 */     return AlipayOperatorMobileBindResponse.class;
/* 165:    */   }
/* 166:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayOperatorMobileBindRequest
 * JD-Core Version:    0.7.0.1
 */