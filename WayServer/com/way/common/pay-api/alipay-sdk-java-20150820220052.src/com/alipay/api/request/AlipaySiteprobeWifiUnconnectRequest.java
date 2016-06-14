/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipaySiteprobeWifiUnconnectResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipaySiteprobeWifiUnconnectRequest
/*   9:    */   implements AlipayRequest<AlipaySiteprobeWifiUnconnectResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String deviceId;
/*  14:    */   private String deviceMac;
/*  15:    */   private String merchantId;
/*  16:    */   private String partnerId;
/*  17:    */   private String userMac;
/*  18:    */   private String terminalType;
/*  19:    */   private String terminalInfo;
/*  20:    */   private String prodCode;
/*  21:    */   private String notifyUrl;
/*  22:    */   
/*  23:    */   public void setDeviceId(String deviceId)
/*  24:    */   {
/*  25: 46 */     this.deviceId = deviceId;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public String getDeviceId()
/*  29:    */   {
/*  30: 49 */     return this.deviceId;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setDeviceMac(String deviceMac)
/*  34:    */   {
/*  35: 53 */     this.deviceMac = deviceMac;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getDeviceMac()
/*  39:    */   {
/*  40: 56 */     return this.deviceMac;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setMerchantId(String merchantId)
/*  44:    */   {
/*  45: 60 */     this.merchantId = merchantId;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getMerchantId()
/*  49:    */   {
/*  50: 63 */     return this.merchantId;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setPartnerId(String partnerId)
/*  54:    */   {
/*  55: 67 */     this.partnerId = partnerId;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getPartnerId()
/*  59:    */   {
/*  60: 70 */     return this.partnerId;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setUserMac(String userMac)
/*  64:    */   {
/*  65: 74 */     this.userMac = userMac;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getUserMac()
/*  69:    */   {
/*  70: 77 */     return this.userMac;
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
/* 125:125 */     return "alipay.siteprobe.wifi.unconnect";
/* 126:    */   }
/* 127:    */   
/* 128:    */   public Map<String, String> getTextParams()
/* 129:    */   {
/* 130:129 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 131:130 */     txtParams.put("device_id", this.deviceId);
/* 132:131 */     txtParams.put("device_mac", this.deviceMac);
/* 133:132 */     txtParams.put("merchant_id", this.merchantId);
/* 134:133 */     txtParams.put("partner_id", this.partnerId);
/* 135:134 */     txtParams.put("user_mac", this.userMac);
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
/* 150:    */   public Class<AlipaySiteprobeWifiUnconnectResponse> getResponseClass()
/* 151:    */   {
/* 152:149 */     return AlipaySiteprobeWifiUnconnectResponse.class;
/* 153:    */   }
/* 154:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipaySiteprobeWifiUnconnectRequest
 * JD-Core Version:    0.7.0.1
 */