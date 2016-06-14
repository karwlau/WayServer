/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayZmScoreZrankResult
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5887252323292566928L;
/* 10:   */   @ApiField("zrank")
/* 11:   */   private String zrank;
/* 12:   */   
/* 13:   */   public String getZrank()
/* 14:   */   {
/* 15:23 */     return this.zrank;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setZrank(String zrank)
/* 19:   */   {
/* 20:26 */     this.zrank = zrank;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.AlipayZmScoreZrankResult
 * JD-Core Version:    0.7.0.1
 */