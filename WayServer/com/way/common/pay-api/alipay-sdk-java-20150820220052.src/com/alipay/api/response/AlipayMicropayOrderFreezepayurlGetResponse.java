/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMicropayOrderFreezepayurlGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2178143683833595847L;
/* 10:   */   @ApiField("pay_freeze_url")
/* 11:   */   private String payFreezeUrl;
/* 12:   */   
/* 13:   */   public void setPayFreezeUrl(String payFreezeUrl)
/* 14:   */   {
/* 15:24 */     this.payFreezeUrl = payFreezeUrl;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getPayFreezeUrl()
/* 19:   */   {
/* 20:27 */     return this.payFreezeUrl;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMicropayOrderFreezepayurlGetResponse
 * JD-Core Version:    0.7.0.1
 */