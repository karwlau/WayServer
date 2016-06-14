/*   1:    */ package com.alipay.api;
/*   2:    */ 
/*   3:    */ import com.alipay.api.internal.parser.json.ObjectJsonParser;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.internal.util.AlipayLogger;
/*   6:    */ import com.alipay.api.internal.util.AlipaySignature;
/*   7:    */ import com.alipay.api.internal.util.RequestParametersHolder;
/*   8:    */ import com.alipay.api.internal.util.StreamUtil;
/*   9:    */ import com.alipay.api.internal.util.StringUtils;
/*  10:    */ import java.io.BufferedReader;
/*  11:    */ import java.io.IOException;
/*  12:    */ import java.io.InputStream;
/*  13:    */ import java.io.InputStreamReader;
/*  14:    */ import java.io.OutputStream;
/*  15:    */ import java.io.StringWriter;
/*  16:    */ import java.net.HttpURLConnection;
/*  17:    */ import java.net.URL;
/*  18:    */ import java.net.URLEncoder;
/*  19:    */ import java.security.SecureRandom;
/*  20:    */ import java.security.Security;
/*  21:    */ import java.security.cert.CertificateException;
/*  22:    */ import java.security.cert.X509Certificate;
/*  23:    */ import java.text.DateFormat;
/*  24:    */ import java.text.SimpleDateFormat;
/*  25:    */ import java.util.Date;
/*  26:    */ import java.util.HashMap;
/*  27:    */ import java.util.Map;
/*  28:    */ import java.util.Map.Entry;
/*  29:    */ import java.util.Set;
/*  30:    */ import java.util.TimeZone;
/*  31:    */ import java.util.TreeMap;
/*  32:    */ import javax.net.ssl.HostnameVerifier;
/*  33:    */ import javax.net.ssl.HttpsURLConnection;
/*  34:    */ import javax.net.ssl.KeyManager;
/*  35:    */ import javax.net.ssl.SSLContext;
/*  36:    */ import javax.net.ssl.SSLSession;
/*  37:    */ import javax.net.ssl.TrustManager;
/*  38:    */ import javax.net.ssl.X509TrustManager;
/*  39:    */ 
/*  40:    */ public class AlipayMobilePublicMultiMediaClient
/*  41:    */   implements AlipayClient
/*  42:    */ {
/*  43:    */   private static final String DEFAULT_CHARSET = "UTF-8";
/*  44:    */   private static final String METHOD_POST = "POST";
/*  45:    */   private static final String METHOD_GET = "GET";
/*  46:    */   private String serverUrl;
/*  47:    */   private String appId;
/*  48:    */   private String privateKey;
/*  49:    */   private String prodCode;
/*  50: 57 */   private String format = "json";
/*  51: 58 */   private String sign_type = "RSA";
/*  52:    */   private String charset;
/*  53: 62 */   private int connectTimeout = 3000;
/*  54: 63 */   private int readTimeout = 15000;
/*  55:    */   
/*  56:    */   private static class DefaultTrustManager
/*  57:    */     implements X509TrustManager
/*  58:    */   {
/*  59:    */     public X509Certificate[] getAcceptedIssuers()
/*  60:    */     {
/*  61: 67 */       return null;
/*  62:    */     }
/*  63:    */     
/*  64:    */     public void checkClientTrusted(X509Certificate[] chain, String authType)
/*  65:    */       throws CertificateException
/*  66:    */     {}
/*  67:    */     
/*  68:    */     public void checkServerTrusted(X509Certificate[] chain, String authType)
/*  69:    */       throws CertificateException
/*  70:    */     {}
/*  71:    */   }
/*  72:    */   
/*  73:    */   static
/*  74:    */   {
/*  75: 80 */     Security.setProperty("jdk.certpath.disabledAlgorithms", "");
/*  76:    */   }
/*  77:    */   
/*  78:    */   public AlipayMobilePublicMultiMediaClient(String serverUrl, String appId, String privateKey)
/*  79:    */   {
/*  80: 84 */     this.serverUrl = serverUrl;
/*  81: 85 */     this.appId = appId;
/*  82: 86 */     this.privateKey = privateKey;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public AlipayMobilePublicMultiMediaClient(String serverUrl, String appId, String privateKey, String format)
/*  86:    */   {
/*  87: 91 */     this(serverUrl, appId, privateKey);
/*  88: 92 */     this.format = format;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public AlipayMobilePublicMultiMediaClient(String serverUrl, String appId, String privateKey, String format, String charset)
/*  92:    */   {
/*  93: 97 */     this(serverUrl, appId, privateKey);
/*  94: 98 */     this.format = format;
/*  95: 99 */     this.charset = charset;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public <T extends AlipayResponse> T execute(AlipayRequest<T> request)
/*  99:    */     throws AlipayApiException
/* 100:    */   {
/* 101:106 */     return execute(request, null);
/* 102:    */   }
/* 103:    */   
/* 104:    */   public <T extends AlipayResponse> T execute(AlipayRequest<T> request, String accessToken)
/* 105:    */     throws AlipayApiException
/* 106:    */   {
/* 107:115 */     return _execute(request, accessToken);
/* 108:    */   }
/* 109:    */   
/* 110:    */   private <T extends AlipayResponse> T _execute(AlipayRequest<T> request, String authToken)
/* 111:    */     throws AlipayApiException
/* 112:    */   {
/* 113:120 */     return doGet(request);
/* 114:    */   }
/* 115:    */   
/* 116:    */   public <T extends AlipayResponse> T doGet(AlipayRequest<T> request)
/* 117:    */     throws AlipayApiException
/* 118:    */   {
/* 119:125 */     if (StringUtils.isEmpty(this.charset)) {
/* 120:126 */       this.charset = "UTF-8";
/* 121:    */     }
/* 122:129 */     RequestParametersHolder requestHolder = new RequestParametersHolder();
/* 123:130 */     AlipayHashMap appParams = new AlipayHashMap(request.getTextParams());
/* 124:131 */     requestHolder.setApplicationParams(appParams);
/* 125:    */     
/* 126:133 */     AlipayHashMap protocalMustParams = new AlipayHashMap();
/* 127:134 */     protocalMustParams.put("method", request.getApiMethodName());
/* 128:135 */     protocalMustParams.put("version", request.getApiVersion());
/* 129:136 */     protocalMustParams.put("app_id", this.appId);
/* 130:137 */     protocalMustParams.put("sign_type", this.sign_type);
/* 131:138 */     protocalMustParams.put("charset", this.charset);
/* 132:    */     
/* 133:140 */     Long timestamp = Long.valueOf(System.currentTimeMillis());
/* 134:141 */     DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 135:142 */     df.setTimeZone(TimeZone.getTimeZone("GMT+8"));
/* 136:143 */     protocalMustParams.put("timestamp", df.format(new Date(timestamp.longValue())));
/* 137:144 */     protocalMustParams.put("format", this.format);
/* 138:145 */     requestHolder.setProtocalMustParams(protocalMustParams);
/* 139:    */     
/* 140:147 */     String signContent = AlipaySignature.getSignatureContent(requestHolder);
/* 141:    */     
/* 142:149 */     protocalMustParams.put("sign", AlipaySignature.rsaSign(signContent, this.privateKey, this.charset));
/* 143:    */     
/* 144:    */ 
/* 145:152 */     AlipayMobilePublicMultiMediaDownloadResponse rsp = null;
/* 146:    */     try
/* 147:    */     {
/* 148:155 */       if ((request instanceof AlipayMobilePublicMultiMediaDownloadRequest))
/* 149:    */       {
/* 150:156 */         OutputStream outputStream = ((AlipayMobilePublicMultiMediaDownloadRequest)request).getOutputStream();
/* 151:    */         
/* 152:158 */         rsp = doGet(this.serverUrl, requestHolder, this.charset, this.connectTimeout, this.readTimeout, outputStream);
/* 153:    */       }
/* 154:    */     }
/* 155:    */     catch (IOException e)
/* 156:    */     {
/* 157:162 */       throw new AlipayApiException(e);
/* 158:    */     }
/* 159:164 */     return rsp;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public static AlipayMobilePublicMultiMediaDownloadResponse doGet(String url, RequestParametersHolder requestHolder, String charset, int connectTimeout, int readTimeout, OutputStream output)
/* 163:    */     throws AlipayApiException, IOException
/* 164:    */   {
/* 165:188 */     HttpURLConnection conn = null;
/* 166:189 */     AlipayMobilePublicMultiMediaDownloadResponse response = null;
/* 167:    */     try
/* 168:    */     {
/* 169:193 */       Map<String, String> params = new TreeMap();
/* 170:194 */       AlipayHashMap appParams = requestHolder.getApplicationParams();
/* 171:195 */       if ((appParams != null) && (appParams.size() > 0)) {
/* 172:196 */         params.putAll(appParams);
/* 173:    */       }
/* 174:198 */       AlipayHashMap protocalMustParams = requestHolder.getProtocalMustParams();
/* 175:199 */       if ((protocalMustParams != null) && (protocalMustParams.size() > 0)) {
/* 176:200 */         params.putAll(protocalMustParams);
/* 177:    */       }
/* 178:202 */       AlipayHashMap protocalOptParams = requestHolder.getProtocalOptParams();
/* 179:203 */       if ((protocalOptParams != null) && (protocalOptParams.size() > 0)) {
/* 180:204 */         params.putAll(protocalOptParams);
/* 181:    */       }
/* 182:207 */       String ctype = "application/x-www-form-urlencoded;charset=" + charset;
/* 183:208 */       String query = buildQuery(params, charset);
/* 184:    */       try
/* 185:    */       {
/* 186:210 */         conn = getConnection(buildGetUrl(url, query), "GET", ctype);
/* 187:211 */         conn.setConnectTimeout(connectTimeout);
/* 188:212 */         conn.setReadTimeout(readTimeout);
/* 189:    */       }
/* 190:    */       catch (IOException e)
/* 191:    */       {
/* 192:214 */         Map<String, String> map = getParamsFromUrl(url);
/* 193:215 */         AlipayLogger.logCommError(e, url, (String)map.get("app_key"), (String)map.get("method"), params);
/* 194:216 */         throw e;
/* 195:    */       }
/* 196:    */       try
/* 197:    */       {
/* 198:220 */         if (conn.getResponseCode() == 200)
/* 199:    */         {
/* 200:221 */           if ((conn.getContentType() != null) && (conn.getContentType().toLowerCase().contains("text/plain")))
/* 201:    */           {
/* 202:223 */             String rsp = getResponseAsString(conn);
/* 203:224 */             ObjectJsonParser<AlipayMobilePublicMultiMediaDownloadResponse> parser = new ObjectJsonParser(AlipayMobilePublicMultiMediaDownloadResponse.class);
/* 204:    */             
/* 205:226 */             response = (AlipayMobilePublicMultiMediaDownloadResponse)parser.parse(rsp);
/* 206:227 */             response.setBody(rsp);
/* 207:228 */             response.setParams(appParams);
/* 208:229 */             return response;
/* 209:    */           }
/* 210:232 */           StreamUtil.io(conn.getInputStream(), output);
/* 211:233 */           response = new AlipayMobilePublicMultiMediaDownloadResponse();
/* 212:234 */           response.setCode("200");
/* 213:235 */           response.setMsg("成功");
/* 214:236 */           response.setBody("{\"alipay_mobile_public_multimedia_download_response\":{\"code\":200,\"msg\":\"成功\"}}");
/* 215:    */           
/* 216:238 */           response.setParams(appParams);
/* 217:    */         }
/* 218:    */         else
/* 219:    */         {
/* 220:240 */           response = new AlipayMobilePublicMultiMediaDownloadResponse();
/* 221:241 */           response.setCode(String.valueOf(conn.getResponseCode()));
/* 222:242 */           response.setMsg(conn.getResponseMessage());
/* 223:243 */           response.setParams(appParams);
/* 224:    */         }
/* 225:    */       }
/* 226:    */       catch (IOException e)
/* 227:    */       {
/* 228:246 */         Map<String, String> map = getParamsFromUrl(url);
/* 229:247 */         AlipayLogger.logCommError(e, conn, (String)map.get("app_key"), (String)map.get("method"), params);
/* 230:248 */         throw e;
/* 231:    */       }
/* 232:    */     }
/* 233:    */     finally
/* 234:    */     {
/* 235:252 */       if (conn != null) {
/* 236:253 */         conn.disconnect();
/* 237:    */       }
/* 238:255 */       if (output != null) {
/* 239:256 */         output.close();
/* 240:    */       }
/* 241:    */     }
/* 242:259 */     return response;
/* 243:    */   }
/* 244:    */   
/* 245:    */   private static HttpURLConnection getConnection(URL url, String method, String ctype)
/* 246:    */     throws IOException
/* 247:    */   {
/* 248:265 */     HttpURLConnection conn = null;
/* 249:266 */     if ("https".equals(url.getProtocol()))
/* 250:    */     {
/* 251:267 */       SSLContext ctx = null;
/* 252:    */       try
/* 253:    */       {
/* 254:269 */         ctx = SSLContext.getInstance("TLS");
/* 255:270 */         ctx.init(new KeyManager[0], new TrustManager[] { new DefaultTrustManager(null) }, new SecureRandom());
/* 256:    */       }
/* 257:    */       catch (Exception e)
/* 258:    */       {
/* 259:273 */         throw new IOException(e);
/* 260:    */       }
/* 261:275 */       HttpsURLConnection connHttps = (HttpsURLConnection)url.openConnection();
/* 262:276 */       connHttps.setSSLSocketFactory(ctx.getSocketFactory());
/* 263:277 */       connHttps.setHostnameVerifier(new HostnameVerifier()
/* 264:    */       {
/* 265:    */         public boolean verify(String hostname, SSLSession session)
/* 266:    */         {
/* 267:279 */           return false;
/* 268:    */         }
/* 269:281 */       });
/* 270:282 */       conn = connHttps;
/* 271:    */     }
/* 272:    */     else
/* 273:    */     {
/* 274:284 */       conn = (HttpURLConnection)url.openConnection();
/* 275:    */     }
/* 276:287 */     conn.setRequestMethod(method);
/* 277:288 */     conn.setDoInput(true);
/* 278:289 */     conn.setDoOutput(true);
/* 279:290 */     conn.setRequestProperty("Accept", "text/xml,text/javascript,text/html");
/* 280:291 */     conn.setRequestProperty("User-Agent", "aop-sdk-java");
/* 281:292 */     conn.setRequestProperty("Content-Type", ctype);
/* 282:293 */     return conn;
/* 283:    */   }
/* 284:    */   
/* 285:    */   protected static String getResponseAsString(HttpURLConnection conn)
/* 286:    */     throws IOException
/* 287:    */   {
/* 288:297 */     String charset = getResponseCharset(conn.getContentType());
/* 289:298 */     InputStream es = conn.getErrorStream();
/* 290:299 */     if (es == null) {
/* 291:300 */       return getStreamAsString(conn.getInputStream(), charset);
/* 292:    */     }
/* 293:302 */     String msg = getStreamAsString(es, charset);
/* 294:303 */     if (StringUtils.isEmpty(msg)) {
/* 295:304 */       throw new IOException(conn.getResponseCode() + ":" + conn.getResponseMessage());
/* 296:    */     }
/* 297:306 */     throw new IOException(msg);
/* 298:    */   }
/* 299:    */   
/* 300:    */   private static String getStreamAsString(InputStream stream, String charset)
/* 301:    */     throws IOException
/* 302:    */   {
/* 303:    */     try
/* 304:    */     {
/* 305:313 */       BufferedReader reader = new BufferedReader(new InputStreamReader(stream, charset));
/* 306:314 */       StringWriter writer = new StringWriter();
/* 307:    */       
/* 308:316 */       char[] chars = new char[256];
/* 309:317 */       int count = 0;
/* 310:318 */       while ((count = reader.read(chars)) > 0) {
/* 311:319 */         writer.write(chars, 0, count);
/* 312:    */       }
/* 313:322 */       return writer.toString();
/* 314:    */     }
/* 315:    */     finally
/* 316:    */     {
/* 317:324 */       if (stream != null) {
/* 318:325 */         stream.close();
/* 319:    */       }
/* 320:    */     }
/* 321:    */   }
/* 322:    */   
/* 323:    */   private static String getResponseCharset(String ctype)
/* 324:    */   {
/* 325:331 */     String charset = "UTF-8";
/* 326:333 */     if (!StringUtils.isEmpty(ctype))
/* 327:    */     {
/* 328:334 */       String[] params = ctype.split(";");
/* 329:335 */       for (String param : params)
/* 330:    */       {
/* 331:336 */         param = param.trim();
/* 332:337 */         if (param.startsWith("charset"))
/* 333:    */         {
/* 334:338 */           String[] pair = param.split("=", 2);
/* 335:339 */           if ((pair.length != 2) || 
/* 336:340 */             (StringUtils.isEmpty(pair[1]))) {
/* 337:    */             break;
/* 338:    */           }
/* 339:341 */           charset = pair[1].trim(); break;
/* 340:    */         }
/* 341:    */       }
/* 342:    */     }
/* 343:349 */     return charset;
/* 344:    */   }
/* 345:    */   
/* 346:    */   private static Map<String, String> getParamsFromUrl(String url)
/* 347:    */   {
/* 348:353 */     Map<String, String> map = null;
/* 349:354 */     if ((url != null) && (url.indexOf('?') != -1)) {
/* 350:355 */       map = splitUrlQuery(url.substring(url.indexOf('?') + 1));
/* 351:    */     }
/* 352:357 */     if (map == null) {
/* 353:358 */       map = new HashMap();
/* 354:    */     }
/* 355:360 */     return map;
/* 356:    */   }
/* 357:    */   
/* 358:    */   private static URL buildGetUrl(String strUrl, String query)
/* 359:    */     throws IOException
/* 360:    */   {
/* 361:364 */     URL url = new URL(strUrl);
/* 362:365 */     if (StringUtils.isEmpty(query)) {
/* 363:366 */       return url;
/* 364:    */     }
/* 365:369 */     if (StringUtils.isEmpty(url.getQuery()))
/* 366:    */     {
/* 367:370 */       if (strUrl.endsWith("?")) {
/* 368:371 */         strUrl = strUrl + query;
/* 369:    */       } else {
/* 370:373 */         strUrl = strUrl + "?" + query;
/* 371:    */       }
/* 372:    */     }
/* 373:376 */     else if (strUrl.endsWith("&")) {
/* 374:377 */       strUrl = strUrl + query;
/* 375:    */     } else {
/* 376:379 */       strUrl = strUrl + "&" + query;
/* 377:    */     }
/* 378:383 */     return new URL(strUrl);
/* 379:    */   }
/* 380:    */   
/* 381:    */   public static String buildQuery(Map<String, String> params, String charset)
/* 382:    */     throws IOException
/* 383:    */   {
/* 384:387 */     if ((params == null) || (params.isEmpty())) {
/* 385:388 */       return null;
/* 386:    */     }
/* 387:391 */     StringBuilder query = new StringBuilder();
/* 388:392 */     Set<Map.Entry<String, String>> entries = params.entrySet();
/* 389:393 */     boolean hasParam = false;
/* 390:395 */     for (Map.Entry<String, String> entry : entries)
/* 391:    */     {
/* 392:396 */       String name = (String)entry.getKey();
/* 393:397 */       String value = (String)entry.getValue();
/* 394:399 */       if (StringUtils.areNotEmpty(new String[] { name, value }))
/* 395:    */       {
/* 396:400 */         if (hasParam) {
/* 397:401 */           query.append("&");
/* 398:    */         } else {
/* 399:403 */           hasParam = true;
/* 400:    */         }
/* 401:406 */         query.append(name).append("=").append(URLEncoder.encode(value, charset));
/* 402:    */       }
/* 403:    */     }
/* 404:410 */     return query.toString();
/* 405:    */   }
/* 406:    */   
/* 407:    */   public static Map<String, String> splitUrlQuery(String query)
/* 408:    */   {
/* 409:419 */     Map<String, String> result = new HashMap();
/* 410:    */     
/* 411:421 */     String[] pairs = query.split("&");
/* 412:422 */     if ((pairs != null) && (pairs.length > 0)) {
/* 413:423 */       for (String pair : pairs)
/* 414:    */       {
/* 415:424 */         String[] param = pair.split("=", 2);
/* 416:425 */         if ((param != null) && (param.length == 2)) {
/* 417:426 */           result.put(param[0], param[1]);
/* 418:    */         }
/* 419:    */       }
/* 420:    */     }
/* 421:431 */     return result;
/* 422:    */   }
/* 423:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.AlipayMobilePublicMultiMediaClient
 * JD-Core Version:    0.7.0.1
 */