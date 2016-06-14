/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayAcquireQueryResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayAcquireQueryRequest
/*   9:    */   implements AlipayRequest<AlipayAcquireQueryResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String outTradeNo;
/*  14:    */   private String tradeNo;
/*  15:    */   private String terminalType;
/*  16:    */   private String terminalInfo;
/*  17:    */   private String prodCode;
/*  18:    */   private String notifyUrl;
/*  19:    */   
/*  20:    */   public void setOutTradeNo(String outTradeNo)
/*  21:    */   {
/*  22: 33 */     this.outTradeNo = outTradeNo;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public String getOutTradeNo()
/*  26:    */   {
/*  27: 36 */     return this.outTradeNo;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setTradeNo(String tradeNo)
/*  31:    */   {
/*  32: 40 */     this.tradeNo = tradeNo;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getTradeNo()
/*  36:    */   {
/*  37: 43 */     return this.tradeNo;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getNotifyUrl()
/*  41:    */   {
/*  42: 51 */     return this.notifyUrl;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setNotifyUrl(String notifyUrl)
/*  46:    */   {
/*  47: 55 */     this.notifyUrl = notifyUrl;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getApiVersion()
/*  51:    */   {
/*  52: 59 */     return this.apiVersion;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setApiVersion(String apiVersion)
/*  56:    */   {
/*  57: 63 */     this.apiVersion = apiVersion;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setTerminalType(String terminalType)
/*  61:    */   {
/*  62: 67 */     this.terminalType = terminalType;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getTerminalType()
/*  66:    */   {
/*  67: 71 */     return this.terminalType;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setTerminalInfo(String terminalInfo)
/*  71:    */   {
/*  72: 75 */     this.terminalInfo = terminalInfo;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getTerminalInfo()
/*  76:    */   {
/*  77: 79 */     return this.terminalInfo;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setProdCode(String prodCode)
/*  81:    */   {
/*  82: 83 */     this.prodCode = prodCode;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getProdCode()
/*  86:    */   {
/*  87: 87 */     return this.prodCode;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getApiMethodName()
/*  91:    */   {
/*  92: 91 */     return "alipay.acquire.query";
/*  93:    */   }
/*  94:    */   
/*  95:    */   public Map<String, String> getTextParams()
/*  96:    */   {
/*  97: 95 */     AlipayHashMap txtParams = new AlipayHashMap();
/*  98: 96 */     txtParams.put("out_trade_no", this.outTradeNo);
/*  99: 97 */     txtParams.put("trade_no", this.tradeNo);
/* 100: 98 */     if (this.udfParams != null) {
/* 101: 99 */       txtParams.putAll(this.udfParams);
/* 102:    */     }
/* 103:101 */     return txtParams;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void putOtherTextParam(String key, String value)
/* 107:    */   {
/* 108:105 */     if (this.udfParams == null) {
/* 109:106 */       this.udfParams = new AlipayHashMap();
/* 110:    */     }
/* 111:108 */     this.udfParams.put(key, value);
/* 112:    */   }
/* 113:    */   
/* 114:    */   public Class<AlipayAcquireQueryResponse> getResponseClass()
/* 115:    */   {
/* 116:112 */     return AlipayAcquireQueryResponse.class;
/* 117:    */   }
/* 118:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayAcquireQueryRequest
 * JD-Core Version:    0.7.0.1
 */