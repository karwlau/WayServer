/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.Coupon;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayMemberCouponQuerydetailResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 2764483263976692355L;
/* 11:   */   @ApiField("coupon")
/* 12:   */   private Coupon coupon;
/* 13:   */   @ApiField("error_code")
/* 14:   */   private String errorCode;
/* 15:   */   @ApiField("error_msg")
/* 16:   */   private String errorMsg;
/* 17:   */   @ApiField("success_code")
/* 18:   */   private String successCode;
/* 19:   */   
/* 20:   */   public void setCoupon(Coupon coupon)
/* 21:   */   {
/* 22:43 */     this.coupon = coupon;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public Coupon getCoupon()
/* 26:   */   {
/* 27:46 */     return this.coupon;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setErrorCode(String errorCode)
/* 31:   */   {
/* 32:50 */     this.errorCode = errorCode;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public String getErrorCode()
/* 36:   */   {
/* 37:53 */     return this.errorCode;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void setErrorMsg(String errorMsg)
/* 41:   */   {
/* 42:57 */     this.errorMsg = errorMsg;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public String getErrorMsg()
/* 46:   */   {
/* 47:60 */     return this.errorMsg;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public void setSuccessCode(String successCode)
/* 51:   */   {
/* 52:64 */     this.successCode = successCode;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public String getSuccessCode()
/* 56:   */   {
/* 57:67 */     return this.successCode;
/* 58:   */   }
/* 59:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMemberCouponQuerydetailResponse
 * JD-Core Version:    0.7.0.1
 */