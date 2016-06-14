/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayAcquireCancelResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayAcquireCancelRequest
/*   9:    */   implements AlipayRequest<AlipayAcquireCancelResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String operatorId;
/*  14:    */   private String operatorType;
/*  15:    */   private String outTradeNo;
/*  16:    */   private String tradeNo;
/*  17:    */   private String terminalType;
/*  18:    */   private String terminalInfo;
/*  19:    */   private String prodCode;
/*  20:    */   private String notifyUrl;
/*  21:    */   
/*  22:    */   public void setOperatorId(String operatorId)
/*  23:    */   {
/*  24: 46 */     this.operatorId = operatorId;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public String getOperatorId()
/*  28:    */   {
/*  29: 49 */     return this.operatorId;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setOperatorType(String operatorType)
/*  33:    */   {
/*  34: 53 */     this.operatorType = operatorType;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getOperatorType()
/*  38:    */   {
/*  39: 56 */     return this.operatorType;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setOutTradeNo(String outTradeNo)
/*  43:    */   {
/*  44: 60 */     this.outTradeNo = outTradeNo;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getOutTradeNo()
/*  48:    */   {
/*  49: 63 */     return this.outTradeNo;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setTradeNo(String tradeNo)
/*  53:    */   {
/*  54: 67 */     this.tradeNo = tradeNo;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getTradeNo()
/*  58:    */   {
/*  59: 70 */     return this.tradeNo;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getNotifyUrl()
/*  63:    */   {
/*  64: 78 */     return this.notifyUrl;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setNotifyUrl(String notifyUrl)
/*  68:    */   {
/*  69: 82 */     this.notifyUrl = notifyUrl;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getApiVersion()
/*  73:    */   {
/*  74: 86 */     return this.apiVersion;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setApiVersion(String apiVersion)
/*  78:    */   {
/*  79: 90 */     this.apiVersion = apiVersion;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setTerminalType(String terminalType)
/*  83:    */   {
/*  84: 94 */     this.terminalType = terminalType;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getTerminalType()
/*  88:    */   {
/*  89: 98 */     return this.terminalType;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setTerminalInfo(String terminalInfo)
/*  93:    */   {
/*  94:102 */     this.terminalInfo = terminalInfo;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getTerminalInfo()
/*  98:    */   {
/*  99:106 */     return this.terminalInfo;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setProdCode(String prodCode)
/* 103:    */   {
/* 104:110 */     this.prodCode = prodCode;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getProdCode()
/* 108:    */   {
/* 109:114 */     return this.prodCode;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getApiMethodName()
/* 113:    */   {
/* 114:118 */     return "alipay.acquire.cancel";
/* 115:    */   }
/* 116:    */   
/* 117:    */   public Map<String, String> getTextParams()
/* 118:    */   {
/* 119:122 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 120:123 */     txtParams.put("operator_id", this.operatorId);
/* 121:124 */     txtParams.put("operator_type", this.operatorType);
/* 122:125 */     txtParams.put("out_trade_no", this.outTradeNo);
/* 123:126 */     txtParams.put("trade_no", this.tradeNo);
/* 124:127 */     if (this.udfParams != null) {
/* 125:128 */       txtParams.putAll(this.udfParams);
/* 126:    */     }
/* 127:130 */     return txtParams;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void putOtherTextParam(String key, String value)
/* 131:    */   {
/* 132:134 */     if (this.udfParams == null) {
/* 133:135 */       this.udfParams = new AlipayHashMap();
/* 134:    */     }
/* 135:137 */     this.udfParams.put(key, value);
/* 136:    */   }
/* 137:    */   
/* 138:    */   public Class<AlipayAcquireCancelResponse> getResponseClass()
/* 139:    */   {
/* 140:141 */     return AlipayAcquireCancelResponse.class;
/* 141:    */   }
/* 142:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayAcquireCancelRequest
 * JD-Core Version:    0.7.0.1
 */