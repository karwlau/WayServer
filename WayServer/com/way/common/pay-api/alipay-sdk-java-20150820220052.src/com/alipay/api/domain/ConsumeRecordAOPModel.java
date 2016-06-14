/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class ConsumeRecordAOPModel
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 1855762549954971947L;
/*  13:    */   @ApiField("access_channel")
/*  14:    */   private String accessChannel;
/*  15:    */   @ApiField("additional_status")
/*  16:    */   private String additionalStatus;
/*  17:    */   @ApiListField("biz_actions")
/*  18:    */   @ApiField("string")
/*  19:    */   private List<String> bizActions;
/*  20:    */   @ApiField("biz_extra_no")
/*  21:    */   private String bizExtraNo;
/*  22:    */   @ApiField("biz_in_no")
/*  23:    */   private String bizInNo;
/*  24:    */   @ApiField("biz_memo")
/*  25:    */   private String bizMemo;
/*  26:    */   @ApiField("biz_orig")
/*  27:    */   private String bizOrig;
/*  28:    */   @ApiField("biz_out_no")
/*  29:    */   private String bizOutNo;
/*  30:    */   @ApiField("biz_state")
/*  31:    */   private String bizState;
/*  32:    */   @ApiField("biz_sub_type")
/*  33:    */   private String bizSubType;
/*  34:    */   @ApiField("biz_type")
/*  35:    */   private String bizType;
/*  36:    */   @ApiField("category_id")
/*  37:    */   private String categoryId;
/*  38:    */   @ApiField("consume_fee")
/*  39:    */   private String consumeFee;
/*  40:    */   @ApiField("consume_refund_status")
/*  41:    */   private String consumeRefundStatus;
/*  42:    */   @ApiField("consume_site")
/*  43:    */   private String consumeSite;
/*  44:    */   @ApiField("consume_status")
/*  45:    */   private String consumeStatus;
/*  46:    */   @ApiField("consume_title")
/*  47:    */   private String consumeTitle;
/*  48:    */   @ApiField("consume_type")
/*  49:    */   private String consumeType;
/*  50:    */   @ApiField("currency")
/*  51:    */   private String currency;
/*  52:    */   @ApiField("delete_over_time")
/*  53:    */   private Date deleteOverTime;
/*  54:    */   @ApiField("delete_time")
/*  55:    */   private Date deleteTime;
/*  56:    */   @ApiField("delete_type")
/*  57:    */   private String deleteType;
/*  58:    */   @ApiField("depositback_status")
/*  59:    */   private String depositbackStatus;
/*  60:    */   @ApiField("flag_locked")
/*  61:    */   private String flagLocked;
/*  62:    */   @ApiField("flag_refund")
/*  63:    */   private String flagRefund;
/*  64:    */   @ApiField("gmt_biz_create")
/*  65:    */   private Date gmtBizCreate;
/*  66:    */   @ApiField("gmt_biz_modified")
/*  67:    */   private Date gmtBizModified;
/*  68:    */   @ApiField("gmt_create")
/*  69:    */   private Date gmtCreate;
/*  70:    */   @ApiField("gmt_modified")
/*  71:    */   private Date gmtModified;
/*  72:    */   @ApiField("gmt_receive_pay")
/*  73:    */   private Date gmtReceivePay;
/*  74:    */   @ApiField("gmt_send_pay")
/*  75:    */   private Date gmtSendPay;
/*  76:    */   @ApiField("has_fund_item")
/*  77:    */   private Boolean hasFundItem;
/*  78:    */   @ApiField("has_new_fund_item")
/*  79:    */   private Boolean hasNewFundItem;
/*  80:    */   @ApiField("in_out")
/*  81:    */   private String inOut;
/*  82:    */   @ApiField("opposite_card_no")
/*  83:    */   private String oppositeCardNo;
/*  84:    */   @ApiField("opposite_login_id")
/*  85:    */   private String oppositeLoginId;
/*  86:    */   @ApiField("opposite_name")
/*  87:    */   private String oppositeName;
/*  88:    */   @ApiField("opposite_nick_name")
/*  89:    */   private String oppositeNickName;
/*  90:    */   @ApiField("orig_consume_title")
/*  91:    */   private String origConsumeTitle;
/*  92:    */   @ApiField("owner_card_no")
/*  93:    */   private String ownerCardNo;
/*  94:    */   @ApiField("owner_customer_id")
/*  95:    */   private String ownerCustomerId;
/*  96:    */   @ApiField("owner_login_id")
/*  97:    */   private String ownerLoginId;
/*  98:    */   @ApiField("owner_name")
/*  99:    */   private String ownerName;
/* 100:    */   @ApiField("owner_nick")
/* 101:    */   private String ownerNick;
/* 102:    */   @ApiField("partner_id")
/* 103:    */   private String partnerId;
/* 104:    */   @ApiField("pay_channel")
/* 105:    */   private String payChannel;
/* 106:    */   @ApiField("product")
/* 107:    */   private String product;
/* 108:    */   @ApiField("refund_fee")
/* 109:    */   private String refundFee;
/* 110:    */   @ApiField("service_fee")
/* 111:    */   private String serviceFee;
/* 112:    */   @ApiField("total_refund_fee")
/* 113:    */   private String totalRefundFee;
/* 114:    */   @ApiField("trade_from")
/* 115:    */   private String tradeFrom;
/* 116:    */   
/* 117:    */   public String getAccessChannel()
/* 118:    */   {
/* 119:328 */     return this.accessChannel;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void setAccessChannel(String accessChannel)
/* 123:    */   {
/* 124:331 */     this.accessChannel = accessChannel;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getAdditionalStatus()
/* 128:    */   {
/* 129:335 */     return this.additionalStatus;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void setAdditionalStatus(String additionalStatus)
/* 133:    */   {
/* 134:338 */     this.additionalStatus = additionalStatus;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public List<String> getBizActions()
/* 138:    */   {
/* 139:342 */     return this.bizActions;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void setBizActions(List<String> bizActions)
/* 143:    */   {
/* 144:345 */     this.bizActions = bizActions;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public String getBizExtraNo()
/* 148:    */   {
/* 149:349 */     return this.bizExtraNo;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void setBizExtraNo(String bizExtraNo)
/* 153:    */   {
/* 154:352 */     this.bizExtraNo = bizExtraNo;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public String getBizInNo()
/* 158:    */   {
/* 159:356 */     return this.bizInNo;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void setBizInNo(String bizInNo)
/* 163:    */   {
/* 164:359 */     this.bizInNo = bizInNo;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public String getBizMemo()
/* 168:    */   {
/* 169:363 */     return this.bizMemo;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public void setBizMemo(String bizMemo)
/* 173:    */   {
/* 174:366 */     this.bizMemo = bizMemo;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public String getBizOrig()
/* 178:    */   {
/* 179:370 */     return this.bizOrig;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public void setBizOrig(String bizOrig)
/* 183:    */   {
/* 184:373 */     this.bizOrig = bizOrig;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public String getBizOutNo()
/* 188:    */   {
/* 189:377 */     return this.bizOutNo;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public void setBizOutNo(String bizOutNo)
/* 193:    */   {
/* 194:380 */     this.bizOutNo = bizOutNo;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public String getBizState()
/* 198:    */   {
/* 199:384 */     return this.bizState;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public void setBizState(String bizState)
/* 203:    */   {
/* 204:387 */     this.bizState = bizState;
/* 205:    */   }
/* 206:    */   
/* 207:    */   public String getBizSubType()
/* 208:    */   {
/* 209:391 */     return this.bizSubType;
/* 210:    */   }
/* 211:    */   
/* 212:    */   public void setBizSubType(String bizSubType)
/* 213:    */   {
/* 214:394 */     this.bizSubType = bizSubType;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public String getBizType()
/* 218:    */   {
/* 219:398 */     return this.bizType;
/* 220:    */   }
/* 221:    */   
/* 222:    */   public void setBizType(String bizType)
/* 223:    */   {
/* 224:401 */     this.bizType = bizType;
/* 225:    */   }
/* 226:    */   
/* 227:    */   public String getCategoryId()
/* 228:    */   {
/* 229:405 */     return this.categoryId;
/* 230:    */   }
/* 231:    */   
/* 232:    */   public void setCategoryId(String categoryId)
/* 233:    */   {
/* 234:408 */     this.categoryId = categoryId;
/* 235:    */   }
/* 236:    */   
/* 237:    */   public String getConsumeFee()
/* 238:    */   {
/* 239:412 */     return this.consumeFee;
/* 240:    */   }
/* 241:    */   
/* 242:    */   public void setConsumeFee(String consumeFee)
/* 243:    */   {
/* 244:415 */     this.consumeFee = consumeFee;
/* 245:    */   }
/* 246:    */   
/* 247:    */   public String getConsumeRefundStatus()
/* 248:    */   {
/* 249:419 */     return this.consumeRefundStatus;
/* 250:    */   }
/* 251:    */   
/* 252:    */   public void setConsumeRefundStatus(String consumeRefundStatus)
/* 253:    */   {
/* 254:422 */     this.consumeRefundStatus = consumeRefundStatus;
/* 255:    */   }
/* 256:    */   
/* 257:    */   public String getConsumeSite()
/* 258:    */   {
/* 259:426 */     return this.consumeSite;
/* 260:    */   }
/* 261:    */   
/* 262:    */   public void setConsumeSite(String consumeSite)
/* 263:    */   {
/* 264:429 */     this.consumeSite = consumeSite;
/* 265:    */   }
/* 266:    */   
/* 267:    */   public String getConsumeStatus()
/* 268:    */   {
/* 269:433 */     return this.consumeStatus;
/* 270:    */   }
/* 271:    */   
/* 272:    */   public void setConsumeStatus(String consumeStatus)
/* 273:    */   {
/* 274:436 */     this.consumeStatus = consumeStatus;
/* 275:    */   }
/* 276:    */   
/* 277:    */   public String getConsumeTitle()
/* 278:    */   {
/* 279:440 */     return this.consumeTitle;
/* 280:    */   }
/* 281:    */   
/* 282:    */   public void setConsumeTitle(String consumeTitle)
/* 283:    */   {
/* 284:443 */     this.consumeTitle = consumeTitle;
/* 285:    */   }
/* 286:    */   
/* 287:    */   public String getConsumeType()
/* 288:    */   {
/* 289:447 */     return this.consumeType;
/* 290:    */   }
/* 291:    */   
/* 292:    */   public void setConsumeType(String consumeType)
/* 293:    */   {
/* 294:450 */     this.consumeType = consumeType;
/* 295:    */   }
/* 296:    */   
/* 297:    */   public String getCurrency()
/* 298:    */   {
/* 299:454 */     return this.currency;
/* 300:    */   }
/* 301:    */   
/* 302:    */   public void setCurrency(String currency)
/* 303:    */   {
/* 304:457 */     this.currency = currency;
/* 305:    */   }
/* 306:    */   
/* 307:    */   public Date getDeleteOverTime()
/* 308:    */   {
/* 309:461 */     return this.deleteOverTime;
/* 310:    */   }
/* 311:    */   
/* 312:    */   public void setDeleteOverTime(Date deleteOverTime)
/* 313:    */   {
/* 314:464 */     this.deleteOverTime = deleteOverTime;
/* 315:    */   }
/* 316:    */   
/* 317:    */   public Date getDeleteTime()
/* 318:    */   {
/* 319:468 */     return this.deleteTime;
/* 320:    */   }
/* 321:    */   
/* 322:    */   public void setDeleteTime(Date deleteTime)
/* 323:    */   {
/* 324:471 */     this.deleteTime = deleteTime;
/* 325:    */   }
/* 326:    */   
/* 327:    */   public String getDeleteType()
/* 328:    */   {
/* 329:475 */     return this.deleteType;
/* 330:    */   }
/* 331:    */   
/* 332:    */   public void setDeleteType(String deleteType)
/* 333:    */   {
/* 334:478 */     this.deleteType = deleteType;
/* 335:    */   }
/* 336:    */   
/* 337:    */   public String getDepositbackStatus()
/* 338:    */   {
/* 339:482 */     return this.depositbackStatus;
/* 340:    */   }
/* 341:    */   
/* 342:    */   public void setDepositbackStatus(String depositbackStatus)
/* 343:    */   {
/* 344:485 */     this.depositbackStatus = depositbackStatus;
/* 345:    */   }
/* 346:    */   
/* 347:    */   public String getFlagLocked()
/* 348:    */   {
/* 349:489 */     return this.flagLocked;
/* 350:    */   }
/* 351:    */   
/* 352:    */   public void setFlagLocked(String flagLocked)
/* 353:    */   {
/* 354:492 */     this.flagLocked = flagLocked;
/* 355:    */   }
/* 356:    */   
/* 357:    */   public String getFlagRefund()
/* 358:    */   {
/* 359:496 */     return this.flagRefund;
/* 360:    */   }
/* 361:    */   
/* 362:    */   public void setFlagRefund(String flagRefund)
/* 363:    */   {
/* 364:499 */     this.flagRefund = flagRefund;
/* 365:    */   }
/* 366:    */   
/* 367:    */   public Date getGmtBizCreate()
/* 368:    */   {
/* 369:503 */     return this.gmtBizCreate;
/* 370:    */   }
/* 371:    */   
/* 372:    */   public void setGmtBizCreate(Date gmtBizCreate)
/* 373:    */   {
/* 374:506 */     this.gmtBizCreate = gmtBizCreate;
/* 375:    */   }
/* 376:    */   
/* 377:    */   public Date getGmtBizModified()
/* 378:    */   {
/* 379:510 */     return this.gmtBizModified;
/* 380:    */   }
/* 381:    */   
/* 382:    */   public void setGmtBizModified(Date gmtBizModified)
/* 383:    */   {
/* 384:513 */     this.gmtBizModified = gmtBizModified;
/* 385:    */   }
/* 386:    */   
/* 387:    */   public Date getGmtCreate()
/* 388:    */   {
/* 389:517 */     return this.gmtCreate;
/* 390:    */   }
/* 391:    */   
/* 392:    */   public void setGmtCreate(Date gmtCreate)
/* 393:    */   {
/* 394:520 */     this.gmtCreate = gmtCreate;
/* 395:    */   }
/* 396:    */   
/* 397:    */   public Date getGmtModified()
/* 398:    */   {
/* 399:524 */     return this.gmtModified;
/* 400:    */   }
/* 401:    */   
/* 402:    */   public void setGmtModified(Date gmtModified)
/* 403:    */   {
/* 404:527 */     this.gmtModified = gmtModified;
/* 405:    */   }
/* 406:    */   
/* 407:    */   public Date getGmtReceivePay()
/* 408:    */   {
/* 409:531 */     return this.gmtReceivePay;
/* 410:    */   }
/* 411:    */   
/* 412:    */   public void setGmtReceivePay(Date gmtReceivePay)
/* 413:    */   {
/* 414:534 */     this.gmtReceivePay = gmtReceivePay;
/* 415:    */   }
/* 416:    */   
/* 417:    */   public Date getGmtSendPay()
/* 418:    */   {
/* 419:538 */     return this.gmtSendPay;
/* 420:    */   }
/* 421:    */   
/* 422:    */   public void setGmtSendPay(Date gmtSendPay)
/* 423:    */   {
/* 424:541 */     this.gmtSendPay = gmtSendPay;
/* 425:    */   }
/* 426:    */   
/* 427:    */   public Boolean getHasFundItem()
/* 428:    */   {
/* 429:545 */     return this.hasFundItem;
/* 430:    */   }
/* 431:    */   
/* 432:    */   public void setHasFundItem(Boolean hasFundItem)
/* 433:    */   {
/* 434:548 */     this.hasFundItem = hasFundItem;
/* 435:    */   }
/* 436:    */   
/* 437:    */   public Boolean getHasNewFundItem()
/* 438:    */   {
/* 439:552 */     return this.hasNewFundItem;
/* 440:    */   }
/* 441:    */   
/* 442:    */   public void setHasNewFundItem(Boolean hasNewFundItem)
/* 443:    */   {
/* 444:555 */     this.hasNewFundItem = hasNewFundItem;
/* 445:    */   }
/* 446:    */   
/* 447:    */   public String getInOut()
/* 448:    */   {
/* 449:559 */     return this.inOut;
/* 450:    */   }
/* 451:    */   
/* 452:    */   public void setInOut(String inOut)
/* 453:    */   {
/* 454:562 */     this.inOut = inOut;
/* 455:    */   }
/* 456:    */   
/* 457:    */   public String getOppositeCardNo()
/* 458:    */   {
/* 459:566 */     return this.oppositeCardNo;
/* 460:    */   }
/* 461:    */   
/* 462:    */   public void setOppositeCardNo(String oppositeCardNo)
/* 463:    */   {
/* 464:569 */     this.oppositeCardNo = oppositeCardNo;
/* 465:    */   }
/* 466:    */   
/* 467:    */   public String getOppositeLoginId()
/* 468:    */   {
/* 469:573 */     return this.oppositeLoginId;
/* 470:    */   }
/* 471:    */   
/* 472:    */   public void setOppositeLoginId(String oppositeLoginId)
/* 473:    */   {
/* 474:576 */     this.oppositeLoginId = oppositeLoginId;
/* 475:    */   }
/* 476:    */   
/* 477:    */   public String getOppositeName()
/* 478:    */   {
/* 479:580 */     return this.oppositeName;
/* 480:    */   }
/* 481:    */   
/* 482:    */   public void setOppositeName(String oppositeName)
/* 483:    */   {
/* 484:583 */     this.oppositeName = oppositeName;
/* 485:    */   }
/* 486:    */   
/* 487:    */   public String getOppositeNickName()
/* 488:    */   {
/* 489:587 */     return this.oppositeNickName;
/* 490:    */   }
/* 491:    */   
/* 492:    */   public void setOppositeNickName(String oppositeNickName)
/* 493:    */   {
/* 494:590 */     this.oppositeNickName = oppositeNickName;
/* 495:    */   }
/* 496:    */   
/* 497:    */   public String getOrigConsumeTitle()
/* 498:    */   {
/* 499:594 */     return this.origConsumeTitle;
/* 500:    */   }
/* 501:    */   
/* 502:    */   public void setOrigConsumeTitle(String origConsumeTitle)
/* 503:    */   {
/* 504:597 */     this.origConsumeTitle = origConsumeTitle;
/* 505:    */   }
/* 506:    */   
/* 507:    */   public String getOwnerCardNo()
/* 508:    */   {
/* 509:601 */     return this.ownerCardNo;
/* 510:    */   }
/* 511:    */   
/* 512:    */   public void setOwnerCardNo(String ownerCardNo)
/* 513:    */   {
/* 514:604 */     this.ownerCardNo = ownerCardNo;
/* 515:    */   }
/* 516:    */   
/* 517:    */   public String getOwnerCustomerId()
/* 518:    */   {
/* 519:608 */     return this.ownerCustomerId;
/* 520:    */   }
/* 521:    */   
/* 522:    */   public void setOwnerCustomerId(String ownerCustomerId)
/* 523:    */   {
/* 524:611 */     this.ownerCustomerId = ownerCustomerId;
/* 525:    */   }
/* 526:    */   
/* 527:    */   public String getOwnerLoginId()
/* 528:    */   {
/* 529:615 */     return this.ownerLoginId;
/* 530:    */   }
/* 531:    */   
/* 532:    */   public void setOwnerLoginId(String ownerLoginId)
/* 533:    */   {
/* 534:618 */     this.ownerLoginId = ownerLoginId;
/* 535:    */   }
/* 536:    */   
/* 537:    */   public String getOwnerName()
/* 538:    */   {
/* 539:622 */     return this.ownerName;
/* 540:    */   }
/* 541:    */   
/* 542:    */   public void setOwnerName(String ownerName)
/* 543:    */   {
/* 544:625 */     this.ownerName = ownerName;
/* 545:    */   }
/* 546:    */   
/* 547:    */   public String getOwnerNick()
/* 548:    */   {
/* 549:629 */     return this.ownerNick;
/* 550:    */   }
/* 551:    */   
/* 552:    */   public void setOwnerNick(String ownerNick)
/* 553:    */   {
/* 554:632 */     this.ownerNick = ownerNick;
/* 555:    */   }
/* 556:    */   
/* 557:    */   public String getPartnerId()
/* 558:    */   {
/* 559:636 */     return this.partnerId;
/* 560:    */   }
/* 561:    */   
/* 562:    */   public void setPartnerId(String partnerId)
/* 563:    */   {
/* 564:639 */     this.partnerId = partnerId;
/* 565:    */   }
/* 566:    */   
/* 567:    */   public String getPayChannel()
/* 568:    */   {
/* 569:643 */     return this.payChannel;
/* 570:    */   }
/* 571:    */   
/* 572:    */   public void setPayChannel(String payChannel)
/* 573:    */   {
/* 574:646 */     this.payChannel = payChannel;
/* 575:    */   }
/* 576:    */   
/* 577:    */   public String getProduct()
/* 578:    */   {
/* 579:650 */     return this.product;
/* 580:    */   }
/* 581:    */   
/* 582:    */   public void setProduct(String product)
/* 583:    */   {
/* 584:653 */     this.product = product;
/* 585:    */   }
/* 586:    */   
/* 587:    */   public String getRefundFee()
/* 588:    */   {
/* 589:657 */     return this.refundFee;
/* 590:    */   }
/* 591:    */   
/* 592:    */   public void setRefundFee(String refundFee)
/* 593:    */   {
/* 594:660 */     this.refundFee = refundFee;
/* 595:    */   }
/* 596:    */   
/* 597:    */   public String getServiceFee()
/* 598:    */   {
/* 599:664 */     return this.serviceFee;
/* 600:    */   }
/* 601:    */   
/* 602:    */   public void setServiceFee(String serviceFee)
/* 603:    */   {
/* 604:667 */     this.serviceFee = serviceFee;
/* 605:    */   }
/* 606:    */   
/* 607:    */   public String getTotalRefundFee()
/* 608:    */   {
/* 609:671 */     return this.totalRefundFee;
/* 610:    */   }
/* 611:    */   
/* 612:    */   public void setTotalRefundFee(String totalRefundFee)
/* 613:    */   {
/* 614:674 */     this.totalRefundFee = totalRefundFee;
/* 615:    */   }
/* 616:    */   
/* 617:    */   public String getTradeFrom()
/* 618:    */   {
/* 619:678 */     return this.tradeFrom;
/* 620:    */   }
/* 621:    */   
/* 622:    */   public void setTradeFrom(String tradeFrom)
/* 623:    */   {
/* 624:681 */     this.tradeFrom = tradeFrom;
/* 625:    */   }
/* 626:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.ConsumeRecordAOPModel
 * JD-Core Version:    0.7.0.1
 */