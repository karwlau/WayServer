/*   1:    */ package com.alipay.api.internal.util;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import java.io.IOException;
/*   5:    */ import java.io.UnsupportedEncodingException;
/*   6:    */ import java.net.HttpURLConnection;
/*   7:    */ import java.net.InetAddress;
/*   8:    */ import java.net.URL;
/*   9:    */ import java.text.DateFormat;
/*  10:    */ import java.text.SimpleDateFormat;
/*  11:    */ import java.util.Date;
/*  12:    */ import java.util.HashMap;
/*  13:    */ import java.util.Map;
/*  14:    */ import java.util.Map.Entry;
/*  15:    */ import java.util.Properties;
/*  16:    */ import java.util.Set;
/*  17:    */ import java.util.TimeZone;
/*  18:    */ import org.apache.commons.logging.Log;
/*  19:    */ import org.apache.commons.logging.LogFactory;
/*  20:    */ 
/*  21:    */ public class AlipayLogger
/*  22:    */ {
/*  23: 28 */   private static final Log clog = LogFactory.getLog("sdk.comm.err");
/*  24: 29 */   private static final Log blog = LogFactory.getLog("sdk.biz.err");
/*  25: 31 */   private static String osName = System.getProperties().getProperty("os.name");
/*  26: 32 */   private static String ip = null;
/*  27: 33 */   private static boolean needEnableLogger = true;
/*  28:    */   
/*  29:    */   public static void setNeedEnableLogger(boolean needEnableLogger)
/*  30:    */   {
/*  31: 36 */     needEnableLogger = needEnableLogger;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public static String getIp()
/*  35:    */   {
/*  36: 40 */     if (ip == null) {
/*  37:    */       try
/*  38:    */       {
/*  39: 42 */         ip = InetAddress.getLocalHost().getHostAddress();
/*  40:    */       }
/*  41:    */       catch (Exception e)
/*  42:    */       {
/*  43: 44 */         e.printStackTrace();
/*  44:    */       }
/*  45:    */     }
/*  46: 47 */     return ip;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public static void setIp(String ip)
/*  50:    */   {
/*  51: 51 */     ip = ip;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public static void logCommError(Exception e, HttpURLConnection conn, String appKey, String method, byte[] content)
/*  55:    */   {
/*  56: 58 */     if (!needEnableLogger) {
/*  57: 59 */       return;
/*  58:    */     }
/*  59: 61 */     String contentString = null;
/*  60:    */     try
/*  61:    */     {
/*  62: 63 */       contentString = new String(content, "UTF-8");
/*  63: 64 */       logCommError(e, conn, appKey, method, contentString);
/*  64:    */     }
/*  65:    */     catch (Exception e1)
/*  66:    */     {
/*  67: 66 */       e1.printStackTrace();
/*  68:    */     }
/*  69:    */   }
/*  70:    */   
/*  71:    */   public static void logCommError(Exception e, String url, String appKey, String method, byte[] content)
/*  72:    */   {
/*  73: 74 */     if (!needEnableLogger) {
/*  74: 75 */       return;
/*  75:    */     }
/*  76: 77 */     String contentString = null;
/*  77:    */     try
/*  78:    */     {
/*  79: 79 */       contentString = new String(content, "UTF-8");
/*  80: 80 */       logCommError(e, url, appKey, method, contentString);
/*  81:    */     }
/*  82:    */     catch (UnsupportedEncodingException e1)
/*  83:    */     {
/*  84: 82 */       e1.printStackTrace();
/*  85:    */     }
/*  86:    */   }
/*  87:    */   
/*  88:    */   public static void logCommError(Exception e, HttpURLConnection conn, String appKey, String method, Map<String, String> params)
/*  89:    */   {
/*  90: 90 */     if (!needEnableLogger) {
/*  91: 91 */       return;
/*  92:    */     }
/*  93: 93 */     _logCommError(e, conn, null, appKey, method, params);
/*  94:    */   }
/*  95:    */   
/*  96:    */   public static void logCommError(Exception e, String url, String appKey, String method, Map<String, String> params)
/*  97:    */   {
/*  98: 97 */     if (!needEnableLogger) {
/*  99: 98 */       return;
/* 100:    */     }
/* 101:100 */     _logCommError(e, null, url, appKey, method, params);
/* 102:    */   }
/* 103:    */   
/* 104:    */   private static void logCommError(Exception e, HttpURLConnection conn, String appKey, String method, String content)
/* 105:    */   {
/* 106:107 */     Map<String, String> params = parseParam(content);
/* 107:108 */     _logCommError(e, conn, null, appKey, method, params);
/* 108:    */   }
/* 109:    */   
/* 110:    */   private static void logCommError(Exception e, String url, String appKey, String method, String content)
/* 111:    */   {
/* 112:115 */     Map<String, String> params = parseParam(content);
/* 113:116 */     _logCommError(e, null, url, appKey, method, params);
/* 114:    */   }
/* 115:    */   
/* 116:    */   private static void _logCommError(Exception e, HttpURLConnection conn, String url, String appKey, String method, Map<String, String> params)
/* 117:    */   {
/* 118:123 */     DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 119:124 */     df.setTimeZone(TimeZone.getTimeZone("GMT+8"));
/* 120:125 */     String sdkName = "alipay-sdk-java-dynamicVersionNo";
/* 121:126 */     String urlStr = null;
/* 122:127 */     String rspCode = "";
/* 123:128 */     if (conn != null)
/* 124:    */     {
/* 125:    */       try
/* 126:    */       {
/* 127:130 */         urlStr = conn.getURL().toString();
/* 128:131 */         rspCode = "HTTP_ERROR_" + conn.getResponseCode();
/* 129:    */       }
/* 130:    */       catch (IOException ioe) {}
/* 131:    */     }
/* 132:    */     else
/* 133:    */     {
/* 134:135 */       urlStr = url;
/* 135:136 */       rspCode = "";
/* 136:    */     }
/* 137:138 */     StringBuilder sb = new StringBuilder();
/* 138:139 */     sb.append(df.format(new Date()));
/* 139:140 */     sb.append("^_^");
/* 140:141 */     sb.append(method);
/* 141:142 */     sb.append("^_^");
/* 142:143 */     sb.append(appKey);
/* 143:144 */     sb.append("^_^");
/* 144:145 */     sb.append(getIp());
/* 145:146 */     sb.append("^_^");
/* 146:147 */     sb.append(osName);
/* 147:148 */     sb.append("^_^");
/* 148:149 */     sb.append(sdkName);
/* 149:150 */     sb.append("^_^");
/* 150:151 */     sb.append(urlStr);
/* 151:152 */     sb.append("^_^");
/* 152:153 */     sb.append(rspCode);
/* 153:154 */     sb.append("^_^");
/* 154:155 */     sb.append((e.getMessage() + "").replaceAll("\r\n", " "));
/* 155:156 */     clog.error(sb.toString());
/* 156:    */   }
/* 157:    */   
/* 158:    */   private static Map<String, String> parseParam(String contentString)
/* 159:    */   {
/* 160:160 */     Map<String, String> params = new HashMap();
/* 161:161 */     if ((contentString == null) || (contentString.trim().equals(""))) {
/* 162:162 */       return params;
/* 163:    */     }
/* 164:164 */     String[] paramsArray = contentString.split("\\&");
/* 165:165 */     if (paramsArray != null) {
/* 166:166 */       for (String param : paramsArray)
/* 167:    */       {
/* 168:167 */         String[] keyValue = param.split("=");
/* 169:168 */         if ((keyValue != null) && (keyValue.length == 2)) {
/* 170:169 */           params.put(keyValue[0], keyValue[1]);
/* 171:    */         }
/* 172:    */       }
/* 173:    */     }
/* 174:173 */     return params;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public static void logBizError(String rsp)
/* 178:    */   {
/* 179:180 */     if (!needEnableLogger) {
/* 180:181 */       return;
/* 181:    */     }
/* 182:183 */     DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 183:184 */     df.setTimeZone(TimeZone.getTimeZone("GMT+8"));
/* 184:185 */     StringBuilder sb = new StringBuilder();
/* 185:186 */     sb.append(df.format(new Date()));
/* 186:187 */     sb.append("^_^");
/* 187:188 */     sb.append(rsp);
/* 188:189 */     blog.error(sb.toString());
/* 189:    */   }
/* 190:    */   
/* 191:    */   public static void logErrorScene(Map<String, Object> rt, AlipayResponse tRsp, String appSecret)
/* 192:    */   {
/* 193:196 */     if (!needEnableLogger) {
/* 194:197 */       return;
/* 195:    */     }
/* 196:199 */     DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 197:200 */     df.setTimeZone(TimeZone.getTimeZone("GMT+8"));
/* 198:201 */     StringBuilder sb = new StringBuilder();
/* 199:202 */     sb.append("ErrorScene");
/* 200:203 */     sb.append("^_^");
/* 201:204 */     sb.append(tRsp.getErrorCode());
/* 202:205 */     sb.append("^_^");
/* 203:206 */     sb.append(tRsp.getSubCode());
/* 204:207 */     sb.append("^_^");
/* 205:208 */     sb.append(ip);
/* 206:209 */     sb.append("^_^");
/* 207:210 */     sb.append(osName);
/* 208:211 */     sb.append("^_^");
/* 209:212 */     sb.append(df.format(new Date()));
/* 210:213 */     sb.append("^_^");
/* 211:214 */     sb.append("ProtocalMustParams:");
/* 212:215 */     appendLog((AlipayHashMap)rt.get("protocalMustParams"), sb);
/* 213:216 */     sb.append("^_^");
/* 214:217 */     sb.append("ProtocalOptParams:");
/* 215:218 */     appendLog((AlipayHashMap)rt.get("protocalOptParams"), sb);
/* 216:219 */     sb.append("^_^");
/* 217:220 */     sb.append("ApplicationParams:");
/* 218:221 */     appendLog((AlipayHashMap)rt.get("textParams"), sb);
/* 219:222 */     sb.append("^_^");
/* 220:223 */     sb.append("Body:");
/* 221:224 */     sb.append((String)rt.get("rsp"));
/* 222:225 */     blog.error(sb.toString());
/* 223:    */   }
/* 224:    */   
/* 225:    */   private static void appendLog(AlipayHashMap map, StringBuilder sb)
/* 226:    */   {
/* 227:229 */     boolean first = true;
/* 228:230 */     Set<Map.Entry<String, String>> set = map.entrySet();
/* 229:231 */     for (Map.Entry<String, String> entry : set)
/* 230:    */     {
/* 231:232 */       if (!first) {
/* 232:233 */         sb.append("&");
/* 233:    */       } else {
/* 234:235 */         first = false;
/* 235:    */       }
/* 236:237 */       sb.append((String)entry.getKey()).append("=").append((String)entry.getValue());
/* 237:    */     }
/* 238:    */   }
/* 239:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.AlipayLogger
 * JD-Core Version:    0.7.0.1
 */