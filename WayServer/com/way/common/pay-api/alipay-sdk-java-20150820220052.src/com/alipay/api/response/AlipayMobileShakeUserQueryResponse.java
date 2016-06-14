/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMobileShakeUserQueryResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2297729576358191484L;
/* 10:   */   @ApiField("bizdata")
/* 11:   */   private String bizdata;
/* 12:   */   @ApiField("logon_id")
/* 13:   */   private String logonId;
/* 14:   */   @ApiField("pass_id")
/* 15:   */   private String passId;
/* 16:   */   @ApiField("user_id")
/* 17:   */   private String userId;
/* 18:   */   
/* 19:   */   public void setBizdata(String bizdata)
/* 20:   */   {
/* 21:42 */     this.bizdata = bizdata;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public String getBizdata()
/* 25:   */   {
/* 26:45 */     return this.bizdata;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setLogonId(String logonId)
/* 30:   */   {
/* 31:49 */     this.logonId = logonId;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getLogonId()
/* 35:   */   {
/* 36:52 */     return this.logonId;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setPassId(String passId)
/* 40:   */   {
/* 41:56 */     this.passId = passId;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getPassId()
/* 45:   */   {
/* 46:59 */     return this.passId;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setUserId(String userId)
/* 50:   */   {
/* 51:63 */     this.userId = userId;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getUserId()
/* 55:   */   {
/* 56:66 */     return this.userId;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMobileShakeUserQueryResponse
 * JD-Core Version:    0.7.0.1
 */