/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AssetAccountResult
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8262916639447576537L;
/* 10:   */   @ApiField("alipay_user_id")
/* 11:   */   private String alipayUserId;
/* 12:   */   @ApiField("consumer_id")
/* 13:   */   private String consumerId;
/* 14:   */   @ApiField("provider_id")
/* 15:   */   private String providerId;
/* 16:   */   @ApiField("provider_user_id")
/* 17:   */   private String providerUserId;
/* 18:   */   @ApiField("provider_user_name")
/* 19:   */   private String providerUserName;
/* 20:   */   
/* 21:   */   public String getAlipayUserId()
/* 22:   */   {
/* 23:47 */     return this.alipayUserId;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setAlipayUserId(String alipayUserId)
/* 27:   */   {
/* 28:50 */     this.alipayUserId = alipayUserId;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public String getConsumerId()
/* 32:   */   {
/* 33:54 */     return this.consumerId;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void setConsumerId(String consumerId)
/* 37:   */   {
/* 38:57 */     this.consumerId = consumerId;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getProviderId()
/* 42:   */   {
/* 43:61 */     return this.providerId;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void setProviderId(String providerId)
/* 47:   */   {
/* 48:64 */     this.providerId = providerId;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String getProviderUserId()
/* 52:   */   {
/* 53:68 */     return this.providerUserId;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void setProviderUserId(String providerUserId)
/* 57:   */   {
/* 58:71 */     this.providerUserId = providerUserId;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public String getProviderUserName()
/* 62:   */   {
/* 63:75 */     return this.providerUserName;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void setProviderUserName(String providerUserName)
/* 67:   */   {
/* 68:78 */     this.providerUserName = providerUserName;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.AssetAccountResult
 * JD-Core Version:    0.7.0.1
 */