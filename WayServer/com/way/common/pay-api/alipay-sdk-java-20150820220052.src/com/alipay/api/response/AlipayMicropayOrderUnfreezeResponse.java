/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.UnfreezeOrderDetail;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayMicropayOrderUnfreezeResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 5685391293217826753L;
/* 11:   */   @ApiField("unfreeze_order_detail")
/* 12:   */   private UnfreezeOrderDetail unfreezeOrderDetail;
/* 13:   */   
/* 14:   */   public void setUnfreezeOrderDetail(UnfreezeOrderDetail unfreezeOrderDetail)
/* 15:   */   {
/* 16:25 */     this.unfreezeOrderDetail = unfreezeOrderDetail;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public UnfreezeOrderDetail getUnfreezeOrderDetail()
/* 20:   */   {
/* 21:28 */     return this.unfreezeOrderDetail;
/* 22:   */   }
/* 23:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMicropayOrderUnfreezeResponse
 * JD-Core Version:    0.7.0.1
 */