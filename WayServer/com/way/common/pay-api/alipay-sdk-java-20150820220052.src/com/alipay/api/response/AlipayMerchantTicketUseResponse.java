/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.Ticket;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayMerchantTicketUseResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 1726882251255613343L;
/* 11:   */   @ApiField("biz_no")
/* 12:   */   private String bizNo;
/* 13:   */   @ApiField("error_code")
/* 14:   */   private String errorCode;
/* 15:   */   @ApiField("error_msg")
/* 16:   */   private String errorMsg;
/* 17:   */   @ApiField("success_code")
/* 18:   */   private String successCode;
/* 19:   */   @ApiField("ticket")
/* 20:   */   private Ticket ticket;
/* 21:   */   
/* 22:   */   public void setBizNo(String bizNo)
/* 23:   */   {
/* 24:52 */     this.bizNo = bizNo;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getBizNo()
/* 28:   */   {
/* 29:55 */     return this.bizNo;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setErrorCode(String errorCode)
/* 33:   */   {
/* 34:59 */     this.errorCode = errorCode;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getErrorCode()
/* 38:   */   {
/* 39:62 */     return this.errorCode;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setErrorMsg(String errorMsg)
/* 43:   */   {
/* 44:66 */     this.errorMsg = errorMsg;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public String getErrorMsg()
/* 48:   */   {
/* 49:69 */     return this.errorMsg;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public void setSuccessCode(String successCode)
/* 53:   */   {
/* 54:73 */     this.successCode = successCode;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public String getSuccessCode()
/* 58:   */   {
/* 59:76 */     return this.successCode;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public void setTicket(Ticket ticket)
/* 63:   */   {
/* 64:80 */     this.ticket = ticket;
/* 65:   */   }
/* 66:   */   
/* 67:   */   public Ticket getTicket()
/* 68:   */   {
/* 69:83 */     return this.ticket;
/* 70:   */   }
/* 71:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMerchantTicketUseResponse
 * JD-Core Version:    0.7.0.1
 */