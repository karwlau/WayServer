/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMobileBksigntokenVerifyResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 6656456662253265917L;
/* 10:   */   @ApiField("createtimestamp")
/* 11:   */   private String createtimestamp;
/* 12:   */   @ApiField("loginid")
/* 13:   */   private String loginid;
/* 14:   */   @ApiField("memo")
/* 15:   */   private String memo;
/* 16:   */   @ApiField("resultcode")
/* 17:   */   private Long resultcode;
/* 18:   */   @ApiField("success")
/* 19:   */   private Boolean success;
/* 20:   */   @ApiField("userid")
/* 21:   */   private String userid;
/* 22:   */   
/* 23:   */   public void setCreatetimestamp(String createtimestamp)
/* 24:   */   {
/* 25:54 */     this.createtimestamp = createtimestamp;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String getCreatetimestamp()
/* 29:   */   {
/* 30:57 */     return this.createtimestamp;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setLoginid(String loginid)
/* 34:   */   {
/* 35:61 */     this.loginid = loginid;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public String getLoginid()
/* 39:   */   {
/* 40:64 */     return this.loginid;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void setMemo(String memo)
/* 44:   */   {
/* 45:68 */     this.memo = memo;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public String getMemo()
/* 49:   */   {
/* 50:71 */     return this.memo;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void setResultcode(Long resultcode)
/* 54:   */   {
/* 55:75 */     this.resultcode = resultcode;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public Long getResultcode()
/* 59:   */   {
/* 60:78 */     return this.resultcode;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public void setSuccess(Boolean success)
/* 64:   */   {
/* 65:82 */     this.success = success;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public Boolean getSuccess()
/* 69:   */   {
/* 70:85 */     return this.success;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public void setUserid(String userid)
/* 74:   */   {
/* 75:89 */     this.userid = userid;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public String getUserid()
/* 79:   */   {
/* 80:92 */     return this.userid;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMobileBksigntokenVerifyResponse
 * JD-Core Version:    0.7.0.1
 */