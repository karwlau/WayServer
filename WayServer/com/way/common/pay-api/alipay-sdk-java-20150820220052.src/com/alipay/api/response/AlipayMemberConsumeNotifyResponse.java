/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMemberConsumeNotifyResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6448719745544298646L;
/* 10:   */   @ApiField("error_code")
/* 11:   */   private String errorCode;
/* 12:   */   @ApiField("error_msg")
/* 13:   */   private String errorMsg;
/* 14:   */   @ApiField("ext_card_no")
/* 15:   */   private String extCardNo;
/* 16:   */   @ApiField("success")
/* 17:   */   private String success;
/* 18:   */   
/* 19:   */   public void setErrorCode(String errorCode)
/* 20:   */   {
/* 21:43 */     this.errorCode = errorCode;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public String getErrorCode()
/* 25:   */   {
/* 26:46 */     return this.errorCode;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setErrorMsg(String errorMsg)
/* 30:   */   {
/* 31:50 */     this.errorMsg = errorMsg;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getErrorMsg()
/* 35:   */   {
/* 36:53 */     return this.errorMsg;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setExtCardNo(String extCardNo)
/* 40:   */   {
/* 41:57 */     this.extCardNo = extCardNo;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getExtCardNo()
/* 45:   */   {
/* 46:60 */     return this.extCardNo;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setSuccess(String success)
/* 50:   */   {
/* 51:64 */     this.success = success;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getSuccess()
/* 55:   */   {
/* 56:67 */     return this.success;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMemberConsumeNotifyResponse
 * JD-Core Version:    0.7.0.1
 */