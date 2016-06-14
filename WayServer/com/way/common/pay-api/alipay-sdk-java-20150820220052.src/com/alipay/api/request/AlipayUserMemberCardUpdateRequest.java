/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayUserMemberCardUpdateResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayUserMemberCardUpdateRequest
/*   9:    */   implements AlipayRequest<AlipayUserMemberCardUpdateResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String balance;
/*  14:    */   private String bizCardNo;
/*  15:    */   private String cardMerchantInfo;
/*  16:    */   private String extInfo;
/*  17:    */   private String externalCardNo;
/*  18:    */   private String level;
/*  19:    */   private String orrurTime;
/*  20:    */   private Long point;
/*  21:    */   private String requestFrom;
/*  22:    */   private String terminalType;
/*  23:    */   private String terminalInfo;
/*  24:    */   private String prodCode;
/*  25:    */   private String notifyUrl;
/*  26:    */   
/*  27:    */   public void setBalance(String balance)
/*  28:    */   {
/*  29: 79 */     this.balance = balance;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public String getBalance()
/*  33:    */   {
/*  34: 82 */     return this.balance;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void setBizCardNo(String bizCardNo)
/*  38:    */   {
/*  39: 86 */     this.bizCardNo = bizCardNo;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String getBizCardNo()
/*  43:    */   {
/*  44: 89 */     return this.bizCardNo;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setCardMerchantInfo(String cardMerchantInfo)
/*  48:    */   {
/*  49: 93 */     this.cardMerchantInfo = cardMerchantInfo;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String getCardMerchantInfo()
/*  53:    */   {
/*  54: 96 */     return this.cardMerchantInfo;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setExtInfo(String extInfo)
/*  58:    */   {
/*  59:100 */     this.extInfo = extInfo;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getExtInfo()
/*  63:    */   {
/*  64:103 */     return this.extInfo;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setExternalCardNo(String externalCardNo)
/*  68:    */   {
/*  69:107 */     this.externalCardNo = externalCardNo;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getExternalCardNo()
/*  73:    */   {
/*  74:110 */     return this.externalCardNo;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setLevel(String level)
/*  78:    */   {
/*  79:114 */     this.level = level;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getLevel()
/*  83:    */   {
/*  84:117 */     return this.level;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setOrrurTime(String orrurTime)
/*  88:    */   {
/*  89:121 */     this.orrurTime = orrurTime;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getOrrurTime()
/*  93:    */   {
/*  94:124 */     return this.orrurTime;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setPoint(Long point)
/*  98:    */   {
/*  99:128 */     this.point = point;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public Long getPoint()
/* 103:    */   {
/* 104:131 */     return this.point;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setRequestFrom(String requestFrom)
/* 108:    */   {
/* 109:135 */     this.requestFrom = requestFrom;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getRequestFrom()
/* 113:    */   {
/* 114:138 */     return this.requestFrom;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public String getNotifyUrl()
/* 118:    */   {
/* 119:146 */     return this.notifyUrl;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void setNotifyUrl(String notifyUrl)
/* 123:    */   {
/* 124:150 */     this.notifyUrl = notifyUrl;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getApiVersion()
/* 128:    */   {
/* 129:154 */     return this.apiVersion;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void setApiVersion(String apiVersion)
/* 133:    */   {
/* 134:158 */     this.apiVersion = apiVersion;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void setTerminalType(String terminalType)
/* 138:    */   {
/* 139:162 */     this.terminalType = terminalType;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public String getTerminalType()
/* 143:    */   {
/* 144:166 */     return this.terminalType;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void setTerminalInfo(String terminalInfo)
/* 148:    */   {
/* 149:170 */     this.terminalInfo = terminalInfo;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public String getTerminalInfo()
/* 153:    */   {
/* 154:174 */     return this.terminalInfo;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void setProdCode(String prodCode)
/* 158:    */   {
/* 159:178 */     this.prodCode = prodCode;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public String getProdCode()
/* 163:    */   {
/* 164:182 */     return this.prodCode;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public String getApiMethodName()
/* 168:    */   {
/* 169:186 */     return "alipay.user.member.card.update";
/* 170:    */   }
/* 171:    */   
/* 172:    */   public Map<String, String> getTextParams()
/* 173:    */   {
/* 174:190 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 175:191 */     txtParams.put("balance", this.balance);
/* 176:192 */     txtParams.put("biz_card_no", this.bizCardNo);
/* 177:193 */     txtParams.put("card_merchant_info", this.cardMerchantInfo);
/* 178:194 */     txtParams.put("ext_info", this.extInfo);
/* 179:195 */     txtParams.put("external_card_no", this.externalCardNo);
/* 180:196 */     txtParams.put("level", this.level);
/* 181:197 */     txtParams.put("orrur_time", this.orrurTime);
/* 182:198 */     txtParams.put("point", this.point);
/* 183:199 */     txtParams.put("request_from", this.requestFrom);
/* 184:200 */     if (this.udfParams != null) {
/* 185:201 */       txtParams.putAll(this.udfParams);
/* 186:    */     }
/* 187:203 */     return txtParams;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public void putOtherTextParam(String key, String value)
/* 191:    */   {
/* 192:207 */     if (this.udfParams == null) {
/* 193:208 */       this.udfParams = new AlipayHashMap();
/* 194:    */     }
/* 195:210 */     this.udfParams.put(key, value);
/* 196:    */   }
/* 197:    */   
/* 198:    */   public Class<AlipayUserMemberCardUpdateResponse> getResponseClass()
/* 199:    */   {
/* 200:214 */     return AlipayUserMemberCardUpdateResponse.class;
/* 201:    */   }
/* 202:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayUserMemberCardUpdateRequest
 * JD-Core Version:    0.7.0.1
 */