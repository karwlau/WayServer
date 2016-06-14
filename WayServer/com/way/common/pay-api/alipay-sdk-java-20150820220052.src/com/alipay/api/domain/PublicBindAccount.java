/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class PublicBindAccount
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8238557197283339435L;
/* 10:   */   @ApiField("agreement_id")
/* 11:   */   private String agreementId;
/* 12:   */   @ApiField("app_id")
/* 13:   */   private String appId;
/* 14:   */   @ApiField("bind_account_no")
/* 15:   */   private String bindAccountNo;
/* 16:   */   @ApiField("display_name")
/* 17:   */   private String displayName;
/* 18:   */   @ApiField("from_user_id")
/* 19:   */   private String fromUserId;
/* 20:   */   @ApiField("real_name")
/* 21:   */   private String realName;
/* 22:   */   
/* 23:   */   public String getAgreementId()
/* 24:   */   {
/* 25:53 */     return this.agreementId;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setAgreementId(String agreementId)
/* 29:   */   {
/* 30:56 */     this.agreementId = agreementId;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getAppId()
/* 34:   */   {
/* 35:60 */     return this.appId;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setAppId(String appId)
/* 39:   */   {
/* 40:63 */     this.appId = appId;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getBindAccountNo()
/* 44:   */   {
/* 45:67 */     return this.bindAccountNo;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setBindAccountNo(String bindAccountNo)
/* 49:   */   {
/* 50:70 */     this.bindAccountNo = bindAccountNo;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getDisplayName()
/* 54:   */   {
/* 55:74 */     return this.displayName;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setDisplayName(String displayName)
/* 59:   */   {
/* 60:77 */     this.displayName = displayName;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getFromUserId()
/* 64:   */   {
/* 65:81 */     return this.fromUserId;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setFromUserId(String fromUserId)
/* 69:   */   {
/* 70:84 */     this.fromUserId = fromUserId;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getRealName()
/* 74:   */   {
/* 75:88 */     return this.realName;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setRealName(String realName)
/* 79:   */   {
/* 80:91 */     this.realName = realName;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.PublicBindAccount
 * JD-Core Version:    0.7.0.1
 */