/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayExscUserCurrentsignGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 3646878542265133528L;
/* 10:   */   @ApiField("biz_type")
/* 11:   */   private String bizType;
/* 12:   */   @ApiField("success")
/* 13:   */   private Boolean success;
/* 14:   */   
/* 15:   */   public void setBizType(String bizType)
/* 16:   */   {
/* 17:32 */     this.bizType = bizType;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getBizType()
/* 21:   */   {
/* 22:35 */     return this.bizType;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setSuccess(Boolean success)
/* 26:   */   {
/* 27:39 */     this.success = success;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public Boolean getSuccess()
/* 31:   */   {
/* 32:42 */     return this.success;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayExscUserCurrentsignGetResponse
 * JD-Core Version:    0.7.0.1
 */