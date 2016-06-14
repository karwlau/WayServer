/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipaySiteprobeDeviceInfoSearchResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7826699931197431985L;
/* 10:   */   @ApiField("code")
/* 11:   */   private String code;
/* 12:   */   @ApiField("devices")
/* 13:   */   private String devices;
/* 14:   */   @ApiField("msg")
/* 15:   */   private String msg;
/* 16:   */   @ApiField("total")
/* 17:   */   private Long total;
/* 18:   */   
/* 19:   */   public void setCode(String code)
/* 20:   */   {
/* 21:52 */     this.code = code;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public String getCode()
/* 25:   */   {
/* 26:55 */     return this.code;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setDevices(String devices)
/* 30:   */   {
/* 31:59 */     this.devices = devices;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getDevices()
/* 35:   */   {
/* 36:62 */     return this.devices;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setMsg(String msg)
/* 40:   */   {
/* 41:66 */     this.msg = msg;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String getMsg()
/* 45:   */   {
/* 46:69 */     return this.msg;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setTotal(Long total)
/* 50:   */   {
/* 51:73 */     this.total = total;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public Long getTotal()
/* 55:   */   {
/* 56:76 */     return this.total;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipaySiteprobeDeviceInfoSearchResponse
 * JD-Core Version:    0.7.0.1
 */