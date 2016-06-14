/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayTrustUserRiskSummaryGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5264518168718949222L;
/* 10:   */   @ApiField("risk_code")
/* 11:   */   private String riskCode;
/* 12:   */   
/* 13:   */   public void setRiskCode(String riskCode)
/* 14:   */   {
/* 15:24 */     this.riskCode = riskCode;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getRiskCode()
/* 19:   */   {
/* 20:27 */     return this.riskCode;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayTrustUserRiskSummaryGetResponse
 * JD-Core Version:    0.7.0.1
 */