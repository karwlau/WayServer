/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayPassInstanceUpdateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4388127796214527383L;
/* 10:   */   @ApiField("result")
/* 11:   */   private String result;
/* 12:   */   @ApiField("success")
/* 13:   */   private String success;
/* 14:   */   
/* 15:   */   public void setResult(String result)
/* 16:   */   {
/* 17:30 */     this.result = result;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getResult()
/* 21:   */   {
/* 22:33 */     return this.result;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setSuccess(String success)
/* 26:   */   {
/* 27:37 */     this.success = success;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getSuccess()
/* 31:   */   {
/* 32:40 */     return this.success;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayPassInstanceUpdateResponse
 * JD-Core Version:    0.7.0.1
 */