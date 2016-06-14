/*   1:    */ package com.alipay.api.internal.util;
/*   2:    */ 
/*   3:    */ import com.alipay.api.FileItem;
/*   4:    */ import java.io.BufferedReader;
/*   5:    */ import java.io.IOException;
/*   6:    */ import java.io.InputStream;
/*   7:    */ import java.io.InputStreamReader;
/*   8:    */ import java.io.OutputStream;
/*   9:    */ import java.io.StringWriter;
/*  10:    */ import java.net.HttpURLConnection;
/*  11:    */ import java.net.URL;
/*  12:    */ import java.net.URLDecoder;
/*  13:    */ import java.net.URLEncoder;
/*  14:    */ import java.security.SecureRandom;
/*  15:    */ import java.security.cert.CertificateException;
/*  16:    */ import java.security.cert.X509Certificate;
/*  17:    */ import java.util.HashMap;
/*  18:    */ import java.util.Map;
/*  19:    */ import java.util.Map.Entry;
/*  20:    */ import java.util.Set;
/*  21:    */ import javax.net.ssl.HostnameVerifier;
/*  22:    */ import javax.net.ssl.HttpsURLConnection;
/*  23:    */ import javax.net.ssl.KeyManager;
/*  24:    */ import javax.net.ssl.SSLContext;
/*  25:    */ import javax.net.ssl.SSLSession;
/*  26:    */ import javax.net.ssl.TrustManager;
/*  27:    */ import javax.net.ssl.X509TrustManager;
/*  28:    */ 
/*  29:    */ public abstract class WebUtils
/*  30:    */ {
/*  31:    */   private static final String DEFAULT_CHARSET = "UTF-8";
/*  32:    */   private static final String METHOD_POST = "POST";
/*  33:    */   private static final String METHOD_GET = "GET";
/*  34:    */   
/*  35:    */   private static class DefaultTrustManager
/*  36:    */     implements X509TrustManager
/*  37:    */   {
/*  38:    */     public X509Certificate[] getAcceptedIssuers()
/*  39:    */     {
/*  40: 46 */       return null;
/*  41:    */     }
/*  42:    */     
/*  43:    */     public void checkClientTrusted(X509Certificate[] chain, String authType)
/*  44:    */       throws CertificateException
/*  45:    */     {}
/*  46:    */     
/*  47:    */     public void checkServerTrusted(X509Certificate[] chain, String authType)
/*  48:    */       throws CertificateException
/*  49:    */     {}
/*  50:    */   }
/*  51:    */   
/*  52:    */   public static String doPost(String url, Map<String, String> params, int connectTimeout, int readTimeout)
/*  53:    */     throws IOException
/*  54:    */   {
/*  55: 71 */     return doPost(url, params, "UTF-8", connectTimeout, readTimeout);
/*  56:    */   }
/*  57:    */   
/*  58:    */   public static String doPost(String url, Map<String, String> params, String charset, int connectTimeout, int readTimeout)
/*  59:    */     throws IOException
/*  60:    */   {
/*  61: 85 */     String ctype = "application/x-www-form-urlencoded;charset=" + charset;
/*  62: 86 */     String query = buildQuery(params, charset);
/*  63: 87 */     byte[] content = new byte[0];
/*  64: 88 */     if (query != null) {
/*  65: 89 */       content = query.getBytes(charset);
/*  66:    */     }
/*  67: 91 */     return doPost(url, ctype, content, connectTimeout, readTimeout);
/*  68:    */   }
/*  69:    */   
/*  70:    */   public static String doPost(String url, String ctype, byte[] content, int connectTimeout, int readTimeout)
/*  71:    */     throws IOException
/*  72:    */   {
/*  73:105 */     HttpURLConnection conn = null;
/*  74:106 */     OutputStream out = null;
/*  75:107 */     String rsp = null;
/*  76:    */     try
/*  77:    */     {
/*  78:    */       try
/*  79:    */       {
/*  80:110 */         conn = getConnection(new URL(url), "POST", ctype);
/*  81:111 */         conn.setConnectTimeout(connectTimeout);
/*  82:112 */         conn.setReadTimeout(readTimeout);
/*  83:    */       }
/*  84:    */       catch (IOException e)
/*  85:    */       {
/*  86:114 */         Map<String, String> map = getParamsFromUrl(url);
/*  87:115 */         AlipayLogger.logCommError(e, url, (String)map.get("app_key"), (String)map.get("method"), content);
/*  88:116 */         throw e;
/*  89:    */       }
/*  90:    */       try
/*  91:    */       {
/*  92:119 */         out = conn.getOutputStream();
/*  93:120 */         out.write(content);
/*  94:121 */         rsp = getResponseAsString(conn);
/*  95:    */       }
/*  96:    */       catch (IOException e)
/*  97:    */       {
/*  98:123 */         Map<String, String> map = getParamsFromUrl(url);
/*  99:124 */         AlipayLogger.logCommError(e, conn, (String)map.get("app_key"), (String)map.get("method"), content);
/* 100:125 */         throw e;
/* 101:    */       }
/* 102:    */     }
/* 103:    */     finally
/* 104:    */     {
/* 105:129 */       if (out != null) {
/* 106:130 */         out.close();
/* 107:    */       }
/* 108:132 */       if (conn != null) {
/* 109:133 */         conn.disconnect();
/* 110:    */       }
/* 111:    */     }
/* 112:137 */     return rsp;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public static String doPost(String url, Map<String, String> params, Map<String, FileItem> fileParams, int connectTimeout, int readTimeout)
/* 116:    */     throws IOException
/* 117:    */   {
/* 118:152 */     if ((fileParams == null) || (fileParams.isEmpty())) {
/* 119:153 */       return doPost(url, params, "UTF-8", connectTimeout, readTimeout);
/* 120:    */     }
/* 121:155 */     return doPost(url, params, fileParams, "UTF-8", connectTimeout, readTimeout);
/* 122:    */   }
/* 123:    */   
/* 124:    */   public static String doPost(String url, Map<String, String> params, Map<String, FileItem> fileParams, String charset, int connectTimeout, int readTimeout)
/* 125:    */     throws IOException
/* 126:    */   {
/* 127:172 */     if ((fileParams == null) || (fileParams.isEmpty())) {
/* 128:173 */       return doPost(url, params, charset, connectTimeout, readTimeout);
/* 129:    */     }
/* 130:176 */     String boundary = System.currentTimeMillis() + "";
/* 131:177 */     HttpURLConnection conn = null;
/* 132:178 */     OutputStream out = null;
/* 133:179 */     String rsp = null;
/* 134:    */     try
/* 135:    */     {
/* 136:    */       try
/* 137:    */       {
/* 138:182 */         String ctype = "multipart/form-data;boundary=" + boundary + ";charset=" + charset;
/* 139:183 */         conn = getConnection(new URL(url), "POST", ctype);
/* 140:184 */         conn.setConnectTimeout(connectTimeout);
/* 141:185 */         conn.setReadTimeout(readTimeout);
/* 142:    */       }
/* 143:    */       catch (IOException e)
/* 144:    */       {
/* 145:187 */         Map<String, String> map = getParamsFromUrl(url);
/* 146:188 */         AlipayLogger.logCommError(e, url, (String)map.get("app_key"), (String)map.get("method"), params);
/* 147:189 */         throw e;
/* 148:    */       }
/* 149:    */       try
/* 150:    */       {
/* 151:193 */         out = conn.getOutputStream();
/* 152:    */         
/* 153:195 */         byte[] entryBoundaryBytes = ("\r\n--" + boundary + "\r\n").getBytes(charset);
/* 154:    */         
/* 155:    */ 
/* 156:198 */         Set<Map.Entry<String, String>> textEntrySet = params.entrySet();
/* 157:199 */         for (Map.Entry<String, String> textEntry : textEntrySet)
/* 158:    */         {
/* 159:200 */           byte[] textBytes = getTextEntry((String)textEntry.getKey(), (String)textEntry.getValue(), charset);
/* 160:    */           
/* 161:202 */           out.write(entryBoundaryBytes);
/* 162:203 */           out.write(textBytes);
/* 163:    */         }
/* 164:207 */         Set<Map.Entry<String, FileItem>> fileEntrySet = fileParams.entrySet();
/* 165:208 */         for (Map.Entry<String, FileItem> fileEntry : fileEntrySet)
/* 166:    */         {
/* 167:209 */           FileItem fileItem = (FileItem)fileEntry.getValue();
/* 168:210 */           byte[] fileBytes = getFileEntry((String)fileEntry.getKey(), fileItem.getFileName(), fileItem.getMimeType(), charset);
/* 169:    */           
/* 170:212 */           out.write(entryBoundaryBytes);
/* 171:213 */           out.write(fileBytes);
/* 172:214 */           out.write(fileItem.getContent());
/* 173:    */         }
/* 174:218 */         byte[] endBoundaryBytes = ("\r\n--" + boundary + "--\r\n").getBytes(charset);
/* 175:219 */         out.write(endBoundaryBytes);
/* 176:220 */         rsp = getResponseAsString(conn);
/* 177:    */       }
/* 178:    */       catch (IOException e)
/* 179:    */       {
/* 180:222 */         Map<String, String> map = getParamsFromUrl(url);
/* 181:223 */         AlipayLogger.logCommError(e, conn, (String)map.get("app_key"), (String)map.get("method"), params);
/* 182:224 */         throw e;
/* 183:    */       }
/* 184:    */     }
/* 185:    */     finally
/* 186:    */     {
/* 187:228 */       if (out != null) {
/* 188:229 */         out.close();
/* 189:    */       }
/* 190:231 */       if (conn != null) {
/* 191:232 */         conn.disconnect();
/* 192:    */       }
/* 193:    */     }
/* 194:236 */     return rsp;
/* 195:    */   }
/* 196:    */   
/* 197:    */   private static byte[] getTextEntry(String fieldName, String fieldValue, String charset)
/* 198:    */     throws IOException
/* 199:    */   {
/* 200:241 */     StringBuilder entry = new StringBuilder();
/* 201:242 */     entry.append("Content-Disposition:form-data;name=\"");
/* 202:243 */     entry.append(fieldName);
/* 203:244 */     entry.append("\"\r\nContent-Type:text/plain\r\n\r\n");
/* 204:245 */     entry.append(fieldValue);
/* 205:246 */     return entry.toString().getBytes(charset);
/* 206:    */   }
/* 207:    */   
/* 208:    */   private static byte[] getFileEntry(String fieldName, String fileName, String mimeType, String charset)
/* 209:    */     throws IOException
/* 210:    */   {
/* 211:251 */     StringBuilder entry = new StringBuilder();
/* 212:252 */     entry.append("Content-Disposition:form-data;name=\"");
/* 213:253 */     entry.append(fieldName);
/* 214:254 */     entry.append("\";filename=\"");
/* 215:255 */     entry.append(fileName);
/* 216:256 */     entry.append("\"\r\nContent-Type:");
/* 217:257 */     entry.append(mimeType);
/* 218:258 */     entry.append("\r\n\r\n");
/* 219:259 */     return entry.toString().getBytes(charset);
/* 220:    */   }
/* 221:    */   
/* 222:    */   public static String doGet(String url, Map<String, String> params)
/* 223:    */     throws IOException
/* 224:    */   {
/* 225:271 */     return doGet(url, params, "UTF-8");
/* 226:    */   }
/* 227:    */   
/* 228:    */   public static String doGet(String url, Map<String, String> params, String charset)
/* 229:    */     throws IOException
/* 230:    */   {
/* 231:285 */     HttpURLConnection conn = null;
/* 232:286 */     String rsp = null;
/* 233:    */     try
/* 234:    */     {
/* 235:289 */       String ctype = "application/x-www-form-urlencoded;charset=" + charset;
/* 236:290 */       String query = buildQuery(params, charset);
/* 237:    */       try
/* 238:    */       {
/* 239:292 */         conn = getConnection(buildGetUrl(url, query), "GET", ctype);
/* 240:    */       }
/* 241:    */       catch (IOException e)
/* 242:    */       {
/* 243:294 */         Map<String, String> map = getParamsFromUrl(url);
/* 244:295 */         AlipayLogger.logCommError(e, url, (String)map.get("app_key"), (String)map.get("method"), params);
/* 245:296 */         throw e;
/* 246:    */       }
/* 247:    */       try
/* 248:    */       {
/* 249:300 */         rsp = getResponseAsString(conn);
/* 250:    */       }
/* 251:    */       catch (IOException e)
/* 252:    */       {
/* 253:302 */         Map<String, String> map = getParamsFromUrl(url);
/* 254:303 */         AlipayLogger.logCommError(e, conn, (String)map.get("app_key"), (String)map.get("method"), params);
/* 255:304 */         throw e;
/* 256:    */       }
/* 257:    */     }
/* 258:    */     finally
/* 259:    */     {
/* 260:308 */       if (conn != null) {
/* 261:309 */         conn.disconnect();
/* 262:    */       }
/* 263:    */     }
/* 264:313 */     return rsp;
/* 265:    */   }
/* 266:    */   
/* 267:    */   private static HttpURLConnection getConnection(URL url, String method, String ctype)
/* 268:    */     throws IOException
/* 269:    */   {
/* 270:318 */     HttpURLConnection conn = null;
/* 271:319 */     if ("https".equals(url.getProtocol()))
/* 272:    */     {
/* 273:320 */       SSLContext ctx = null;
/* 274:    */       try
/* 275:    */       {
/* 276:322 */         ctx = SSLContext.getInstance("TLS");
/* 277:323 */         ctx.init(new KeyManager[0], new TrustManager[] { new DefaultTrustManager(null) }, new SecureRandom());
/* 278:    */       }
/* 279:    */       catch (Exception e)
/* 280:    */       {
/* 281:326 */         throw new IOException(e);
/* 282:    */       }
/* 283:328 */       HttpsURLConnection connHttps = (HttpsURLConnection)url.openConnection();
/* 284:329 */       connHttps.setSSLSocketFactory(ctx.getSocketFactory());
/* 285:330 */       connHttps.setHostnameVerifier(new HostnameVerifier()
/* 286:    */       {
/* 287:    */         public boolean verify(String hostname, SSLSession session)
/* 288:    */         {
/* 289:332 */           return false;
/* 290:    */         }
/* 291:334 */       });
/* 292:335 */       conn = connHttps;
/* 293:    */     }
/* 294:    */     else
/* 295:    */     {
/* 296:337 */       conn = (HttpURLConnection)url.openConnection();
/* 297:    */     }
/* 298:340 */     conn.setRequestMethod(method);
/* 299:341 */     conn.setDoInput(true);
/* 300:342 */     conn.setDoOutput(true);
/* 301:343 */     conn.setRequestProperty("Accept", "text/xml,text/javascript,text/html");
/* 302:344 */     conn.setRequestProperty("User-Agent", "aop-sdk-java");
/* 303:345 */     conn.setRequestProperty("Content-Type", ctype);
/* 304:346 */     return conn;
/* 305:    */   }
/* 306:    */   
/* 307:    */   private static URL buildGetUrl(String strUrl, String query)
/* 308:    */     throws IOException
/* 309:    */   {
/* 310:350 */     URL url = new URL(strUrl);
/* 311:351 */     if (StringUtils.isEmpty(query)) {
/* 312:352 */       return url;
/* 313:    */     }
/* 314:355 */     if (StringUtils.isEmpty(url.getQuery()))
/* 315:    */     {
/* 316:356 */       if (strUrl.endsWith("?")) {
/* 317:357 */         strUrl = strUrl + query;
/* 318:    */       } else {
/* 319:359 */         strUrl = strUrl + "?" + query;
/* 320:    */       }
/* 321:    */     }
/* 322:362 */     else if (strUrl.endsWith("&")) {
/* 323:363 */       strUrl = strUrl + query;
/* 324:    */     } else {
/* 325:365 */       strUrl = strUrl + "&" + query;
/* 326:    */     }
/* 327:369 */     return new URL(strUrl);
/* 328:    */   }
/* 329:    */   
/* 330:    */   public static String buildQuery(Map<String, String> params, String charset)
/* 331:    */     throws IOException
/* 332:    */   {
/* 333:373 */     if ((params == null) || (params.isEmpty())) {
/* 334:374 */       return null;
/* 335:    */     }
/* 336:377 */     StringBuilder query = new StringBuilder();
/* 337:378 */     Set<Map.Entry<String, String>> entries = params.entrySet();
/* 338:379 */     boolean hasParam = false;
/* 339:381 */     for (Map.Entry<String, String> entry : entries)
/* 340:    */     {
/* 341:382 */       String name = (String)entry.getKey();
/* 342:383 */       String value = (String)entry.getValue();
/* 343:385 */       if (StringUtils.areNotEmpty(new String[] { name, value }))
/* 344:    */       {
/* 345:386 */         if (hasParam) {
/* 346:387 */           query.append("&");
/* 347:    */         } else {
/* 348:389 */           hasParam = true;
/* 349:    */         }
/* 350:392 */         query.append(name).append("=").append(URLEncoder.encode(value, charset));
/* 351:    */       }
/* 352:    */     }
/* 353:396 */     return query.toString();
/* 354:    */   }
/* 355:    */   
/* 356:    */   protected static String getResponseAsString(HttpURLConnection conn)
/* 357:    */     throws IOException
/* 358:    */   {
/* 359:400 */     String charset = getResponseCharset(conn.getContentType());
/* 360:401 */     InputStream es = conn.getErrorStream();
/* 361:402 */     if (es == null) {
/* 362:403 */       return getStreamAsString(conn.getInputStream(), charset);
/* 363:    */     }
/* 364:405 */     String msg = getStreamAsString(es, charset);
/* 365:406 */     if (StringUtils.isEmpty(msg)) {
/* 366:407 */       throw new IOException(conn.getResponseCode() + ":" + conn.getResponseMessage());
/* 367:    */     }
/* 368:409 */     throw new IOException(msg);
/* 369:    */   }
/* 370:    */   
/* 371:    */   private static String getStreamAsString(InputStream stream, String charset)
/* 372:    */     throws IOException
/* 373:    */   {
/* 374:    */     try
/* 375:    */     {
/* 376:416 */       BufferedReader reader = new BufferedReader(new InputStreamReader(stream, charset));
/* 377:417 */       StringWriter writer = new StringWriter();
/* 378:    */       
/* 379:419 */       char[] chars = new char[256];
/* 380:420 */       int count = 0;
/* 381:421 */       while ((count = reader.read(chars)) > 0) {
/* 382:422 */         writer.write(chars, 0, count);
/* 383:    */       }
/* 384:425 */       return writer.toString();
/* 385:    */     }
/* 386:    */     finally
/* 387:    */     {
/* 388:427 */       if (stream != null) {
/* 389:428 */         stream.close();
/* 390:    */       }
/* 391:    */     }
/* 392:    */   }
/* 393:    */   
/* 394:    */   private static String getResponseCharset(String ctype)
/* 395:    */   {
/* 396:434 */     String charset = "UTF-8";
/* 397:436 */     if (!StringUtils.isEmpty(ctype))
/* 398:    */     {
/* 399:437 */       String[] params = ctype.split(";");
/* 400:438 */       for (String param : params)
/* 401:    */       {
/* 402:439 */         param = param.trim();
/* 403:440 */         if (param.startsWith("charset"))
/* 404:    */         {
/* 405:441 */           String[] pair = param.split("=", 2);
/* 406:442 */           if ((pair.length != 2) || 
/* 407:443 */             (StringUtils.isEmpty(pair[1]))) {
/* 408:    */             break;
/* 409:    */           }
/* 410:444 */           charset = pair[1].trim(); break;
/* 411:    */         }
/* 412:    */       }
/* 413:    */     }
/* 414:452 */     return charset;
/* 415:    */   }
/* 416:    */   
/* 417:    */   public static String decode(String value)
/* 418:    */   {
/* 419:462 */     return decode(value, "UTF-8");
/* 420:    */   }
/* 421:    */   
/* 422:    */   public static String encode(String value)
/* 423:    */   {
/* 424:472 */     return encode(value, "UTF-8");
/* 425:    */   }
/* 426:    */   
/* 427:    */   public static String decode(String value, String charset)
/* 428:    */   {
/* 429:483 */     String result = null;
/* 430:484 */     if (!StringUtils.isEmpty(value)) {
/* 431:    */       try
/* 432:    */       {
/* 433:486 */         result = URLDecoder.decode(value, charset);
/* 434:    */       }
/* 435:    */       catch (IOException e)
/* 436:    */       {
/* 437:488 */         throw new RuntimeException(e);
/* 438:    */       }
/* 439:    */     }
/* 440:491 */     return result;
/* 441:    */   }
/* 442:    */   
/* 443:    */   public static String encode(String value, String charset)
/* 444:    */   {
/* 445:502 */     String result = null;
/* 446:503 */     if (!StringUtils.isEmpty(value)) {
/* 447:    */       try
/* 448:    */       {
/* 449:505 */         result = URLEncoder.encode(value, charset);
/* 450:    */       }
/* 451:    */       catch (IOException e)
/* 452:    */       {
/* 453:507 */         throw new RuntimeException(e);
/* 454:    */       }
/* 455:    */     }
/* 456:510 */     return result;
/* 457:    */   }
/* 458:    */   
/* 459:    */   private static Map<String, String> getParamsFromUrl(String url)
/* 460:    */   {
/* 461:514 */     Map<String, String> map = null;
/* 462:515 */     if ((url != null) && (url.indexOf('?') != -1)) {
/* 463:516 */       map = splitUrlQuery(url.substring(url.indexOf('?') + 1));
/* 464:    */     }
/* 465:518 */     if (map == null) {
/* 466:519 */       map = new HashMap();
/* 467:    */     }
/* 468:521 */     return map;
/* 469:    */   }
/* 470:    */   
/* 471:    */   public static Map<String, String> splitUrlQuery(String query)
/* 472:    */   {
/* 473:531 */     Map<String, String> result = new HashMap();
/* 474:    */     
/* 475:533 */     String[] pairs = query.split("&");
/* 476:534 */     if ((pairs != null) && (pairs.length > 0)) {
/* 477:535 */       for (String pair : pairs)
/* 478:    */       {
/* 479:536 */         String[] param = pair.split("=", 2);
/* 480:537 */         if ((param != null) && (param.length == 2)) {
/* 481:538 */           result.put(param[0], param[1]);
/* 482:    */         }
/* 483:    */       }
/* 484:    */     }
/* 485:543 */     return result;
/* 486:    */   }
/* 487:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.WebUtils
 * JD-Core Version:    0.7.0.1
 */