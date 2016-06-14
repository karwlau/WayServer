/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.SinglePayDetail;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayMicropayOrderConfirmpayurlGetResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 1624986578772141849L;
/* 11:   */   @ApiField("single_pay_detail")
/* 12:   */   private SinglePayDetail singlePayDetail;
/* 13:   */   
/* 14:   */   public void setSinglePayDetail(SinglePayDetail singlePayDetail)
/* 15:   */   {
/* 16:25 */     this.singlePayDetail = singlePayDetail;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public SinglePayDetail getSinglePayDetail()
/* 20:   */   {
/* 21:28 */     return this.singlePayDetail;
/* 22:   */   }
/* 23:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMicropayOrderConfirmpayurlGetResponse
 * JD-Core Version:    0.7.0.1
 */