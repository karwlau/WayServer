/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayMemberCardDeletecardResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayMemberCardDeletecardRequest
/*   9:    */   implements AlipayRequest<AlipayMemberCardDeletecardResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String bizSerialNo;
/*  14:    */   private String cardMerchantInfo;
/*  15:    */   private String extInfo;
/*  16:    */   private String externalCardNo;
/*  17:    */   private String reasonCode;
/*  18:    */   private String requestFrom;
/*  19:    */   private String terminalType;
/*  20:    */   private String terminalInfo;
/*  21:    */   private String prodCode;
/*  22:    */   private String notifyUrl;
/*  23:    */   
/*  24:    */   public void setBizSerialNo(String bizSerialNo)
/*  25:    */   {
/*  26: 62 */     this.bizSerialNo = bizSerialNo;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String getBizSerialNo()
/*  30:    */   {
/*  31: 65 */     return this.bizSerialNo;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setCardMerchantInfo(String cardMerchantInfo)
/*  35:    */   {
/*  36: 69 */     this.cardMerchantInfo = cardMerchantInfo;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getCardMerchantInfo()
/*  40:    */   {
/*  41: 72 */     return this.cardMerchantInfo;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setExtInfo(String extInfo)
/*  45:    */   {
/*  46: 76 */     this.extInfo = extInfo;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getExtInfo()
/*  50:    */   {
/*  51: 79 */     return this.extInfo;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setExternalCardNo(String externalCardNo)
/*  55:    */   {
/*  56: 83 */     this.externalCardNo = externalCardNo;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getExternalCardNo()
/*  60:    */   {
/*  61: 86 */     return this.externalCardNo;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setReasonCode(String reasonCode)
/*  65:    */   {
/*  66: 90 */     this.reasonCode = reasonCode;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getReasonCode()
/*  70:    */   {
/*  71: 93 */     return this.reasonCode;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setRequestFrom(String requestFrom)
/*  75:    */   {
/*  76: 97 */     this.requestFrom = requestFrom;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getRequestFrom()
/*  80:    */   {
/*  81:100 */     return this.requestFrom;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getNotifyUrl()
/*  85:    */   {
/*  86:108 */     return this.notifyUrl;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setNotifyUrl(String notifyUrl)
/*  90:    */   {
/*  91:112 */     this.notifyUrl = notifyUrl;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getApiVersion()
/*  95:    */   {
/*  96:116 */     return this.apiVersion;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setApiVersion(String apiVersion)
/* 100:    */   {
/* 101:120 */     this.apiVersion = apiVersion;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setTerminalType(String terminalType)
/* 105:    */   {
/* 106:124 */     this.terminalType = terminalType;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getTerminalType()
/* 110:    */   {
/* 111:128 */     return this.terminalType;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setTerminalInfo(String terminalInfo)
/* 115:    */   {
/* 116:132 */     this.terminalInfo = terminalInfo;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public String getTerminalInfo()
/* 120:    */   {
/* 121:136 */     return this.terminalInfo;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setProdCode(String prodCode)
/* 125:    */   {
/* 126:140 */     this.prodCode = prodCode;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public String getProdCode()
/* 130:    */   {
/* 131:144 */     return this.prodCode;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getApiMethodName()
/* 135:    */   {
/* 136:148 */     return "alipay.member.card.deletecard";
/* 137:    */   }
/* 138:    */   
/* 139:    */   public Map<String, String> getTextParams()
/* 140:    */   {
/* 141:152 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 142:153 */     txtParams.put("biz_serial_no", this.bizSerialNo);
/* 143:154 */     txtParams.put("card_merchant_info", this.cardMerchantInfo);
/* 144:155 */     txtParams.put("ext_info", this.extInfo);
/* 145:156 */     txtParams.put("external_card_no", this.externalCardNo);
/* 146:157 */     txtParams.put("reason_code", this.reasonCode);
/* 147:158 */     txtParams.put("request_from", this.requestFrom);
/* 148:159 */     if (this.udfParams != null) {
/* 149:160 */       txtParams.putAll(this.udfParams);
/* 150:    */     }
/* 151:162 */     return txtParams;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void putOtherTextParam(String key, String value)
/* 155:    */   {
/* 156:166 */     if (this.udfParams == null) {
/* 157:167 */       this.udfParams = new AlipayHashMap();
/* 158:    */     }
/* 159:169 */     this.udfParams.put(key, value);
/* 160:    */   }
/* 161:    */   
/* 162:    */   public Class<AlipayMemberCardDeletecardResponse> getResponseClass()
/* 163:    */   {
/* 164:173 */     return AlipayMemberCardDeletecardResponse.class;
/* 165:    */   }
/* 166:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayMemberCardDeletecardRequest
 * JD-Core Version:    0.7.0.1
 */