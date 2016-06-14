/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipaySecurityInfoAnalysisResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4618482482943444784L;
/* 10:   */   @ApiField("risk_code")
/* 11:   */   private String riskCode;
/* 12:   */   @ApiField("risk_level")
/* 13:   */   private Long riskLevel;
/* 14:   */   
/* 15:   */   public void setRiskCode(String riskCode)
/* 16:   */   {
/* 17:30 */     this.riskCode = riskCode;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getRiskCode()
/* 21:   */   {
/* 22:33 */     return this.riskCode;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setRiskLevel(Long riskLevel)
/* 26:   */   {
/* 27:37 */     this.riskLevel = riskLevel;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public Long getRiskLevel()
/* 31:   */   {
/* 32:40 */     return this.riskLevel;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipaySecurityInfoAnalysisResponse
 * JD-Core Version:    0.7.0.1
 */