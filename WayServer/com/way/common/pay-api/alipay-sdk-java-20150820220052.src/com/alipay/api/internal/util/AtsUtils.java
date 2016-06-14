/*   1:    */ package com.alipay.api.internal.util;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayApiException;
/*   4:    */ import java.io.File;
/*   5:    */ import java.io.FileInputStream;
/*   6:    */ import java.io.FileOutputStream;
/*   7:    */ import java.io.IOException;
/*   8:    */ import java.io.InputStream;
/*   9:    */ import java.io.OutputStream;
/*  10:    */ import java.net.HttpURLConnection;
/*  11:    */ import java.net.URL;
/*  12:    */ import java.security.DigestInputStream;
/*  13:    */ import java.security.MessageDigest;
/*  14:    */ import java.util.ArrayList;
/*  15:    */ import java.util.Enumeration;
/*  16:    */ import java.util.List;
/*  17:    */ import java.util.regex.Matcher;
/*  18:    */ import java.util.regex.Pattern;
/*  19:    */ import java.util.zip.GZIPInputStream;
/*  20:    */ import java.util.zip.ZipEntry;
/*  21:    */ import java.util.zip.ZipFile;
/*  22:    */ 
/*  23:    */ public abstract class AtsUtils
/*  24:    */ {
/*  25:    */   private static final String CTYPE_OCTET = "application/octet-stream";
/*  26: 33 */   private static final Pattern REGEX_FILE_NAME = Pattern.compile("attachment;filename=\"([\\w\\-]+)\"");
/*  27:    */   
/*  28:    */   public static File ungzip(File gzip, File toDir)
/*  29:    */     throws IOException
/*  30:    */   {
/*  31: 47 */     toDir.mkdirs();
/*  32: 48 */     File out = new File(toDir, gzip.getName());
/*  33: 49 */     GZIPInputStream gin = null;
/*  34: 50 */     FileOutputStream fout = null;
/*  35:    */     try
/*  36:    */     {
/*  37: 52 */       FileInputStream fin = new FileInputStream(gzip);
/*  38: 53 */       gin = new GZIPInputStream(fin);
/*  39: 54 */       fout = new FileOutputStream(out);
/*  40: 55 */       copy(gin, fout);
/*  41: 56 */       gin.close();
/*  42: 57 */       fout.close();
/*  43:    */     }
/*  44:    */     finally
/*  45:    */     {
/*  46: 59 */       closeQuietly(gin);
/*  47: 60 */       closeQuietly(fout);
/*  48:    */     }
/*  49: 62 */     return out;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public static List<File> unzip(File zip, File toDir)
/*  53:    */     throws IOException
/*  54:    */   {
/*  55: 73 */     ZipFile zf = null;
/*  56: 74 */     List<File> files = null;
/*  57:    */     try
/*  58:    */     {
/*  59: 76 */       zf = new ZipFile(zip);
/*  60: 77 */       files = new ArrayList();
/*  61: 78 */       Enumeration<?> entries = zf.entries();
/*  62: 79 */       while (entries.hasMoreElements())
/*  63:    */       {
/*  64: 80 */         ZipEntry entry = (ZipEntry)entries.nextElement();
/*  65: 81 */         if (entry.isDirectory())
/*  66:    */         {
/*  67: 82 */           new File(toDir, entry.getName()).mkdirs();
/*  68:    */         }
/*  69:    */         else
/*  70:    */         {
/*  71: 86 */           InputStream input = null;
/*  72: 87 */           OutputStream output = null;
/*  73:    */           try
/*  74:    */           {
/*  75: 89 */             File f = new File(toDir, entry.getName());
/*  76: 90 */             input = zf.getInputStream(entry);
/*  77: 91 */             output = new FileOutputStream(f);
/*  78: 92 */             copy(input, output);
/*  79: 93 */             files.add(f);
/*  80:    */           }
/*  81:    */           finally
/*  82:    */           {
/*  83: 95 */             closeQuietly(output);
/*  84: 96 */             closeQuietly(input);
/*  85:    */           }
/*  86:    */         }
/*  87:    */       }
/*  88:    */     }
/*  89:    */     finally
/*  90:    */     {
/*  91:100 */       if (zf != null) {
/*  92:101 */         zf.close();
/*  93:    */       }
/*  94:    */     }
/*  95:104 */     return files;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public static File download(String url, File toDir)
/*  99:    */     throws AlipayApiException
/* 100:    */   {
/* 101:115 */     toDir.mkdirs();
/* 102:116 */     HttpURLConnection conn = null;
/* 103:117 */     OutputStream output = null;
/* 104:118 */     File file = null;
/* 105:    */     try
/* 106:    */     {
/* 107:120 */       conn = getConnection(new URL(url));
/* 108:121 */       String ctype = conn.getContentType();
/* 109:122 */       if ("application/octet-stream".equals(ctype))
/* 110:    */       {
/* 111:123 */         String fileName = getFileName(conn);
/* 112:124 */         file = new File(toDir, fileName);
/* 113:125 */         output = new FileOutputStream(file);
/* 114:126 */         copy(conn.getInputStream(), output);
/* 115:    */       }
/* 116:    */       else
/* 117:    */       {
/* 118:128 */         String rsp = WebUtils.getResponseAsString(conn);
/* 119:129 */         throw new AlipayApiException(rsp);
/* 120:    */       }
/* 121:    */     }
/* 122:    */     catch (IOException e)
/* 123:    */     {
/* 124:132 */       throw new AlipayApiException(e.getMessage());
/* 125:    */     }
/* 126:    */     finally
/* 127:    */     {
/* 128:134 */       closeQuietly(output);
/* 129:135 */       if (conn != null) {
/* 130:136 */         conn.disconnect();
/* 131:    */       }
/* 132:    */     }
/* 133:139 */     return file;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public static boolean checkMd5sum(File file, String checkCode)
/* 137:    */     throws IOException
/* 138:    */   {
/* 139:150 */     DigestInputStream dInput = null;
/* 140:    */     try
/* 141:    */     {
/* 142:152 */       FileInputStream fInput = new FileInputStream(file);
/* 143:153 */       dInput = new DigestInputStream(fInput, getMd5Instance());
/* 144:154 */       byte[] buf = new byte[8192];
/* 145:155 */       while (dInput.read(buf) > 0) {}
/* 146:157 */       byte[] bytes = dInput.getMessageDigest().digest();
/* 147:158 */       return bytes2hex(bytes).equals(checkCode);
/* 148:    */     }
/* 149:    */     finally
/* 150:    */     {
/* 151:160 */       closeQuietly(dInput);
/* 152:    */     }
/* 153:    */   }
/* 154:    */   
/* 155:    */   private static String bytes2hex(byte[] bytes)
/* 156:    */   {
/* 157:168 */     StringBuilder sb = new StringBuilder();
/* 158:169 */     for (int i = 0; i < bytes.length; i++)
/* 159:    */     {
/* 160:170 */       String hex = Integer.toHexString(bytes[i] & 0xFF);
/* 161:171 */       if (hex.length() == 1) {
/* 162:172 */         sb.append("0").append(hex);
/* 163:    */       } else {
/* 164:174 */         sb.append(hex);
/* 165:    */       }
/* 166:    */     }
/* 167:177 */     return sb.toString();
/* 168:    */   }
/* 169:    */   
/* 170:    */   private static MessageDigest getMd5Instance()
/* 171:    */   {
/* 172:    */     try
/* 173:    */     {
/* 174:182 */       return MessageDigest.getInstance("md5");
/* 175:    */     }
/* 176:    */     catch (Exception e)
/* 177:    */     {
/* 178:184 */       throw new RuntimeException(e);
/* 179:    */     }
/* 180:    */   }
/* 181:    */   
/* 182:    */   private static String getFileName(HttpURLConnection conn)
/* 183:    */   {
/* 184:189 */     String fileName = conn.getHeaderField("Content-Disposition");
/* 185:190 */     Matcher matcher = REGEX_FILE_NAME.matcher(fileName);
/* 186:191 */     if (matcher.find()) {
/* 187:192 */       return matcher.group(1);
/* 188:    */     }
/* 189:194 */     return null;
/* 190:    */   }
/* 191:    */   
/* 192:    */   private static HttpURLConnection getConnection(URL url)
/* 193:    */     throws IOException
/* 194:    */   {
/* 195:199 */     HttpURLConnection conn = (HttpURLConnection)url.openConnection();
/* 196:200 */     conn.setRequestMethod("GET");
/* 197:201 */     conn.setDoInput(true);
/* 198:202 */     conn.setDoOutput(true);
/* 199:203 */     conn.setRequestProperty("Accept", "application/zip;text/html");
/* 200:204 */     return conn;
/* 201:    */   }
/* 202:    */   
/* 203:    */   private static int copy(InputStream input, OutputStream output)
/* 204:    */     throws IOException
/* 205:    */   {
/* 206:208 */     long count = copyStream(input, output);
/* 207:209 */     if (count > 2147483647L) {
/* 208:210 */       return -1;
/* 209:    */     }
/* 210:212 */     return (int)count;
/* 211:    */   }
/* 212:    */   
/* 213:    */   private static long copyStream(InputStream input, OutputStream output)
/* 214:    */     throws IOException
/* 215:    */   {
/* 216:216 */     byte[] buffer = new byte[1024];
/* 217:217 */     long count = 0L;
/* 218:218 */     int n = 0;
/* 219:219 */     while (-1 != (n = input.read(buffer)))
/* 220:    */     {
/* 221:220 */       output.write(buffer, 0, n);
/* 222:221 */       count += n;
/* 223:    */     }
/* 224:223 */     return count;
/* 225:    */   }
/* 226:    */   
/* 227:    */   private static void closeQuietly(OutputStream output)
/* 228:    */   {
/* 229:    */     try
/* 230:    */     {
/* 231:228 */       if (output != null) {
/* 232:229 */         output.close();
/* 233:    */       }
/* 234:    */     }
/* 235:    */     catch (IOException ioe) {}
/* 236:    */   }
/* 237:    */   
/* 238:    */   private static void closeQuietly(InputStream input)
/* 239:    */   {
/* 240:    */     try
/* 241:    */     {
/* 242:238 */       if (input != null) {
/* 243:239 */         input.close();
/* 244:    */       }
/* 245:    */     }
/* 246:    */     catch (IOException ioe) {}
/* 247:    */   }
/* 248:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.AtsUtils
 * JD-Core Version:    0.7.0.1
 */