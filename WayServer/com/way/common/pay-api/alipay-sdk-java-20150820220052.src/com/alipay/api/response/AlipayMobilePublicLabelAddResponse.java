/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMobilePublicLabelAddResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1184411221871697987L;
/* 10:   */   @ApiField("code")
/* 11:   */   private String code;
/* 12:   */   @ApiField("id")
/* 13:   */   private Long id;
/* 14:   */   @ApiField("msg")
/* 15:   */   private String msg;
/* 16:   */   @ApiField("name")
/* 17:   */   private String name;
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
/* 29:   */   public void setId(Long id)
/* 30:   */   {
/* 31:49 */     this.id = id;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public Long getId()
/* 35:   */   {
/* 36:52 */     return this.id;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setMsg(String msg)
/* 40:   */   {
/* 41:56 */     this.msg = msg;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getMsg()
/* 45:   */   {
/* 46:59 */     return this.msg;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setName(String name)
/* 50:   */   {
/* 51:63 */     this.name = name;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getName()
/* 55:   */   {
/* 56:66 */     return this.name;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMobilePublicLabelAddResponse
 * JD-Core Version:    0.7.0.1
 */