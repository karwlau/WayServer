/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayAssetAccountBindResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 5717573929223914132L;
/* 10:   */   @ApiField("alipay_user_id")
/* 11:   */   private String alipayUserId;
/* 12:   */   @ApiField("provider_id")
/* 13:   */   private String providerId;
/* 14:   */   @ApiField("provider_user_id")
/* 15:   */   private String providerUserId;
/* 16:   */   @ApiField("provider_user_name")
/* 17:   */   private String providerUserName;
/* 18:   */   
/* 19:   */   public void setAlipayUserId(String alipayUserId)
/* 20:   */   {
/* 21:42 */     this.alipayUserId = alipayUserId;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public String getAlipayUserId()
/* 25:   */   {
/* 26:45 */     return this.alipayUserId;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setProviderId(String providerId)
/* 30:   */   {
/* 31:49 */     this.providerId = providerId;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getProviderId()
/* 35:   */   {
/* 36:52 */     return this.providerId;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setProviderUserId(String providerUserId)
/* 40:   */   {
/* 41:56 */     this.providerUserId = providerUserId;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getProviderUserId()
/* 45:   */   {
/* 46:59 */     return this.providerUserId;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setProviderUserName(String providerUserName)
/* 50:   */   {
/* 51:63 */     this.providerUserName = providerUserName;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getProviderUserName()
/* 55:   */   {
/* 56:66 */     return this.providerUserName;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayAssetAccountBindResponse
 * JD-Core Version:    0.7.0.1
 */