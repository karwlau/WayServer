/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayEbppBillPayurlGetResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayEbppBillPayurlGetRequest
/*   9:    */   implements AlipayRequest<AlipayEbppBillPayurlGetResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String alipayOrderNo;
/*  14:    */   private String callbackUrl;
/*  15:    */   private String merchantOrderNo;
/*  16:    */   private String orderType;
/*  17:    */   private String terminalType;
/*  18:    */   private String terminalInfo;
/*  19:    */   private String prodCode;
/*  20:    */   private String notifyUrl;
/*  21:    */   
/*  22:    */   public void setAlipayOrderNo(String alipayOrderNo)
/*  23:    */   {
/*  24: 41 */     this.alipayOrderNo = alipayOrderNo;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public String getAlipayOrderNo()
/*  28:    */   {
/*  29: 44 */     return this.alipayOrderNo;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setCallbackUrl(String callbackUrl)
/*  33:    */   {
/*  34: 48 */     this.callbackUrl = callbackUrl;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getCallbackUrl()
/*  38:    */   {
/*  39: 51 */     return this.callbackUrl;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setMerchantOrderNo(String merchantOrderNo)
/*  43:    */   {
/*  44: 55 */     this.merchantOrderNo = merchantOrderNo;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getMerchantOrderNo()
/*  48:    */   {
/*  49: 58 */     return this.merchantOrderNo;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setOrderType(String orderType)
/*  53:    */   {
/*  54: 62 */     this.orderType = orderType;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getOrderType()
/*  58:    */   {
/*  59: 65 */     return this.orderType;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getNotifyUrl()
/*  63:    */   {
/*  64: 73 */     return this.notifyUrl;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setNotifyUrl(String notifyUrl)
/*  68:    */   {
/*  69: 77 */     this.notifyUrl = notifyUrl;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getApiVersion()
/*  73:    */   {
/*  74: 81 */     return this.apiVersion;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setApiVersion(String apiVersion)
/*  78:    */   {
/*  79: 85 */     this.apiVersion = apiVersion;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setTerminalType(String terminalType)
/*  83:    */   {
/*  84: 89 */     this.terminalType = terminalType;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getTerminalType()
/*  88:    */   {
/*  89: 93 */     return this.terminalType;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setTerminalInfo(String terminalInfo)
/*  93:    */   {
/*  94: 97 */     this.terminalInfo = terminalInfo;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getTerminalInfo()
/*  98:    */   {
/*  99:101 */     return this.terminalInfo;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setProdCode(String prodCode)
/* 103:    */   {
/* 104:105 */     this.prodCode = prodCode;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getProdCode()
/* 108:    */   {
/* 109:109 */     return this.prodCode;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getApiMethodName()
/* 113:    */   {
/* 114:113 */     return "alipay.ebpp.bill.payurl.get";
/* 115:    */   }
/* 116:    */   
/* 117:    */   public Map<String, String> getTextParams()
/* 118:    */   {
/* 119:117 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 120:118 */     txtParams.put("alipay_order_no", this.alipayOrderNo);
/* 121:119 */     txtParams.put("callback_url", this.callbackUrl);
/* 122:120 */     txtParams.put("merchant_order_no", this.merchantOrderNo);
/* 123:121 */     txtParams.put("order_type", this.orderType);
/* 124:122 */     if (this.udfParams != null) {
/* 125:123 */       txtParams.putAll(this.udfParams);
/* 126:    */     }
/* 127:125 */     return txtParams;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void putOtherTextParam(String key, String value)
/* 131:    */   {
/* 132:129 */     if (this.udfParams == null) {
/* 133:130 */       this.udfParams = new AlipayHashMap();
/* 134:    */     }
/* 135:132 */     this.udfParams.put(key, value);
/* 136:    */   }
/* 137:    */   
/* 138:    */   public Class<AlipayEbppBillPayurlGetResponse> getResponseClass()
/* 139:    */   {
/* 140:136 */     return AlipayEbppBillPayurlGetResponse.class;
/* 141:    */   }
/* 142:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayEbppBillPayurlGetRequest
 * JD-Core Version:    0.7.0.1
 */