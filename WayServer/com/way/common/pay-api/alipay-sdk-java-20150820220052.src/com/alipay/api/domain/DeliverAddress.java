/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class DeliverAddress
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 2574214925567172563L;
/*  10:    */   @ApiField("address")
/*  11:    */   private String address;
/*  12:    */   @ApiField("address_code")
/*  13:    */   private String addressCode;
/*  14:    */   @ApiField("default_deliver_address")
/*  15:    */   private String defaultDeliverAddress;
/*  16:    */   @ApiField("deliver_area")
/*  17:    */   private String deliverArea;
/*  18:    */   @ApiField("deliver_city")
/*  19:    */   private String deliverCity;
/*  20:    */   @ApiField("deliver_fullname")
/*  21:    */   private String deliverFullname;
/*  22:    */   @ApiField("deliver_mobile")
/*  23:    */   private String deliverMobile;
/*  24:    */   @ApiField("deliver_phone")
/*  25:    */   private String deliverPhone;
/*  26:    */   @ApiField("deliver_province")
/*  27:    */   private String deliverProvince;
/*  28:    */   @ApiField("zip")
/*  29:    */   private String zip;
/*  30:    */   
/*  31:    */   public String getAddress()
/*  32:    */   {
/*  33: 77 */     return this.address;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setAddress(String address)
/*  37:    */   {
/*  38: 80 */     this.address = address;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getAddressCode()
/*  42:    */   {
/*  43: 84 */     return this.addressCode;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setAddressCode(String addressCode)
/*  47:    */   {
/*  48: 87 */     this.addressCode = addressCode;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getDefaultDeliverAddress()
/*  52:    */   {
/*  53: 91 */     return this.defaultDeliverAddress;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setDefaultDeliverAddress(String defaultDeliverAddress)
/*  57:    */   {
/*  58: 94 */     this.defaultDeliverAddress = defaultDeliverAddress;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getDeliverArea()
/*  62:    */   {
/*  63: 98 */     return this.deliverArea;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setDeliverArea(String deliverArea)
/*  67:    */   {
/*  68:101 */     this.deliverArea = deliverArea;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getDeliverCity()
/*  72:    */   {
/*  73:105 */     return this.deliverCity;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setDeliverCity(String deliverCity)
/*  77:    */   {
/*  78:108 */     this.deliverCity = deliverCity;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getDeliverFullname()
/*  82:    */   {
/*  83:112 */     return this.deliverFullname;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setDeliverFullname(String deliverFullname)
/*  87:    */   {
/*  88:115 */     this.deliverFullname = deliverFullname;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getDeliverMobile()
/*  92:    */   {
/*  93:119 */     return this.deliverMobile;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setDeliverMobile(String deliverMobile)
/*  97:    */   {
/*  98:122 */     this.deliverMobile = deliverMobile;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getDeliverPhone()
/* 102:    */   {
/* 103:126 */     return this.deliverPhone;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setDeliverPhone(String deliverPhone)
/* 107:    */   {
/* 108:129 */     this.deliverPhone = deliverPhone;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getDeliverProvince()
/* 112:    */   {
/* 113:133 */     return this.deliverProvince;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setDeliverProvince(String deliverProvince)
/* 117:    */   {
/* 118:136 */     this.deliverProvince = deliverProvince;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getZip()
/* 122:    */   {
/* 123:140 */     return this.zip;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setZip(String zip)
/* 127:    */   {
/* 128:143 */     this.zip = zip;
/* 129:    */   }
/* 130:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.DeliverAddress
 * JD-Core Version:    0.7.0.1
 */