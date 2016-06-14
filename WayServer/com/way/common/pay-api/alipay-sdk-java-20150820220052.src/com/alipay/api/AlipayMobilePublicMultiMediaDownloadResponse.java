/*  1:   */ package com.alipay.api;
/*  2:   */ 
/*  3:   */ import com.alipay.api.internal.mapping.ApiField;
/*  4:   */ 
/*  5:   */ public class AlipayMobilePublicMultiMediaDownloadResponse
/*  6:   */   extends AlipayResponse
/*  7:   */ {
/*  8:   */   private static final long serialVersionUID = 4500718209713594926L;
/*  9:   */   @ApiField("code")
/* 10:   */   private String code;
/* 11:   */   @ApiField("msg")
/* 12:   */   private String msg;
/* 13:   */   
/* 14:   */   public void setCode(String code)
/* 15:   */   {
/* 16:26 */     this.code = code;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public String getCode()
/* 20:   */   {
/* 21:30 */     return this.code;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setMsg(String msg)
/* 25:   */   {
/* 26:35 */     this.msg = msg;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getMsg()
/* 30:   */   {
/* 31:40 */     return this.msg;
/* 32:   */   }
/* 33:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.AlipayMobilePublicMultiMediaDownloadResponse
 * JD-Core Version:    0.7.0.1
 */