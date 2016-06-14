/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayPassTplContentUpdateResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayPassTplContentUpdateRequest
/*   9:    */   implements AlipayRequest<AlipayPassTplContentUpdateResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String channelId;
/*  14:    */   private String serialNumber;
/*  15:    */   private String status;
/*  16:    */   private String tplParams;
/*  17:    */   private String verifyCode;
/*  18:    */   private String verifyType;
/*  19:    */   private String terminalType;
/*  20:    */   private String terminalInfo;
/*  21:    */   private String prodCode;
/*  22:    */   private String notifyUrl;
/*  23:    */   
/*  24:    */   public void setChannelId(String channelId)
/*  25:    */   {
/*  26: 51 */     this.channelId = channelId;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String getChannelId()
/*  30:    */   {
/*  31: 54 */     return this.channelId;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setSerialNumber(String serialNumber)
/*  35:    */   {
/*  36: 58 */     this.serialNumber = serialNumber;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getSerialNumber()
/*  40:    */   {
/*  41: 61 */     return this.serialNumber;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setStatus(String status)
/*  45:    */   {
/*  46: 65 */     this.status = status;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getStatus()
/*  50:    */   {
/*  51: 68 */     return this.status;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setTplParams(String tplParams)
/*  55:    */   {
/*  56: 72 */     this.tplParams = tplParams;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getTplParams()
/*  60:    */   {
/*  61: 75 */     return this.tplParams;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setVerifyCode(String verifyCode)
/*  65:    */   {
/*  66: 79 */     this.verifyCode = verifyCode;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getVerifyCode()
/*  70:    */   {
/*  71: 82 */     return this.verifyCode;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setVerifyType(String verifyType)
/*  75:    */   {
/*  76: 86 */     this.verifyType = verifyType;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getVerifyType()
/*  80:    */   {
/*  81: 89 */     return this.verifyType;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getNotifyUrl()
/*  85:    */   {
/*  86: 97 */     return this.notifyUrl;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setNotifyUrl(String notifyUrl)
/*  90:    */   {
/*  91:101 */     this.notifyUrl = notifyUrl;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getApiVersion()
/*  95:    */   {
/*  96:105 */     return this.apiVersion;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setApiVersion(String apiVersion)
/* 100:    */   {
/* 101:109 */     this.apiVersion = apiVersion;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setTerminalType(String terminalType)
/* 105:    */   {
/* 106:113 */     this.terminalType = terminalType;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getTerminalType()
/* 110:    */   {
/* 111:117 */     return this.terminalType;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setTerminalInfo(String terminalInfo)
/* 115:    */   {
/* 116:121 */     this.terminalInfo = terminalInfo;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public String getTerminalInfo()
/* 120:    */   {
/* 121:125 */     return this.terminalInfo;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setProdCode(String prodCode)
/* 125:    */   {
/* 126:129 */     this.prodCode = prodCode;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public String getProdCode()
/* 130:    */   {
/* 131:133 */     return this.prodCode;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getApiMethodName()
/* 135:    */   {
/* 136:137 */     return "alipay.pass.tpl.content.update";
/* 137:    */   }
/* 138:    */   
/* 139:    */   public Map<String, String> getTextParams()
/* 140:    */   {
/* 141:141 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 142:142 */     txtParams.put("channel_id", this.channelId);
/* 143:143 */     txtParams.put("serial_number", this.serialNumber);
/* 144:144 */     txtParams.put("status", this.status);
/* 145:145 */     txtParams.put("tpl_params", this.tplParams);
/* 146:146 */     txtParams.put("verify_code", this.verifyCode);
/* 147:147 */     txtParams.put("verify_type", this.verifyType);
/* 148:148 */     if (this.udfParams != null) {
/* 149:149 */       txtParams.putAll(this.udfParams);
/* 150:    */     }
/* 151:151 */     return txtParams;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void putOtherTextParam(String key, String value)
/* 155:    */   {
/* 156:155 */     if (this.udfParams == null) {
/* 157:156 */       this.udfParams = new AlipayHashMap();
/* 158:    */     }
/* 159:158 */     this.udfParams.put(key, value);
/* 160:    */   }
/* 161:    */   
/* 162:    */   public Class<AlipayPassTplContentUpdateResponse> getResponseClass()
/* 163:    */   {
/* 164:162 */     return AlipayPassTplContentUpdateResponse.class;
/* 165:    */   }
/* 166:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayPassTplContentUpdateRequest
 * JD-Core Version:    0.7.0.1
 */