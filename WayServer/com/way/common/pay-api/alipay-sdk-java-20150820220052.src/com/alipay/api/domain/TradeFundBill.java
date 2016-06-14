/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class TradeFundBill
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2137462964663533535L;
/* 10:   */   @ApiField("amount")
/* 11:   */   private String amount;
/* 12:   */   @ApiField("fund_channel")
/* 13:   */   private String fundChannel;
/* 14:   */   
/* 15:   */   public String getAmount()
/* 16:   */   {
/* 17:29 */     return this.amount;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setAmount(String amount)
/* 21:   */   {
/* 22:32 */     this.amount = amount;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getFundChannel()
/* 26:   */   {
/* 27:36 */     return this.fundChannel;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setFundChannel(String fundChannel)
/* 31:   */   {
/* 32:39 */     this.fundChannel = fundChannel;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.TradeFundBill
 * JD-Core Version:    0.7.0.1
 */