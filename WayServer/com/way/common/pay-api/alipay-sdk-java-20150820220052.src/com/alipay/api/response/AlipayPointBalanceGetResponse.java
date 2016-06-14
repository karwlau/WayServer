/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayPointBalanceGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3527358995481541623L;
/* 10:   */   @ApiField("point_amount")
/* 11:   */   private Long pointAmount;
/* 12:   */   
/* 13:   */   public void setPointAmount(Long pointAmount)
/* 14:   */   {
/* 15:24 */     this.pointAmount = pointAmount;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public Long getPointAmount()
/* 19:   */   {
/* 20:27 */     return this.pointAmount;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayPointBalanceGetResponse
 * JD-Core Version:    0.7.0.1
 */