/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayPointOrderGetResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayPointOrderGetRequest
/*   9:    */   implements AlipayRequest<AlipayPointOrderGetResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String merchantOrderNo;
/*  14:    */   private String userSymbol;
/*  15:    */   private String userSymbolType;
/*  16:    */   private String terminalType;
/*  17:    */   private String terminalInfo;
/*  18:    */   private String prodCode;
/*  19:    */   private String notifyUrl;
/*  20:    */   
/*  21:    */   public void setMerchantOrderNo(String merchantOrderNo)
/*  22:    */   {
/*  23: 36 */     this.merchantOrderNo = merchantOrderNo;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public String getMerchantOrderNo()
/*  27:    */   {
/*  28: 39 */     return this.merchantOrderNo;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void setUserSymbol(String userSymbol)
/*  32:    */   {
/*  33: 43 */     this.userSymbol = userSymbol;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public String getUserSymbol()
/*  37:    */   {
/*  38: 46 */     return this.userSymbol;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setUserSymbolType(String userSymbolType)
/*  42:    */   {
/*  43: 50 */     this.userSymbolType = userSymbolType;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public String getUserSymbolType()
/*  47:    */   {
/*  48: 53 */     return this.userSymbolType;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getNotifyUrl()
/*  52:    */   {
/*  53: 61 */     return this.notifyUrl;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setNotifyUrl(String notifyUrl)
/*  57:    */   {
/*  58: 65 */     this.notifyUrl = notifyUrl;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getApiVersion()
/*  62:    */   {
/*  63: 69 */     return this.apiVersion;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setApiVersion(String apiVersion)
/*  67:    */   {
/*  68: 73 */     this.apiVersion = apiVersion;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setTerminalType(String terminalType)
/*  72:    */   {
/*  73: 77 */     this.terminalType = terminalType;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getTerminalType()
/*  77:    */   {
/*  78: 81 */     return this.terminalType;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setTerminalInfo(String terminalInfo)
/*  82:    */   {
/*  83: 85 */     this.terminalInfo = terminalInfo;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getTerminalInfo()
/*  87:    */   {
/*  88: 89 */     return this.terminalInfo;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setProdCode(String prodCode)
/*  92:    */   {
/*  93: 93 */     this.prodCode = prodCode;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String getProdCode()
/*  97:    */   {
/*  98: 97 */     return this.prodCode;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getApiMethodName()
/* 102:    */   {
/* 103:101 */     return "alipay.point.order.get";
/* 104:    */   }
/* 105:    */   
/* 106:    */   public Map<String, String> getTextParams()
/* 107:    */   {
/* 108:105 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 109:106 */     txtParams.put("merchant_order_no", this.merchantOrderNo);
/* 110:107 */     txtParams.put("user_symbol", this.userSymbol);
/* 111:108 */     txtParams.put("user_symbol_type", this.userSymbolType);
/* 112:109 */     if (this.udfParams != null) {
/* 113:110 */       txtParams.putAll(this.udfParams);
/* 114:    */     }
/* 115:112 */     return txtParams;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void putOtherTextParam(String key, String value)
/* 119:    */   {
/* 120:116 */     if (this.udfParams == null) {
/* 121:117 */       this.udfParams = new AlipayHashMap();
/* 122:    */     }
/* 123:119 */     this.udfParams.put(key, value);
/* 124:    */   }
/* 125:    */   
/* 126:    */   public Class<AlipayPointOrderGetResponse> getResponseClass()
/* 127:    */   {
/* 128:123 */     return AlipayPointOrderGetResponse.class;
/* 129:    */   }
/* 130:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayPointOrderGetRequest
 * JD-Core Version:    0.7.0.1
 */