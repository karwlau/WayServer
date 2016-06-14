/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.domain.DeliverAddress;
/*   5:    */ import com.alipay.api.internal.mapping.ApiField;
/*   6:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class AlipayUserUserinfoShareResponse
/*  10:    */   extends AlipayResponse
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 8414391523389761537L;
/*  13:    */   @ApiField("address")
/*  14:    */   private String address;
/*  15:    */   @ApiField("address_code")
/*  16:    */   private String addressCode;
/*  17:    */   @ApiField("area")
/*  18:    */   private String area;
/*  19:    */   @ApiField("avatar")
/*  20:    */   private String avatar;
/*  21:    */   @ApiField("cert_no")
/*  22:    */   private String certNo;
/*  23:    */   @ApiField("cert_type_value")
/*  24:    */   private String certTypeValue;
/*  25:    */   @ApiField("city")
/*  26:    */   private String city;
/*  27:    */   @ApiField("default_deliver_address")
/*  28:    */   private String defaultDeliverAddress;
/*  29:    */   @ApiListField("deliver_address_list")
/*  30:    */   @ApiField("deliver_address")
/*  31:    */   private List<DeliverAddress> deliverAddressList;
/*  32:    */   @ApiField("deliver_area")
/*  33:    */   private String deliverArea;
/*  34:    */   @ApiField("deliver_city")
/*  35:    */   private String deliverCity;
/*  36:    */   @ApiField("deliver_fullname")
/*  37:    */   private String deliverFullname;
/*  38:    */   @ApiField("deliver_mobile")
/*  39:    */   private String deliverMobile;
/*  40:    */   @ApiField("deliver_phone")
/*  41:    */   private String deliverPhone;
/*  42:    */   @ApiField("deliver_province")
/*  43:    */   private String deliverProvince;
/*  44:    */   @ApiField("email")
/*  45:    */   private String email;
/*  46:    */   @ApiField("firm_name")
/*  47:    */   private String firmName;
/*  48:    */   @ApiField("gender")
/*  49:    */   private String gender;
/*  50:    */   @ApiField("is_bank_auth")
/*  51:    */   private String isBankAuth;
/*  52:    */   @ApiField("is_certified")
/*  53:    */   private String isCertified;
/*  54:    */   @ApiField("is_id_auth")
/*  55:    */   private String isIdAuth;
/*  56:    */   @ApiField("is_licence_auth")
/*  57:    */   private String isLicenceAuth;
/*  58:    */   @ApiField("is_mobile_auth")
/*  59:    */   private String isMobileAuth;
/*  60:    */   @ApiField("is_student_certified")
/*  61:    */   private String isStudentCertified;
/*  62:    */   @ApiField("mobile")
/*  63:    */   private String mobile;
/*  64:    */   @ApiField("phone")
/*  65:    */   private String phone;
/*  66:    */   @ApiField("province")
/*  67:    */   private String province;
/*  68:    */   @ApiField("real_name")
/*  69:    */   private String realName;
/*  70:    */   @ApiField("user_id")
/*  71:    */   private String userId;
/*  72:    */   @ApiField("user_status")
/*  73:    */   private String userStatus;
/*  74:    */   @ApiField("user_type_value")
/*  75:    */   private String userTypeValue;
/*  76:    */   @ApiField("zip")
/*  77:    */   private String zip;
/*  78:    */   
/*  79:    */   public void setAddress(String address)
/*  80:    */   {
/*  81:229 */     this.address = address;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getAddress()
/*  85:    */   {
/*  86:232 */     return this.address;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setAddressCode(String addressCode)
/*  90:    */   {
/*  91:236 */     this.addressCode = addressCode;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getAddressCode()
/*  95:    */   {
/*  96:239 */     return this.addressCode;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setArea(String area)
/* 100:    */   {
/* 101:243 */     this.area = area;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getArea()
/* 105:    */   {
/* 106:246 */     return this.area;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setAvatar(String avatar)
/* 110:    */   {
/* 111:250 */     this.avatar = avatar;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getAvatar()
/* 115:    */   {
/* 116:253 */     return this.avatar;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setCertNo(String certNo)
/* 120:    */   {
/* 121:257 */     this.certNo = certNo;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getCertNo()
/* 125:    */   {
/* 126:260 */     return this.certNo;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setCertTypeValue(String certTypeValue)
/* 130:    */   {
/* 131:264 */     this.certTypeValue = certTypeValue;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getCertTypeValue()
/* 135:    */   {
/* 136:267 */     return this.certTypeValue;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setCity(String city)
/* 140:    */   {
/* 141:271 */     this.city = city;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public String getCity()
/* 145:    */   {
/* 146:274 */     return this.city;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public void setDefaultDeliverAddress(String defaultDeliverAddress)
/* 150:    */   {
/* 151:278 */     this.defaultDeliverAddress = defaultDeliverAddress;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public String getDefaultDeliverAddress()
/* 155:    */   {
/* 156:281 */     return this.defaultDeliverAddress;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public void setDeliverAddressList(List<DeliverAddress> deliverAddressList)
/* 160:    */   {
/* 161:285 */     this.deliverAddressList = deliverAddressList;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public List<DeliverAddress> getDeliverAddressList()
/* 165:    */   {
/* 166:288 */     return this.deliverAddressList;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void setDeliverArea(String deliverArea)
/* 170:    */   {
/* 171:292 */     this.deliverArea = deliverArea;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public String getDeliverArea()
/* 175:    */   {
/* 176:295 */     return this.deliverArea;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void setDeliverCity(String deliverCity)
/* 180:    */   {
/* 181:299 */     this.deliverCity = deliverCity;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public String getDeliverCity()
/* 185:    */   {
/* 186:302 */     return this.deliverCity;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public void setDeliverFullname(String deliverFullname)
/* 190:    */   {
/* 191:306 */     this.deliverFullname = deliverFullname;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public String getDeliverFullname()
/* 195:    */   {
/* 196:309 */     return this.deliverFullname;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public void setDeliverMobile(String deliverMobile)
/* 200:    */   {
/* 201:313 */     this.deliverMobile = deliverMobile;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public String getDeliverMobile()
/* 205:    */   {
/* 206:316 */     return this.deliverMobile;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public void setDeliverPhone(String deliverPhone)
/* 210:    */   {
/* 211:320 */     this.deliverPhone = deliverPhone;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public String getDeliverPhone()
/* 215:    */   {
/* 216:323 */     return this.deliverPhone;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public void setDeliverProvince(String deliverProvince)
/* 220:    */   {
/* 221:327 */     this.deliverProvince = deliverProvince;
/* 222:    */   }
/* 223:    */   
/* 224:    */   public String getDeliverProvince()
/* 225:    */   {
/* 226:330 */     return this.deliverProvince;
/* 227:    */   }
/* 228:    */   
/* 229:    */   public void setEmail(String email)
/* 230:    */   {
/* 231:334 */     this.email = email;
/* 232:    */   }
/* 233:    */   
/* 234:    */   public String getEmail()
/* 235:    */   {
/* 236:337 */     return this.email;
/* 237:    */   }
/* 238:    */   
/* 239:    */   public void setFirmName(String firmName)
/* 240:    */   {
/* 241:341 */     this.firmName = firmName;
/* 242:    */   }
/* 243:    */   
/* 244:    */   public String getFirmName()
/* 245:    */   {
/* 246:344 */     return this.firmName;
/* 247:    */   }
/* 248:    */   
/* 249:    */   public void setGender(String gender)
/* 250:    */   {
/* 251:348 */     this.gender = gender;
/* 252:    */   }
/* 253:    */   
/* 254:    */   public String getGender()
/* 255:    */   {
/* 256:351 */     return this.gender;
/* 257:    */   }
/* 258:    */   
/* 259:    */   public void setIsBankAuth(String isBankAuth)
/* 260:    */   {
/* 261:355 */     this.isBankAuth = isBankAuth;
/* 262:    */   }
/* 263:    */   
/* 264:    */   public String getIsBankAuth()
/* 265:    */   {
/* 266:358 */     return this.isBankAuth;
/* 267:    */   }
/* 268:    */   
/* 269:    */   public void setIsCertified(String isCertified)
/* 270:    */   {
/* 271:362 */     this.isCertified = isCertified;
/* 272:    */   }
/* 273:    */   
/* 274:    */   public String getIsCertified()
/* 275:    */   {
/* 276:365 */     return this.isCertified;
/* 277:    */   }
/* 278:    */   
/* 279:    */   public void setIsIdAuth(String isIdAuth)
/* 280:    */   {
/* 281:369 */     this.isIdAuth = isIdAuth;
/* 282:    */   }
/* 283:    */   
/* 284:    */   public String getIsIdAuth()
/* 285:    */   {
/* 286:372 */     return this.isIdAuth;
/* 287:    */   }
/* 288:    */   
/* 289:    */   public void setIsLicenceAuth(String isLicenceAuth)
/* 290:    */   {
/* 291:376 */     this.isLicenceAuth = isLicenceAuth;
/* 292:    */   }
/* 293:    */   
/* 294:    */   public String getIsLicenceAuth()
/* 295:    */   {
/* 296:379 */     return this.isLicenceAuth;
/* 297:    */   }
/* 298:    */   
/* 299:    */   public void setIsMobileAuth(String isMobileAuth)
/* 300:    */   {
/* 301:383 */     this.isMobileAuth = isMobileAuth;
/* 302:    */   }
/* 303:    */   
/* 304:    */   public String getIsMobileAuth()
/* 305:    */   {
/* 306:386 */     return this.isMobileAuth;
/* 307:    */   }
/* 308:    */   
/* 309:    */   public void setIsStudentCertified(String isStudentCertified)
/* 310:    */   {
/* 311:390 */     this.isStudentCertified = isStudentCertified;
/* 312:    */   }
/* 313:    */   
/* 314:    */   public String getIsStudentCertified()
/* 315:    */   {
/* 316:393 */     return this.isStudentCertified;
/* 317:    */   }
/* 318:    */   
/* 319:    */   public void setMobile(String mobile)
/* 320:    */   {
/* 321:397 */     this.mobile = mobile;
/* 322:    */   }
/* 323:    */   
/* 324:    */   public String getMobile()
/* 325:    */   {
/* 326:400 */     return this.mobile;
/* 327:    */   }
/* 328:    */   
/* 329:    */   public void setPhone(String phone)
/* 330:    */   {
/* 331:404 */     this.phone = phone;
/* 332:    */   }
/* 333:    */   
/* 334:    */   public String getPhone()
/* 335:    */   {
/* 336:407 */     return this.phone;
/* 337:    */   }
/* 338:    */   
/* 339:    */   public void setProvince(String province)
/* 340:    */   {
/* 341:411 */     this.province = province;
/* 342:    */   }
/* 343:    */   
/* 344:    */   public String getProvince()
/* 345:    */   {
/* 346:414 */     return this.province;
/* 347:    */   }
/* 348:    */   
/* 349:    */   public void setRealName(String realName)
/* 350:    */   {
/* 351:418 */     this.realName = realName;
/* 352:    */   }
/* 353:    */   
/* 354:    */   public String getRealName()
/* 355:    */   {
/* 356:421 */     return this.realName;
/* 357:    */   }
/* 358:    */   
/* 359:    */   public void setUserId(String userId)
/* 360:    */   {
/* 361:425 */     this.userId = userId;
/* 362:    */   }
/* 363:    */   
/* 364:    */   public String getUserId()
/* 365:    */   {
/* 366:428 */     return this.userId;
/* 367:    */   }
/* 368:    */   
/* 369:    */   public void setUserStatus(String userStatus)
/* 370:    */   {
/* 371:432 */     this.userStatus = userStatus;
/* 372:    */   }
/* 373:    */   
/* 374:    */   public String getUserStatus()
/* 375:    */   {
/* 376:435 */     return this.userStatus;
/* 377:    */   }
/* 378:    */   
/* 379:    */   public void setUserTypeValue(String userTypeValue)
/* 380:    */   {
/* 381:439 */     this.userTypeValue = userTypeValue;
/* 382:    */   }
/* 383:    */   
/* 384:    */   public String getUserTypeValue()
/* 385:    */   {
/* 386:442 */     return this.userTypeValue;
/* 387:    */   }
/* 388:    */   
/* 389:    */   public void setZip(String zip)
/* 390:    */   {
/* 391:446 */     this.zip = zip;
/* 392:    */   }
/* 393:    */   
/* 394:    */   public String getZip()
/* 395:    */   {
/* 396:449 */     return this.zip;
/* 397:    */   }
/* 398:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayUserUserinfoShareResponse
 * JD-Core Version:    0.7.0.1
 */