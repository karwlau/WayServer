/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayTrustUserReportGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8835842622838715966L;
/* 10:   */   @ApiField("report")
/* 11:   */   private String report;
/* 12:   */   
/* 13:   */   public void setReport(String report)
/* 14:   */   {
/* 15:24 */     this.report = report;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getReport()
/* 19:   */   {
/* 20:27 */     return this.report;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayTrustUserReportGetResponse
 * JD-Core Version:    0.7.0.1
 */