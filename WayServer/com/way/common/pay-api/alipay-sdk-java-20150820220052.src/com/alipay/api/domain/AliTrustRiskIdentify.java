/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AliTrustRiskIdentify
/*  9:   */   extends AlipayObject
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 2317267833752811295L;
/* 12:   */   @ApiListField("details")
/* 13:   */   @ApiField("zhima_risk_detail")
/* 14:   */   private List<ZhimaRiskDetail> details;
/* 15:   */   @ApiField("is_risk")
/* 16:   */   private String isRisk;
/* 17:   */   @ApiField("risk_tag")
/* 18:   */   private String riskTag;
/* 19:   */   
/* 20:   */   public List<ZhimaRiskDetail> getDetails()
/* 21:   */   {
/* 22:39 */     return this.details;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setDetails(List<ZhimaRiskDetail> details)
/* 26:   */   {
/* 27:42 */     this.details = details;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getIsRisk()
/* 31:   */   {
/* 32:46 */     return this.isRisk;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setIsRisk(String isRisk)
/* 36:   */   {
/* 37:49 */     this.isRisk = isRisk;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String getRiskTag()
/* 41:   */   {
/* 42:53 */     return this.riskTag;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setRiskTag(String riskTag)
/* 46:   */   {
/* 47:56 */     this.riskTag = riskTag;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.AliTrustRiskIdentify
 * JD-Core Version:    0.7.0.1
 */