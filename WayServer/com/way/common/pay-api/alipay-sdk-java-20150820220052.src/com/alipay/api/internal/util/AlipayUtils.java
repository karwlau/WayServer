/*   1:    */ package com.alipay.api.internal.util;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayApiException;
/*   4:    */ import com.alipay.api.AlipayResponse;
/*   5:    */ import com.alipay.api.internal.parser.json.ObjectJsonParser;
/*   6:    */ import com.alipay.api.internal.util.json.JSONReader;
/*   7:    */ import com.alipay.api.internal.util.json.JSONValidatingReader;
/*   8:    */ import java.net.Inet4Address;
/*   9:    */ import java.net.InetAddress;
/*  10:    */ import java.net.NetworkInterface;
/*  11:    */ import java.util.Enumeration;
/*  12:    */ import java.util.HashMap;
/*  13:    */ import java.util.Map;
/*  14:    */ import java.util.Map.Entry;
/*  15:    */ import java.util.Set;
/*  16:    */ 
/*  17:    */ public abstract class AlipayUtils
/*  18:    */ {
/*  19:    */   private static String localIp;
/*  20:    */   
/*  21:    */   public static String getFileSuffix(byte[] bytes)
/*  22:    */   {
/*  23: 37 */     if ((bytes == null) || (bytes.length < 10)) {
/*  24: 38 */       return null;
/*  25:    */     }
/*  26: 41 */     if ((bytes[0] == 71) && (bytes[1] == 73) && (bytes[2] == 70)) {
/*  27: 42 */       return "GIF";
/*  28:    */     }
/*  29: 43 */     if ((bytes[1] == 80) && (bytes[2] == 78) && (bytes[3] == 71)) {
/*  30: 44 */       return "PNG";
/*  31:    */     }
/*  32: 45 */     if ((bytes[6] == 74) && (bytes[7] == 70) && (bytes[8] == 73) && (bytes[9] == 70)) {
/*  33: 46 */       return "JPG";
/*  34:    */     }
/*  35: 47 */     if ((bytes[0] == 66) && (bytes[1] == 77)) {
/*  36: 48 */       return "BMP";
/*  37:    */     }
/*  38: 50 */     return null;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public static String getMimeType(byte[] bytes)
/*  42:    */   {
/*  43: 61 */     String suffix = getFileSuffix(bytes);
/*  44:    */     String mimeType;
/*  45:    */     String mimeType;
/*  46: 64 */     if ("JPG".equals(suffix))
/*  47:    */     {
/*  48: 65 */       mimeType = "image/jpeg";
/*  49:    */     }
/*  50:    */     else
/*  51:    */     {
/*  52:    */       String mimeType;
/*  53: 66 */       if ("GIF".equals(suffix))
/*  54:    */       {
/*  55: 67 */         mimeType = "image/gif";
/*  56:    */       }
/*  57:    */       else
/*  58:    */       {
/*  59:    */         String mimeType;
/*  60: 68 */         if ("PNG".equals(suffix))
/*  61:    */         {
/*  62: 69 */           mimeType = "image/png";
/*  63:    */         }
/*  64:    */         else
/*  65:    */         {
/*  66:    */           String mimeType;
/*  67: 70 */           if ("BMP".equals(suffix)) {
/*  68: 71 */             mimeType = "image/bmp";
/*  69:    */           } else {
/*  70: 73 */             mimeType = "application/octet-stream";
/*  71:    */           }
/*  72:    */         }
/*  73:    */       }
/*  74:    */     }
/*  75: 76 */     return mimeType;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public static <V> Map<String, V> cleanupMap(Map<String, V> map)
/*  79:    */   {
/*  80: 87 */     if ((map == null) || (map.isEmpty())) {
/*  81: 88 */       return null;
/*  82:    */     }
/*  83: 91 */     Map<String, V> result = new HashMap(map.size());
/*  84: 92 */     Set<Map.Entry<String, V>> entries = map.entrySet();
/*  85: 94 */     for (Map.Entry<String, V> entry : entries) {
/*  86: 95 */       if (entry.getValue() != null) {
/*  87: 96 */         result.put(entry.getKey(), entry.getValue());
/*  88:    */       }
/*  89:    */     }
/*  90:100 */     return result;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public static Map<?, ?> parseJson(String body)
/*  94:    */   {
/*  95:110 */     JSONReader jr = new JSONValidatingReader();
/*  96:111 */     Object obj = jr.read(body);
/*  97:112 */     if ((obj instanceof Map)) {
/*  98:113 */       return (Map)obj;
/*  99:    */     }
/* 100:115 */     return null;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public static <T extends AlipayResponse> T parseResponse(String json, Class<T> clazz)
/* 104:    */     throws AlipayApiException
/* 105:    */   {
/* 106:129 */     ObjectJsonParser<T> parser = new ObjectJsonParser(clazz);
/* 107:130 */     return parser.parse(json);
/* 108:    */   }
/* 109:    */   
/* 110:    */   public static String getLocalNetWorkIp()
/* 111:    */   {
/* 112:137 */     if (localIp != null) {
/* 113:138 */       return localIp;
/* 114:    */     }
/* 115:    */     try
/* 116:    */     {
/* 117:141 */       Enumeration<NetworkInterface> netInterfaces = NetworkInterface.getNetworkInterfaces();
/* 118:142 */       InetAddress ip = null;
/* 119:143 */       while (netInterfaces.hasMoreElements())
/* 120:    */       {
/* 121:144 */         NetworkInterface ni = (NetworkInterface)netInterfaces.nextElement();
/* 122:145 */         if ((!ni.isLoopback()) && (!ni.isVirtual()))
/* 123:    */         {
/* 124:148 */           Enumeration<InetAddress> addresss = ni.getInetAddresses();
/* 125:149 */           while (addresss.hasMoreElements())
/* 126:    */           {
/* 127:150 */             InetAddress address = (InetAddress)addresss.nextElement();
/* 128:151 */             if ((address instanceof Inet4Address))
/* 129:    */             {
/* 130:152 */               ip = address;
/* 131:153 */               break;
/* 132:    */             }
/* 133:    */           }
/* 134:156 */           if (ip != null) {
/* 135:    */             break;
/* 136:    */           }
/* 137:    */         }
/* 138:    */       }
/* 139:160 */       if (ip != null) {
/* 140:161 */         localIp = ip.getHostAddress();
/* 141:    */       } else {
/* 142:163 */         localIp = "127.0.0.1";
/* 143:    */       }
/* 144:    */     }
/* 145:    */     catch (Exception e)
/* 146:    */     {
/* 147:166 */       localIp = "127.0.0.1";
/* 148:    */     }
/* 149:168 */     return localIp;
/* 150:    */   }
/* 151:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.AlipayUtils
 * JD-Core Version:    0.7.0.1
 */