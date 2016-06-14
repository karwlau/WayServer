/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.BeaconDeviceInfo;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayMobileBeaconDeviceQueryResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 3791469366488385477L;
/* 11:   */   @ApiField("beacon_device_info")
/* 12:   */   private BeaconDeviceInfo beaconDeviceInfo;
/* 13:   */   @ApiField("code")
/* 14:   */   private String code;
/* 15:   */   @ApiField("msg")
/* 16:   */   private String msg;
/* 17:   */   
/* 18:   */   public void setBeaconDeviceInfo(BeaconDeviceInfo beaconDeviceInfo)
/* 19:   */   {
/* 20:37 */     this.beaconDeviceInfo = beaconDeviceInfo;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public BeaconDeviceInfo getBeaconDeviceInfo()
/* 24:   */   {
/* 25:40 */     return this.beaconDeviceInfo;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setCode(String code)
/* 29:   */   {
/* 30:44 */     this.code = code;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getCode()
/* 34:   */   {
/* 35:47 */     return this.code;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setMsg(String msg)
/* 39:   */   {
/* 40:51 */     this.msg = msg;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getMsg()
/* 44:   */   {
/* 45:54 */     return this.msg;
/* 46:   */   }
/* 47:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMobileBeaconDeviceQueryResponse
 * JD-Core Version:    0.7.0.1
 */