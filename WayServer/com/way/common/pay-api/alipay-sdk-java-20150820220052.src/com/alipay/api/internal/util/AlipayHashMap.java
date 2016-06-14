/*  1:   */ package com.alipay.api.internal.util;
/*  2:   */ 
/*  3:   */ import java.text.DateFormat;
/*  4:   */ import java.text.SimpleDateFormat;
/*  5:   */ import java.util.Date;
/*  6:   */ import java.util.HashMap;
/*  7:   */ import java.util.Map;
/*  8:   */ import java.util.TimeZone;
/*  9:   */ 
/* 10:   */ public class AlipayHashMap
/* 11:   */   extends HashMap<String, String>
/* 12:   */ {
/* 13:   */   private static final long serialVersionUID = -1277791390393392630L;
/* 14:   */   
/* 15:   */   public AlipayHashMap() {}
/* 16:   */   
/* 17:   */   public AlipayHashMap(Map<? extends String, ? extends String> m)
/* 18:   */   {
/* 19:27 */     super(m);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String put(String key, Object value)
/* 23:   */   {
/* 24:   */     String strValue;
/* 25:   */     String strValue;
/* 26:33 */     if (value == null)
/* 27:   */     {
/* 28:34 */       strValue = null;
/* 29:   */     }
/* 30:   */     else
/* 31:   */     {
/* 32:   */       String strValue;
/* 33:35 */       if ((value instanceof String))
/* 34:   */       {
/* 35:36 */         strValue = (String)value;
/* 36:   */       }
/* 37:   */       else
/* 38:   */       {
/* 39:   */         String strValue;
/* 40:37 */         if ((value instanceof Integer))
/* 41:   */         {
/* 42:38 */           strValue = ((Integer)value).toString();
/* 43:   */         }
/* 44:   */         else
/* 45:   */         {
/* 46:   */           String strValue;
/* 47:39 */           if ((value instanceof Long))
/* 48:   */           {
/* 49:40 */             strValue = ((Long)value).toString();
/* 50:   */           }
/* 51:   */           else
/* 52:   */           {
/* 53:   */             String strValue;
/* 54:41 */             if ((value instanceof Float))
/* 55:   */             {
/* 56:42 */               strValue = ((Float)value).toString();
/* 57:   */             }
/* 58:   */             else
/* 59:   */             {
/* 60:   */               String strValue;
/* 61:43 */               if ((value instanceof Double))
/* 62:   */               {
/* 63:44 */                 strValue = ((Double)value).toString();
/* 64:   */               }
/* 65:   */               else
/* 66:   */               {
/* 67:   */                 String strValue;
/* 68:45 */                 if ((value instanceof Boolean))
/* 69:   */                 {
/* 70:46 */                   strValue = ((Boolean)value).toString();
/* 71:   */                 }
/* 72:   */                 else
/* 73:   */                 {
/* 74:   */                   String strValue;
/* 75:47 */                   if ((value instanceof Date))
/* 76:   */                   {
/* 77:48 */                     DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 78:49 */                     format.setTimeZone(TimeZone.getTimeZone("GMT+8"));
/* 79:50 */                     strValue = format.format((Date)value);
/* 80:   */                   }
/* 81:   */                   else
/* 82:   */                   {
/* 83:52 */                     strValue = value.toString();
/* 84:   */                   }
/* 85:   */                 }
/* 86:   */               }
/* 87:   */             }
/* 88:   */           }
/* 89:   */         }
/* 90:   */       }
/* 91:   */     }
/* 92:55 */     return put(key, strValue);
/* 93:   */   }
/* 94:   */   
/* 95:   */   public String put(String key, String value)
/* 96:   */   {
/* 97:59 */     if (StringUtils.areNotEmpty(new String[] { key, value })) {
/* 98:60 */       return (String)super.put(key, value);
/* 99:   */     }
/* :0:62 */     return null;
/* :1:   */   }
/* :2:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.AlipayHashMap
 * JD-Core Version:    0.7.0.1
 */