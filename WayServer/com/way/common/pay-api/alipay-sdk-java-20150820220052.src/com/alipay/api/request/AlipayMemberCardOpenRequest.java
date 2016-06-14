/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayMemberCardOpenResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayMemberCardOpenRequest
/*   9:    */   implements AlipayRequest<AlipayMemberCardOpenResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String bizSerialNo;
/*  14:    */   private String cardMerchantInfo;
/*  15:    */   private String cardUserInfo;
/*  16:    */   private String extInfo;
/*  17:    */   private String externalCardNo;
/*  18:    */   private String requestFrom;
/*  19:    */   private String terminalType;
/*  20:    */   private String terminalInfo;
/*  21:    */   private String prodCode;
/*  22:    */   private String notifyUrl;
/*  23:    */   
/*  24:    */   public void setBizSerialNo(String bizSerialNo)
/*  25:    */   {
/*  26: 70 */     this.bizSerialNo = bizSerialNo;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String getBizSerialNo()
/*  30:    */   {
/*  31: 73 */     return this.bizSerialNo;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setCardMerchantInfo(String cardMerchantInfo)
/*  35:    */   {
/*  36: 77 */     this.cardMerchantInfo = cardMerchantInfo;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getCardMerchantInfo()
/*  40:    */   {
/*  41: 80 */     return this.cardMerchantInfo;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setCardUserInfo(String cardUserInfo)
/*  45:    */   {
/*  46: 84 */     this.cardUserInfo = cardUserInfo;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getCardUserInfo()
/*  50:    */   {
/*  51: 87 */     return this.cardUserInfo;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setExtInfo(String extInfo)
/*  55:    */   {
/*  56: 91 */     this.extInfo = extInfo;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getExtInfo()
/*  60:    */   {
/*  61: 94 */     return this.extInfo;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setExternalCardNo(String externalCardNo)
/*  65:    */   {
/*  66: 98 */     this.externalCardNo = externalCardNo;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getExternalCardNo()
/*  70:    */   {
/*  71:101 */     return this.externalCardNo;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setRequestFrom(String requestFrom)
/*  75:    */   {
/*  76:105 */     this.requestFrom = requestFrom;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getRequestFrom()
/*  80:    */   {
/*  81:108 */     return this.requestFrom;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getNotifyUrl()
/*  85:    */   {
/*  86:116 */     return this.notifyUrl;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setNotifyUrl(String notifyUrl)
/*  90:    */   {
/*  91:120 */     this.notifyUrl = notifyUrl;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getApiVersion()
/*  95:    */   {
/*  96:124 */     return this.apiVersion;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setApiVersion(String apiVersion)
/* 100:    */   {
/* 101:128 */     this.apiVersion = apiVersion;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setTerminalType(String terminalType)
/* 105:    */   {
/* 106:132 */     this.terminalType = terminalType;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getTerminalType()
/* 110:    */   {
/* 111:136 */     return this.terminalType;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setTerminalInfo(String terminalInfo)
/* 115:    */   {
/* 116:140 */     this.terminalInfo = terminalInfo;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public String getTerminalInfo()
/* 120:    */   {
/* 121:144 */     return this.terminalInfo;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setProdCode(String prodCode)
/* 125:    */   {
/* 126:148 */     this.prodCode = prodCode;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public String getProdCode()
/* 130:    */   {
/* 131:152 */     return this.prodCode;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getApiMethodName()
/* 135:    */   {
/* 136:156 */     return "alipay.member.card.open";
/* 137:    */   }
/* 138:    */   
/* 139:    */   public Map<String, String> getTextParams()
/* 140:    */   {
/* 141:160 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 142:161 */     txtParams.put("biz_serial_no", this.bizSerialNo);
/* 143:162 */     txtParams.put("card_merchant_info", this.cardMerchantInfo);
/* 144:163 */     txtParams.put("card_user_info", this.cardUserInfo);
/* 145:164 */     txtParams.put("ext_info", this.extInfo);
/* 146:165 */     txtParams.put("external_card_no", this.externalCardNo);
/* 147:166 */     txtParams.put("request_from", this.requestFrom);
/* 148:167 */     if (this.udfParams != null) {
/* 149:168 */       txtParams.putAll(this.udfParams);
/* 150:    */     }
/* 151:170 */     return txtParams;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void putOtherTextParam(String key, String value)
/* 155:    */   {
/* 156:174 */     if (this.udfParams == null) {
/* 157:175 */       this.udfParams = new AlipayHashMap();
/* 158:    */     }
/* 159:177 */     this.udfParams.put(key, value);
/* 160:    */   }
/* 161:    */   
/* 162:    */   public Class<AlipayMemberCardOpenResponse> getResponseClass()
/* 163:    */   {
/* 164:181 */     return AlipayMemberCardOpenResponse.class;
/* 165:    */   }
/* 166:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayMemberCardOpenRequest
 * JD-Core Version:    0.7.0.1
 */