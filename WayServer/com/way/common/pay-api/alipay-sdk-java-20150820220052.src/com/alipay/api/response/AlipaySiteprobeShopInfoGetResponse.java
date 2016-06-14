/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipaySiteprobeShopInfoGetResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 1372859216625847144L;
/*  10:    */   @ApiField("adv_type")
/*  11:    */   private String advType;
/*  12:    */   @ApiField("code")
/*  13:    */   private String code;
/*  14:    */   @ApiField("logo")
/*  15:    */   private String logo;
/*  16:    */   @ApiField("msg")
/*  17:    */   private String msg;
/*  18:    */   @ApiField("public_name")
/*  19:    */   private String publicName;
/*  20:    */   @ApiField("shop_name")
/*  21:    */   private String shopName;
/*  22:    */   @ApiField("shop_notice")
/*  23:    */   private String shopNotice;
/*  24:    */   @ApiField("third_party_shop_name")
/*  25:    */   private String thirdPartyShopName;
/*  26:    */   @ApiField("url")
/*  27:    */   private String url;
/*  28:    */   
/*  29:    */   public void setAdvType(String advType)
/*  30:    */   {
/*  31: 72 */     this.advType = advType;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public String getAdvType()
/*  35:    */   {
/*  36: 75 */     return this.advType;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void setCode(String code)
/*  40:    */   {
/*  41: 79 */     this.code = code;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public String getCode()
/*  45:    */   {
/*  46: 82 */     return this.code;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setLogo(String logo)
/*  50:    */   {
/*  51: 86 */     this.logo = logo;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public String getLogo()
/*  55:    */   {
/*  56: 89 */     return this.logo;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setMsg(String msg)
/*  60:    */   {
/*  61: 93 */     this.msg = msg;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getMsg()
/*  65:    */   {
/*  66: 96 */     return this.msg;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setPublicName(String publicName)
/*  70:    */   {
/*  71:100 */     this.publicName = publicName;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getPublicName()
/*  75:    */   {
/*  76:103 */     return this.publicName;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setShopName(String shopName)
/*  80:    */   {
/*  81:107 */     this.shopName = shopName;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getShopName()
/*  85:    */   {
/*  86:110 */     return this.shopName;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setShopNotice(String shopNotice)
/*  90:    */   {
/*  91:114 */     this.shopNotice = shopNotice;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getShopNotice()
/*  95:    */   {
/*  96:117 */     return this.shopNotice;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setThirdPartyShopName(String thirdPartyShopName)
/* 100:    */   {
/* 101:121 */     this.thirdPartyShopName = thirdPartyShopName;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getThirdPartyShopName()
/* 105:    */   {
/* 106:124 */     return this.thirdPartyShopName;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setUrl(String url)
/* 110:    */   {
/* 111:128 */     this.url = url;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getUrl()
/* 115:    */   {
/* 116:131 */     return this.url;
/* 117:    */   }
/* 118:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipaySiteprobeShopInfoGetResponse
 * JD-Core Version:    0.7.0.1
 */