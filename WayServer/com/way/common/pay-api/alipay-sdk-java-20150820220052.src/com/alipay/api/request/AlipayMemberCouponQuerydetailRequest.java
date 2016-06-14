/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayMemberCouponQuerydetailResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayMemberCouponQuerydetailRequest
/*   9:    */   implements AlipayRequest<AlipayMemberCouponQuerydetailResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String couponNo;
/*  14:    */   private String merchantInfo;
/*  15:    */   private String userInfo;
/*  16:    */   private String terminalType;
/*  17:    */   private String terminalInfo;
/*  18:    */   private String prodCode;
/*  19:    */   private String notifyUrl;
/*  20:    */   
/*  21:    */   public void setCouponNo(String couponNo)
/*  22:    */   {
/*  23: 45 */     this.couponNo = couponNo;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public String getCouponNo()
/*  27:    */   {
/*  28: 48 */     return this.couponNo;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void setMerchantInfo(String merchantInfo)
/*  32:    */   {
/*  33: 52 */     this.merchantInfo = merchantInfo;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public String getMerchantInfo()
/*  37:    */   {
/*  38: 55 */     return this.merchantInfo;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setUserInfo(String userInfo)
/*  42:    */   {
/*  43: 59 */     this.userInfo = userInfo;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public String getUserInfo()
/*  47:    */   {
/*  48: 62 */     return this.userInfo;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getNotifyUrl()
/*  52:    */   {
/*  53: 70 */     return this.notifyUrl;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setNotifyUrl(String notifyUrl)
/*  57:    */   {
/*  58: 74 */     this.notifyUrl = notifyUrl;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getApiVersion()
/*  62:    */   {
/*  63: 78 */     return this.apiVersion;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setApiVersion(String apiVersion)
/*  67:    */   {
/*  68: 82 */     this.apiVersion = apiVersion;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setTerminalType(String terminalType)
/*  72:    */   {
/*  73: 86 */     this.terminalType = terminalType;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getTerminalType()
/*  77:    */   {
/*  78: 90 */     return this.terminalType;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setTerminalInfo(String terminalInfo)
/*  82:    */   {
/*  83: 94 */     this.terminalInfo = terminalInfo;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getTerminalInfo()
/*  87:    */   {
/*  88: 98 */     return this.terminalInfo;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setProdCode(String prodCode)
/*  92:    */   {
/*  93:102 */     this.prodCode = prodCode;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String getProdCode()
/*  97:    */   {
/*  98:106 */     return this.prodCode;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getApiMethodName()
/* 102:    */   {
/* 103:110 */     return "alipay.member.coupon.querydetail";
/* 104:    */   }
/* 105:    */   
/* 106:    */   public Map<String, String> getTextParams()
/* 107:    */   {
/* 108:114 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 109:115 */     txtParams.put("coupon_no", this.couponNo);
/* 110:116 */     txtParams.put("merchant_info", this.merchantInfo);
/* 111:117 */     txtParams.put("user_info", this.userInfo);
/* 112:118 */     if (this.udfParams != null) {
/* 113:119 */       txtParams.putAll(this.udfParams);
/* 114:    */     }
/* 115:121 */     return txtParams;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void putOtherTextParam(String key, String value)
/* 119:    */   {
/* 120:125 */     if (this.udfParams == null) {
/* 121:126 */       this.udfParams = new AlipayHashMap();
/* 122:    */     }
/* 123:128 */     this.udfParams.put(key, value);
/* 124:    */   }
/* 125:    */   
/* 126:    */   public Class<AlipayMemberCouponQuerydetailResponse> getResponseClass()
/* 127:    */   {
/* 128:132 */     return AlipayMemberCouponQuerydetailResponse.class;
/* 129:    */   }
/* 130:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayMemberCouponQuerydetailRequest
 * JD-Core Version:    0.7.0.1
 */