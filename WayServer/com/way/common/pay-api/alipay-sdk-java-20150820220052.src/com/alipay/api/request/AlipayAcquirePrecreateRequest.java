/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayAcquirePrecreateResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayAcquirePrecreateRequest
/*   9:    */   implements AlipayRequest<AlipayAcquirePrecreateResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String body;
/*  14:    */   private String channelParameters;
/*  15:    */   private String currency;
/*  16:    */   private String extendParams;
/*  17:    */   private String goodsDetail;
/*  18:    */   private String itBPay;
/*  19:    */   private String operatorCode;
/*  20:    */   private String operatorId;
/*  21:    */   private String outTradeNo;
/*  22:    */   private String price;
/*  23:    */   private String quantity;
/*  24:    */   private String royaltyParameters;
/*  25:    */   private String royaltyType;
/*  26:    */   private String sellerEmail;
/*  27:    */   private String sellerId;
/*  28:    */   private String showUrl;
/*  29:    */   private String subject;
/*  30:    */   private String totalFee;
/*  31:    */   private String terminalType;
/*  32:    */   private String terminalInfo;
/*  33:    */   private String prodCode;
/*  34:    */   private String notifyUrl;
/*  35:    */   
/*  36:    */   public void setBody(String body)
/*  37:    */   {
/*  38:123 */     this.body = body;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getBody()
/*  42:    */   {
/*  43:126 */     return this.body;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setChannelParameters(String channelParameters)
/*  47:    */   {
/*  48:130 */     this.channelParameters = channelParameters;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getChannelParameters()
/*  52:    */   {
/*  53:133 */     return this.channelParameters;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setCurrency(String currency)
/*  57:    */   {
/*  58:137 */     this.currency = currency;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getCurrency()
/*  62:    */   {
/*  63:140 */     return this.currency;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setExtendParams(String extendParams)
/*  67:    */   {
/*  68:144 */     this.extendParams = extendParams;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getExtendParams()
/*  72:    */   {
/*  73:147 */     return this.extendParams;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setGoodsDetail(String goodsDetail)
/*  77:    */   {
/*  78:151 */     this.goodsDetail = goodsDetail;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getGoodsDetail()
/*  82:    */   {
/*  83:154 */     return this.goodsDetail;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setItBPay(String itBPay)
/*  87:    */   {
/*  88:158 */     this.itBPay = itBPay;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getItBPay()
/*  92:    */   {
/*  93:161 */     return this.itBPay;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setOperatorCode(String operatorCode)
/*  97:    */   {
/*  98:165 */     this.operatorCode = operatorCode;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getOperatorCode()
/* 102:    */   {
/* 103:168 */     return this.operatorCode;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setOperatorId(String operatorId)
/* 107:    */   {
/* 108:172 */     this.operatorId = operatorId;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getOperatorId()
/* 112:    */   {
/* 113:175 */     return this.operatorId;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setOutTradeNo(String outTradeNo)
/* 117:    */   {
/* 118:179 */     this.outTradeNo = outTradeNo;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getOutTradeNo()
/* 122:    */   {
/* 123:182 */     return this.outTradeNo;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setPrice(String price)
/* 127:    */   {
/* 128:186 */     this.price = price;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public String getPrice()
/* 132:    */   {
/* 133:189 */     return this.price;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setQuantity(String quantity)
/* 137:    */   {
/* 138:193 */     this.quantity = quantity;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public String getQuantity()
/* 142:    */   {
/* 143:196 */     return this.quantity;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void setRoyaltyParameters(String royaltyParameters)
/* 147:    */   {
/* 148:200 */     this.royaltyParameters = royaltyParameters;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public String getRoyaltyParameters()
/* 152:    */   {
/* 153:203 */     return this.royaltyParameters;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void setRoyaltyType(String royaltyType)
/* 157:    */   {
/* 158:207 */     this.royaltyType = royaltyType;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public String getRoyaltyType()
/* 162:    */   {
/* 163:210 */     return this.royaltyType;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void setSellerEmail(String sellerEmail)
/* 167:    */   {
/* 168:214 */     this.sellerEmail = sellerEmail;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public String getSellerEmail()
/* 172:    */   {
/* 173:217 */     return this.sellerEmail;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void setSellerId(String sellerId)
/* 177:    */   {
/* 178:221 */     this.sellerId = sellerId;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public String getSellerId()
/* 182:    */   {
/* 183:224 */     return this.sellerId;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void setShowUrl(String showUrl)
/* 187:    */   {
/* 188:228 */     this.showUrl = showUrl;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public String getShowUrl()
/* 192:    */   {
/* 193:231 */     return this.showUrl;
/* 194:    */   }
/* 195:    */   
/* 196:    */   public void setSubject(String subject)
/* 197:    */   {
/* 198:235 */     this.subject = subject;
/* 199:    */   }
/* 200:    */   
/* 201:    */   public String getSubject()
/* 202:    */   {
/* 203:238 */     return this.subject;
/* 204:    */   }
/* 205:    */   
/* 206:    */   public void setTotalFee(String totalFee)
/* 207:    */   {
/* 208:242 */     this.totalFee = totalFee;
/* 209:    */   }
/* 210:    */   
/* 211:    */   public String getTotalFee()
/* 212:    */   {
/* 213:245 */     return this.totalFee;
/* 214:    */   }
/* 215:    */   
/* 216:    */   public String getNotifyUrl()
/* 217:    */   {
/* 218:253 */     return this.notifyUrl;
/* 219:    */   }
/* 220:    */   
/* 221:    */   public void setNotifyUrl(String notifyUrl)
/* 222:    */   {
/* 223:257 */     this.notifyUrl = notifyUrl;
/* 224:    */   }
/* 225:    */   
/* 226:    */   public String getApiVersion()
/* 227:    */   {
/* 228:261 */     return this.apiVersion;
/* 229:    */   }
/* 230:    */   
/* 231:    */   public void setApiVersion(String apiVersion)
/* 232:    */   {
/* 233:265 */     this.apiVersion = apiVersion;
/* 234:    */   }
/* 235:    */   
/* 236:    */   public void setTerminalType(String terminalType)
/* 237:    */   {
/* 238:269 */     this.terminalType = terminalType;
/* 239:    */   }
/* 240:    */   
/* 241:    */   public String getTerminalType()
/* 242:    */   {
/* 243:273 */     return this.terminalType;
/* 244:    */   }
/* 245:    */   
/* 246:    */   public void setTerminalInfo(String terminalInfo)
/* 247:    */   {
/* 248:277 */     this.terminalInfo = terminalInfo;
/* 249:    */   }
/* 250:    */   
/* 251:    */   public String getTerminalInfo()
/* 252:    */   {
/* 253:281 */     return this.terminalInfo;
/* 254:    */   }
/* 255:    */   
/* 256:    */   public void setProdCode(String prodCode)
/* 257:    */   {
/* 258:285 */     this.prodCode = prodCode;
/* 259:    */   }
/* 260:    */   
/* 261:    */   public String getProdCode()
/* 262:    */   {
/* 263:289 */     return this.prodCode;
/* 264:    */   }
/* 265:    */   
/* 266:    */   public String getApiMethodName()
/* 267:    */   {
/* 268:293 */     return "alipay.acquire.precreate";
/* 269:    */   }
/* 270:    */   
/* 271:    */   public Map<String, String> getTextParams()
/* 272:    */   {
/* 273:297 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 274:298 */     txtParams.put("body", this.body);
/* 275:299 */     txtParams.put("channel_parameters", this.channelParameters);
/* 276:300 */     txtParams.put("currency", this.currency);
/* 277:301 */     txtParams.put("extend_params", this.extendParams);
/* 278:302 */     txtParams.put("goods_detail", this.goodsDetail);
/* 279:303 */     txtParams.put("it_b_pay", this.itBPay);
/* 280:304 */     txtParams.put("operator_code", this.operatorCode);
/* 281:305 */     txtParams.put("operator_id", this.operatorId);
/* 282:306 */     txtParams.put("out_trade_no", this.outTradeNo);
/* 283:307 */     txtParams.put("price", this.price);
/* 284:308 */     txtParams.put("quantity", this.quantity);
/* 285:309 */     txtParams.put("royalty_parameters", this.royaltyParameters);
/* 286:310 */     txtParams.put("royalty_type", this.royaltyType);
/* 287:311 */     txtParams.put("seller_email", this.sellerEmail);
/* 288:312 */     txtParams.put("seller_id", this.sellerId);
/* 289:313 */     txtParams.put("show_url", this.showUrl);
/* 290:314 */     txtParams.put("subject", this.subject);
/* 291:315 */     txtParams.put("total_fee", this.totalFee);
/* 292:316 */     if (this.udfParams != null) {
/* 293:317 */       txtParams.putAll(this.udfParams);
/* 294:    */     }
/* 295:319 */     return txtParams;
/* 296:    */   }
/* 297:    */   
/* 298:    */   public void putOtherTextParam(String key, String value)
/* 299:    */   {
/* 300:323 */     if (this.udfParams == null) {
/* 301:324 */       this.udfParams = new AlipayHashMap();
/* 302:    */     }
/* 303:326 */     this.udfParams.put(key, value);
/* 304:    */   }
/* 305:    */   
/* 306:    */   public Class<AlipayAcquirePrecreateResponse> getResponseClass()
/* 307:    */   {
/* 308:330 */     return AlipayAcquirePrecreateResponse.class;
/* 309:    */   }
/* 310:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayAcquirePrecreateRequest
 * JD-Core Version:    0.7.0.1
 */