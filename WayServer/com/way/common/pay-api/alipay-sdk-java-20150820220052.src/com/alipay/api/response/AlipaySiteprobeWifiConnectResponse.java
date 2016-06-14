/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipaySiteprobeWifiConnectResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7234499233375355864L;
/* 10:   */   @ApiField("code")
/* 11:   */   private String code;
/* 12:   */   @ApiField("msg")
/* 13:   */   private String msg;
/* 14:   */   
/* 15:   */   public void setCode(String code)
/* 16:   */   {
/* 17:30 */     this.code = code;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getCode()
/* 21:   */   {
/* 22:33 */     return this.code;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setMsg(String msg)
/* 26:   */   {
/* 27:37 */     this.msg = msg;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getMsg()
/* 31:   */   {
/* 32:40 */     return this.msg;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipaySiteprobeWifiConnectResponse
 * JD-Core Version:    0.7.0.1
 */