/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.AliTrustRiskIdentify;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayTrustUserRiskidentifyGetResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 8176863535321532978L;
/* 11:   */   @ApiField("ali_trust_risk_identify")
/* 12:   */   private AliTrustRiskIdentify aliTrustRiskIdentify;
/* 13:   */   
/* 14:   */   public void setAliTrustRiskIdentify(AliTrustRiskIdentify aliTrustRiskIdentify)
/* 15:   */   {
/* 16:25 */     this.aliTrustRiskIdentify = aliTrustRiskIdentify;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public AliTrustRiskIdentify getAliTrustRiskIdentify()
/* 20:   */   {
/* 21:28 */     return this.aliTrustRiskIdentify;
/* 22:   */   }
/* 23:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayTrustUserRiskidentifyGetResponse
 * JD-Core Version:    0.7.0.1
 */