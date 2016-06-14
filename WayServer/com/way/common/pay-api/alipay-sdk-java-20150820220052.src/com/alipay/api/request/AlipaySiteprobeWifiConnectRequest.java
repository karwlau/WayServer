/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipaySiteprobeWifiConnectResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipaySiteprobeWifiConnectRequest
/*   9:    */   implements AlipayRequest<AlipaySiteprobeWifiConnectResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private Boolean auth;
/*  14:    */   private String deviceId;
/*  15:    */   private String deviceMac;
/*  16:    */   private String merchantId;
/*  17:    */   private String partnerId;
/*  18:    */   private String token;
/*  19:    */   private String userMac;
/*  20:    */   private String terminalType;
/*  21:    */   private String terminalInfo;
/*  22:    */   private String prodCode;
/*  23:    */   private String notifyUrl;
/*  24:    */   
/*  25:    */   public void setAuth(Boolean auth)
/*  26:    */   {
/*  27: 56 */     this.auth = auth;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public Boolean getAuth()
/*  31:    */   {
/*  32: 59 */     return this.auth;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setDeviceId(String deviceId)
/*  36:    */   {
/*  37: 63 */     this.deviceId = deviceId;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getDeviceId()
/*  41:    */   {
/*  42: 66 */     return this.deviceId;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setDeviceMac(String deviceMac)
/*  46:    */   {
/*  47: 70 */     this.deviceMac = deviceMac;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getDeviceMac()
/*  51:    */   {
/*  52: 73 */     return this.deviceMac;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setMerchantId(String merchantId)
/*  56:    */   {
/*  57: 77 */     this.merchantId = merchantId;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getMerchantId()
/*  61:    */   {
/*  62: 80 */     return this.merchantId;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setPartnerId(String partnerId)
/*  66:    */   {
/*  67: 84 */     this.partnerId = partnerId;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getPartnerId()
/*  71:    */   {
/*  72: 87 */     return this.partnerId;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setToken(String token)
/*  76:    */   {
/*  77: 91 */     this.token = token;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getToken()
/*  81:    */   {
/*  82: 94 */     return this.token;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setUserMac(String userMac)
/*  86:    */   {
/*  87: 98 */     this.userMac = userMac;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getUserMac()
/*  91:    */   {
/*  92:101 */     return this.userMac;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getNotifyUrl()
/*  96:    */   {
/*  97:109 */     return this.notifyUrl;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setNotifyUrl(String notifyUrl)
/* 101:    */   {
/* 102:113 */     this.notifyUrl = notifyUrl;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getApiVersion()
/* 106:    */   {
/* 107:117 */     return this.apiVersion;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setApiVersion(String apiVersion)
/* 111:    */   {
/* 112:121 */     this.apiVersion = apiVersion;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setTerminalType(String terminalType)
/* 116:    */   {
/* 117:125 */     this.terminalType = terminalType;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public String getTerminalType()
/* 121:    */   {
/* 122:129 */     return this.terminalType;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setTerminalInfo(String terminalInfo)
/* 126:    */   {
/* 127:133 */     this.terminalInfo = terminalInfo;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public String getTerminalInfo()
/* 131:    */   {
/* 132:137 */     return this.terminalInfo;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void setProdCode(String prodCode)
/* 136:    */   {
/* 137:141 */     this.prodCode = prodCode;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String getProdCode()
/* 141:    */   {
/* 142:145 */     return this.prodCode;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getApiMethodName()
/* 146:    */   {
/* 147:149 */     return "alipay.siteprobe.wifi.connect";
/* 148:    */   }
/* 149:    */   
/* 150:    */   public Map<String, String> getTextParams()
/* 151:    */   {
/* 152:153 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 153:154 */     txtParams.put("auth", this.auth);
/* 154:155 */     txtParams.put("device_id", this.deviceId);
/* 155:156 */     txtParams.put("device_mac", this.deviceMac);
/* 156:157 */     txtParams.put("merchant_id", this.merchantId);
/* 157:158 */     txtParams.put("partner_id", this.partnerId);
/* 158:159 */     txtParams.put("token", this.token);
/* 159:160 */     txtParams.put("user_mac", this.userMac);
/* 160:161 */     if (this.udfParams != null) {
/* 161:162 */       txtParams.putAll(this.udfParams);
/* 162:    */     }
/* 163:164 */     return txtParams;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void putOtherTextParam(String key, String value)
/* 167:    */   {
/* 168:168 */     if (this.udfParams == null) {
/* 169:169 */       this.udfParams = new AlipayHashMap();
/* 170:    */     }
/* 171:171 */     this.udfParams.put(key, value);
/* 172:    */   }
/* 173:    */   
/* 174:    */   public Class<AlipaySiteprobeWifiConnectResponse> getResponseClass()
/* 175:    */   {
/* 176:175 */     return AlipaySiteprobeWifiConnectResponse.class;
/* 177:    */   }
/* 178:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipaySiteprobeWifiConnectRequest
 * JD-Core Version:    0.7.0.1
 */