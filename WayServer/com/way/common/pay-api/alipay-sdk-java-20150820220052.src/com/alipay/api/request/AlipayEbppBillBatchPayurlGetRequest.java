/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayEbppBillBatchPayurlGetResponse;
/*   6:    */ import java.util.List;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayEbppBillBatchPayurlGetRequest
/*  10:    */   implements AlipayRequest<AlipayEbppBillBatchPayurlGetResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String callbackUrl;
/*  15:    */   private String orderType;
/*  16:    */   private List<String> payBillList;
/*  17:    */   private String terminalType;
/*  18:    */   private String terminalInfo;
/*  19:    */   private String prodCode;
/*  20:    */   private String notifyUrl;
/*  21:    */   
/*  22:    */   public void setCallbackUrl(String callbackUrl)
/*  23:    */   {
/*  24: 37 */     this.callbackUrl = callbackUrl;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public String getCallbackUrl()
/*  28:    */   {
/*  29: 40 */     return this.callbackUrl;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setOrderType(String orderType)
/*  33:    */   {
/*  34: 44 */     this.orderType = orderType;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getOrderType()
/*  38:    */   {
/*  39: 47 */     return this.orderType;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setPayBillList(List<String> payBillList)
/*  43:    */   {
/*  44: 51 */     this.payBillList = payBillList;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public List<String> getPayBillList()
/*  48:    */   {
/*  49: 54 */     return this.payBillList;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String getNotifyUrl()
/*  53:    */   {
/*  54: 62 */     return this.notifyUrl;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setNotifyUrl(String notifyUrl)
/*  58:    */   {
/*  59: 66 */     this.notifyUrl = notifyUrl;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getApiVersion()
/*  63:    */   {
/*  64: 70 */     return this.apiVersion;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setApiVersion(String apiVersion)
/*  68:    */   {
/*  69: 74 */     this.apiVersion = apiVersion;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setTerminalType(String terminalType)
/*  73:    */   {
/*  74: 78 */     this.terminalType = terminalType;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getTerminalType()
/*  78:    */   {
/*  79: 82 */     return this.terminalType;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setTerminalInfo(String terminalInfo)
/*  83:    */   {
/*  84: 86 */     this.terminalInfo = terminalInfo;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getTerminalInfo()
/*  88:    */   {
/*  89: 90 */     return this.terminalInfo;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setProdCode(String prodCode)
/*  93:    */   {
/*  94: 94 */     this.prodCode = prodCode;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getProdCode()
/*  98:    */   {
/*  99: 98 */     return this.prodCode;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getApiMethodName()
/* 103:    */   {
/* 104:102 */     return "alipay.ebpp.bill.batch.payurl.get";
/* 105:    */   }
/* 106:    */   
/* 107:    */   public Map<String, String> getTextParams()
/* 108:    */   {
/* 109:106 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 110:107 */     txtParams.put("callback_url", this.callbackUrl);
/* 111:108 */     txtParams.put("order_type", this.orderType);
/* 112:109 */     txtParams.put("pay_bill_list", this.payBillList);
/* 113:110 */     if (this.udfParams != null) {
/* 114:111 */       txtParams.putAll(this.udfParams);
/* 115:    */     }
/* 116:113 */     return txtParams;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void putOtherTextParam(String key, String value)
/* 120:    */   {
/* 121:117 */     if (this.udfParams == null) {
/* 122:118 */       this.udfParams = new AlipayHashMap();
/* 123:    */     }
/* 124:120 */     this.udfParams.put(key, value);
/* 125:    */   }
/* 126:    */   
/* 127:    */   public Class<AlipayEbppBillBatchPayurlGetResponse> getResponseClass()
/* 128:    */   {
/* 129:124 */     return AlipayEbppBillBatchPayurlGetResponse.class;
/* 130:    */   }
/* 131:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayEbppBillBatchPayurlGetRequest
 * JD-Core Version:    0.7.0.1
 */