/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayAcquireRefundResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayAcquireRefundRequest
/*   9:    */   implements AlipayRequest<AlipayAcquireRefundResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String operatorId;
/*  14:    */   private String operatorType;
/*  15:    */   private String outRequestNo;
/*  16:    */   private String outTradeNo;
/*  17:    */   private String refIds;
/*  18:    */   private String refundAmount;
/*  19:    */   private String refundReason;
/*  20:    */   private String tradeNo;
/*  21:    */   private String terminalType;
/*  22:    */   private String terminalInfo;
/*  23:    */   private String prodCode;
/*  24:    */   private String notifyUrl;
/*  25:    */   
/*  26:    */   public void setOperatorId(String operatorId)
/*  27:    */   {
/*  28: 67 */     this.operatorId = operatorId;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public String getOperatorId()
/*  32:    */   {
/*  33: 70 */     return this.operatorId;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setOperatorType(String operatorType)
/*  37:    */   {
/*  38: 74 */     this.operatorType = operatorType;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getOperatorType()
/*  42:    */   {
/*  43: 77 */     return this.operatorType;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setOutRequestNo(String outRequestNo)
/*  47:    */   {
/*  48: 81 */     this.outRequestNo = outRequestNo;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getOutRequestNo()
/*  52:    */   {
/*  53: 84 */     return this.outRequestNo;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setOutTradeNo(String outTradeNo)
/*  57:    */   {
/*  58: 88 */     this.outTradeNo = outTradeNo;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getOutTradeNo()
/*  62:    */   {
/*  63: 91 */     return this.outTradeNo;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setRefIds(String refIds)
/*  67:    */   {
/*  68: 95 */     this.refIds = refIds;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getRefIds()
/*  72:    */   {
/*  73: 98 */     return this.refIds;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setRefundAmount(String refundAmount)
/*  77:    */   {
/*  78:102 */     this.refundAmount = refundAmount;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getRefundAmount()
/*  82:    */   {
/*  83:105 */     return this.refundAmount;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setRefundReason(String refundReason)
/*  87:    */   {
/*  88:109 */     this.refundReason = refundReason;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getRefundReason()
/*  92:    */   {
/*  93:112 */     return this.refundReason;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setTradeNo(String tradeNo)
/*  97:    */   {
/*  98:116 */     this.tradeNo = tradeNo;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getTradeNo()
/* 102:    */   {
/* 103:119 */     return this.tradeNo;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public String getNotifyUrl()
/* 107:    */   {
/* 108:127 */     return this.notifyUrl;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setNotifyUrl(String notifyUrl)
/* 112:    */   {
/* 113:131 */     this.notifyUrl = notifyUrl;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public String getApiVersion()
/* 117:    */   {
/* 118:135 */     return this.apiVersion;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void setApiVersion(String apiVersion)
/* 122:    */   {
/* 123:139 */     this.apiVersion = apiVersion;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setTerminalType(String terminalType)
/* 127:    */   {
/* 128:143 */     this.terminalType = terminalType;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public String getTerminalType()
/* 132:    */   {
/* 133:147 */     return this.terminalType;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setTerminalInfo(String terminalInfo)
/* 137:    */   {
/* 138:151 */     this.terminalInfo = terminalInfo;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public String getTerminalInfo()
/* 142:    */   {
/* 143:155 */     return this.terminalInfo;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void setProdCode(String prodCode)
/* 147:    */   {
/* 148:159 */     this.prodCode = prodCode;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public String getProdCode()
/* 152:    */   {
/* 153:163 */     return this.prodCode;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public String getApiMethodName()
/* 157:    */   {
/* 158:167 */     return "alipay.acquire.refund";
/* 159:    */   }
/* 160:    */   
/* 161:    */   public Map<String, String> getTextParams()
/* 162:    */   {
/* 163:171 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 164:172 */     txtParams.put("operator_id", this.operatorId);
/* 165:173 */     txtParams.put("operator_type", this.operatorType);
/* 166:174 */     txtParams.put("out_request_no", this.outRequestNo);
/* 167:175 */     txtParams.put("out_trade_no", this.outTradeNo);
/* 168:176 */     txtParams.put("ref_ids", this.refIds);
/* 169:177 */     txtParams.put("refund_amount", this.refundAmount);
/* 170:178 */     txtParams.put("refund_reason", this.refundReason);
/* 171:179 */     txtParams.put("trade_no", this.tradeNo);
/* 172:180 */     if (this.udfParams != null) {
/* 173:181 */       txtParams.putAll(this.udfParams);
/* 174:    */     }
/* 175:183 */     return txtParams;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public void putOtherTextParam(String key, String value)
/* 179:    */   {
/* 180:187 */     if (this.udfParams == null) {
/* 181:188 */       this.udfParams = new AlipayHashMap();
/* 182:    */     }
/* 183:190 */     this.udfParams.put(key, value);
/* 184:    */   }
/* 185:    */   
/* 186:    */   public Class<AlipayAcquireRefundResponse> getResponseClass()
/* 187:    */   {
/* 188:194 */     return AlipayAcquireRefundResponse.class;
/* 189:    */   }
/* 190:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayAcquireRefundRequest
 * JD-Core Version:    0.7.0.1
 */