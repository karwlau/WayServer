/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class InstoreUser
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5699877569865772839L;
/* 10:   */   @ApiField("is_birthday")
/* 11:   */   private Boolean isBirthday;
/* 12:   */   @ApiField("user_id")
/* 13:   */   private String userId;
/* 14:   */   
/* 15:   */   public Boolean getIsBirthday()
/* 16:   */   {
/* 17:29 */     return this.isBirthday;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setIsBirthday(Boolean isBirthday)
/* 21:   */   {
/* 22:32 */     this.isBirthday = isBirthday;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getUserId()
/* 26:   */   {
/* 27:36 */     return this.userId;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setUserId(String userId)
/* 31:   */   {
/* 32:39 */     this.userId = userId;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.InstoreUser
 * JD-Core Version:    0.7.0.1
 */