/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.PublicBindAccount;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayMobilePublicAccountQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 2245235654991128614L;
/* 13:   */   @ApiField("code")
/* 14:   */   private String code;
/* 15:   */   @ApiField("msg")
/* 16:   */   private String msg;
/* 17:   */   @ApiListField("public_bind_accounts")
/* 18:   */   @ApiField("public_bind_account")
/* 19:   */   private List<PublicBindAccount> publicBindAccounts;
/* 20:   */   
/* 21:   */   public void setCode(String code)
/* 22:   */   {
/* 23:40 */     this.code = code;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String getCode()
/* 27:   */   {
/* 28:43 */     return this.code;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setMsg(String msg)
/* 32:   */   {
/* 33:47 */     this.msg = msg;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public String getMsg()
/* 37:   */   {
/* 38:50 */     return this.msg;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setPublicBindAccounts(List<PublicBindAccount> publicBindAccounts)
/* 42:   */   {
/* 43:54 */     this.publicBindAccounts = publicBindAccounts;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public List<PublicBindAccount> getPublicBindAccounts()
/* 47:   */   {
/* 48:57 */     return this.publicBindAccounts;
/* 49:   */   }
/* 50:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMobilePublicAccountQueryResponse
 * JD-Core Version:    0.7.0.1
 */