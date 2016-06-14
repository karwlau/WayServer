/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.MicroPayOrderDetail;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayMicropayOrderFreezeResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 6169454119434696335L;
/* 11:   */   @ApiField("micro_pay_order_detail")
/* 12:   */   private MicroPayOrderDetail microPayOrderDetail;
/* 13:   */   
/* 14:   */   public void setMicroPayOrderDetail(MicroPayOrderDetail microPayOrderDetail)
/* 15:   */   {
/* 16:25 */     this.microPayOrderDetail = microPayOrderDetail;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public MicroPayOrderDetail getMicroPayOrderDetail()
/* 20:   */   {
/* 21:28 */     return this.microPayOrderDetail;
/* 22:   */   }
/* 23:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMicropayOrderFreezeResponse
 * JD-Core Version:    0.7.0.1
 */