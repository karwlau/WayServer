/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEbppPdeductBillPayStatusResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5265383758678896196L;
/* 10:   */   @ApiField("agreement_id")
/* 11:   */   private String agreementId;
/* 12:   */   @ApiField("order_no")
/* 13:   */   private String orderNo;
/* 14:   */   @ApiField("out_order_no")
/* 15:   */   private String outOrderNo;
/* 16:   */   @ApiField("status")
/* 17:   */   private String status;
/* 18:   */   
/* 19:   */   public void setAgreementId(String agreementId)
/* 20:   */   {
/* 21:45 */     this.agreementId = agreementId;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public String getAgreementId()
/* 25:   */   {
/* 26:48 */     return this.agreementId;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setOrderNo(String orderNo)
/* 30:   */   {
/* 31:52 */     this.orderNo = orderNo;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getOrderNo()
/* 35:   */   {
/* 36:55 */     return this.orderNo;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setOutOrderNo(String outOrderNo)
/* 40:   */   {
/* 41:59 */     this.outOrderNo = outOrderNo;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getOutOrderNo()
/* 45:   */   {
/* 46:62 */     return this.outOrderNo;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setStatus(String status)
/* 50:   */   {
/* 51:66 */     this.status = status;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getStatus()
/* 55:   */   {
/* 56:69 */     return this.status;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayEbppPdeductBillPayStatusResponse
 * JD-Core Version:    0.7.0.1
 */