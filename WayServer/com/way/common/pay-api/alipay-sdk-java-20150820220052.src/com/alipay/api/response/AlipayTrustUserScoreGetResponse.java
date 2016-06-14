/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.AliTrustScore;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayTrustUserScoreGetResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 5497818899936638923L;
/* 11:   */   @ApiField("ali_trust_score")
/* 12:   */   private AliTrustScore aliTrustScore;
/* 13:   */   
/* 14:   */   public void setAliTrustScore(AliTrustScore aliTrustScore)
/* 15:   */   {
/* 16:25 */     this.aliTrustScore = aliTrustScore;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public AliTrustScore getAliTrustScore()
/* 20:   */   {
/* 21:28 */     return this.aliTrustScore;
/* 22:   */   }
/* 23:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayTrustUserScoreGetResponse
 * JD-Core Version:    0.7.0.1
 */