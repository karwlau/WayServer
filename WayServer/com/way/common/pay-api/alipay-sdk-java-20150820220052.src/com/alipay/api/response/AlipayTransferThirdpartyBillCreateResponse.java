/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayTransferThirdpartyBillCreateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3212297233543987289L;
/* 10:   */   @ApiField("order_id")
/* 11:   */   private String orderId;
/* 12:   */   @ApiField("order_type")
/* 13:   */   private String orderType;
/* 14:   */   @ApiField("payment_id")
/* 15:   */   private String paymentId;
/* 16:   */   
/* 17:   */   public void setOrderId(String orderId)
/* 18:   */   {
/* 19:36 */     this.orderId = orderId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getOrderId()
/* 23:   */   {
/* 24:39 */     return this.orderId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setOrderType(String orderType)
/* 28:   */   {
/* 29:43 */     this.orderType = orderType;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getOrderType()
/* 33:   */   {
/* 34:46 */     return this.orderType;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setPaymentId(String paymentId)
/* 38:   */   {
/* 39:50 */     this.paymentId = paymentId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getPaymentId()
/* 43:   */   {
/* 44:53 */     return this.paymentId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayTransferThirdpartyBillCreateResponse
 * JD-Core Version:    0.7.0.1
 */