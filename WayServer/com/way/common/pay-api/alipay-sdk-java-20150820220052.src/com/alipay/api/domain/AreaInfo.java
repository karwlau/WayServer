/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AreaInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7121367495826444423L;
/* 10:   */   @ApiField("city")
/* 11:   */   private String city;
/* 12:   */   @ApiField("province")
/* 13:   */   private String province;
/* 14:   */   
/* 15:   */   public String getCity()
/* 16:   */   {
/* 17:29 */     return this.city;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setCity(String city)
/* 21:   */   {
/* 22:32 */     this.city = city;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getProvince()
/* 26:   */   {
/* 27:36 */     return this.province;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setProvince(String province)
/* 31:   */   {
/* 32:39 */     this.province = province;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.AreaInfo
 * JD-Core Version:    0.7.0.1
 */