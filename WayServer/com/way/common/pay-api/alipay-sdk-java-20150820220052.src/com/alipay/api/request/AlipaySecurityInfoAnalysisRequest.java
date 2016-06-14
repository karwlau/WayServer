/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipaySecurityInfoAnalysisResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipaySecurityInfoAnalysisRequest
/*   9:    */   implements AlipayRequest<AlipaySecurityInfoAnalysisResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String envClientBaseBand;
/*  14:    */   private String envClientBaseStation;
/*  15:    */   private String envClientCoordinates;
/*  16:    */   private String envClientImei;
/*  17:    */   private String envClientImsi;
/*  18:    */   private String envClientIosUdid;
/*  19:    */   private String envClientIp;
/*  20:    */   private String envClientMac;
/*  21:    */   private String envClientScreen;
/*  22:    */   private String envClientUuid;
/*  23:    */   private String jsTokenId;
/*  24:    */   private String partnerId;
/*  25:    */   private String sceneCode;
/*  26:    */   private String userAccountNo;
/*  27:    */   private String userBindBankcard;
/*  28:    */   private String userBindBankcardType;
/*  29:    */   private String userBindMobile;
/*  30:    */   private String userIdentityType;
/*  31:    */   private String userRealName;
/*  32:    */   private String userRegDate;
/*  33:    */   private String userRegEmail;
/*  34:    */   private String userRegMobile;
/*  35:    */   private String userrIdentityNo;
/*  36:    */   private String terminalType;
/*  37:    */   private String terminalInfo;
/*  38:    */   private String prodCode;
/*  39:    */   private String notifyUrl;
/*  40:    */   
/*  41:    */   public void setEnvClientBaseBand(String envClientBaseBand)
/*  42:    */   {
/*  43:136 */     this.envClientBaseBand = envClientBaseBand;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public String getEnvClientBaseBand()
/*  47:    */   {
/*  48:139 */     return this.envClientBaseBand;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setEnvClientBaseStation(String envClientBaseStation)
/*  52:    */   {
/*  53:143 */     this.envClientBaseStation = envClientBaseStation;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String getEnvClientBaseStation()
/*  57:    */   {
/*  58:146 */     return this.envClientBaseStation;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setEnvClientCoordinates(String envClientCoordinates)
/*  62:    */   {
/*  63:150 */     this.envClientCoordinates = envClientCoordinates;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getEnvClientCoordinates()
/*  67:    */   {
/*  68:153 */     return this.envClientCoordinates;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setEnvClientImei(String envClientImei)
/*  72:    */   {
/*  73:157 */     this.envClientImei = envClientImei;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getEnvClientImei()
/*  77:    */   {
/*  78:160 */     return this.envClientImei;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setEnvClientImsi(String envClientImsi)
/*  82:    */   {
/*  83:164 */     this.envClientImsi = envClientImsi;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getEnvClientImsi()
/*  87:    */   {
/*  88:167 */     return this.envClientImsi;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setEnvClientIosUdid(String envClientIosUdid)
/*  92:    */   {
/*  93:171 */     this.envClientIosUdid = envClientIosUdid;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String getEnvClientIosUdid()
/*  97:    */   {
/*  98:174 */     return this.envClientIosUdid;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setEnvClientIp(String envClientIp)
/* 102:    */   {
/* 103:178 */     this.envClientIp = envClientIp;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public String getEnvClientIp()
/* 107:    */   {
/* 108:181 */     return this.envClientIp;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setEnvClientMac(String envClientMac)
/* 112:    */   {
/* 113:185 */     this.envClientMac = envClientMac;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public String getEnvClientMac()
/* 117:    */   {
/* 118:188 */     return this.envClientMac;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void setEnvClientScreen(String envClientScreen)
/* 122:    */   {
/* 123:192 */     this.envClientScreen = envClientScreen;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public String getEnvClientScreen()
/* 127:    */   {
/* 128:195 */     return this.envClientScreen;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void setEnvClientUuid(String envClientUuid)
/* 132:    */   {
/* 133:199 */     this.envClientUuid = envClientUuid;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public String getEnvClientUuid()
/* 137:    */   {
/* 138:202 */     return this.envClientUuid;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void setJsTokenId(String jsTokenId)
/* 142:    */   {
/* 143:206 */     this.jsTokenId = jsTokenId;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public String getJsTokenId()
/* 147:    */   {
/* 148:209 */     return this.jsTokenId;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void setPartnerId(String partnerId)
/* 152:    */   {
/* 153:213 */     this.partnerId = partnerId;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public String getPartnerId()
/* 157:    */   {
/* 158:216 */     return this.partnerId;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void setSceneCode(String sceneCode)
/* 162:    */   {
/* 163:220 */     this.sceneCode = sceneCode;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public String getSceneCode()
/* 167:    */   {
/* 168:223 */     return this.sceneCode;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public void setUserAccountNo(String userAccountNo)
/* 172:    */   {
/* 173:227 */     this.userAccountNo = userAccountNo;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public String getUserAccountNo()
/* 177:    */   {
/* 178:230 */     return this.userAccountNo;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public void setUserBindBankcard(String userBindBankcard)
/* 182:    */   {
/* 183:234 */     this.userBindBankcard = userBindBankcard;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public String getUserBindBankcard()
/* 187:    */   {
/* 188:237 */     return this.userBindBankcard;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public void setUserBindBankcardType(String userBindBankcardType)
/* 192:    */   {
/* 193:241 */     this.userBindBankcardType = userBindBankcardType;
/* 194:    */   }
/* 195:    */   
/* 196:    */   public String getUserBindBankcardType()
/* 197:    */   {
/* 198:244 */     return this.userBindBankcardType;
/* 199:    */   }
/* 200:    */   
/* 201:    */   public void setUserBindMobile(String userBindMobile)
/* 202:    */   {
/* 203:248 */     this.userBindMobile = userBindMobile;
/* 204:    */   }
/* 205:    */   
/* 206:    */   public String getUserBindMobile()
/* 207:    */   {
/* 208:251 */     return this.userBindMobile;
/* 209:    */   }
/* 210:    */   
/* 211:    */   public void setUserIdentityType(String userIdentityType)
/* 212:    */   {
/* 213:255 */     this.userIdentityType = userIdentityType;
/* 214:    */   }
/* 215:    */   
/* 216:    */   public String getUserIdentityType()
/* 217:    */   {
/* 218:258 */     return this.userIdentityType;
/* 219:    */   }
/* 220:    */   
/* 221:    */   public void setUserRealName(String userRealName)
/* 222:    */   {
/* 223:262 */     this.userRealName = userRealName;
/* 224:    */   }
/* 225:    */   
/* 226:    */   public String getUserRealName()
/* 227:    */   {
/* 228:265 */     return this.userRealName;
/* 229:    */   }
/* 230:    */   
/* 231:    */   public void setUserRegDate(String userRegDate)
/* 232:    */   {
/* 233:269 */     this.userRegDate = userRegDate;
/* 234:    */   }
/* 235:    */   
/* 236:    */   public String getUserRegDate()
/* 237:    */   {
/* 238:272 */     return this.userRegDate;
/* 239:    */   }
/* 240:    */   
/* 241:    */   public void setUserRegEmail(String userRegEmail)
/* 242:    */   {
/* 243:276 */     this.userRegEmail = userRegEmail;
/* 244:    */   }
/* 245:    */   
/* 246:    */   public String getUserRegEmail()
/* 247:    */   {
/* 248:279 */     return this.userRegEmail;
/* 249:    */   }
/* 250:    */   
/* 251:    */   public void setUserRegMobile(String userRegMobile)
/* 252:    */   {
/* 253:283 */     this.userRegMobile = userRegMobile;
/* 254:    */   }
/* 255:    */   
/* 256:    */   public String getUserRegMobile()
/* 257:    */   {
/* 258:286 */     return this.userRegMobile;
/* 259:    */   }
/* 260:    */   
/* 261:    */   public void setUserrIdentityNo(String userrIdentityNo)
/* 262:    */   {
/* 263:290 */     this.userrIdentityNo = userrIdentityNo;
/* 264:    */   }
/* 265:    */   
/* 266:    */   public String getUserrIdentityNo()
/* 267:    */   {
/* 268:293 */     return this.userrIdentityNo;
/* 269:    */   }
/* 270:    */   
/* 271:    */   public String getNotifyUrl()
/* 272:    */   {
/* 273:301 */     return this.notifyUrl;
/* 274:    */   }
/* 275:    */   
/* 276:    */   public void setNotifyUrl(String notifyUrl)
/* 277:    */   {
/* 278:305 */     this.notifyUrl = notifyUrl;
/* 279:    */   }
/* 280:    */   
/* 281:    */   public String getApiVersion()
/* 282:    */   {
/* 283:309 */     return this.apiVersion;
/* 284:    */   }
/* 285:    */   
/* 286:    */   public void setApiVersion(String apiVersion)
/* 287:    */   {
/* 288:313 */     this.apiVersion = apiVersion;
/* 289:    */   }
/* 290:    */   
/* 291:    */   public void setTerminalType(String terminalType)
/* 292:    */   {
/* 293:317 */     this.terminalType = terminalType;
/* 294:    */   }
/* 295:    */   
/* 296:    */   public String getTerminalType()
/* 297:    */   {
/* 298:321 */     return this.terminalType;
/* 299:    */   }
/* 300:    */   
/* 301:    */   public void setTerminalInfo(String terminalInfo)
/* 302:    */   {
/* 303:325 */     this.terminalInfo = terminalInfo;
/* 304:    */   }
/* 305:    */   
/* 306:    */   public String getTerminalInfo()
/* 307:    */   {
/* 308:329 */     return this.terminalInfo;
/* 309:    */   }
/* 310:    */   
/* 311:    */   public void setProdCode(String prodCode)
/* 312:    */   {
/* 313:333 */     this.prodCode = prodCode;
/* 314:    */   }
/* 315:    */   
/* 316:    */   public String getProdCode()
/* 317:    */   {
/* 318:337 */     return this.prodCode;
/* 319:    */   }
/* 320:    */   
/* 321:    */   public String getApiMethodName()
/* 322:    */   {
/* 323:341 */     return "alipay.security.info.analysis";
/* 324:    */   }
/* 325:    */   
/* 326:    */   public Map<String, String> getTextParams()
/* 327:    */   {
/* 328:345 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 329:346 */     txtParams.put("env_client_base_band", this.envClientBaseBand);
/* 330:347 */     txtParams.put("env_client_base_station", this.envClientBaseStation);
/* 331:348 */     txtParams.put("env_client_coordinates", this.envClientCoordinates);
/* 332:349 */     txtParams.put("env_client_imei", this.envClientImei);
/* 333:350 */     txtParams.put("env_client_imsi", this.envClientImsi);
/* 334:351 */     txtParams.put("env_client_ios_udid", this.envClientIosUdid);
/* 335:352 */     txtParams.put("env_client_ip", this.envClientIp);
/* 336:353 */     txtParams.put("env_client_mac", this.envClientMac);
/* 337:354 */     txtParams.put("env_client_screen", this.envClientScreen);
/* 338:355 */     txtParams.put("env_client_uuid", this.envClientUuid);
/* 339:356 */     txtParams.put("js_token_id", this.jsTokenId);
/* 340:357 */     txtParams.put("partner_id", this.partnerId);
/* 341:358 */     txtParams.put("scene_code", this.sceneCode);
/* 342:359 */     txtParams.put("user_account_no", this.userAccountNo);
/* 343:360 */     txtParams.put("user_bind_bankcard", this.userBindBankcard);
/* 344:361 */     txtParams.put("user_bind_bankcard_type", this.userBindBankcardType);
/* 345:362 */     txtParams.put("user_bind_mobile", this.userBindMobile);
/* 346:363 */     txtParams.put("user_identity_type", this.userIdentityType);
/* 347:364 */     txtParams.put("user_real_name", this.userRealName);
/* 348:365 */     txtParams.put("user_reg_date", this.userRegDate);
/* 349:366 */     txtParams.put("user_reg_email", this.userRegEmail);
/* 350:367 */     txtParams.put("user_reg_mobile", this.userRegMobile);
/* 351:368 */     txtParams.put("userr_identity_no", this.userrIdentityNo);
/* 352:369 */     if (this.udfParams != null) {
/* 353:370 */       txtParams.putAll(this.udfParams);
/* 354:    */     }
/* 355:372 */     return txtParams;
/* 356:    */   }
/* 357:    */   
/* 358:    */   public void putOtherTextParam(String key, String value)
/* 359:    */   {
/* 360:376 */     if (this.udfParams == null) {
/* 361:377 */       this.udfParams = new AlipayHashMap();
/* 362:    */     }
/* 363:379 */     this.udfParams.put(key, value);
/* 364:    */   }
/* 365:    */   
/* 366:    */   public Class<AlipaySecurityInfoAnalysisResponse> getResponseClass()
/* 367:    */   {
/* 368:383 */     return AlipaySecurityInfoAnalysisResponse.class;
/* 369:    */   }
/* 370:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipaySecurityInfoAnalysisRequest
 * JD-Core Version:    0.7.0.1
 */