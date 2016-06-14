/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMobilePublicQrcodeCreateResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1262182286847818194L;
/* 10:   */   @ApiField("code")
/* 11:   */   private String code;
/* 12:   */   @ApiField("code_img")
/* 13:   */   private String codeImg;
/* 14:   */   @ApiField("expire_second")
/* 15:   */   private Long expireSecond;
/* 16:   */   @ApiField("msg")
/* 17:   */   private String msg;
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
/* 29:   */   public void setCodeImg(String codeImg)
/* 30:   */   {
/* 31:49 */     this.codeImg = codeImg;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getCodeImg()
/* 35:   */   {
/* 36:52 */     return this.codeImg;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setExpireSecond(Long expireSecond)
/* 40:   */   {
/* 41:56 */     this.expireSecond = expireSecond;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public Long getExpireSecond()
/* 45:   */   {
/* 46:59 */     return this.expireSecond;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setMsg(String msg)
/* 50:   */   {
/* 51:63 */     this.msg = msg;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getMsg()
/* 55:   */   {
/* 56:66 */     return this.msg;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMobilePublicQrcodeCreateResponse
 * JD-Core Version:    0.7.0.1
 */