/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.CreditResult;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayEcapiprodCreditGetResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 1415854434784386576L;
/* 11:   */   @ApiField("credit_result")
/* 12:   */   private CreditResult creditResult;
/* 13:   */   @ApiField("request_id")
/* 14:   */   private String requestId;
/* 15:   */   
/* 16:   */   public void setCreditResult(CreditResult creditResult)
/* 17:   */   {
/* 18:31 */     this.creditResult = creditResult;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public CreditResult getCreditResult()
/* 22:   */   {
/* 23:34 */     return this.creditResult;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setRequestId(String requestId)
/* 27:   */   {
/* 28:38 */     this.requestId = requestId;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getRequestId()
/* 32:   */   {
/* 33:41 */     return this.requestId;
/* 34:   */   }
/* 35:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayEcapiprodCreditGetResponse
 * JD-Core Version:    0.7.0.1
 */