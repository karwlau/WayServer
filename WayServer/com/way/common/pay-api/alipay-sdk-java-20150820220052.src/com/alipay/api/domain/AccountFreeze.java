/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AccountFreeze
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1882228255376788218L;
/* 10:   */   @ApiField("freeze_amount")
/* 11:   */   private String freezeAmount;
/* 12:   */   @ApiField("freeze_name")
/* 13:   */   private String freezeName;
/* 14:   */   @ApiField("freeze_type")
/* 15:   */   private String freezeType;
/* 16:   */   
/* 17:   */   public String getFreezeAmount()
/* 18:   */   {
/* 19:35 */     return this.freezeAmount;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setFreezeAmount(String freezeAmount)
/* 23:   */   {
/* 24:38 */     this.freezeAmount = freezeAmount;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getFreezeName()
/* 28:   */   {
/* 29:42 */     return this.freezeName;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setFreezeName(String freezeName)
/* 33:   */   {
/* 34:45 */     this.freezeName = freezeName;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getFreezeType()
/* 38:   */   {
/* 39:49 */     return this.freezeType;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setFreezeType(String freezeType)
/* 43:   */   {
/* 44:52 */     this.freezeType = freezeType;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.AccountFreeze
 * JD-Core Version:    0.7.0.1
 */