/*  1:   */ package com.alipay.api.internal.util;
/*  2:   */ 
/*  3:   */ public class RequestParametersHolder
/*  4:   */ {
/*  5:   */   private AlipayHashMap protocalMustParams;
/*  6:   */   private AlipayHashMap protocalOptParams;
/*  7:   */   private AlipayHashMap applicationParams;
/*  8:   */   
/*  9:   */   public AlipayHashMap getProtocalMustParams()
/* 10:   */   {
/* 11: 9 */     return this.protocalMustParams;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void setProtocalMustParams(AlipayHashMap protocalMustParams)
/* 15:   */   {
/* 16:12 */     this.protocalMustParams = protocalMustParams;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public AlipayHashMap getProtocalOptParams()
/* 20:   */   {
/* 21:15 */     return this.protocalOptParams;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setProtocalOptParams(AlipayHashMap protocalOptParams)
/* 25:   */   {
/* 26:18 */     this.protocalOptParams = protocalOptParams;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public AlipayHashMap getApplicationParams()
/* 30:   */   {
/* 31:21 */     return this.applicationParams;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setApplicationParams(AlipayHashMap applicationParams)
/* 35:   */   {
/* 36:24 */     this.applicationParams = applicationParams;
/* 37:   */   }
/* 38:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.RequestParametersHolder
 * JD-Core Version:    0.7.0.1
 */