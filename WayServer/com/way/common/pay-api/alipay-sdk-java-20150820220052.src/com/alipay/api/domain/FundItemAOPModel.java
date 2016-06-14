/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class FundItemAOPModel
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 5524492654484849882L;
/*  11:    */   @ApiField("acctrans_out_biz_no")
/*  12:    */   private String acctransOutBizNo;
/*  13:    */   @ApiField("amount")
/*  14:    */   private String amount;
/*  15:    */   @ApiField("assert_type_code")
/*  16:    */   private String assertTypeCode;
/*  17:    */   @ApiField("biz_id")
/*  18:    */   private String bizId;
/*  19:    */   @ApiField("biz_in_no")
/*  20:    */   private String bizInNo;
/*  21:    */   @ApiField("biz_out_no")
/*  22:    */   private String bizOutNo;
/*  23:    */   @ApiField("biz_type")
/*  24:    */   private String bizType;
/*  25:    */   @ApiField("dback_amount")
/*  26:    */   private String dbackAmount;
/*  27:    */   @ApiField("dback_gmt_create")
/*  28:    */   private Date dbackGmtCreate;
/*  29:    */   @ApiField("dback_gmt_est_bk_ack")
/*  30:    */   private Date dbackGmtEstBkAck;
/*  31:    */   @ApiField("dback_gmt_est_bk_into")
/*  32:    */   private Date dbackGmtEstBkInto;
/*  33:    */   @ApiField("dback_inst_account_name")
/*  34:    */   private String dbackInstAccountName;
/*  35:    */   @ApiField("dback_inst_account_no")
/*  36:    */   private String dbackInstAccountNo;
/*  37:    */   @ApiField("dback_inst_id")
/*  38:    */   private String dbackInstId;
/*  39:    */   @ApiField("dback_inst_name")
/*  40:    */   private String dbackInstName;
/*  41:    */   @ApiField("fid")
/*  42:    */   private String fid;
/*  43:    */   @ApiField("fund_access_type")
/*  44:    */   private Long fundAccessType;
/*  45:    */   @ApiField("fund_account_no")
/*  46:    */   private String fundAccountNo;
/*  47:    */   @ApiField("fund_biz_type")
/*  48:    */   private Long fundBizType;
/*  49:    */   @ApiField("fund_create_time")
/*  50:    */   private Date fundCreateTime;
/*  51:    */   @ApiField("fund_finish_time")
/*  52:    */   private Date fundFinishTime;
/*  53:    */   @ApiField("fund_in_out")
/*  54:    */   private Long fundInOut;
/*  55:    */   @ApiField("fund_inst_id")
/*  56:    */   private String fundInstId;
/*  57:    */   @ApiField("fund_modify_time")
/*  58:    */   private Date fundModifyTime;
/*  59:    */   @ApiField("fund_status")
/*  60:    */   private String fundStatus;
/*  61:    */   @ApiField("fund_tool_belong_to_crowner")
/*  62:    */   private Boolean fundToolBelongToCrowner;
/*  63:    */   @ApiField("fund_tool_owner_card_no")
/*  64:    */   private String fundToolOwnerCardNo;
/*  65:    */   @ApiField("fund_tool_type_for_crowner")
/*  66:    */   private String fundToolTypeForCrowner;
/*  67:    */   @ApiField("fund_tool_type_for_system")
/*  68:    */   private String fundToolTypeForSystem;
/*  69:    */   @ApiField("fund_tool_type_name")
/*  70:    */   private String fundToolTypeName;
/*  71:    */   @ApiField("gmt_biz_create")
/*  72:    */   private Date gmtBizCreate;
/*  73:    */   @ApiField("opposite_biz_card_alias")
/*  74:    */   private String oppositeBizCardAlias;
/*  75:    */   @ApiField("opposite_biz_card_no")
/*  76:    */   private String oppositeBizCardNo;
/*  77:    */   @ApiField("opposite_fund_card_no")
/*  78:    */   private String oppositeFundCardNo;
/*  79:    */   @ApiField("out_request_no")
/*  80:    */   private String outRequestNo;
/*  81:    */   @ApiField("owner_card_no")
/*  82:    */   private String ownerCardNo;
/*  83:    */   @ApiField("refund_bank_status")
/*  84:    */   private String refundBankStatus;
/*  85:    */   @ApiField("sub_prepaid_card_type")
/*  86:    */   private String subPrepaidCardType;
/*  87:    */   @ApiField("uid")
/*  88:    */   private String uid;
/*  89:    */   
/*  90:    */   public String getAcctransOutBizNo()
/*  91:    */   {
/*  92:253 */     return this.acctransOutBizNo;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setAcctransOutBizNo(String acctransOutBizNo)
/*  96:    */   {
/*  97:256 */     this.acctransOutBizNo = acctransOutBizNo;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getAmount()
/* 101:    */   {
/* 102:260 */     return this.amount;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setAmount(String amount)
/* 106:    */   {
/* 107:263 */     this.amount = amount;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getAssertTypeCode()
/* 111:    */   {
/* 112:267 */     return this.assertTypeCode;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setAssertTypeCode(String assertTypeCode)
/* 116:    */   {
/* 117:270 */     this.assertTypeCode = assertTypeCode;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public String getBizId()
/* 121:    */   {
/* 122:274 */     return this.bizId;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setBizId(String bizId)
/* 126:    */   {
/* 127:277 */     this.bizId = bizId;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public String getBizInNo()
/* 131:    */   {
/* 132:281 */     return this.bizInNo;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void setBizInNo(String bizInNo)
/* 136:    */   {
/* 137:284 */     this.bizInNo = bizInNo;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String getBizOutNo()
/* 141:    */   {
/* 142:288 */     return this.bizOutNo;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void setBizOutNo(String bizOutNo)
/* 146:    */   {
/* 147:291 */     this.bizOutNo = bizOutNo;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public String getBizType()
/* 151:    */   {
/* 152:295 */     return this.bizType;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void setBizType(String bizType)
/* 156:    */   {
/* 157:298 */     this.bizType = bizType;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public String getDbackAmount()
/* 161:    */   {
/* 162:302 */     return this.dbackAmount;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void setDbackAmount(String dbackAmount)
/* 166:    */   {
/* 167:305 */     this.dbackAmount = dbackAmount;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public Date getDbackGmtCreate()
/* 171:    */   {
/* 172:309 */     return this.dbackGmtCreate;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void setDbackGmtCreate(Date dbackGmtCreate)
/* 176:    */   {
/* 177:312 */     this.dbackGmtCreate = dbackGmtCreate;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public Date getDbackGmtEstBkAck()
/* 181:    */   {
/* 182:316 */     return this.dbackGmtEstBkAck;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public void setDbackGmtEstBkAck(Date dbackGmtEstBkAck)
/* 186:    */   {
/* 187:319 */     this.dbackGmtEstBkAck = dbackGmtEstBkAck;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public Date getDbackGmtEstBkInto()
/* 191:    */   {
/* 192:323 */     return this.dbackGmtEstBkInto;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public void setDbackGmtEstBkInto(Date dbackGmtEstBkInto)
/* 196:    */   {
/* 197:326 */     this.dbackGmtEstBkInto = dbackGmtEstBkInto;
/* 198:    */   }
/* 199:    */   
/* 200:    */   public String getDbackInstAccountName()
/* 201:    */   {
/* 202:330 */     return this.dbackInstAccountName;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public void setDbackInstAccountName(String dbackInstAccountName)
/* 206:    */   {
/* 207:333 */     this.dbackInstAccountName = dbackInstAccountName;
/* 208:    */   }
/* 209:    */   
/* 210:    */   public String getDbackInstAccountNo()
/* 211:    */   {
/* 212:337 */     return this.dbackInstAccountNo;
/* 213:    */   }
/* 214:    */   
/* 215:    */   public void setDbackInstAccountNo(String dbackInstAccountNo)
/* 216:    */   {
/* 217:340 */     this.dbackInstAccountNo = dbackInstAccountNo;
/* 218:    */   }
/* 219:    */   
/* 220:    */   public String getDbackInstId()
/* 221:    */   {
/* 222:344 */     return this.dbackInstId;
/* 223:    */   }
/* 224:    */   
/* 225:    */   public void setDbackInstId(String dbackInstId)
/* 226:    */   {
/* 227:347 */     this.dbackInstId = dbackInstId;
/* 228:    */   }
/* 229:    */   
/* 230:    */   public String getDbackInstName()
/* 231:    */   {
/* 232:351 */     return this.dbackInstName;
/* 233:    */   }
/* 234:    */   
/* 235:    */   public void setDbackInstName(String dbackInstName)
/* 236:    */   {
/* 237:354 */     this.dbackInstName = dbackInstName;
/* 238:    */   }
/* 239:    */   
/* 240:    */   public String getFid()
/* 241:    */   {
/* 242:358 */     return this.fid;
/* 243:    */   }
/* 244:    */   
/* 245:    */   public void setFid(String fid)
/* 246:    */   {
/* 247:361 */     this.fid = fid;
/* 248:    */   }
/* 249:    */   
/* 250:    */   public Long getFundAccessType()
/* 251:    */   {
/* 252:365 */     return this.fundAccessType;
/* 253:    */   }
/* 254:    */   
/* 255:    */   public void setFundAccessType(Long fundAccessType)
/* 256:    */   {
/* 257:368 */     this.fundAccessType = fundAccessType;
/* 258:    */   }
/* 259:    */   
/* 260:    */   public String getFundAccountNo()
/* 261:    */   {
/* 262:372 */     return this.fundAccountNo;
/* 263:    */   }
/* 264:    */   
/* 265:    */   public void setFundAccountNo(String fundAccountNo)
/* 266:    */   {
/* 267:375 */     this.fundAccountNo = fundAccountNo;
/* 268:    */   }
/* 269:    */   
/* 270:    */   public Long getFundBizType()
/* 271:    */   {
/* 272:379 */     return this.fundBizType;
/* 273:    */   }
/* 274:    */   
/* 275:    */   public void setFundBizType(Long fundBizType)
/* 276:    */   {
/* 277:382 */     this.fundBizType = fundBizType;
/* 278:    */   }
/* 279:    */   
/* 280:    */   public Date getFundCreateTime()
/* 281:    */   {
/* 282:386 */     return this.fundCreateTime;
/* 283:    */   }
/* 284:    */   
/* 285:    */   public void setFundCreateTime(Date fundCreateTime)
/* 286:    */   {
/* 287:389 */     this.fundCreateTime = fundCreateTime;
/* 288:    */   }
/* 289:    */   
/* 290:    */   public Date getFundFinishTime()
/* 291:    */   {
/* 292:393 */     return this.fundFinishTime;
/* 293:    */   }
/* 294:    */   
/* 295:    */   public void setFundFinishTime(Date fundFinishTime)
/* 296:    */   {
/* 297:396 */     this.fundFinishTime = fundFinishTime;
/* 298:    */   }
/* 299:    */   
/* 300:    */   public Long getFundInOut()
/* 301:    */   {
/* 302:400 */     return this.fundInOut;
/* 303:    */   }
/* 304:    */   
/* 305:    */   public void setFundInOut(Long fundInOut)
/* 306:    */   {
/* 307:403 */     this.fundInOut = fundInOut;
/* 308:    */   }
/* 309:    */   
/* 310:    */   public String getFundInstId()
/* 311:    */   {
/* 312:407 */     return this.fundInstId;
/* 313:    */   }
/* 314:    */   
/* 315:    */   public void setFundInstId(String fundInstId)
/* 316:    */   {
/* 317:410 */     this.fundInstId = fundInstId;
/* 318:    */   }
/* 319:    */   
/* 320:    */   public Date getFundModifyTime()
/* 321:    */   {
/* 322:414 */     return this.fundModifyTime;
/* 323:    */   }
/* 324:    */   
/* 325:    */   public void setFundModifyTime(Date fundModifyTime)
/* 326:    */   {
/* 327:417 */     this.fundModifyTime = fundModifyTime;
/* 328:    */   }
/* 329:    */   
/* 330:    */   public String getFundStatus()
/* 331:    */   {
/* 332:421 */     return this.fundStatus;
/* 333:    */   }
/* 334:    */   
/* 335:    */   public void setFundStatus(String fundStatus)
/* 336:    */   {
/* 337:424 */     this.fundStatus = fundStatus;
/* 338:    */   }
/* 339:    */   
/* 340:    */   public Boolean getFundToolBelongToCrowner()
/* 341:    */   {
/* 342:428 */     return this.fundToolBelongToCrowner;
/* 343:    */   }
/* 344:    */   
/* 345:    */   public void setFundToolBelongToCrowner(Boolean fundToolBelongToCrowner)
/* 346:    */   {
/* 347:431 */     this.fundToolBelongToCrowner = fundToolBelongToCrowner;
/* 348:    */   }
/* 349:    */   
/* 350:    */   public String getFundToolOwnerCardNo()
/* 351:    */   {
/* 352:435 */     return this.fundToolOwnerCardNo;
/* 353:    */   }
/* 354:    */   
/* 355:    */   public void setFundToolOwnerCardNo(String fundToolOwnerCardNo)
/* 356:    */   {
/* 357:438 */     this.fundToolOwnerCardNo = fundToolOwnerCardNo;
/* 358:    */   }
/* 359:    */   
/* 360:    */   public String getFundToolTypeForCrowner()
/* 361:    */   {
/* 362:442 */     return this.fundToolTypeForCrowner;
/* 363:    */   }
/* 364:    */   
/* 365:    */   public void setFundToolTypeForCrowner(String fundToolTypeForCrowner)
/* 366:    */   {
/* 367:445 */     this.fundToolTypeForCrowner = fundToolTypeForCrowner;
/* 368:    */   }
/* 369:    */   
/* 370:    */   public String getFundToolTypeForSystem()
/* 371:    */   {
/* 372:449 */     return this.fundToolTypeForSystem;
/* 373:    */   }
/* 374:    */   
/* 375:    */   public void setFundToolTypeForSystem(String fundToolTypeForSystem)
/* 376:    */   {
/* 377:452 */     this.fundToolTypeForSystem = fundToolTypeForSystem;
/* 378:    */   }
/* 379:    */   
/* 380:    */   public String getFundToolTypeName()
/* 381:    */   {
/* 382:456 */     return this.fundToolTypeName;
/* 383:    */   }
/* 384:    */   
/* 385:    */   public void setFundToolTypeName(String fundToolTypeName)
/* 386:    */   {
/* 387:459 */     this.fundToolTypeName = fundToolTypeName;
/* 388:    */   }
/* 389:    */   
/* 390:    */   public Date getGmtBizCreate()
/* 391:    */   {
/* 392:463 */     return this.gmtBizCreate;
/* 393:    */   }
/* 394:    */   
/* 395:    */   public void setGmtBizCreate(Date gmtBizCreate)
/* 396:    */   {
/* 397:466 */     this.gmtBizCreate = gmtBizCreate;
/* 398:    */   }
/* 399:    */   
/* 400:    */   public String getOppositeBizCardAlias()
/* 401:    */   {
/* 402:470 */     return this.oppositeBizCardAlias;
/* 403:    */   }
/* 404:    */   
/* 405:    */   public void setOppositeBizCardAlias(String oppositeBizCardAlias)
/* 406:    */   {
/* 407:473 */     this.oppositeBizCardAlias = oppositeBizCardAlias;
/* 408:    */   }
/* 409:    */   
/* 410:    */   public String getOppositeBizCardNo()
/* 411:    */   {
/* 412:477 */     return this.oppositeBizCardNo;
/* 413:    */   }
/* 414:    */   
/* 415:    */   public void setOppositeBizCardNo(String oppositeBizCardNo)
/* 416:    */   {
/* 417:480 */     this.oppositeBizCardNo = oppositeBizCardNo;
/* 418:    */   }
/* 419:    */   
/* 420:    */   public String getOppositeFundCardNo()
/* 421:    */   {
/* 422:484 */     return this.oppositeFundCardNo;
/* 423:    */   }
/* 424:    */   
/* 425:    */   public void setOppositeFundCardNo(String oppositeFundCardNo)
/* 426:    */   {
/* 427:487 */     this.oppositeFundCardNo = oppositeFundCardNo;
/* 428:    */   }
/* 429:    */   
/* 430:    */   public String getOutRequestNo()
/* 431:    */   {
/* 432:491 */     return this.outRequestNo;
/* 433:    */   }
/* 434:    */   
/* 435:    */   public void setOutRequestNo(String outRequestNo)
/* 436:    */   {
/* 437:494 */     this.outRequestNo = outRequestNo;
/* 438:    */   }
/* 439:    */   
/* 440:    */   public String getOwnerCardNo()
/* 441:    */   {
/* 442:498 */     return this.ownerCardNo;
/* 443:    */   }
/* 444:    */   
/* 445:    */   public void setOwnerCardNo(String ownerCardNo)
/* 446:    */   {
/* 447:501 */     this.ownerCardNo = ownerCardNo;
/* 448:    */   }
/* 449:    */   
/* 450:    */   public String getRefundBankStatus()
/* 451:    */   {
/* 452:505 */     return this.refundBankStatus;
/* 453:    */   }
/* 454:    */   
/* 455:    */   public void setRefundBankStatus(String refundBankStatus)
/* 456:    */   {
/* 457:508 */     this.refundBankStatus = refundBankStatus;
/* 458:    */   }
/* 459:    */   
/* 460:    */   public String getSubPrepaidCardType()
/* 461:    */   {
/* 462:512 */     return this.subPrepaidCardType;
/* 463:    */   }
/* 464:    */   
/* 465:    */   public void setSubPrepaidCardType(String subPrepaidCardType)
/* 466:    */   {
/* 467:515 */     this.subPrepaidCardType = subPrepaidCardType;
/* 468:    */   }
/* 469:    */   
/* 470:    */   public String getUid()
/* 471:    */   {
/* 472:519 */     return this.uid;
/* 473:    */   }
/* 474:    */   
/* 475:    */   public void setUid(String uid)
/* 476:    */   {
/* 477:522 */     this.uid = uid;
/* 478:    */   }
/* 479:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.FundItemAOPModel
 * JD-Core Version:    0.7.0.1
 */