/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMappprodAccountBindingSyncResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2412189779418685879L;
/* 10:   */   @ApiField("result")
/* 11:   */   private String result;
/* 12:   */   
/* 13:   */   public void setResult(String result)
/* 14:   */   {
/* 15:24 */     this.result = result;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getResult()
/* 19:   */   {
/* 20:27 */     return this.result;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMappprodAccountBindingSyncResponse
 * JD-Core Version:    0.7.0.1
 */