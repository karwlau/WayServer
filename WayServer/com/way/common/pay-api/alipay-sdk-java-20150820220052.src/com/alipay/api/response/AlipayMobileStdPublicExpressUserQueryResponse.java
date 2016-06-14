/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMobileStdPublicExpressUserQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6124225526338697155L;
/* 10:   */   @ApiField("cert_no")
/* 11:   */   private String certNo;
/* 12:   */   @ApiField("cert_type")
/* 13:   */   private String certType;
/* 14:   */   
/* 15:   */   public void setCertNo(String certNo)
/* 16:   */   {
/* 17:30 */     this.certNo = certNo;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getCertNo()
/* 21:   */   {
/* 22:33 */     return this.certNo;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setCertType(String certType)
/* 26:   */   {
/* 27:37 */     this.certType = certType;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getCertType()
/* 31:   */   {
/* 32:40 */     return this.certType;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMobileStdPublicExpressUserQueryResponse
 * JD-Core Version:    0.7.0.1
 */