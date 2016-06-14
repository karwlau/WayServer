/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipaySiteprobeDeviceInfoGetResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 4386948296447114434L;
/*  10:    */   @ApiField("auth_id")
/*  11:    */   private String authId;
/*  12:    */   @ApiField("auth_type")
/*  13:    */   private String authType;
/*  14:    */   @ApiField("bssid")
/*  15:    */   private String bssid;
/*  16:    */   @ApiField("code")
/*  17:    */   private String code;
/*  18:    */   @ApiField("latitude")
/*  19:    */   private String latitude;
/*  20:    */   @ApiField("longitude")
/*  21:    */   private String longitude;
/*  22:    */   @ApiField("msg")
/*  23:    */   private String msg;
/*  24:    */   @ApiField("password")
/*  25:    */   private String password;
/*  26:    */   @ApiField("shop_id")
/*  27:    */   private String shopId;
/*  28:    */   @ApiField("ssid")
/*  29:    */   private String ssid;
/*  30:    */   @ApiField("status")
/*  31:    */   private String status;
/*  32:    */   
/*  33:    */   public void setAuthId(String authId)
/*  34:    */   {
/*  35: 84 */     this.authId = authId;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getAuthId()
/*  39:    */   {
/*  40: 87 */     return this.authId;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setAuthType(String authType)
/*  44:    */   {
/*  45: 91 */     this.authType = authType;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getAuthType()
/*  49:    */   {
/*  50: 94 */     return this.authType;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setBssid(String bssid)
/*  54:    */   {
/*  55: 98 */     this.bssid = bssid;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getBssid()
/*  59:    */   {
/*  60:101 */     return this.bssid;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setCode(String code)
/*  64:    */   {
/*  65:105 */     this.code = code;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getCode()
/*  69:    */   {
/*  70:108 */     return this.code;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setLatitude(String latitude)
/*  74:    */   {
/*  75:112 */     this.latitude = latitude;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getLatitude()
/*  79:    */   {
/*  80:115 */     return this.latitude;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setLongitude(String longitude)
/*  84:    */   {
/*  85:119 */     this.longitude = longitude;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getLongitude()
/*  89:    */   {
/*  90:122 */     return this.longitude;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setMsg(String msg)
/*  94:    */   {
/*  95:126 */     this.msg = msg;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getMsg()
/*  99:    */   {
/* 100:129 */     return this.msg;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setPassword(String password)
/* 104:    */   {
/* 105:133 */     this.password = password;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public String getPassword()
/* 109:    */   {
/* 110:136 */     return this.password;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setShopId(String shopId)
/* 114:    */   {
/* 115:140 */     this.shopId = shopId;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getShopId()
/* 119:    */   {
/* 120:143 */     return this.shopId;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void setSsid(String ssid)
/* 124:    */   {
/* 125:147 */     this.ssid = ssid;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public String getSsid()
/* 129:    */   {
/* 130:150 */     return this.ssid;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void setStatus(String status)
/* 134:    */   {
/* 135:154 */     this.status = status;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public String getStatus()
/* 139:    */   {
/* 140:157 */     return this.status;
/* 141:    */   }
/* 142:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipaySiteprobeDeviceInfoGetResponse
 * JD-Core Version:    0.7.0.1
 */