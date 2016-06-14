/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEbppBillPayurlGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5759921437996479571L;
/* 10:   */   @ApiField("pay_url")
/* 11:   */   private String payUrl;
/* 12:   */   
/* 13:   */   public void setPayUrl(String payUrl)
/* 14:   */   {
/* 15:24 */     this.payUrl = payUrl;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getPayUrl()
/* 19:   */   {
/* 20:27 */     return this.payUrl;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayEbppBillPayurlGetResponse
 * JD-Core Version:    0.7.0.1
 */