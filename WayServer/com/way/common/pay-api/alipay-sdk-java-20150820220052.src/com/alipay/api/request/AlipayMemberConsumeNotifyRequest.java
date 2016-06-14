/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayMemberConsumeNotifyResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayMemberConsumeNotifyRequest
/*   9:    */   implements AlipayRequest<AlipayMemberConsumeNotifyResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String actPayAmount;
/*  14:    */   private String bizCardNo;
/*  15:    */   private String cardInfo;
/*  16:    */   private String externalCardNo;
/*  17:    */   private String gainBenefitList;
/*  18:    */   private String memo;
/*  19:    */   private String shopCode;
/*  20:    */   private String swipeCertType;
/*  21:    */   private String tradeAmount;
/*  22:    */   private String tradeName;
/*  23:    */   private String tradeNo;
/*  24:    */   private String tradeTime;
/*  25:    */   private String tradeType;
/*  26:    */   private String useBenefitList;
/*  27:    */   private String terminalType;
/*  28:    */   private String terminalInfo;
/*  29:    */   private String prodCode;
/*  30:    */   private String notifyUrl;
/*  31:    */   
/*  32:    */   public void setActPayAmount(String actPayAmount)
/*  33:    */   {
/*  34:119 */     this.actPayAmount = actPayAmount;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getActPayAmount()
/*  38:    */   {
/*  39:122 */     return this.actPayAmount;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setBizCardNo(String bizCardNo)
/*  43:    */   {
/*  44:126 */     this.bizCardNo = bizCardNo;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getBizCardNo()
/*  48:    */   {
/*  49:129 */     return this.bizCardNo;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setCardInfo(String cardInfo)
/*  53:    */   {
/*  54:133 */     this.cardInfo = cardInfo;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getCardInfo()
/*  58:    */   {
/*  59:136 */     return this.cardInfo;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setExternalCardNo(String externalCardNo)
/*  63:    */   {
/*  64:140 */     this.externalCardNo = externalCardNo;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getExternalCardNo()
/*  68:    */   {
/*  69:143 */     return this.externalCardNo;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setGainBenefitList(String gainBenefitList)
/*  73:    */   {
/*  74:147 */     this.gainBenefitList = gainBenefitList;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getGainBenefitList()
/*  78:    */   {
/*  79:150 */     return this.gainBenefitList;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setMemo(String memo)
/*  83:    */   {
/*  84:154 */     this.memo = memo;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getMemo()
/*  88:    */   {
/*  89:157 */     return this.memo;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setShopCode(String shopCode)
/*  93:    */   {
/*  94:161 */     this.shopCode = shopCode;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getShopCode()
/*  98:    */   {
/*  99:164 */     return this.shopCode;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setSwipeCertType(String swipeCertType)
/* 103:    */   {
/* 104:168 */     this.swipeCertType = swipeCertType;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getSwipeCertType()
/* 108:    */   {
/* 109:171 */     return this.swipeCertType;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void setTradeAmount(String tradeAmount)
/* 113:    */   {
/* 114:175 */     this.tradeAmount = tradeAmount;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public String getTradeAmount()
/* 118:    */   {
/* 119:178 */     return this.tradeAmount;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void setTradeName(String tradeName)
/* 123:    */   {
/* 124:182 */     this.tradeName = tradeName;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getTradeName()
/* 128:    */   {
/* 129:185 */     return this.tradeName;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void setTradeNo(String tradeNo)
/* 133:    */   {
/* 134:189 */     this.tradeNo = tradeNo;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public String getTradeNo()
/* 138:    */   {
/* 139:192 */     return this.tradeNo;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void setTradeTime(String tradeTime)
/* 143:    */   {
/* 144:196 */     this.tradeTime = tradeTime;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public String getTradeTime()
/* 148:    */   {
/* 149:199 */     return this.tradeTime;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void setTradeType(String tradeType)
/* 153:    */   {
/* 154:203 */     this.tradeType = tradeType;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public String getTradeType()
/* 158:    */   {
/* 159:206 */     return this.tradeType;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void setUseBenefitList(String useBenefitList)
/* 163:    */   {
/* 164:210 */     this.useBenefitList = useBenefitList;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public String getUseBenefitList()
/* 168:    */   {
/* 169:213 */     return this.useBenefitList;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public String getNotifyUrl()
/* 173:    */   {
/* 174:221 */     return this.notifyUrl;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public void setNotifyUrl(String notifyUrl)
/* 178:    */   {
/* 179:225 */     this.notifyUrl = notifyUrl;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public String getApiVersion()
/* 183:    */   {
/* 184:229 */     return this.apiVersion;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public void setApiVersion(String apiVersion)
/* 188:    */   {
/* 189:233 */     this.apiVersion = apiVersion;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public void setTerminalType(String terminalType)
/* 193:    */   {
/* 194:237 */     this.terminalType = terminalType;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public String getTerminalType()
/* 198:    */   {
/* 199:241 */     return this.terminalType;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public void setTerminalInfo(String terminalInfo)
/* 203:    */   {
/* 204:245 */     this.terminalInfo = terminalInfo;
/* 205:    */   }
/* 206:    */   
/* 207:    */   public String getTerminalInfo()
/* 208:    */   {
/* 209:249 */     return this.terminalInfo;
/* 210:    */   }
/* 211:    */   
/* 212:    */   public void setProdCode(String prodCode)
/* 213:    */   {
/* 214:253 */     this.prodCode = prodCode;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public String getProdCode()
/* 218:    */   {
/* 219:257 */     return this.prodCode;
/* 220:    */   }
/* 221:    */   
/* 222:    */   public String getApiMethodName()
/* 223:    */   {
/* 224:261 */     return "alipay.member.consume.notify";
/* 225:    */   }
/* 226:    */   
/* 227:    */   public Map<String, String> getTextParams()
/* 228:    */   {
/* 229:265 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 230:266 */     txtParams.put("act_pay_amount", this.actPayAmount);
/* 231:267 */     txtParams.put("biz_card_no", this.bizCardNo);
/* 232:268 */     txtParams.put("card_info", this.cardInfo);
/* 233:269 */     txtParams.put("external_card_no", this.externalCardNo);
/* 234:270 */     txtParams.put("gain_benefit_list", this.gainBenefitList);
/* 235:271 */     txtParams.put("memo", this.memo);
/* 236:272 */     txtParams.put("shop_code", this.shopCode);
/* 237:273 */     txtParams.put("swipe_cert_type", this.swipeCertType);
/* 238:274 */     txtParams.put("trade_amount", this.tradeAmount);
/* 239:275 */     txtParams.put("trade_name", this.tradeName);
/* 240:276 */     txtParams.put("trade_no", this.tradeNo);
/* 241:277 */     txtParams.put("trade_time", this.tradeTime);
/* 242:278 */     txtParams.put("trade_type", this.tradeType);
/* 243:279 */     txtParams.put("use_benefit_list", this.useBenefitList);
/* 244:280 */     if (this.udfParams != null) {
/* 245:281 */       txtParams.putAll(this.udfParams);
/* 246:    */     }
/* 247:283 */     return txtParams;
/* 248:    */   }
/* 249:    */   
/* 250:    */   public void putOtherTextParam(String key, String value)
/* 251:    */   {
/* 252:287 */     if (this.udfParams == null) {
/* 253:288 */       this.udfParams = new AlipayHashMap();
/* 254:    */     }
/* 255:290 */     this.udfParams.put(key, value);
/* 256:    */   }
/* 257:    */   
/* 258:    */   public Class<AlipayMemberConsumeNotifyResponse> getResponseClass()
/* 259:    */   {
/* 260:294 */     return AlipayMemberConsumeNotifyResponse.class;
/* 261:    */   }
/* 262:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayMemberConsumeNotifyRequest
 * JD-Core Version:    0.7.0.1
 */