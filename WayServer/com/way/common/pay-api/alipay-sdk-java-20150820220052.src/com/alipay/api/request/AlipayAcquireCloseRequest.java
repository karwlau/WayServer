/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayAcquireCloseResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayAcquireCloseRequest
/*   9:    */   implements AlipayRequest<AlipayAcquireCloseResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String operatorId;
/*  14:    */   private String outTradeNo;
/*  15:    */   private String tradeNo;
/*  16:    */   private String terminalType;
/*  17:    */   private String terminalInfo;
/*  18:    */   private String prodCode;
/*  19:    */   private String notifyUrl;
/*  20:    */   
/*  21:    */   public void setOperatorId(String operatorId)
/*  22:    */   {
/*  23: 38 */     this.operatorId = operatorId;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public String getOperatorId()
/*  27:    */   {
/*  28: 41 */     return this.operatorId;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void setOutTradeNo(String outTradeNo)
/*  32:    */   {
/*  33: 45 */     this.outTradeNo = outTradeNo;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public String getOutTradeNo()
/*  37:    */   {
/*  38: 48 */     return this.outTradeNo;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setTradeNo(String tradeNo)
/*  42:    */   {
/*  43: 52 */     this.tradeNo = tradeNo;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public String getTradeNo()
/*  47:    */   {
/*  48: 55 */     return this.tradeNo;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getNotifyUrl()
/*  52:    */   {
/*  53: 63 */     return this.notifyUrl;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setNotifyUrl(String notifyUrl)
/*  57:    */   {
/*  58: 67 */     this.notifyUrl = notifyUrl;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getApiVersion()
/*  62:    */   {
/*  63: 71 */     return this.apiVersion;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setApiVersion(String apiVersion)
/*  67:    */   {
/*  68: 75 */     this.apiVersion = apiVersion;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setTerminalType(String terminalType)
/*  72:    */   {
/*  73: 79 */     this.terminalType = terminalType;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getTerminalType()
/*  77:    */   {
/*  78: 83 */     return this.terminalType;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setTerminalInfo(String terminalInfo)
/*  82:    */   {
/*  83: 87 */     this.terminalInfo = terminalInfo;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getTerminalInfo()
/*  87:    */   {
/*  88: 91 */     return this.terminalInfo;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setProdCode(String prodCode)
/*  92:    */   {
/*  93: 95 */     this.prodCode = prodCode;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String getProdCode()
/*  97:    */   {
/*  98: 99 */     return this.prodCode;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getApiMethodName()
/* 102:    */   {
/* 103:103 */     return "alipay.acquire.close";
/* 104:    */   }
/* 105:    */   
/* 106:    */   public Map<String, String> getTextParams()
/* 107:    */   {
/* 108:107 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 109:108 */     txtParams.put("operator_id", this.operatorId);
/* 110:109 */     txtParams.put("out_trade_no", this.outTradeNo);
/* 111:110 */     txtParams.put("trade_no", this.tradeNo);
/* 112:111 */     if (this.udfParams != null) {
/* 113:112 */       txtParams.putAll(this.udfParams);
/* 114:    */     }
/* 115:114 */     return txtParams;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void putOtherTextParam(String key, String value)
/* 119:    */   {
/* 120:118 */     if (this.udfParams == null) {
/* 121:119 */       this.udfParams = new AlipayHashMap();
/* 122:    */     }
/* 123:121 */     this.udfParams.put(key, value);
/* 124:    */   }
/* 125:    */   
/* 126:    */   public Class<AlipayAcquireCloseResponse> getResponseClass()
/* 127:    */   {
/* 128:125 */     return AlipayAcquireCloseResponse.class;
/* 129:    */   }
/* 130:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayAcquireCloseRequest
 * JD-Core Version:    0.7.0.1
 */