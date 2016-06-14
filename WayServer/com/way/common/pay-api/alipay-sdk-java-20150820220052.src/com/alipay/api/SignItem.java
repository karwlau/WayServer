/*  1:   */ package com.alipay.api;
/*  2:   */ 
/*  3:   */ import java.io.Serializable;
/*  4:   */ 
/*  5:   */ public class SignItem
/*  6:   */   implements Serializable
/*  7:   */ {
/*  8:   */   private static final long serialVersionUID = 6531196726066096786L;
/*  9:   */   private String signSourceDate;
/* 10:   */   private String sign;
/* 11:   */   
/* 12:   */   public String getSignSourceDate()
/* 13:   */   {
/* 14:35 */     return this.signSourceDate;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void setSignSourceDate(String signSourceDate)
/* 18:   */   {
/* 19:44 */     this.signSourceDate = signSourceDate;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getSign()
/* 23:   */   {
/* 24:53 */     return this.sign;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setSign(String sign)
/* 28:   */   {
/* 29:62 */     this.sign = sign;
/* 30:   */   }
/* 31:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.SignItem
 * JD-Core Version:    0.7.0.1
 */