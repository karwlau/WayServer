/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class MerchantInstConfig
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8625991182252997692L;
/* 10:   */   @ApiField("en_name")
/* 11:   */   private String enName;
/* 12:   */   @ApiField("order_type")
/* 13:   */   private String orderType;
/* 14:   */   @ApiField("scene")
/* 15:   */   private String scene;
/* 16:   */   @ApiField("zh_name")
/* 17:   */   private String zhName;
/* 18:   */   
/* 19:   */   public String getEnName()
/* 20:   */   {
/* 21:41 */     return this.enName;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void setEnName(String enName)
/* 25:   */   {
/* 26:44 */     this.enName = enName;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String getOrderType()
/* 30:   */   {
/* 31:48 */     return this.orderType;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void setOrderType(String orderType)
/* 35:   */   {
/* 36:51 */     this.orderType = orderType;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public String getScene()
/* 40:   */   {
/* 41:55 */     return this.scene;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void setScene(String scene)
/* 45:   */   {
/* 46:58 */     this.scene = scene;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public String getZhName()
/* 50:   */   {
/* 51:62 */     return this.zhName;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void setZhName(String zhName)
/* 55:   */   {
/* 56:65 */     this.zhName = zhName;
/* 57:   */   }
/* 58:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.MerchantInstConfig
 * JD-Core Version:    0.7.0.1
 */