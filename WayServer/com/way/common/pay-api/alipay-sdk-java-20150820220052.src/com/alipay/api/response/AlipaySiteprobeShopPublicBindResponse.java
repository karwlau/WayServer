/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipaySiteprobeShopPublicBindResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7686964257522352678L;
/* 10:   */   @ApiField("code")
/* 11:   */   private String code;
/* 12:   */   @ApiField("msg")
/* 13:   */   private String msg;
/* 14:   */   @ApiField("public_logo")
/* 15:   */   private String publicLogo;
/* 16:   */   @ApiField("public_name")
/* 17:   */   private String publicName;
/* 18:   */   
/* 19:   */   public void setCode(String code)
/* 20:   */   {
/* 21:42 */     this.code = code;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public String getCode()
/* 25:   */   {
/* 26:45 */     return this.code;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setMsg(String msg)
/* 30:   */   {
/* 31:49 */     this.msg = msg;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getMsg()
/* 35:   */   {
/* 36:52 */     return this.msg;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setPublicLogo(String publicLogo)
/* 40:   */   {
/* 41:56 */     this.publicLogo = publicLogo;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getPublicLogo()
/* 45:   */   {
/* 46:59 */     return this.publicLogo;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setPublicName(String publicName)
/* 50:   */   {
/* 51:63 */     this.publicName = publicName;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getPublicName()
/* 55:   */   {
/* 56:66 */     return this.publicName;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipaySiteprobeShopPublicBindResponse
 * JD-Core Version:    0.7.0.1
 */