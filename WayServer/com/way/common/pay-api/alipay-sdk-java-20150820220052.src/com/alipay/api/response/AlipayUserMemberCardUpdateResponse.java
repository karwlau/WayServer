/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayUserMemberCardUpdateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4861542638759796325L;
/* 10:   */   @ApiField("card")
/* 11:   */   private String card;
/* 12:   */   @ApiField("result_code")
/* 13:   */   private String resultCode;
/* 14:   */   @ApiField("result_msg")
/* 15:   */   private String resultMsg;
/* 16:   */   
/* 17:   */   public void setCard(String card)
/* 18:   */   {
/* 19:36 */     this.card = card;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getCard()
/* 23:   */   {
/* 24:39 */     return this.card;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setResultCode(String resultCode)
/* 28:   */   {
/* 29:43 */     this.resultCode = resultCode;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getResultCode()
/* 33:   */   {
/* 34:46 */     return this.resultCode;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setResultMsg(String resultMsg)
/* 38:   */   {
/* 39:50 */     this.resultMsg = resultMsg;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getResultMsg()
/* 43:   */   {
/* 44:53 */     return this.resultMsg;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayUserMemberCardUpdateResponse
 * JD-Core Version:    0.7.0.1
 */