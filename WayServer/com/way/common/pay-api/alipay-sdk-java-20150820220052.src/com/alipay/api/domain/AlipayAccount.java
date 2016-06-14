/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayAccount
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6567489219228135979L;
/* 10:   */   @ApiField("alipay_user_id")
/* 11:   */   private String alipayUserId;
/* 12:   */   @ApiField("available_amount")
/* 13:   */   private String availableAmount;
/* 14:   */   @ApiField("freeze_amount")
/* 15:   */   private String freezeAmount;
/* 16:   */   @ApiField("total_amount")
/* 17:   */   private String totalAmount;
/* 18:   */   
/* 19:   */   public String getAlipayUserId()
/* 20:   */   {
/* 21:41 */     return this.alipayUserId;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setAlipayUserId(String alipayUserId)
/* 25:   */   {
/* 26:44 */     this.alipayUserId = alipayUserId;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getAvailableAmount()
/* 30:   */   {
/* 31:48 */     return this.availableAmount;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setAvailableAmount(String availableAmount)
/* 35:   */   {
/* 36:51 */     this.availableAmount = availableAmount;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getFreezeAmount()
/* 40:   */   {
/* 41:55 */     return this.freezeAmount;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setFreezeAmount(String freezeAmount)
/* 45:   */   {
/* 46:58 */     this.freezeAmount = freezeAmount;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getTotalAmount()
/* 50:   */   {
/* 51:62 */     return this.totalAmount;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setTotalAmount(String totalAmount)
/* 55:   */   {
/* 56:65 */     this.totalAmount = totalAmount;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.AlipayAccount
 * JD-Core Version:    0.7.0.1
 */