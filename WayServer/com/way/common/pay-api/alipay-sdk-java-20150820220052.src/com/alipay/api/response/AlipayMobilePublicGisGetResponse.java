/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayMobilePublicGisGetResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 6321317687359343752L;
/*  10:    */   @ApiField("accuracy")
/*  11:    */   private String accuracy;
/*  12:    */   @ApiField("city")
/*  13:    */   private String city;
/*  14:    */   @ApiField("code")
/*  15:    */   private String code;
/*  16:    */   @ApiField("latitude")
/*  17:    */   private String latitude;
/*  18:    */   @ApiField("longitude")
/*  19:    */   private String longitude;
/*  20:    */   @ApiField("msg")
/*  21:    */   private String msg;
/*  22:    */   @ApiField("province")
/*  23:    */   private String province;
/*  24:    */   
/*  25:    */   public void setAccuracy(String accuracy)
/*  26:    */   {
/*  27: 60 */     this.accuracy = accuracy;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public String getAccuracy()
/*  31:    */   {
/*  32: 63 */     return this.accuracy;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setCity(String city)
/*  36:    */   {
/*  37: 67 */     this.city = city;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getCity()
/*  41:    */   {
/*  42: 70 */     return this.city;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setCode(String code)
/*  46:    */   {
/*  47: 74 */     this.code = code;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getCode()
/*  51:    */   {
/*  52: 77 */     return this.code;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setLatitude(String latitude)
/*  56:    */   {
/*  57: 81 */     this.latitude = latitude;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getLatitude()
/*  61:    */   {
/*  62: 84 */     return this.latitude;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setLongitude(String longitude)
/*  66:    */   {
/*  67: 88 */     this.longitude = longitude;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getLongitude()
/*  71:    */   {
/*  72: 91 */     return this.longitude;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setMsg(String msg)
/*  76:    */   {
/*  77: 95 */     this.msg = msg;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getMsg()
/*  81:    */   {
/*  82: 98 */     return this.msg;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setProvince(String province)
/*  86:    */   {
/*  87:102 */     this.province = province;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getProvince()
/*  91:    */   {
/*  92:105 */     return this.province;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMobilePublicGisGetResponse
 * JD-Core Version:    0.7.0.1
 */