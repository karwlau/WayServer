/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayPassTplContentUpdateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2611152474184717584L;
/* 10:   */   @ApiField("error_code")
/* 11:   */   private String errorCode;
/* 12:   */   @ApiField("result")
/* 13:   */   private String result;
/* 14:   */   @ApiField("success")
/* 15:   */   private String success;
/* 16:   */   
/* 17:   */   public void setErrorCode(String errorCode)
/* 18:   */   {
/* 19:36 */     this.errorCode = errorCode;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getErrorCode()
/* 23:   */   {
/* 24:39 */     return this.errorCode;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setResult(String result)
/* 28:   */   {
/* 29:43 */     this.result = result;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getResult()
/* 33:   */   {
/* 34:46 */     return this.result;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setSuccess(String success)
/* 38:   */   {
/* 39:50 */     this.success = success;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getSuccess()
/* 43:   */   {
/* 44:53 */     return this.success;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayPassTplContentUpdateResponse
 * JD-Core Version:    0.7.0.1
 */