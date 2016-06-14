/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayTradeCancelResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1179812759236517991L;
/* 10:   */   @ApiField("action")
/* 11:   */   private String action;
/* 12:   */   @ApiField("out_trade_no")
/* 13:   */   private String outTradeNo;
/* 14:   */   @ApiField("retry_flag")
/* 15:   */   private String retryFlag;
/* 16:   */   @ApiField("trade_no")
/* 17:   */   private String tradeNo;
/* 18:   */   
/* 19:   */   public void setAction(String action)
/* 20:   */   {
/* 21:42 */     this.action = action;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public String getAction()
/* 25:   */   {
/* 26:45 */     return this.action;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setOutTradeNo(String outTradeNo)
/* 30:   */   {
/* 31:49 */     this.outTradeNo = outTradeNo;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getOutTradeNo()
/* 35:   */   {
/* 36:52 */     return this.outTradeNo;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setRetryFlag(String retryFlag)
/* 40:   */   {
/* 41:56 */     this.retryFlag = retryFlag;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getRetryFlag()
/* 45:   */   {
/* 46:59 */     return this.retryFlag;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setTradeNo(String tradeNo)
/* 50:   */   {
/* 51:63 */     this.tradeNo = tradeNo;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getTradeNo()
/* 55:   */   {
/* 56:66 */     return this.tradeNo;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayTradeCancelResponse
 * JD-Core Version:    0.7.0.1
 */