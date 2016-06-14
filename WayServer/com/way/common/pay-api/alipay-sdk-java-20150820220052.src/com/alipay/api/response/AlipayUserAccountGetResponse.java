/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.AlipayAccount;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayUserAccountGetResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 4637944329514249224L;
/* 11:   */   @ApiField("alipay_account")
/* 12:   */   private AlipayAccount alipayAccount;
/* 13:   */   
/* 14:   */   public void setAlipayAccount(AlipayAccount alipayAccount)
/* 15:   */   {
/* 16:25 */     this.alipayAccount = alipayAccount;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public AlipayAccount getAlipayAccount()
/* 20:   */   {
/* 21:28 */     return this.alipayAccount;
/* 22:   */   }
/* 23:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayUserAccountGetResponse
 * JD-Core Version:    0.7.0.1
 */