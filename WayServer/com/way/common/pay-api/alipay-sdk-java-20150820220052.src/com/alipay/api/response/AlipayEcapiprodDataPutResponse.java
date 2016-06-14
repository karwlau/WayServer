/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayEcapiprodDataPutResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8851239172976661717L;
/* 10:   */   @ApiField("data_version")
/* 11:   */   private String dataVersion;
/* 12:   */   
/* 13:   */   public void setDataVersion(String dataVersion)
/* 14:   */   {
/* 15:24 */     this.dataVersion = dataVersion;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getDataVersion()
/* 19:   */   {
/* 20:27 */     return this.dataVersion;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayEcapiprodDataPutResponse
 * JD-Core Version:    0.7.0.1
 */