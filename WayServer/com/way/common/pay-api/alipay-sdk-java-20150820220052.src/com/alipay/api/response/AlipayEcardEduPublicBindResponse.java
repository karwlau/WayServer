/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcardEduPublicBindResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3658716868893432452L;
/* 10:   */   @ApiField("agent_code")
/* 11:   */   private String agentCode;
/* 12:   */   @ApiField("card_no")
/* 13:   */   private String cardNo;
/* 14:   */   @ApiField("return_code")
/* 15:   */   private String returnCode;
/* 16:   */   
/* 17:   */   public void setAgentCode(String agentCode)
/* 18:   */   {
/* 19:36 */     this.agentCode = agentCode;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getAgentCode()
/* 23:   */   {
/* 24:39 */     return this.agentCode;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setCardNo(String cardNo)
/* 28:   */   {
/* 29:43 */     this.cardNo = cardNo;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getCardNo()
/* 33:   */   {
/* 34:46 */     return this.cardNo;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setReturnCode(String returnCode)
/* 38:   */   {
/* 39:50 */     this.returnCode = returnCode;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getReturnCode()
/* 43:   */   {
/* 44:53 */     return this.returnCode;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayEcardEduPublicBindResponse
 * JD-Core Version:    0.7.0.1
 */