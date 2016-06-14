/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayPointOrderAddResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2115728577273792372L;
/* 10:   */   @ApiField("alipay_order_no")
/* 11:   */   private String alipayOrderNo;
/* 12:   */   @ApiField("result_code")
/* 13:   */   private Boolean resultCode;
/* 14:   */   
/* 15:   */   public void setAlipayOrderNo(String alipayOrderNo)
/* 16:   */   {
/* 17:30 */     this.alipayOrderNo = alipayOrderNo;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getAlipayOrderNo()
/* 21:   */   {
/* 22:33 */     return this.alipayOrderNo;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setResultCode(Boolean resultCode)
/* 26:   */   {
/* 27:37 */     this.resultCode = resultCode;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public Boolean getResultCode()
/* 31:   */   {
/* 32:40 */     return this.resultCode;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayPointOrderAddResponse
 * JD-Core Version:    0.7.0.1
 */