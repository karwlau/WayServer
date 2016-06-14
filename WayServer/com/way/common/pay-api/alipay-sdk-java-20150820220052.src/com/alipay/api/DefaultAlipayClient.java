/*   1:    */ package com.alipay.api;
/*   2:    */ 
/*   3:    */ import com.alipay.api.internal.parser.json.ObjectJsonParser;
/*   4:    */ import com.alipay.api.internal.parser.xml.ObjectXmlParser;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.internal.util.AlipayLogger;
/*   7:    */ import com.alipay.api.internal.util.AlipaySignature;
/*   8:    */ import com.alipay.api.internal.util.AlipayUtils;
/*   9:    */ import com.alipay.api.internal.util.RequestParametersHolder;
/*  10:    */ import com.alipay.api.internal.util.StringUtils;
/*  11:    */ import com.alipay.api.internal.util.WebUtils;
/*  12:    */ import java.io.IOException;
/*  13:    */ import java.security.Security;
/*  14:    */ import java.text.DateFormat;
/*  15:    */ import java.text.SimpleDateFormat;
/*  16:    */ import java.util.Date;
/*  17:    */ import java.util.HashMap;
/*  18:    */ import java.util.Map;
/*  19:    */ import java.util.TimeZone;
/*  20:    */ 
/*  21:    */ public class DefaultAlipayClient
/*  22:    */   implements AlipayClient
/*  23:    */ {
/*  24:    */   private String serverUrl;
/*  25:    */   private String appId;
/*  26:    */   private String privateKey;
/*  27:    */   private String prodCode;
/*  28: 37 */   private String format = "json";
/*  29: 38 */   private String sign_type = "RSA";
/*  30:    */   private String alipayPublicKey;
/*  31:    */   private String charset;
/*  32: 44 */   private int connectTimeout = 3000;
/*  33: 45 */   private int readTimeout = 15000;
/*  34:    */   
/*  35:    */   static
/*  36:    */   {
/*  37: 49 */     Security.setProperty("jdk.certpath.disabledAlgorithms", "");
/*  38:    */   }
/*  39:    */   
/*  40:    */   public DefaultAlipayClient(String serverUrl, String appId, String privateKey)
/*  41:    */   {
/*  42: 53 */     this.serverUrl = serverUrl;
/*  43: 54 */     this.appId = appId;
/*  44: 55 */     this.privateKey = privateKey;
/*  45: 56 */     this.alipayPublicKey = null;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format)
/*  49:    */   {
/*  50: 60 */     this(serverUrl, appId, privateKey);
/*  51: 61 */     this.format = format;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format, String charset)
/*  55:    */   {
/*  56: 66 */     this(serverUrl, appId, privateKey);
/*  57: 67 */     this.format = format;
/*  58: 68 */     this.charset = charset;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public DefaultAlipayClient(String serverUrl, String appId, String privateKey, String format, String charset, String alipayPulicKey)
/*  62:    */   {
/*  63: 73 */     this(serverUrl, appId, privateKey);
/*  64: 74 */     this.format = format;
/*  65: 75 */     this.charset = charset;
/*  66: 76 */     this.alipayPublicKey = alipayPulicKey;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public <T extends AlipayResponse> T execute(AlipayRequest<T> request)
/*  70:    */     throws AlipayApiException
/*  71:    */   {
/*  72: 80 */     return execute(request, null);
/*  73:    */   }
/*  74:    */   
/*  75:    */   public <T extends AlipayResponse> T execute(AlipayRequest<T> request, String accessToken)
/*  76:    */     throws AlipayApiException
/*  77:    */   {
/*  78: 86 */     AlipayParser<T> parser = null;
/*  79: 87 */     if ("xml".equals(this.format)) {
/*  80: 88 */       parser = new ObjectXmlParser(request.getResponseClass());
/*  81:    */     } else {
/*  82: 90 */       parser = new ObjectJsonParser(request.getResponseClass());
/*  83:    */     }
/*  84: 93 */     return _execute(request, parser, accessToken);
/*  85:    */   }
/*  86:    */   
/*  87:    */   private <T extends AlipayResponse> T _execute(AlipayRequest<T> request, AlipayParser<T> parser, String authToken)
/*  88:    */     throws AlipayApiException
/*  89:    */   {
/*  90: 98 */     Map<String, Object> rt = doPost(request, authToken);
/*  91: 99 */     if (rt == null) {
/*  92:100 */       return null;
/*  93:    */     }
/*  94:103 */     T tRsp = null;
/*  95:    */     try
/*  96:    */     {
/*  97:105 */       tRsp = parser.parse((String)rt.get("rsp"));
/*  98:106 */       tRsp.setBody((String)rt.get("rsp"));
/*  99:109 */       if (!StringUtils.isEmpty(this.alipayPublicKey))
/* 100:    */       {
/* 101:111 */         SignItem signItem = parser.getSignItem(request, tRsp);
/* 102:113 */         if (signItem == null) {
/* 103:115 */           throw new AlipayApiException("sign check fail: Body is Empty!");
/* 104:    */         }
/* 105:118 */         if ((tRsp.isSuccess()) || ((!tRsp.isSuccess()) && (!StringUtils.isEmpty(signItem.getSign()))))
/* 106:    */         {
/* 107:121 */           boolean rsaCheckContent = AlipaySignature.rsaCheckContent(signItem.getSignSourceDate(), signItem.getSign(), this.alipayPublicKey, this.charset);
/* 108:125 */           if (!rsaCheckContent) {
/* 109:128 */             if ((!StringUtils.isEmpty(signItem.getSignSourceDate())) && (signItem.getSignSourceDate().contains("\\/")))
/* 110:    */             {
/* 111:131 */               String srouceData = signItem.getSignSourceDate().replace("\\/", "/");
/* 112:    */               
/* 113:133 */               boolean jsonCheck = AlipaySignature.rsaCheckContent(srouceData, signItem.getSign(), this.alipayPublicKey, this.charset);
/* 114:136 */               if (!jsonCheck) {
/* 115:137 */                 throw new AlipayApiException("sign check fail: check Sign and Data Fail！JSON also！");
/* 116:    */               }
/* 117:    */             }
/* 118:    */             else
/* 119:    */             {
/* 120:142 */               throw new AlipayApiException("sign check fail: check Sign and Data Fail!");
/* 121:    */             }
/* 122:    */           }
/* 123:    */         }
/* 124:    */       }
/* 125:    */     }
/* 126:    */     catch (RuntimeException e)
/* 127:    */     {
/* 128:151 */       AlipayLogger.logBizError((String)rt.get("rsp"));
/* 129:152 */       throw e;
/* 130:    */     }
/* 131:    */     catch (AlipayApiException e)
/* 132:    */     {
/* 133:154 */       AlipayLogger.logBizError((String)rt.get("rsp"));
/* 134:155 */       throw new AlipayApiException(e);
/* 135:    */     }
/* 136:158 */     tRsp.setParams((AlipayHashMap)rt.get("textParams"));
/* 137:159 */     if (!tRsp.isSuccess()) {
/* 138:160 */       AlipayLogger.logErrorScene(rt, tRsp, "");
/* 139:    */     }
/* 140:162 */     return tRsp;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public <T extends AlipayResponse> Map<String, Object> doPost(AlipayRequest<T> request, String accessToken)
/* 144:    */     throws AlipayApiException
/* 145:    */   {
/* 146:176 */     Map<String, Object> result = new HashMap();
/* 147:177 */     RequestParametersHolder requestHolder = new RequestParametersHolder();
/* 148:178 */     AlipayHashMap appParams = new AlipayHashMap(request.getTextParams());
/* 149:179 */     requestHolder.setApplicationParams(appParams);
/* 150:181 */     if (StringUtils.isEmpty(this.charset)) {
/* 151:182 */       this.charset = "UTF-8";
/* 152:    */     }
/* 153:185 */     AlipayHashMap protocalMustParams = new AlipayHashMap();
/* 154:186 */     protocalMustParams.put("method", request.getApiMethodName());
/* 155:187 */     protocalMustParams.put("version", request.getApiVersion());
/* 156:188 */     protocalMustParams.put("app_id", this.appId);
/* 157:189 */     protocalMustParams.put("sign_type", this.sign_type);
/* 158:190 */     protocalMustParams.put("terminal_type", request.getTerminalType());
/* 159:191 */     protocalMustParams.put("terminal_info", request.getTerminalInfo());
/* 160:192 */     protocalMustParams.put("notify_url", request.getNotifyUrl());
/* 161:193 */     protocalMustParams.put("charset", this.charset);
/* 162:    */     
/* 163:195 */     Long timestamp = Long.valueOf(System.currentTimeMillis());
/* 164:196 */     DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 165:197 */     df.setTimeZone(TimeZone.getTimeZone("GMT+8"));
/* 166:198 */     protocalMustParams.put("timestamp", df.format(new Date(timestamp.longValue())));
/* 167:199 */     requestHolder.setProtocalMustParams(protocalMustParams);
/* 168:    */     
/* 169:201 */     AlipayHashMap protocalOptParams = new AlipayHashMap();
/* 170:202 */     protocalOptParams.put("format", this.format);
/* 171:203 */     protocalOptParams.put("auth_token", accessToken);
/* 172:204 */     protocalOptParams.put("alipay_sdk", "alipay-sdk-java-dynamicVersionNo");
/* 173:205 */     protocalOptParams.put("prod_code", request.getProdCode());
/* 174:206 */     requestHolder.setProtocalOptParams(protocalOptParams);
/* 175:208 */     if ("RSA".equals(this.sign_type))
/* 176:    */     {
/* 177:210 */       String signContent = AlipaySignature.getSignatureContent(requestHolder);
/* 178:    */       
/* 179:212 */       protocalMustParams.put("sign", AlipaySignature.rsaSign(signContent, this.privateKey, this.charset));
/* 180:    */     }
/* 181:    */     else
/* 182:    */     {
/* 183:216 */       protocalMustParams.put("sign", "");
/* 184:    */     }
/* 185:219 */     StringBuffer urlSb = new StringBuffer(this.serverUrl);
/* 186:    */     try
/* 187:    */     {
/* 188:221 */       String sysMustQuery = WebUtils.buildQuery(requestHolder.getProtocalMustParams(), this.charset);
/* 189:    */       
/* 190:223 */       String sysOptQuery = WebUtils.buildQuery(requestHolder.getProtocalOptParams(), this.charset);
/* 191:    */       
/* 192:225 */       urlSb.append("?");
/* 193:226 */       urlSb.append(sysMustQuery);
/* 194:227 */       if (((sysOptQuery != null ? 1 : 0) & (sysOptQuery.length() > 0 ? 1 : 0)) != 0)
/* 195:    */       {
/* 196:228 */         urlSb.append("&");
/* 197:229 */         urlSb.append(sysOptQuery);
/* 198:    */       }
/* 199:    */     }
/* 200:    */     catch (IOException e)
/* 201:    */     {
/* 202:232 */       throw new AlipayApiException(e);
/* 203:    */     }
/* 204:235 */     String rsp = null;
/* 205:    */     try
/* 206:    */     {
/* 207:237 */       if ((request instanceof AlipayUploadRequest))
/* 208:    */       {
/* 209:238 */         AlipayUploadRequest<T> uRequest = (AlipayUploadRequest)request;
/* 210:239 */         Map<String, FileItem> fileParams = AlipayUtils.cleanupMap(uRequest.getFileParams());
/* 211:240 */         rsp = WebUtils.doPost(urlSb.toString(), appParams, fileParams, this.charset, this.connectTimeout, this.readTimeout);
/* 212:    */       }
/* 213:    */       else
/* 214:    */       {
/* 215:243 */         rsp = WebUtils.doPost(urlSb.toString(), appParams, this.charset, this.connectTimeout, this.readTimeout);
/* 216:    */       }
/* 217:    */     }
/* 218:    */     catch (IOException e)
/* 219:    */     {
/* 220:247 */       throw new AlipayApiException(e);
/* 221:    */     }
/* 222:249 */     result.put("rsp", rsp);
/* 223:250 */     result.put("textParams", appParams);
/* 224:251 */     result.put("protocalMustParams", protocalMustParams);
/* 225:252 */     result.put("protocalOptParams", protocalOptParams);
/* 226:253 */     result.put("url", urlSb.toString());
/* 227:254 */     return result;
/* 228:    */   }
/* 229:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.DefaultAlipayClient
 * JD-Core Version:    0.7.0.1
 */