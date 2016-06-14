/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayTrustUserStandardVerifyGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3647293198937664276L;
/* 10:   */   @ApiField("verify_info")
/* 11:   */   private String verifyInfo;
/* 12:   */   
/* 13:   */   public void setVerifyInfo(String verifyInfo)
/* 14:   */   {
/* 15:24 */     this.verifyInfo = verifyInfo;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getVerifyInfo()
/* 19:   */   {
/* 20:27 */     return this.verifyInfo;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayTrustUserStandardVerifyGetResponse
 * JD-Core Version:    0.7.0.1
 */