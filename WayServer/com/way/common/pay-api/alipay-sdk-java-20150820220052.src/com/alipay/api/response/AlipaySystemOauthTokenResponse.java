/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipaySystemOauthTokenResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3259715289324196487L;
/* 10:   */   @ApiField("access_token")
/* 11:   */   private String accessToken;
/* 12:   */   @ApiField("alipay_user_id")
/* 13:   */   private String alipayUserId;
/* 14:   */   @ApiField("expires_in")
/* 15:   */   private String expiresIn;
/* 16:   */   @ApiField("re_expires_in")
/* 17:   */   private String reExpiresIn;
/* 18:   */   @ApiField("refresh_token")
/* 19:   */   private String refreshToken;
/* 20:   */   
/* 21:   */   public void setAccessToken(String accessToken)
/* 22:   */   {
/* 23:48 */     this.accessToken = accessToken;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String getAccessToken()
/* 27:   */   {
/* 28:51 */     return this.accessToken;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setAlipayUserId(String alipayUserId)
/* 32:   */   {
/* 33:55 */     this.alipayUserId = alipayUserId;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public String getAlipayUserId()
/* 37:   */   {
/* 38:58 */     return this.alipayUserId;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setExpiresIn(String expiresIn)
/* 42:   */   {
/* 43:62 */     this.expiresIn = expiresIn;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public String getExpiresIn()
/* 47:   */   {
/* 48:65 */     return this.expiresIn;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void setReExpiresIn(String reExpiresIn)
/* 52:   */   {
/* 53:69 */     this.reExpiresIn = reExpiresIn;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public String getReExpiresIn()
/* 57:   */   {
/* 58:72 */     return this.reExpiresIn;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public void setRefreshToken(String refreshToken)
/* 62:   */   {
/* 63:76 */     this.refreshToken = refreshToken;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public String getRefreshToken()
/* 67:   */   {
/* 68:79 */     return this.refreshToken;
/* 69:   */   }
/* 70:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipaySystemOauthTokenResponse
 * JD-Core Version:    0.7.0.1
 */