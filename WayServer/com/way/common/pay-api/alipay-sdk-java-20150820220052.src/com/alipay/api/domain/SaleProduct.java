/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class SaleProduct
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 8616574256596712416L;
/* 10:   */   @ApiField("channel_type")
/* 11:   */   private String channelType;
/* 12:   */   @ApiField("id")
/* 13:   */   private String id;
/* 14:   */   @ApiField("market_price")
/* 15:   */   private String marketPrice;
/* 16:   */   @ApiField("product_provider")
/* 17:   */   private ProductProvider productProvider;
/* 18:   */   @ApiField("sale_price")
/* 19:   */   private String salePrice;
/* 20:   */   @ApiField("status")
/* 21:   */   private String status;
/* 22:   */   
/* 23:   */   public String getChannelType()
/* 24:   */   {
/* 25:53 */     return this.channelType;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setChannelType(String channelType)
/* 29:   */   {
/* 30:56 */     this.channelType = channelType;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public String getId()
/* 34:   */   {
/* 35:60 */     return this.id;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setId(String id)
/* 39:   */   {
/* 40:63 */     this.id = id;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getMarketPrice()
/* 44:   */   {
/* 45:67 */     return this.marketPrice;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setMarketPrice(String marketPrice)
/* 49:   */   {
/* 50:70 */     this.marketPrice = marketPrice;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public ProductProvider getProductProvider()
/* 54:   */   {
/* 55:74 */     return this.productProvider;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setProductProvider(ProductProvider productProvider)
/* 59:   */   {
/* 60:77 */     this.productProvider = productProvider;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String getSalePrice()
/* 64:   */   {
/* 65:81 */     return this.salePrice;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setSalePrice(String salePrice)
/* 69:   */   {
/* 70:84 */     this.salePrice = salePrice;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getStatus()
/* 74:   */   {
/* 75:88 */     return this.status;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setStatus(String status)
/* 79:   */   {
/* 80:91 */     this.status = status;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.SaleProduct
 * JD-Core Version:    0.7.0.1
 */