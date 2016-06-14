/*   1:    */ package com.alipay.api.internal.util;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayApiException;
/*   4:    */ import com.alipay.api.internal.util.codec.Base64;
/*   5:    */ import java.io.ByteArrayInputStream;
/*   6:    */ import java.io.ByteArrayOutputStream;
/*   7:    */ import java.io.InputStream;
/*   8:    */ import java.io.InputStreamReader;
/*   9:    */ import java.io.StringWriter;
/*  10:    */ import java.security.KeyFactory;
/*  11:    */ import java.security.PrivateKey;
/*  12:    */ import java.security.PublicKey;
/*  13:    */ import java.security.Signature;
/*  14:    */ import java.security.spec.PKCS8EncodedKeySpec;
/*  15:    */ import java.security.spec.X509EncodedKeySpec;
/*  16:    */ import java.util.ArrayList;
/*  17:    */ import java.util.Collections;
/*  18:    */ import java.util.List;
/*  19:    */ import java.util.Map;
/*  20:    */ import java.util.TreeMap;
/*  21:    */ import javax.crypto.Cipher;
/*  22:    */ 
/*  23:    */ public class AlipaySignature
/*  24:    */ {
/*  25:    */   private static final int MAX_ENCRYPT_BLOCK = 117;
/*  26:    */   private static final int MAX_DECRYPT_BLOCK = 128;
/*  27:    */   
/*  28:    */   public static String getSignatureContent(RequestParametersHolder requestHolder)
/*  29:    */   {
/*  30: 42 */     Map<String, String> sortedParams = new TreeMap();
/*  31: 43 */     AlipayHashMap appParams = requestHolder.getApplicationParams();
/*  32: 44 */     if ((appParams != null) && (appParams.size() > 0)) {
/*  33: 45 */       sortedParams.putAll(appParams);
/*  34:    */     }
/*  35: 47 */     AlipayHashMap protocalMustParams = requestHolder.getProtocalMustParams();
/*  36: 48 */     if ((protocalMustParams != null) && (protocalMustParams.size() > 0)) {
/*  37: 49 */       sortedParams.putAll(protocalMustParams);
/*  38:    */     }
/*  39: 51 */     AlipayHashMap protocalOptParams = requestHolder.getProtocalOptParams();
/*  40: 52 */     if ((protocalOptParams != null) && (protocalOptParams.size() > 0)) {
/*  41: 53 */       sortedParams.putAll(protocalOptParams);
/*  42:    */     }
/*  43: 56 */     return getSignContent(sortedParams);
/*  44:    */   }
/*  45:    */   
/*  46:    */   public static String getSignContent(Map<String, String> sortedParams)
/*  47:    */   {
/*  48: 65 */     StringBuffer content = new StringBuffer();
/*  49: 66 */     List<String> keys = new ArrayList(sortedParams.keySet());
/*  50: 67 */     Collections.sort(keys);
/*  51: 68 */     int index = 0;
/*  52: 69 */     for (int i = 0; i < keys.size(); i++)
/*  53:    */     {
/*  54: 70 */       String key = (String)keys.get(i);
/*  55: 71 */       String value = (String)sortedParams.get(key);
/*  56: 72 */       if (StringUtils.areNotEmpty(new String[] { key, value }))
/*  57:    */       {
/*  58: 73 */         content.append((index == 0 ? "" : "&") + key + "=" + value);
/*  59: 74 */         index++;
/*  60:    */       }
/*  61:    */     }
/*  62: 77 */     return content.toString();
/*  63:    */   }
/*  64:    */   
/*  65:    */   public static String rsaSign(String content, String privateKey, String charset)
/*  66:    */     throws AlipayApiException
/*  67:    */   {
/*  68:    */     try
/*  69:    */     {
/*  70: 83 */       PrivateKey priKey = getPrivateKeyFromPKCS8("RSA", new ByteArrayInputStream(privateKey.getBytes()));
/*  71:    */       
/*  72:    */ 
/*  73: 86 */       Signature signature = Signature.getInstance("SHA1WithRSA");
/*  74:    */       
/*  75:    */ 
/*  76: 89 */       signature.initSign(priKey);
/*  77: 91 */       if (StringUtils.isEmpty(charset)) {
/*  78: 92 */         signature.update(content.getBytes());
/*  79:    */       } else {
/*  80: 94 */         signature.update(content.getBytes(charset));
/*  81:    */       }
/*  82: 97 */       byte[] signed = signature.sign();
/*  83:    */       
/*  84: 99 */       return new String(Base64.encodeBase64(signed));
/*  85:    */     }
/*  86:    */     catch (Exception e)
/*  87:    */     {
/*  88:101 */       throw new AlipayApiException("RSAcontent = " + content + "; charset = " + charset, e);
/*  89:    */     }
/*  90:    */   }
/*  91:    */   
/*  92:    */   public static String rsaSign(Map<String, String> params, String privateKey, String charset)
/*  93:    */     throws AlipayApiException
/*  94:    */   {
/*  95:107 */     String signContent = getSignContent(params);
/*  96:    */     
/*  97:109 */     return rsaSign(signContent, privateKey, charset);
/*  98:    */   }
/*  99:    */   
/* 100:    */   public static PrivateKey getPrivateKeyFromPKCS8(String algorithm, InputStream ins)
/* 101:    */     throws Exception
/* 102:    */   {
/* 103:115 */     if ((ins == null) || (StringUtils.isEmpty(algorithm))) {
/* 104:116 */       return null;
/* 105:    */     }
/* 106:119 */     KeyFactory keyFactory = KeyFactory.getInstance(algorithm);
/* 107:    */     
/* 108:121 */     byte[] encodedKey = StreamUtil.readText(ins).getBytes();
/* 109:    */     
/* 110:123 */     encodedKey = Base64.decodeBase64(encodedKey);
/* 111:    */     
/* 112:125 */     return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(encodedKey));
/* 113:    */   }
/* 114:    */   
/* 115:    */   public static String getSignCheckContentV1(Map<String, String> params)
/* 116:    */   {
/* 117:129 */     if (params == null) {
/* 118:130 */       return null;
/* 119:    */     }
/* 120:133 */     params.remove("sign");
/* 121:134 */     params.remove("sign_type");
/* 122:    */     
/* 123:136 */     StringBuffer content = new StringBuffer();
/* 124:137 */     List<String> keys = new ArrayList(params.keySet());
/* 125:138 */     Collections.sort(keys);
/* 126:140 */     for (int i = 0; i < keys.size(); i++)
/* 127:    */     {
/* 128:141 */       String key = (String)keys.get(i);
/* 129:142 */       String value = (String)params.get(key);
/* 130:143 */       content.append((i == 0 ? "" : "&") + key + "=" + value);
/* 131:    */     }
/* 132:146 */     return content.toString();
/* 133:    */   }
/* 134:    */   
/* 135:    */   public static String getSignCheckContentV2(Map<String, String> params)
/* 136:    */   {
/* 137:150 */     if (params == null) {
/* 138:151 */       return null;
/* 139:    */     }
/* 140:154 */     params.remove("sign");
/* 141:    */     
/* 142:156 */     StringBuffer content = new StringBuffer();
/* 143:157 */     List<String> keys = new ArrayList(params.keySet());
/* 144:158 */     Collections.sort(keys);
/* 145:160 */     for (int i = 0; i < keys.size(); i++)
/* 146:    */     {
/* 147:161 */       String key = (String)keys.get(i);
/* 148:162 */       String value = (String)params.get(key);
/* 149:163 */       content.append((i == 0 ? "" : "&") + key + "=" + value);
/* 150:    */     }
/* 151:166 */     return content.toString();
/* 152:    */   }
/* 153:    */   
/* 154:    */   public static boolean rsaCheckV1(Map<String, String> params, String publicKey, String charset)
/* 155:    */     throws AlipayApiException
/* 156:    */   {
/* 157:171 */     String sign = (String)params.get("sign");
/* 158:172 */     String content = getSignCheckContentV1(params);
/* 159:    */     
/* 160:174 */     return rsaCheckContent(content, sign, publicKey, charset);
/* 161:    */   }
/* 162:    */   
/* 163:    */   public static boolean rsaCheckV2(Map<String, String> params, String publicKey, String charset)
/* 164:    */     throws AlipayApiException
/* 165:    */   {
/* 166:179 */     String sign = (String)params.get("sign");
/* 167:180 */     String content = getSignCheckContentV2(params);
/* 168:    */     
/* 169:182 */     return rsaCheckContent(content, sign, publicKey, charset);
/* 170:    */   }
/* 171:    */   
/* 172:    */   public static boolean rsaCheckContent(String content, String sign, String publicKey, String charset)
/* 173:    */     throws AlipayApiException
/* 174:    */   {
/* 175:    */     try
/* 176:    */     {
/* 177:188 */       PublicKey pubKey = getPublicKeyFromX509("RSA", new ByteArrayInputStream(publicKey.getBytes()));
/* 178:    */       
/* 179:    */ 
/* 180:191 */       Signature signature = Signature.getInstance("SHA1WithRSA");
/* 181:    */       
/* 182:    */ 
/* 183:194 */       signature.initVerify(pubKey);
/* 184:196 */       if (StringUtils.isEmpty(charset)) {
/* 185:197 */         signature.update(content.getBytes());
/* 186:    */       } else {
/* 187:199 */         signature.update(content.getBytes(charset));
/* 188:    */       }
/* 189:202 */       return signature.verify(Base64.decodeBase64(sign.getBytes()));
/* 190:    */     }
/* 191:    */     catch (Exception e)
/* 192:    */     {
/* 193:204 */       throw new AlipayApiException("RSAcontent = " + content + ",sign=" + sign + ",charset = " + charset, e);
/* 194:    */     }
/* 195:    */   }
/* 196:    */   
/* 197:    */   public static PublicKey getPublicKeyFromX509(String algorithm, InputStream ins)
/* 198:    */     throws Exception
/* 199:    */   {
/* 200:211 */     KeyFactory keyFactory = KeyFactory.getInstance(algorithm);
/* 201:    */     
/* 202:213 */     StringWriter writer = new StringWriter();
/* 203:214 */     StreamUtil.io(new InputStreamReader(ins), writer);
/* 204:    */     
/* 205:216 */     byte[] encodedKey = writer.toString().getBytes();
/* 206:    */     
/* 207:218 */     encodedKey = Base64.decodeBase64(encodedKey);
/* 208:    */     
/* 209:220 */     return keyFactory.generatePublic(new X509EncodedKeySpec(encodedKey));
/* 210:    */   }
/* 211:    */   
/* 212:    */   public static String checkSignAndDecrypt(Map<String, String> params, String alipayPublicKey, String cusPrivateKey, boolean isCheckSign, boolean isDecrypt)
/* 213:    */     throws AlipayApiException
/* 214:    */   {
/* 215:246 */     String charset = (String)params.get("charset");
/* 216:247 */     String bizContent = (String)params.get("biz_content");
/* 217:248 */     if ((isCheckSign) && 
/* 218:249 */       (!rsaCheckV2(params, alipayPublicKey, charset))) {
/* 219:250 */       throw new AlipayApiException("rsaCheck failure:rsaParams=" + params);
/* 220:    */     }
/* 221:254 */     if (isDecrypt) {
/* 222:255 */       return rsaDecrypt(bizContent, cusPrivateKey, charset);
/* 223:    */     }
/* 224:258 */     return bizContent;
/* 225:    */   }
/* 226:    */   
/* 227:    */   public static String encryptAndSign(String bizContent, String alipayPublicKey, String cusPrivateKey, String charset, boolean isEncrypt, boolean isSign)
/* 228:    */     throws AlipayApiException
/* 229:    */   {
/* 230:285 */     StringBuilder sb = new StringBuilder();
/* 231:286 */     if (StringUtils.isEmpty(charset)) {
/* 232:287 */       charset = "GBK";
/* 233:    */     }
/* 234:289 */     sb.append("<?xml version=\"1.0\" encoding=\"" + charset + "\"?>");
/* 235:290 */     if (isEncrypt)
/* 236:    */     {
/* 237:291 */       sb.append("<alipay>");
/* 238:292 */       String encrypted = rsaEncrypt(bizContent, alipayPublicKey, charset);
/* 239:293 */       sb.append("<response>" + encrypted + "</response>");
/* 240:294 */       sb.append("<encryption_type>RSA</encryption_type>");
/* 241:295 */       if (isSign)
/* 242:    */       {
/* 243:296 */         String sign = rsaSign(encrypted, cusPrivateKey, charset);
/* 244:297 */         sb.append("<sign>" + sign + "</sign>");
/* 245:298 */         sb.append("<sign_type>RSA</sign_type>");
/* 246:    */       }
/* 247:300 */       sb.append("</alipay>");
/* 248:    */     }
/* 249:301 */     else if (isSign)
/* 250:    */     {
/* 251:302 */       sb.append("<alipay>");
/* 252:303 */       sb.append("<response>" + bizContent + "</response>");
/* 253:304 */       String sign = rsaSign(bizContent, cusPrivateKey, charset);
/* 254:305 */       sb.append("<sign>" + sign + "</sign>");
/* 255:306 */       sb.append("<sign_type>RSA</sign_type>");
/* 256:307 */       sb.append("</alipay>");
/* 257:    */     }
/* 258:    */     else
/* 259:    */     {
/* 260:309 */       sb.append(bizContent);
/* 261:    */     }
/* 262:311 */     return sb.toString();
/* 263:    */   }
/* 264:    */   
/* 265:    */   public static String rsaEncrypt(String content, String publicKey, String charset)
/* 266:    */     throws AlipayApiException
/* 267:    */   {
/* 268:    */     try
/* 269:    */     {
/* 270:326 */       PublicKey pubKey = getPublicKeyFromX509("RSA", new ByteArrayInputStream(publicKey.getBytes()));
/* 271:    */       
/* 272:328 */       Cipher cipher = Cipher.getInstance("RSA");
/* 273:329 */       cipher.init(1, pubKey);
/* 274:330 */       byte[] data = StringUtils.isEmpty(charset) ? content.getBytes() : content.getBytes(charset);
/* 275:    */       
/* 276:332 */       int inputLen = data.length;
/* 277:333 */       ByteArrayOutputStream out = new ByteArrayOutputStream();
/* 278:334 */       int offSet = 0;
/* 279:    */       
/* 280:336 */       int i = 0;
/* 281:338 */       while (inputLen - offSet > 0)
/* 282:    */       {
/* 283:    */         byte[] cache;
/* 284:    */         byte[] cache;
/* 285:339 */         if (inputLen - offSet > 117) {
/* 286:340 */           cache = cipher.doFinal(data, offSet, 117);
/* 287:    */         } else {
/* 288:342 */           cache = cipher.doFinal(data, offSet, inputLen - offSet);
/* 289:    */         }
/* 290:344 */         out.write(cache, 0, cache.length);
/* 291:345 */         i++;
/* 292:346 */         offSet = i * 117;
/* 293:    */       }
/* 294:348 */       byte[] encryptedData = Base64.encodeBase64(out.toByteArray());
/* 295:349 */       out.close();
/* 296:    */       
/* 297:351 */       return StringUtils.isEmpty(charset) ? new String(encryptedData) : new String(encryptedData, charset);
/* 298:    */     }
/* 299:    */     catch (Exception e)
/* 300:    */     {
/* 301:354 */       throw new AlipayApiException("EncryptContent = " + content + ",charset = " + charset, e);
/* 302:    */     }
/* 303:    */   }
/* 304:    */   
/* 305:    */   public static String rsaDecrypt(String content, String privateKey, String charset)
/* 306:    */     throws AlipayApiException
/* 307:    */   {
/* 308:    */     try
/* 309:    */     {
/* 310:370 */       PrivateKey priKey = getPrivateKeyFromPKCS8("RSA", new ByteArrayInputStream(privateKey.getBytes()));
/* 311:    */       
/* 312:372 */       Cipher cipher = Cipher.getInstance("RSA");
/* 313:373 */       cipher.init(2, priKey);
/* 314:374 */       byte[] encryptedData = StringUtils.isEmpty(charset) ? Base64.decodeBase64(content.getBytes()) : Base64.decodeBase64(content.getBytes(charset));
/* 315:    */       
/* 316:376 */       int inputLen = encryptedData.length;
/* 317:377 */       ByteArrayOutputStream out = new ByteArrayOutputStream();
/* 318:378 */       int offSet = 0;
/* 319:    */       
/* 320:380 */       int i = 0;
/* 321:382 */       while (inputLen - offSet > 0)
/* 322:    */       {
/* 323:    */         byte[] cache;
/* 324:    */         byte[] cache;
/* 325:383 */         if (inputLen - offSet > 128) {
/* 326:384 */           cache = cipher.doFinal(encryptedData, offSet, 128);
/* 327:    */         } else {
/* 328:386 */           cache = cipher.doFinal(encryptedData, offSet, inputLen - offSet);
/* 329:    */         }
/* 330:388 */         out.write(cache, 0, cache.length);
/* 331:389 */         i++;
/* 332:390 */         offSet = i * 128;
/* 333:    */       }
/* 334:392 */       byte[] decryptedData = out.toByteArray();
/* 335:393 */       out.close();
/* 336:    */       
/* 337:395 */       return StringUtils.isEmpty(charset) ? new String(decryptedData) : new String(decryptedData, charset);
/* 338:    */     }
/* 339:    */     catch (Exception e)
/* 340:    */     {
/* 341:398 */       throw new AlipayApiException("EncodeContent = " + content + ",charset = " + charset, e);
/* 342:    */     }
/* 343:    */   }
/* 344:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.AlipaySignature
 * JD-Core Version:    0.7.0.1
 */