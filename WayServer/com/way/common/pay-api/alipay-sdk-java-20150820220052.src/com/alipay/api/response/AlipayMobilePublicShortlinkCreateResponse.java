/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMobilePublicShortlinkCreateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4417393797634361146L;
/* 10:   */   @ApiField("code")
/* 11:   */   private String code;
/* 12:   */   @ApiField("msg")
/* 13:   */   private String msg;
/* 14:   */   @ApiField("shortlink")
/* 15:   */   private String shortlink;
/* 16:   */   
/* 17:   */   public void setCode(String code)
/* 18:   */   {
/* 19:36 */     this.code = code;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getCode()
/* 23:   */   {
/* 24:39 */     return this.code;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setMsg(String msg)
/* 28:   */   {
/* 29:43 */     this.msg = msg;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getMsg()
/* 33:   */   {
/* 34:46 */     return this.msg;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setShortlink(String shortlink)
/* 38:   */   {
/* 39:50 */     this.shortlink = shortlink;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getShortlink()
/* 43:   */   {
/* 44:53 */     return this.shortlink;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMobilePublicShortlinkCreateResponse
 * JD-Core Version:    0.7.0.1
 */