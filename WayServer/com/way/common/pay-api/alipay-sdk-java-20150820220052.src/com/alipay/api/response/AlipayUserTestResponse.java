/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayUserTestResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1568229133183535125L;
/* 10:   */   @ApiField("ret1")
/* 11:   */   private String ret1;
/* 12:   */   
/* 13:   */   public void setRet1(String ret1)
/* 14:   */   {
/* 15:24 */     this.ret1 = ret1;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getRet1()
/* 19:   */   {
/* 20:27 */     return this.ret1;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayUserTestResponse
 * JD-Core Version:    0.7.0.1
 */