/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayStockPortfolioSingleAddResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2542289345115265896L;
/* 10:   */   @ApiField("code")
/* 11:   */   private String code;
/* 12:   */   @ApiField("msg")
/* 13:   */   private String msg;
/* 14:   */   @ApiField("success")
/* 15:   */   private Boolean success;
/* 16:   */   
/* 17:   */   public void setCode(String code)
/* 18:   */   {
/* 19:36 */     this.code = code;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getCode()
/* 23:   */   {
/* 24:39 */     return this.code;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setMsg(String msg)
/* 28:   */   {
/* 29:43 */     this.msg = msg;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getMsg()
/* 33:   */   {
/* 34:46 */     return this.msg;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setSuccess(Boolean success)
/* 38:   */   {
/* 39:50 */     this.success = success;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public Boolean getSuccess()
/* 43:   */   {
/* 44:53 */     return this.success;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayStockPortfolioSingleAddResponse
 * JD-Core Version:    0.7.0.1
 */