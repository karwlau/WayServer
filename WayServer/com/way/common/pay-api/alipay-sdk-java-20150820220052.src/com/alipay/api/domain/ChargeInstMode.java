/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ChargeInstMode
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7571836635766666332L;
/* 10:   */   @ApiField("charge_inst")
/* 11:   */   private String chargeInst;
/* 12:   */   @ApiField("charge_inst_name")
/* 13:   */   private String chargeInstName;
/* 14:   */   @ApiField("city")
/* 15:   */   private String city;
/* 16:   */   @ApiField("province")
/* 17:   */   private String province;
/* 18:   */   
/* 19:   */   public String getChargeInst()
/* 20:   */   {
/* 21:41 */     return this.chargeInst;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setChargeInst(String chargeInst)
/* 25:   */   {
/* 26:44 */     this.chargeInst = chargeInst;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getChargeInstName()
/* 30:   */   {
/* 31:48 */     return this.chargeInstName;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setChargeInstName(String chargeInstName)
/* 35:   */   {
/* 36:51 */     this.chargeInstName = chargeInstName;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getCity()
/* 40:   */   {
/* 41:55 */     return this.city;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setCity(String city)
/* 45:   */   {
/* 46:58 */     this.city = city;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getProvince()
/* 50:   */   {
/* 51:62 */     return this.province;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setProvince(String province)
/* 55:   */   {
/* 56:65 */     this.province = province;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.ChargeInstMode
 * JD-Core Version:    0.7.0.1
 */