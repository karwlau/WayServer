/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayWapUserAlipayinsideAuthapiResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2728411721566743222L;
/* 10:   */   @ApiField("auth_code")
/* 11:   */   private String authCode;
/* 12:   */   
/* 13:   */   public void setAuthCode(String authCode)
/* 14:   */   {
/* 15:24 */     this.authCode = authCode;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getAuthCode()
/* 19:   */   {
/* 20:27 */     return this.authCode;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayWapUserAlipayinsideAuthapiResponse
 * JD-Core Version:    0.7.0.1
 */