/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayAppTokenGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3714478588992442352L;
/* 10:   */   @ApiField("app_access_token")
/* 11:   */   private String appAccessToken;
/* 12:   */   @ApiField("expires_in")
/* 13:   */   private Long expiresIn;
/* 14:   */   
/* 15:   */   public void setAppAccessToken(String appAccessToken)
/* 16:   */   {
/* 17:30 */     this.appAccessToken = appAccessToken;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getAppAccessToken()
/* 21:   */   {
/* 22:33 */     return this.appAccessToken;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setExpiresIn(Long expiresIn)
/* 26:   */   {
/* 27:37 */     this.expiresIn = expiresIn;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public Long getExpiresIn()
/* 31:   */   {
/* 32:40 */     return this.expiresIn;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayAppTokenGetResponse
 * JD-Core Version:    0.7.0.1
 */