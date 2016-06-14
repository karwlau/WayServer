/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayMemberCardQueryResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayMemberCardQueryRequest
/*   9:    */   implements AlipayRequest<AlipayMemberCardQueryResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String bizCardNo;
/*  14:    */   private String cardMerchantInfo;
/*  15:    */   private String cardUserInfo;
/*  16:    */   private String extInfo;
/*  17:    */   private String requestFrom;
/*  18:    */   private String terminalType;
/*  19:    */   private String terminalInfo;
/*  20:    */   private String prodCode;
/*  21:    */   private String notifyUrl;
/*  22:    */   
/*  23:    */   public void setBizCardNo(String bizCardNo)
/*  24:    */   {
/*  25: 70 */     this.bizCardNo = bizCardNo;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public String getBizCardNo()
/*  29:    */   {
/*  30: 73 */     return this.bizCardNo;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setCardMerchantInfo(String cardMerchantInfo)
/*  34:    */   {
/*  35: 77 */     this.cardMerchantInfo = cardMerchantInfo;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getCardMerchantInfo()
/*  39:    */   {
/*  40: 80 */     return this.cardMerchantInfo;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setCardUserInfo(String cardUserInfo)
/*  44:    */   {
/*  45: 84 */     this.cardUserInfo = cardUserInfo;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getCardUserInfo()
/*  49:    */   {
/*  50: 87 */     return this.cardUserInfo;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setExtInfo(String extInfo)
/*  54:    */   {
/*  55: 91 */     this.extInfo = extInfo;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getExtInfo()
/*  59:    */   {
/*  60: 94 */     return this.extInfo;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setRequestFrom(String requestFrom)
/*  64:    */   {
/*  65: 98 */     this.requestFrom = requestFrom;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getRequestFrom()
/*  69:    */   {
/*  70:101 */     return this.requestFrom;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getNotifyUrl()
/*  74:    */   {
/*  75:109 */     return this.notifyUrl;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setNotifyUrl(String notifyUrl)
/*  79:    */   {
/*  80:113 */     this.notifyUrl = notifyUrl;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public String getApiVersion()
/*  84:    */   {
/*  85:117 */     return this.apiVersion;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setApiVersion(String apiVersion)
/*  89:    */   {
/*  90:121 */     this.apiVersion = apiVersion;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setTerminalType(String terminalType)
/*  94:    */   {
/*  95:125 */     this.terminalType = terminalType;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getTerminalType()
/*  99:    */   {
/* 100:129 */     return this.terminalType;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setTerminalInfo(String terminalInfo)
/* 104:    */   {
/* 105:133 */     this.terminalInfo = terminalInfo;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public String getTerminalInfo()
/* 109:    */   {
/* 110:137 */     return this.terminalInfo;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setProdCode(String prodCode)
/* 114:    */   {
/* 115:141 */     this.prodCode = prodCode;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getProdCode()
/* 119:    */   {
/* 120:145 */     return this.prodCode;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getApiMethodName()
/* 124:    */   {
/* 125:149 */     return "alipay.member.card.query";
/* 126:    */   }
/* 127:    */   
/* 128:    */   public Map<String, String> getTextParams()
/* 129:    */   {
/* 130:153 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 131:154 */     txtParams.put("biz_card_no", this.bizCardNo);
/* 132:155 */     txtParams.put("card_merchant_info", this.cardMerchantInfo);
/* 133:156 */     txtParams.put("card_user_info", this.cardUserInfo);
/* 134:157 */     txtParams.put("ext_info", this.extInfo);
/* 135:158 */     txtParams.put("request_from", this.requestFrom);
/* 136:159 */     if (this.udfParams != null) {
/* 137:160 */       txtParams.putAll(this.udfParams);
/* 138:    */     }
/* 139:162 */     return txtParams;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void putOtherTextParam(String key, String value)
/* 143:    */   {
/* 144:166 */     if (this.udfParams == null) {
/* 145:167 */       this.udfParams = new AlipayHashMap();
/* 146:    */     }
/* 147:169 */     this.udfParams.put(key, value);
/* 148:    */   }
/* 149:    */   
/* 150:    */   public Class<AlipayMemberCardQueryResponse> getResponseClass()
/* 151:    */   {
/* 152:173 */     return AlipayMemberCardQueryResponse.class;
/* 153:    */   }
/* 154:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayMemberCardQueryRequest
 * JD-Core Version:    0.7.0.1
 */