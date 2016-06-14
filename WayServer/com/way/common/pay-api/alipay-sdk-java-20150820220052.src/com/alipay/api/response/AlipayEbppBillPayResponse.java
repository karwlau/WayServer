/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEbppBillPayResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8419687356743332955L;
/* 10:   */   @ApiField("alipay_order_no")
/* 11:   */   private String alipayOrderNo;
/* 12:   */   @ApiField("merchant_order_no")
/* 13:   */   private String merchantOrderNo;
/* 14:   */   @ApiField("order_status")
/* 15:   */   private String orderStatus;
/* 16:   */   @ApiField("order_type")
/* 17:   */   private String orderType;
/* 18:   */   
/* 19:   */   public void setAlipayOrderNo(String alipayOrderNo)
/* 20:   */   {
/* 21:42 */     this.alipayOrderNo = alipayOrderNo;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public String getAlipayOrderNo()
/* 25:   */   {
/* 26:45 */     return this.alipayOrderNo;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setMerchantOrderNo(String merchantOrderNo)
/* 30:   */   {
/* 31:49 */     this.merchantOrderNo = merchantOrderNo;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getMerchantOrderNo()
/* 35:   */   {
/* 36:52 */     return this.merchantOrderNo;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setOrderStatus(String orderStatus)
/* 40:   */   {
/* 41:56 */     this.orderStatus = orderStatus;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getOrderStatus()
/* 45:   */   {
/* 46:59 */     return this.orderStatus;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setOrderType(String orderType)
/* 50:   */   {
/* 51:63 */     this.orderType = orderType;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getOrderType()
/* 55:   */   {
/* 56:66 */     return this.orderType;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayEbppBillPayResponse
 * JD-Core Version:    0.7.0.1
 */