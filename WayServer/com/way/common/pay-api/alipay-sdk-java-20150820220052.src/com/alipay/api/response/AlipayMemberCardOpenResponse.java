/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMemberCardOpenResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7351332871991789914L;
/* 10:   */   @ApiField("card")
/* 11:   */   private String card;
/* 12:   */   @ApiField("error_code")
/* 13:   */   private String errorCode;
/* 14:   */   @ApiField("error_msg")
/* 15:   */   private String errorMsg;
/* 16:   */   @ApiField("success")
/* 17:   */   private String success;
/* 18:   */   
/* 19:   */   public void setCard(String card)
/* 20:   */   {
/* 21:48 */     this.card = card;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public String getCard()
/* 25:   */   {
/* 26:51 */     return this.card;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setErrorCode(String errorCode)
/* 30:   */   {
/* 31:55 */     this.errorCode = errorCode;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getErrorCode()
/* 35:   */   {
/* 36:58 */     return this.errorCode;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setErrorMsg(String errorMsg)
/* 40:   */   {
/* 41:62 */     this.errorMsg = errorMsg;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getErrorMsg()
/* 45:   */   {
/* 46:65 */     return this.errorMsg;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setSuccess(String success)
/* 50:   */   {
/* 51:69 */     this.success = success;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getSuccess()
/* 55:   */   {
/* 56:72 */     return this.success;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMemberCardOpenResponse
 * JD-Core Version:    0.7.0.1
 */