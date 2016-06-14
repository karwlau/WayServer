/*  1:   */ package com.alipay.api.internal.util;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayApiException;
/*  4:   */ import com.alipay.api.FileItem;
/*  5:   */ import java.io.IOException;
/*  6:   */ 
/*  7:   */ public class RequestCheckUtils
/*  8:   */ {
/*  9:   */   public static final String ERROR_CODE_ARGUMENTS_MISS = "40001";
/* 10:   */   public static final String ERROR_CODE_ARGUMENTS_INVALID = "40002";
/* 11:   */   
/* 12:   */   public static void checkNotEmpty(Object value, String fieldName)
/* 13:   */     throws AlipayApiException
/* 14:   */   {
/* 15:13 */     if (value == null) {
/* 16:14 */       throw new AlipayApiException("40001", "client-error:Missing Required Arguments:" + fieldName + "");
/* 17:   */     }
/* 18:17 */     if (((value instanceof String)) && 
/* 19:18 */       (((String)value).trim().length() == 0)) {
/* 20:19 */       throw new AlipayApiException("40001", "client-error:Missing Required Arguments:" + fieldName + "");
/* 21:   */     }
/* 22:   */   }
/* 23:   */   
/* 24:   */   public static void checkMaxLength(String value, int maxLength, String fieldName)
/* 25:   */     throws AlipayApiException
/* 26:   */   {
/* 27:27 */     if ((value != null) && 
/* 28:28 */       (value.length() > maxLength)) {
/* 29:29 */       throw new AlipayApiException("40002", "client-error:Invalid Arguments:the length of " + fieldName + " can not be larger than " + maxLength + ".");
/* 30:   */     }
/* 31:   */   }
/* 32:   */   
/* 33:   */   public static void checkMaxLength(FileItem fileItem, int maxLength, String fieldName)
/* 34:   */     throws AlipayApiException
/* 35:   */   {
/* 36:   */     try
/* 37:   */     {
/* 38:39 */       if ((fileItem != null) && (fileItem.getContent() != null)) {
/* 39:41 */         if (fileItem.getContent().length > maxLength) {
/* 40:42 */           throw new AlipayApiException("40002", "client-error:Invalid Arguments:the length of " + fieldName + " can not be larger than " + maxLength + ".");
/* 41:   */         }
/* 42:   */       }
/* 43:   */     }
/* 44:   */     catch (IOException e)
/* 45:   */     {
/* 46:48 */       throw new RuntimeException(e);
/* 47:   */     }
/* 48:   */   }
/* 49:   */   
/* 50:   */   public static void checkMaxListSize(String value, int maxSize, String fieldName)
/* 51:   */     throws AlipayApiException
/* 52:   */   {
/* 53:54 */     if (value != null)
/* 54:   */     {
/* 55:55 */       String[] list = value.split(",");
/* 56:56 */       if ((list != null) && (list.length > maxSize)) {
/* 57:57 */         throw new AlipayApiException("40002", "client-error:Invalid Arguments:the listsize(the string split by \",\") of " + fieldName + " must be less than " + maxSize + ".");
/* 58:   */       }
/* 59:   */     }
/* 60:   */   }
/* 61:   */   
/* 62:   */   public static void checkMaxValue(Long value, long maxValue, String fieldName)
/* 63:   */     throws AlipayApiException
/* 64:   */   {
/* 65:66 */     if ((value != null) && 
/* 66:67 */       (value.longValue() > maxValue)) {
/* 67:68 */       throw new AlipayApiException("40002", "client-error:Invalid Arguments:the value of " + fieldName + " can not be larger than " + maxValue + ".");
/* 68:   */     }
/* 69:   */   }
/* 70:   */   
/* 71:   */   public static void checkMinValue(Long value, long minValue, String fieldName)
/* 72:   */     throws AlipayApiException
/* 73:   */   {
/* 74:77 */     if ((value != null) && 
/* 75:78 */       (value.longValue() < minValue)) {
/* 76:79 */       throw new AlipayApiException("40002", "client-error:Invalid Arguments:the value of " + fieldName + " can not be less than " + minValue + ".");
/* 77:   */     }
/* 78:   */   }
/* 79:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.RequestCheckUtils
 * JD-Core Version:    0.7.0.1
 */