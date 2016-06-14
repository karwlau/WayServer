/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayDataBillDownloadurlGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5332384295486995435L;
/* 10:   */   @ApiField("bill_download_url")
/* 11:   */   private String billDownloadUrl;
/* 12:   */   
/* 13:   */   public void setBillDownloadUrl(String billDownloadUrl)
/* 14:   */   {
/* 15:24 */     this.billDownloadUrl = billDownloadUrl;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getBillDownloadUrl()
/* 19:   */   {
/* 20:27 */     return this.billDownloadUrl;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayDataBillDownloadurlGetResponse
 * JD-Core Version:    0.7.0.1
 */