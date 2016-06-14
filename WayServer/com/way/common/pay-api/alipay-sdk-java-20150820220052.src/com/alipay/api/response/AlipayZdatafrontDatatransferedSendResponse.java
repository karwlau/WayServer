/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayZdatafrontDatatransferedSendResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1299293837254269413L;
/* 10:   */   @ApiField("success")
/* 11:   */   private String success;
/* 12:   */   
/* 13:   */   public void setSuccess(String success)
/* 14:   */   {
/* 15:24 */     this.success = success;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String getSuccess()
/* 19:   */   {
/* 20:27 */     return this.success;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayZdatafrontDatatransferedSendResponse
 * JD-Core Version:    0.7.0.1
 */