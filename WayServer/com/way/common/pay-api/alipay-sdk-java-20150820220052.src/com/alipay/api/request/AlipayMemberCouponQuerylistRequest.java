/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayMemberCouponQuerylistResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayMemberCouponQuerylistRequest
/*   9:    */   implements AlipayRequest<AlipayMemberCouponQuerylistResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String merchantInfo;
/*  14:    */   private String pageNo;
/*  15:    */   private String pageSize;
/*  16:    */   private String status;
/*  17:    */   private String userInfo;
/*  18:    */   private String terminalType;
/*  19:    */   private String terminalInfo;
/*  20:    */   private String prodCode;
/*  21:    */   private String notifyUrl;
/*  22:    */   
/*  23:    */   public void setMerchantInfo(String merchantInfo)
/*  24:    */   {
/*  25: 62 */     this.merchantInfo = merchantInfo;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public String getMerchantInfo()
/*  29:    */   {
/*  30: 65 */     return this.merchantInfo;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setPageNo(String pageNo)
/*  34:    */   {
/*  35: 69 */     this.pageNo = pageNo;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getPageNo()
/*  39:    */   {
/*  40: 72 */     return this.pageNo;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setPageSize(String pageSize)
/*  44:    */   {
/*  45: 76 */     this.pageSize = pageSize;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getPageSize()
/*  49:    */   {
/*  50: 79 */     return this.pageSize;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setStatus(String status)
/*  54:    */   {
/*  55: 83 */     this.status = status;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getStatus()
/*  59:    */   {
/*  60: 86 */     return this.status;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setUserInfo(String userInfo)
/*  64:    */   {
/*  65: 90 */     this.userInfo = userInfo;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getUserInfo()
/*  69:    */   {
/*  70: 93 */     return this.userInfo;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getNotifyUrl()
/*  74:    */   {
/*  75:101 */     return this.notifyUrl;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setNotifyUrl(String notifyUrl)
/*  79:    */   {
/*  80:105 */     this.notifyUrl = notifyUrl;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public String getApiVersion()
/*  84:    */   {
/*  85:109 */     return this.apiVersion;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setApiVersion(String apiVersion)
/*  89:    */   {
/*  90:113 */     this.apiVersion = apiVersion;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setTerminalType(String terminalType)
/*  94:    */   {
/*  95:117 */     this.terminalType = terminalType;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getTerminalType()
/*  99:    */   {
/* 100:121 */     return this.terminalType;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setTerminalInfo(String terminalInfo)
/* 104:    */   {
/* 105:125 */     this.terminalInfo = terminalInfo;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public String getTerminalInfo()
/* 109:    */   {
/* 110:129 */     return this.terminalInfo;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setProdCode(String prodCode)
/* 114:    */   {
/* 115:133 */     this.prodCode = prodCode;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getProdCode()
/* 119:    */   {
/* 120:137 */     return this.prodCode;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getApiMethodName()
/* 124:    */   {
/* 125:141 */     return "alipay.member.coupon.querylist";
/* 126:    */   }
/* 127:    */   
/* 128:    */   public Map<String, String> getTextParams()
/* 129:    */   {
/* 130:145 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 131:146 */     txtParams.put("merchant_info", this.merchantInfo);
/* 132:147 */     txtParams.put("page_no", this.pageNo);
/* 133:148 */     txtParams.put("page_size", this.pageSize);
/* 134:149 */     txtParams.put("status", this.status);
/* 135:150 */     txtParams.put("user_info", this.userInfo);
/* 136:151 */     if (this.udfParams != null) {
/* 137:152 */       txtParams.putAll(this.udfParams);
/* 138:    */     }
/* 139:154 */     return txtParams;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void putOtherTextParam(String key, String value)
/* 143:    */   {
/* 144:158 */     if (this.udfParams == null) {
/* 145:159 */       this.udfParams = new AlipayHashMap();
/* 146:    */     }
/* 147:161 */     this.udfParams.put(key, value);
/* 148:    */   }
/* 149:    */   
/* 150:    */   public Class<AlipayMemberCouponQuerylistResponse> getResponseClass()
/* 151:    */   {
/* 152:165 */     return AlipayMemberCouponQuerylistResponse.class;
/* 153:    */   }
/* 154:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayMemberCouponQuerylistRequest
 * JD-Core Version:    0.7.0.1
 */