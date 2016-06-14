/*  1:   */ package com.alipay.api;
/*  2:   */ 
/*  3:   */ public class AlipayApiException
/*  4:   */   extends Exception
/*  5:   */ {
/*  6:   */   private static final long serialVersionUID = -238091758285157331L;
/*  7:   */   private String errCode;
/*  8:   */   private String errMsg;
/*  9:   */   
/* 10:   */   public AlipayApiException() {}
/* 11:   */   
/* 12:   */   public AlipayApiException(String message, Throwable cause)
/* 13:   */   {
/* 14:24 */     super(message, cause);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public AlipayApiException(String message)
/* 18:   */   {
/* 19:28 */     super(message);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public AlipayApiException(Throwable cause)
/* 23:   */   {
/* 24:32 */     super(cause);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public AlipayApiException(String errCode, String errMsg)
/* 28:   */   {
/* 29:36 */     super(errCode + ":" + errMsg);
/* 30:37 */     this.errCode = errCode;
/* 31:38 */     this.errMsg = errMsg;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getErrCode()
/* 35:   */   {
/* 36:42 */     return this.errCode;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getErrMsg()
/* 40:   */   {
/* 41:46 */     return this.errMsg;
/* 42:   */   }
/* 43:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.AlipayApiException
 * JD-Core Version:    0.7.0.1
 */