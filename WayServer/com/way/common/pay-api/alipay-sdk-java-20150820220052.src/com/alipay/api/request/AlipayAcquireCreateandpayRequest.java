/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayAcquireCreateandpayResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayAcquireCreateandpayRequest
/*   9:    */   implements AlipayRequest<AlipayAcquireCreateandpayResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String alipayCaRequest;
/*  14:    */   private String body;
/*  15:    */   private String buyerEmail;
/*  16:    */   private String buyerId;
/*  17:    */   private String channelParameters;
/*  18:    */   private String currency;
/*  19:    */   private String dynamicId;
/*  20:    */   private String dynamicIdType;
/*  21:    */   private String extendParams;
/*  22:    */   private String formatType;
/*  23:    */   private String goodsDetail;
/*  24:    */   private String itBPay;
/*  25:    */   private String mcardParameters;
/*  26:    */   private String operatorId;
/*  27:    */   private String operatorType;
/*  28:    */   private String outTradeNo;
/*  29:    */   private String price;
/*  30:    */   private String quantity;
/*  31:    */   private String refIds;
/*  32:    */   private String royaltyParameters;
/*  33:    */   private String royaltyType;
/*  34:    */   private String sellerEmail;
/*  35:    */   private String sellerId;
/*  36:    */   private String showUrl;
/*  37:    */   private String subject;
/*  38:    */   private String totalFee;
/*  39:    */   private String terminalType;
/*  40:    */   private String terminalInfo;
/*  41:    */   private String prodCode;
/*  42:    */   private String notifyUrl;
/*  43:    */   
/*  44:    */   public void setAlipayCaRequest(String alipayCaRequest)
/*  45:    */   {
/*  46:183 */     this.alipayCaRequest = alipayCaRequest;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getAlipayCaRequest()
/*  50:    */   {
/*  51:186 */     return this.alipayCaRequest;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setBody(String body)
/*  55:    */   {
/*  56:190 */     this.body = body;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getBody()
/*  60:    */   {
/*  61:193 */     return this.body;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setBuyerEmail(String buyerEmail)
/*  65:    */   {
/*  66:197 */     this.buyerEmail = buyerEmail;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getBuyerEmail()
/*  70:    */   {
/*  71:200 */     return this.buyerEmail;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setBuyerId(String buyerId)
/*  75:    */   {
/*  76:204 */     this.buyerId = buyerId;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getBuyerId()
/*  80:    */   {
/*  81:207 */     return this.buyerId;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setChannelParameters(String channelParameters)
/*  85:    */   {
/*  86:211 */     this.channelParameters = channelParameters;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getChannelParameters()
/*  90:    */   {
/*  91:214 */     return this.channelParameters;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setCurrency(String currency)
/*  95:    */   {
/*  96:218 */     this.currency = currency;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getCurrency()
/* 100:    */   {
/* 101:221 */     return this.currency;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setDynamicId(String dynamicId)
/* 105:    */   {
/* 106:225 */     this.dynamicId = dynamicId;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getDynamicId()
/* 110:    */   {
/* 111:228 */     return this.dynamicId;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setDynamicIdType(String dynamicIdType)
/* 115:    */   {
/* 116:232 */     this.dynamicIdType = dynamicIdType;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public String getDynamicIdType()
/* 120:    */   {
/* 121:235 */     return this.dynamicIdType;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setExtendParams(String extendParams)
/* 125:    */   {
/* 126:239 */     this.extendParams = extendParams;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public String getExtendParams()
/* 130:    */   {
/* 131:242 */     return this.extendParams;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public void setFormatType(String formatType)
/* 135:    */   {
/* 136:246 */     this.formatType = formatType;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public String getFormatType()
/* 140:    */   {
/* 141:249 */     return this.formatType;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public void setGoodsDetail(String goodsDetail)
/* 145:    */   {
/* 146:253 */     this.goodsDetail = goodsDetail;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public String getGoodsDetail()
/* 150:    */   {
/* 151:256 */     return this.goodsDetail;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void setItBPay(String itBPay)
/* 155:    */   {
/* 156:260 */     this.itBPay = itBPay;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public String getItBPay()
/* 160:    */   {
/* 161:263 */     return this.itBPay;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void setMcardParameters(String mcardParameters)
/* 165:    */   {
/* 166:267 */     this.mcardParameters = mcardParameters;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public String getMcardParameters()
/* 170:    */   {
/* 171:270 */     return this.mcardParameters;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public void setOperatorId(String operatorId)
/* 175:    */   {
/* 176:274 */     this.operatorId = operatorId;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public String getOperatorId()
/* 180:    */   {
/* 181:277 */     return this.operatorId;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public void setOperatorType(String operatorType)
/* 185:    */   {
/* 186:281 */     this.operatorType = operatorType;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public String getOperatorType()
/* 190:    */   {
/* 191:284 */     return this.operatorType;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public void setOutTradeNo(String outTradeNo)
/* 195:    */   {
/* 196:288 */     this.outTradeNo = outTradeNo;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public String getOutTradeNo()
/* 200:    */   {
/* 201:291 */     return this.outTradeNo;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public void setPrice(String price)
/* 205:    */   {
/* 206:295 */     this.price = price;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public String getPrice()
/* 210:    */   {
/* 211:298 */     return this.price;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public void setQuantity(String quantity)
/* 215:    */   {
/* 216:302 */     this.quantity = quantity;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public String getQuantity()
/* 220:    */   {
/* 221:305 */     return this.quantity;
/* 222:    */   }
/* 223:    */   
/* 224:    */   public void setRefIds(String refIds)
/* 225:    */   {
/* 226:309 */     this.refIds = refIds;
/* 227:    */   }
/* 228:    */   
/* 229:    */   public String getRefIds()
/* 230:    */   {
/* 231:312 */     return this.refIds;
/* 232:    */   }
/* 233:    */   
/* 234:    */   public void setRoyaltyParameters(String royaltyParameters)
/* 235:    */   {
/* 236:316 */     this.royaltyParameters = royaltyParameters;
/* 237:    */   }
/* 238:    */   
/* 239:    */   public String getRoyaltyParameters()
/* 240:    */   {
/* 241:319 */     return this.royaltyParameters;
/* 242:    */   }
/* 243:    */   
/* 244:    */   public void setRoyaltyType(String royaltyType)
/* 245:    */   {
/* 246:323 */     this.royaltyType = royaltyType;
/* 247:    */   }
/* 248:    */   
/* 249:    */   public String getRoyaltyType()
/* 250:    */   {
/* 251:326 */     return this.royaltyType;
/* 252:    */   }
/* 253:    */   
/* 254:    */   public void setSellerEmail(String sellerEmail)
/* 255:    */   {
/* 256:330 */     this.sellerEmail = sellerEmail;
/* 257:    */   }
/* 258:    */   
/* 259:    */   public String getSellerEmail()
/* 260:    */   {
/* 261:333 */     return this.sellerEmail;
/* 262:    */   }
/* 263:    */   
/* 264:    */   public void setSellerId(String sellerId)
/* 265:    */   {
/* 266:337 */     this.sellerId = sellerId;
/* 267:    */   }
/* 268:    */   
/* 269:    */   public String getSellerId()
/* 270:    */   {
/* 271:340 */     return this.sellerId;
/* 272:    */   }
/* 273:    */   
/* 274:    */   public void setShowUrl(String showUrl)
/* 275:    */   {
/* 276:344 */     this.showUrl = showUrl;
/* 277:    */   }
/* 278:    */   
/* 279:    */   public String getShowUrl()
/* 280:    */   {
/* 281:347 */     return this.showUrl;
/* 282:    */   }
/* 283:    */   
/* 284:    */   public void setSubject(String subject)
/* 285:    */   {
/* 286:351 */     this.subject = subject;
/* 287:    */   }
/* 288:    */   
/* 289:    */   public String getSubject()
/* 290:    */   {
/* 291:354 */     return this.subject;
/* 292:    */   }
/* 293:    */   
/* 294:    */   public void setTotalFee(String totalFee)
/* 295:    */   {
/* 296:358 */     this.totalFee = totalFee;
/* 297:    */   }
/* 298:    */   
/* 299:    */   public String getTotalFee()
/* 300:    */   {
/* 301:361 */     return this.totalFee;
/* 302:    */   }
/* 303:    */   
/* 304:    */   public String getNotifyUrl()
/* 305:    */   {
/* 306:369 */     return this.notifyUrl;
/* 307:    */   }
/* 308:    */   
/* 309:    */   public void setNotifyUrl(String notifyUrl)
/* 310:    */   {
/* 311:373 */     this.notifyUrl = notifyUrl;
/* 312:    */   }
/* 313:    */   
/* 314:    */   public String getApiVersion()
/* 315:    */   {
/* 316:377 */     return this.apiVersion;
/* 317:    */   }
/* 318:    */   
/* 319:    */   public void setApiVersion(String apiVersion)
/* 320:    */   {
/* 321:381 */     this.apiVersion = apiVersion;
/* 322:    */   }
/* 323:    */   
/* 324:    */   public void setTerminalType(String terminalType)
/* 325:    */   {
/* 326:385 */     this.terminalType = terminalType;
/* 327:    */   }
/* 328:    */   
/* 329:    */   public String getTerminalType()
/* 330:    */   {
/* 331:389 */     return this.terminalType;
/* 332:    */   }
/* 333:    */   
/* 334:    */   public void setTerminalInfo(String terminalInfo)
/* 335:    */   {
/* 336:393 */     this.terminalInfo = terminalInfo;
/* 337:    */   }
/* 338:    */   
/* 339:    */   public String getTerminalInfo()
/* 340:    */   {
/* 341:397 */     return this.terminalInfo;
/* 342:    */   }
/* 343:    */   
/* 344:    */   public void setProdCode(String prodCode)
/* 345:    */   {
/* 346:401 */     this.prodCode = prodCode;
/* 347:    */   }
/* 348:    */   
/* 349:    */   public String getProdCode()
/* 350:    */   {
/* 351:405 */     return this.prodCode;
/* 352:    */   }
/* 353:    */   
/* 354:    */   public String getApiMethodName()
/* 355:    */   {
/* 356:409 */     return "alipay.acquire.createandpay";
/* 357:    */   }
/* 358:    */   
/* 359:    */   public Map<String, String> getTextParams()
/* 360:    */   {
/* 361:413 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 362:414 */     txtParams.put("alipay_ca_request", this.alipayCaRequest);
/* 363:415 */     txtParams.put("body", this.body);
/* 364:416 */     txtParams.put("buyer_email", this.buyerEmail);
/* 365:417 */     txtParams.put("buyer_id", this.buyerId);
/* 366:418 */     txtParams.put("channel_parameters", this.channelParameters);
/* 367:419 */     txtParams.put("currency", this.currency);
/* 368:420 */     txtParams.put("dynamic_id", this.dynamicId);
/* 369:421 */     txtParams.put("dynamic_id_type", this.dynamicIdType);
/* 370:422 */     txtParams.put("extend_params", this.extendParams);
/* 371:423 */     txtParams.put("format_type", this.formatType);
/* 372:424 */     txtParams.put("goods_detail", this.goodsDetail);
/* 373:425 */     txtParams.put("it_b_pay", this.itBPay);
/* 374:426 */     txtParams.put("mcard_parameters", this.mcardParameters);
/* 375:427 */     txtParams.put("operator_id", this.operatorId);
/* 376:428 */     txtParams.put("operator_type", this.operatorType);
/* 377:429 */     txtParams.put("out_trade_no", this.outTradeNo);
/* 378:430 */     txtParams.put("price", this.price);
/* 379:431 */     txtParams.put("quantity", this.quantity);
/* 380:432 */     txtParams.put("ref_ids", this.refIds);
/* 381:433 */     txtParams.put("royalty_parameters", this.royaltyParameters);
/* 382:434 */     txtParams.put("royalty_type", this.royaltyType);
/* 383:435 */     txtParams.put("seller_email", this.sellerEmail);
/* 384:436 */     txtParams.put("seller_id", this.sellerId);
/* 385:437 */     txtParams.put("show_url", this.showUrl);
/* 386:438 */     txtParams.put("subject", this.subject);
/* 387:439 */     txtParams.put("total_fee", this.totalFee);
/* 388:440 */     if (this.udfParams != null) {
/* 389:441 */       txtParams.putAll(this.udfParams);
/* 390:    */     }
/* 391:443 */     return txtParams;
/* 392:    */   }
/* 393:    */   
/* 394:    */   public void putOtherTextParam(String key, String value)
/* 395:    */   {
/* 396:447 */     if (this.udfParams == null) {
/* 397:448 */       this.udfParams = new AlipayHashMap();
/* 398:    */     }
/* 399:450 */     this.udfParams.put(key, value);
/* 400:    */   }
/* 401:    */   
/* 402:    */   public Class<AlipayAcquireCreateandpayResponse> getResponseClass()
/* 403:    */   {
/* 404:454 */     return AlipayAcquireCreateandpayResponse.class;
/* 405:    */   }
/* 406:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayAcquireCreateandpayRequest
 * JD-Core Version:    0.7.0.1
 */