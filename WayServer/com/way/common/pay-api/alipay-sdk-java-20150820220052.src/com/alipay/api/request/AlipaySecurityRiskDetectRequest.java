/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipaySecurityRiskDetectResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipaySecurityRiskDetectRequest
/*   9:    */   implements AlipayRequest<AlipaySecurityRiskDetectResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String buyerAccountNo;
/*  14:    */   private String buyerBindBankcard;
/*  15:    */   private String buyerBindBankcardType;
/*  16:    */   private String buyerBindMobile;
/*  17:    */   private String buyerGrade;
/*  18:    */   private String buyerIdentityNo;
/*  19:    */   private String buyerIdentityType;
/*  20:    */   private String buyerRealName;
/*  21:    */   private String buyerRegDate;
/*  22:    */   private String buyerRegEmail;
/*  23:    */   private String buyerRegMobile;
/*  24:    */   private String buyerSceneBankcard;
/*  25:    */   private String buyerSceneBankcardType;
/*  26:    */   private String buyerSceneEmail;
/*  27:    */   private String buyerSceneMobile;
/*  28:    */   private String currency;
/*  29:    */   private String envClientBaseBand;
/*  30:    */   private String envClientBaseStation;
/*  31:    */   private String envClientCoordinates;
/*  32:    */   private String envClientImei;
/*  33:    */   private String envClientImsi;
/*  34:    */   private String envClientIosUdid;
/*  35:    */   private String envClientIp;
/*  36:    */   private String envClientMac;
/*  37:    */   private String envClientScreen;
/*  38:    */   private String envClientUuid;
/*  39:    */   private String itemQuantity;
/*  40:    */   private String itemUnitPrice;
/*  41:    */   private String jsTokenId;
/*  42:    */   private String orderAmount;
/*  43:    */   private String orderCategory;
/*  44:    */   private String orderCredateTime;
/*  45:    */   private String orderItemCity;
/*  46:    */   private String orderItemName;
/*  47:    */   private String orderNo;
/*  48:    */   private String partnerId;
/*  49:    */   private String receiverAddress;
/*  50:    */   private String receiverCity;
/*  51:    */   private String receiverDistrict;
/*  52:    */   private String receiverEmail;
/*  53:    */   private String receiverMobile;
/*  54:    */   private String receiverName;
/*  55:    */   private String receiverState;
/*  56:    */   private String receiverZip;
/*  57:    */   private String sceneCode;
/*  58:    */   private String sellerAccountNo;
/*  59:    */   private String sellerBindBankcard;
/*  60:    */   private String sellerBindBankcardType;
/*  61:    */   private String sellerBindMobile;
/*  62:    */   private String sellerIdentityNo;
/*  63:    */   private String sellerIdentityType;
/*  64:    */   private String sellerRealName;
/*  65:    */   private String sellerRegDate;
/*  66:    */   private String sellerRegEmail;
/*  67:    */   private String sellerRegMoile;
/*  68:    */   private String transportType;
/*  69:    */   private String terminalType;
/*  70:    */   private String terminalInfo;
/*  71:    */   private String prodCode;
/*  72:    */   private String notifyUrl;
/*  73:    */   
/*  74:    */   public void setBuyerAccountNo(String buyerAccountNo)
/*  75:    */   {
/*  76:301 */     this.buyerAccountNo = buyerAccountNo;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getBuyerAccountNo()
/*  80:    */   {
/*  81:304 */     return this.buyerAccountNo;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setBuyerBindBankcard(String buyerBindBankcard)
/*  85:    */   {
/*  86:308 */     this.buyerBindBankcard = buyerBindBankcard;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String getBuyerBindBankcard()
/*  90:    */   {
/*  91:311 */     return this.buyerBindBankcard;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setBuyerBindBankcardType(String buyerBindBankcardType)
/*  95:    */   {
/*  96:315 */     this.buyerBindBankcardType = buyerBindBankcardType;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getBuyerBindBankcardType()
/* 100:    */   {
/* 101:318 */     return this.buyerBindBankcardType;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setBuyerBindMobile(String buyerBindMobile)
/* 105:    */   {
/* 106:322 */     this.buyerBindMobile = buyerBindMobile;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getBuyerBindMobile()
/* 110:    */   {
/* 111:325 */     return this.buyerBindMobile;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setBuyerGrade(String buyerGrade)
/* 115:    */   {
/* 116:329 */     this.buyerGrade = buyerGrade;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public String getBuyerGrade()
/* 120:    */   {
/* 121:332 */     return this.buyerGrade;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setBuyerIdentityNo(String buyerIdentityNo)
/* 125:    */   {
/* 126:336 */     this.buyerIdentityNo = buyerIdentityNo;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public String getBuyerIdentityNo()
/* 130:    */   {
/* 131:339 */     return this.buyerIdentityNo;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public void setBuyerIdentityType(String buyerIdentityType)
/* 135:    */   {
/* 136:343 */     this.buyerIdentityType = buyerIdentityType;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public String getBuyerIdentityType()
/* 140:    */   {
/* 141:346 */     return this.buyerIdentityType;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public void setBuyerRealName(String buyerRealName)
/* 145:    */   {
/* 146:350 */     this.buyerRealName = buyerRealName;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public String getBuyerRealName()
/* 150:    */   {
/* 151:353 */     return this.buyerRealName;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void setBuyerRegDate(String buyerRegDate)
/* 155:    */   {
/* 156:357 */     this.buyerRegDate = buyerRegDate;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public String getBuyerRegDate()
/* 160:    */   {
/* 161:360 */     return this.buyerRegDate;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void setBuyerRegEmail(String buyerRegEmail)
/* 165:    */   {
/* 166:364 */     this.buyerRegEmail = buyerRegEmail;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public String getBuyerRegEmail()
/* 170:    */   {
/* 171:367 */     return this.buyerRegEmail;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public void setBuyerRegMobile(String buyerRegMobile)
/* 175:    */   {
/* 176:371 */     this.buyerRegMobile = buyerRegMobile;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public String getBuyerRegMobile()
/* 180:    */   {
/* 181:374 */     return this.buyerRegMobile;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public void setBuyerSceneBankcard(String buyerSceneBankcard)
/* 185:    */   {
/* 186:378 */     this.buyerSceneBankcard = buyerSceneBankcard;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public String getBuyerSceneBankcard()
/* 190:    */   {
/* 191:381 */     return this.buyerSceneBankcard;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public void setBuyerSceneBankcardType(String buyerSceneBankcardType)
/* 195:    */   {
/* 196:385 */     this.buyerSceneBankcardType = buyerSceneBankcardType;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public String getBuyerSceneBankcardType()
/* 200:    */   {
/* 201:388 */     return this.buyerSceneBankcardType;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public void setBuyerSceneEmail(String buyerSceneEmail)
/* 205:    */   {
/* 206:392 */     this.buyerSceneEmail = buyerSceneEmail;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public String getBuyerSceneEmail()
/* 210:    */   {
/* 211:395 */     return this.buyerSceneEmail;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public void setBuyerSceneMobile(String buyerSceneMobile)
/* 215:    */   {
/* 216:399 */     this.buyerSceneMobile = buyerSceneMobile;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public String getBuyerSceneMobile()
/* 220:    */   {
/* 221:402 */     return this.buyerSceneMobile;
/* 222:    */   }
/* 223:    */   
/* 224:    */   public void setCurrency(String currency)
/* 225:    */   {
/* 226:406 */     this.currency = currency;
/* 227:    */   }
/* 228:    */   
/* 229:    */   public String getCurrency()
/* 230:    */   {
/* 231:409 */     return this.currency;
/* 232:    */   }
/* 233:    */   
/* 234:    */   public void setEnvClientBaseBand(String envClientBaseBand)
/* 235:    */   {
/* 236:413 */     this.envClientBaseBand = envClientBaseBand;
/* 237:    */   }
/* 238:    */   
/* 239:    */   public String getEnvClientBaseBand()
/* 240:    */   {
/* 241:416 */     return this.envClientBaseBand;
/* 242:    */   }
/* 243:    */   
/* 244:    */   public void setEnvClientBaseStation(String envClientBaseStation)
/* 245:    */   {
/* 246:420 */     this.envClientBaseStation = envClientBaseStation;
/* 247:    */   }
/* 248:    */   
/* 249:    */   public String getEnvClientBaseStation()
/* 250:    */   {
/* 251:423 */     return this.envClientBaseStation;
/* 252:    */   }
/* 253:    */   
/* 254:    */   public void setEnvClientCoordinates(String envClientCoordinates)
/* 255:    */   {
/* 256:427 */     this.envClientCoordinates = envClientCoordinates;
/* 257:    */   }
/* 258:    */   
/* 259:    */   public String getEnvClientCoordinates()
/* 260:    */   {
/* 261:430 */     return this.envClientCoordinates;
/* 262:    */   }
/* 263:    */   
/* 264:    */   public void setEnvClientImei(String envClientImei)
/* 265:    */   {
/* 266:434 */     this.envClientImei = envClientImei;
/* 267:    */   }
/* 268:    */   
/* 269:    */   public String getEnvClientImei()
/* 270:    */   {
/* 271:437 */     return this.envClientImei;
/* 272:    */   }
/* 273:    */   
/* 274:    */   public void setEnvClientImsi(String envClientImsi)
/* 275:    */   {
/* 276:441 */     this.envClientImsi = envClientImsi;
/* 277:    */   }
/* 278:    */   
/* 279:    */   public String getEnvClientImsi()
/* 280:    */   {
/* 281:444 */     return this.envClientImsi;
/* 282:    */   }
/* 283:    */   
/* 284:    */   public void setEnvClientIosUdid(String envClientIosUdid)
/* 285:    */   {
/* 286:448 */     this.envClientIosUdid = envClientIosUdid;
/* 287:    */   }
/* 288:    */   
/* 289:    */   public String getEnvClientIosUdid()
/* 290:    */   {
/* 291:451 */     return this.envClientIosUdid;
/* 292:    */   }
/* 293:    */   
/* 294:    */   public void setEnvClientIp(String envClientIp)
/* 295:    */   {
/* 296:455 */     this.envClientIp = envClientIp;
/* 297:    */   }
/* 298:    */   
/* 299:    */   public String getEnvClientIp()
/* 300:    */   {
/* 301:458 */     return this.envClientIp;
/* 302:    */   }
/* 303:    */   
/* 304:    */   public void setEnvClientMac(String envClientMac)
/* 305:    */   {
/* 306:462 */     this.envClientMac = envClientMac;
/* 307:    */   }
/* 308:    */   
/* 309:    */   public String getEnvClientMac()
/* 310:    */   {
/* 311:465 */     return this.envClientMac;
/* 312:    */   }
/* 313:    */   
/* 314:    */   public void setEnvClientScreen(String envClientScreen)
/* 315:    */   {
/* 316:469 */     this.envClientScreen = envClientScreen;
/* 317:    */   }
/* 318:    */   
/* 319:    */   public String getEnvClientScreen()
/* 320:    */   {
/* 321:472 */     return this.envClientScreen;
/* 322:    */   }
/* 323:    */   
/* 324:    */   public void setEnvClientUuid(String envClientUuid)
/* 325:    */   {
/* 326:476 */     this.envClientUuid = envClientUuid;
/* 327:    */   }
/* 328:    */   
/* 329:    */   public String getEnvClientUuid()
/* 330:    */   {
/* 331:479 */     return this.envClientUuid;
/* 332:    */   }
/* 333:    */   
/* 334:    */   public void setItemQuantity(String itemQuantity)
/* 335:    */   {
/* 336:483 */     this.itemQuantity = itemQuantity;
/* 337:    */   }
/* 338:    */   
/* 339:    */   public String getItemQuantity()
/* 340:    */   {
/* 341:486 */     return this.itemQuantity;
/* 342:    */   }
/* 343:    */   
/* 344:    */   public void setItemUnitPrice(String itemUnitPrice)
/* 345:    */   {
/* 346:490 */     this.itemUnitPrice = itemUnitPrice;
/* 347:    */   }
/* 348:    */   
/* 349:    */   public String getItemUnitPrice()
/* 350:    */   {
/* 351:493 */     return this.itemUnitPrice;
/* 352:    */   }
/* 353:    */   
/* 354:    */   public void setJsTokenId(String jsTokenId)
/* 355:    */   {
/* 356:497 */     this.jsTokenId = jsTokenId;
/* 357:    */   }
/* 358:    */   
/* 359:    */   public String getJsTokenId()
/* 360:    */   {
/* 361:500 */     return this.jsTokenId;
/* 362:    */   }
/* 363:    */   
/* 364:    */   public void setOrderAmount(String orderAmount)
/* 365:    */   {
/* 366:504 */     this.orderAmount = orderAmount;
/* 367:    */   }
/* 368:    */   
/* 369:    */   public String getOrderAmount()
/* 370:    */   {
/* 371:507 */     return this.orderAmount;
/* 372:    */   }
/* 373:    */   
/* 374:    */   public void setOrderCategory(String orderCategory)
/* 375:    */   {
/* 376:511 */     this.orderCategory = orderCategory;
/* 377:    */   }
/* 378:    */   
/* 379:    */   public String getOrderCategory()
/* 380:    */   {
/* 381:514 */     return this.orderCategory;
/* 382:    */   }
/* 383:    */   
/* 384:    */   public void setOrderCredateTime(String orderCredateTime)
/* 385:    */   {
/* 386:518 */     this.orderCredateTime = orderCredateTime;
/* 387:    */   }
/* 388:    */   
/* 389:    */   public String getOrderCredateTime()
/* 390:    */   {
/* 391:521 */     return this.orderCredateTime;
/* 392:    */   }
/* 393:    */   
/* 394:    */   public void setOrderItemCity(String orderItemCity)
/* 395:    */   {
/* 396:525 */     this.orderItemCity = orderItemCity;
/* 397:    */   }
/* 398:    */   
/* 399:    */   public String getOrderItemCity()
/* 400:    */   {
/* 401:528 */     return this.orderItemCity;
/* 402:    */   }
/* 403:    */   
/* 404:    */   public void setOrderItemName(String orderItemName)
/* 405:    */   {
/* 406:532 */     this.orderItemName = orderItemName;
/* 407:    */   }
/* 408:    */   
/* 409:    */   public String getOrderItemName()
/* 410:    */   {
/* 411:535 */     return this.orderItemName;
/* 412:    */   }
/* 413:    */   
/* 414:    */   public void setOrderNo(String orderNo)
/* 415:    */   {
/* 416:539 */     this.orderNo = orderNo;
/* 417:    */   }
/* 418:    */   
/* 419:    */   public String getOrderNo()
/* 420:    */   {
/* 421:542 */     return this.orderNo;
/* 422:    */   }
/* 423:    */   
/* 424:    */   public void setPartnerId(String partnerId)
/* 425:    */   {
/* 426:546 */     this.partnerId = partnerId;
/* 427:    */   }
/* 428:    */   
/* 429:    */   public String getPartnerId()
/* 430:    */   {
/* 431:549 */     return this.partnerId;
/* 432:    */   }
/* 433:    */   
/* 434:    */   public void setReceiverAddress(String receiverAddress)
/* 435:    */   {
/* 436:553 */     this.receiverAddress = receiverAddress;
/* 437:    */   }
/* 438:    */   
/* 439:    */   public String getReceiverAddress()
/* 440:    */   {
/* 441:556 */     return this.receiverAddress;
/* 442:    */   }
/* 443:    */   
/* 444:    */   public void setReceiverCity(String receiverCity)
/* 445:    */   {
/* 446:560 */     this.receiverCity = receiverCity;
/* 447:    */   }
/* 448:    */   
/* 449:    */   public String getReceiverCity()
/* 450:    */   {
/* 451:563 */     return this.receiverCity;
/* 452:    */   }
/* 453:    */   
/* 454:    */   public void setReceiverDistrict(String receiverDistrict)
/* 455:    */   {
/* 456:567 */     this.receiverDistrict = receiverDistrict;
/* 457:    */   }
/* 458:    */   
/* 459:    */   public String getReceiverDistrict()
/* 460:    */   {
/* 461:570 */     return this.receiverDistrict;
/* 462:    */   }
/* 463:    */   
/* 464:    */   public void setReceiverEmail(String receiverEmail)
/* 465:    */   {
/* 466:574 */     this.receiverEmail = receiverEmail;
/* 467:    */   }
/* 468:    */   
/* 469:    */   public String getReceiverEmail()
/* 470:    */   {
/* 471:577 */     return this.receiverEmail;
/* 472:    */   }
/* 473:    */   
/* 474:    */   public void setReceiverMobile(String receiverMobile)
/* 475:    */   {
/* 476:581 */     this.receiverMobile = receiverMobile;
/* 477:    */   }
/* 478:    */   
/* 479:    */   public String getReceiverMobile()
/* 480:    */   {
/* 481:584 */     return this.receiverMobile;
/* 482:    */   }
/* 483:    */   
/* 484:    */   public void setReceiverName(String receiverName)
/* 485:    */   {
/* 486:588 */     this.receiverName = receiverName;
/* 487:    */   }
/* 488:    */   
/* 489:    */   public String getReceiverName()
/* 490:    */   {
/* 491:591 */     return this.receiverName;
/* 492:    */   }
/* 493:    */   
/* 494:    */   public void setReceiverState(String receiverState)
/* 495:    */   {
/* 496:595 */     this.receiverState = receiverState;
/* 497:    */   }
/* 498:    */   
/* 499:    */   public String getReceiverState()
/* 500:    */   {
/* 501:598 */     return this.receiverState;
/* 502:    */   }
/* 503:    */   
/* 504:    */   public void setReceiverZip(String receiverZip)
/* 505:    */   {
/* 506:602 */     this.receiverZip = receiverZip;
/* 507:    */   }
/* 508:    */   
/* 509:    */   public String getReceiverZip()
/* 510:    */   {
/* 511:605 */     return this.receiverZip;
/* 512:    */   }
/* 513:    */   
/* 514:    */   public void setSceneCode(String sceneCode)
/* 515:    */   {
/* 516:609 */     this.sceneCode = sceneCode;
/* 517:    */   }
/* 518:    */   
/* 519:    */   public String getSceneCode()
/* 520:    */   {
/* 521:612 */     return this.sceneCode;
/* 522:    */   }
/* 523:    */   
/* 524:    */   public void setSellerAccountNo(String sellerAccountNo)
/* 525:    */   {
/* 526:616 */     this.sellerAccountNo = sellerAccountNo;
/* 527:    */   }
/* 528:    */   
/* 529:    */   public String getSellerAccountNo()
/* 530:    */   {
/* 531:619 */     return this.sellerAccountNo;
/* 532:    */   }
/* 533:    */   
/* 534:    */   public void setSellerBindBankcard(String sellerBindBankcard)
/* 535:    */   {
/* 536:623 */     this.sellerBindBankcard = sellerBindBankcard;
/* 537:    */   }
/* 538:    */   
/* 539:    */   public String getSellerBindBankcard()
/* 540:    */   {
/* 541:626 */     return this.sellerBindBankcard;
/* 542:    */   }
/* 543:    */   
/* 544:    */   public void setSellerBindBankcardType(String sellerBindBankcardType)
/* 545:    */   {
/* 546:630 */     this.sellerBindBankcardType = sellerBindBankcardType;
/* 547:    */   }
/* 548:    */   
/* 549:    */   public String getSellerBindBankcardType()
/* 550:    */   {
/* 551:633 */     return this.sellerBindBankcardType;
/* 552:    */   }
/* 553:    */   
/* 554:    */   public void setSellerBindMobile(String sellerBindMobile)
/* 555:    */   {
/* 556:637 */     this.sellerBindMobile = sellerBindMobile;
/* 557:    */   }
/* 558:    */   
/* 559:    */   public String getSellerBindMobile()
/* 560:    */   {
/* 561:640 */     return this.sellerBindMobile;
/* 562:    */   }
/* 563:    */   
/* 564:    */   public void setSellerIdentityNo(String sellerIdentityNo)
/* 565:    */   {
/* 566:644 */     this.sellerIdentityNo = sellerIdentityNo;
/* 567:    */   }
/* 568:    */   
/* 569:    */   public String getSellerIdentityNo()
/* 570:    */   {
/* 571:647 */     return this.sellerIdentityNo;
/* 572:    */   }
/* 573:    */   
/* 574:    */   public void setSellerIdentityType(String sellerIdentityType)
/* 575:    */   {
/* 576:651 */     this.sellerIdentityType = sellerIdentityType;
/* 577:    */   }
/* 578:    */   
/* 579:    */   public String getSellerIdentityType()
/* 580:    */   {
/* 581:654 */     return this.sellerIdentityType;
/* 582:    */   }
/* 583:    */   
/* 584:    */   public void setSellerRealName(String sellerRealName)
/* 585:    */   {
/* 586:658 */     this.sellerRealName = sellerRealName;
/* 587:    */   }
/* 588:    */   
/* 589:    */   public String getSellerRealName()
/* 590:    */   {
/* 591:661 */     return this.sellerRealName;
/* 592:    */   }
/* 593:    */   
/* 594:    */   public void setSellerRegDate(String sellerRegDate)
/* 595:    */   {
/* 596:665 */     this.sellerRegDate = sellerRegDate;
/* 597:    */   }
/* 598:    */   
/* 599:    */   public String getSellerRegDate()
/* 600:    */   {
/* 601:668 */     return this.sellerRegDate;
/* 602:    */   }
/* 603:    */   
/* 604:    */   public void setSellerRegEmail(String sellerRegEmail)
/* 605:    */   {
/* 606:672 */     this.sellerRegEmail = sellerRegEmail;
/* 607:    */   }
/* 608:    */   
/* 609:    */   public String getSellerRegEmail()
/* 610:    */   {
/* 611:675 */     return this.sellerRegEmail;
/* 612:    */   }
/* 613:    */   
/* 614:    */   public void setSellerRegMoile(String sellerRegMoile)
/* 615:    */   {
/* 616:679 */     this.sellerRegMoile = sellerRegMoile;
/* 617:    */   }
/* 618:    */   
/* 619:    */   public String getSellerRegMoile()
/* 620:    */   {
/* 621:682 */     return this.sellerRegMoile;
/* 622:    */   }
/* 623:    */   
/* 624:    */   public void setTransportType(String transportType)
/* 625:    */   {
/* 626:686 */     this.transportType = transportType;
/* 627:    */   }
/* 628:    */   
/* 629:    */   public String getTransportType()
/* 630:    */   {
/* 631:689 */     return this.transportType;
/* 632:    */   }
/* 633:    */   
/* 634:    */   public String getNotifyUrl()
/* 635:    */   {
/* 636:697 */     return this.notifyUrl;
/* 637:    */   }
/* 638:    */   
/* 639:    */   public void setNotifyUrl(String notifyUrl)
/* 640:    */   {
/* 641:701 */     this.notifyUrl = notifyUrl;
/* 642:    */   }
/* 643:    */   
/* 644:    */   public String getApiVersion()
/* 645:    */   {
/* 646:705 */     return this.apiVersion;
/* 647:    */   }
/* 648:    */   
/* 649:    */   public void setApiVersion(String apiVersion)
/* 650:    */   {
/* 651:709 */     this.apiVersion = apiVersion;
/* 652:    */   }
/* 653:    */   
/* 654:    */   public void setTerminalType(String terminalType)
/* 655:    */   {
/* 656:713 */     this.terminalType = terminalType;
/* 657:    */   }
/* 658:    */   
/* 659:    */   public String getTerminalType()
/* 660:    */   {
/* 661:717 */     return this.terminalType;
/* 662:    */   }
/* 663:    */   
/* 664:    */   public void setTerminalInfo(String terminalInfo)
/* 665:    */   {
/* 666:721 */     this.terminalInfo = terminalInfo;
/* 667:    */   }
/* 668:    */   
/* 669:    */   public String getTerminalInfo()
/* 670:    */   {
/* 671:725 */     return this.terminalInfo;
/* 672:    */   }
/* 673:    */   
/* 674:    */   public void setProdCode(String prodCode)
/* 675:    */   {
/* 676:729 */     this.prodCode = prodCode;
/* 677:    */   }
/* 678:    */   
/* 679:    */   public String getProdCode()
/* 680:    */   {
/* 681:733 */     return this.prodCode;
/* 682:    */   }
/* 683:    */   
/* 684:    */   public String getApiMethodName()
/* 685:    */   {
/* 686:737 */     return "alipay.security.risk.detect";
/* 687:    */   }
/* 688:    */   
/* 689:    */   public Map<String, String> getTextParams()
/* 690:    */   {
/* 691:741 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 692:742 */     txtParams.put("buyer_account_no", this.buyerAccountNo);
/* 693:743 */     txtParams.put("buyer_bind_bankcard", this.buyerBindBankcard);
/* 694:744 */     txtParams.put("buyer_bind_bankcard_type", this.buyerBindBankcardType);
/* 695:745 */     txtParams.put("buyer_bind_mobile", this.buyerBindMobile);
/* 696:746 */     txtParams.put("buyer_grade", this.buyerGrade);
/* 697:747 */     txtParams.put("buyer_identity_no", this.buyerIdentityNo);
/* 698:748 */     txtParams.put("buyer_identity_type", this.buyerIdentityType);
/* 699:749 */     txtParams.put("buyer_real_name", this.buyerRealName);
/* 700:750 */     txtParams.put("buyer_reg_date", this.buyerRegDate);
/* 701:751 */     txtParams.put("buyer_reg_email", this.buyerRegEmail);
/* 702:752 */     txtParams.put("buyer_reg_mobile", this.buyerRegMobile);
/* 703:753 */     txtParams.put("buyer_scene_bankcard", this.buyerSceneBankcard);
/* 704:754 */     txtParams.put("buyer_scene_bankcard_type", this.buyerSceneBankcardType);
/* 705:755 */     txtParams.put("buyer_scene_email", this.buyerSceneEmail);
/* 706:756 */     txtParams.put("buyer_scene_mobile", this.buyerSceneMobile);
/* 707:757 */     txtParams.put("currency", this.currency);
/* 708:758 */     txtParams.put("env_client_base_band", this.envClientBaseBand);
/* 709:759 */     txtParams.put("env_client_base_station", this.envClientBaseStation);
/* 710:760 */     txtParams.put("env_client_coordinates", this.envClientCoordinates);
/* 711:761 */     txtParams.put("env_client_imei", this.envClientImei);
/* 712:762 */     txtParams.put("env_client_imsi", this.envClientImsi);
/* 713:763 */     txtParams.put("env_client_ios_udid", this.envClientIosUdid);
/* 714:764 */     txtParams.put("env_client_ip", this.envClientIp);
/* 715:765 */     txtParams.put("env_client_mac", this.envClientMac);
/* 716:766 */     txtParams.put("env_client_screen", this.envClientScreen);
/* 717:767 */     txtParams.put("env_client_uuid", this.envClientUuid);
/* 718:768 */     txtParams.put("item_quantity", this.itemQuantity);
/* 719:769 */     txtParams.put("item_unit_price", this.itemUnitPrice);
/* 720:770 */     txtParams.put("js_token_id", this.jsTokenId);
/* 721:771 */     txtParams.put("order_amount", this.orderAmount);
/* 722:772 */     txtParams.put("order_category", this.orderCategory);
/* 723:773 */     txtParams.put("order_credate_time", this.orderCredateTime);
/* 724:774 */     txtParams.put("order_item_city", this.orderItemCity);
/* 725:775 */     txtParams.put("order_item_name", this.orderItemName);
/* 726:776 */     txtParams.put("order_no", this.orderNo);
/* 727:777 */     txtParams.put("partner_id", this.partnerId);
/* 728:778 */     txtParams.put("receiver_address", this.receiverAddress);
/* 729:779 */     txtParams.put("receiver_city", this.receiverCity);
/* 730:780 */     txtParams.put("receiver_district", this.receiverDistrict);
/* 731:781 */     txtParams.put("receiver_email", this.receiverEmail);
/* 732:782 */     txtParams.put("receiver_mobile", this.receiverMobile);
/* 733:783 */     txtParams.put("receiver_name", this.receiverName);
/* 734:784 */     txtParams.put("receiver_state", this.receiverState);
/* 735:785 */     txtParams.put("receiver_zip", this.receiverZip);
/* 736:786 */     txtParams.put("scene_code", this.sceneCode);
/* 737:787 */     txtParams.put("seller_account_no", this.sellerAccountNo);
/* 738:788 */     txtParams.put("seller_bind_bankcard", this.sellerBindBankcard);
/* 739:789 */     txtParams.put("seller_bind_bankcard_type", this.sellerBindBankcardType);
/* 740:790 */     txtParams.put("seller_bind_mobile", this.sellerBindMobile);
/* 741:791 */     txtParams.put("seller_identity_no", this.sellerIdentityNo);
/* 742:792 */     txtParams.put("seller_identity_type", this.sellerIdentityType);
/* 743:793 */     txtParams.put("seller_real_name", this.sellerRealName);
/* 744:794 */     txtParams.put("seller_reg_date", this.sellerRegDate);
/* 745:795 */     txtParams.put("seller_reg_email", this.sellerRegEmail);
/* 746:796 */     txtParams.put("seller_reg_moile", this.sellerRegMoile);
/* 747:797 */     txtParams.put("transport_type", this.transportType);
/* 748:798 */     if (this.udfParams != null) {
/* 749:799 */       txtParams.putAll(this.udfParams);
/* 750:    */     }
/* 751:801 */     return txtParams;
/* 752:    */   }
/* 753:    */   
/* 754:    */   public void putOtherTextParam(String key, String value)
/* 755:    */   {
/* 756:805 */     if (this.udfParams == null) {
/* 757:806 */       this.udfParams = new AlipayHashMap();
/* 758:    */     }
/* 759:808 */     this.udfParams.put(key, value);
/* 760:    */   }
/* 761:    */   
/* 762:    */   public Class<AlipaySecurityRiskDetectResponse> getResponseClass()
/* 763:    */   {
/* 764:812 */     return AlipaySecurityRiskDetectResponse.class;
/* 765:    */   }
/* 766:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipaySecurityRiskDetectRequest
 * JD-Core Version:    0.7.0.1
 */