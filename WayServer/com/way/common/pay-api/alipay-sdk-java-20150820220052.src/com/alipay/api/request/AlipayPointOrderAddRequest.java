/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayPointOrderAddResponse;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayPointOrderAddRequest
/*  10:    */   implements AlipayRequest<AlipayPointOrderAddResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String memo;
/*  15:    */   private String merchantOrderNo;
/*  16:    */   private Date orderTime;
/*  17:    */   private Long pointCount;
/*  18:    */   private String userSymbol;
/*  19:    */   private String userSymbolType;
/*  20:    */   private String terminalType;
/*  21:    */   private String terminalInfo;
/*  22:    */   private String prodCode;
/*  23:    */   private String notifyUrl;
/*  24:    */   
/*  25:    */   public void setMemo(String memo)
/*  26:    */   {
/*  27: 52 */     this.memo = memo;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public String getMemo()
/*  31:    */   {
/*  32: 55 */     return this.memo;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setMerchantOrderNo(String merchantOrderNo)
/*  36:    */   {
/*  37: 59 */     this.merchantOrderNo = merchantOrderNo;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getMerchantOrderNo()
/*  41:    */   {
/*  42: 62 */     return this.merchantOrderNo;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setOrderTime(Date orderTime)
/*  46:    */   {
/*  47: 66 */     this.orderTime = orderTime;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public Date getOrderTime()
/*  51:    */   {
/*  52: 69 */     return this.orderTime;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setPointCount(Long pointCount)
/*  56:    */   {
/*  57: 73 */     this.pointCount = pointCount;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public Long getPointCount()
/*  61:    */   {
/*  62: 76 */     return this.pointCount;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setUserSymbol(String userSymbol)
/*  66:    */   {
/*  67: 80 */     this.userSymbol = userSymbol;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getUserSymbol()
/*  71:    */   {
/*  72: 83 */     return this.userSymbol;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setUserSymbolType(String userSymbolType)
/*  76:    */   {
/*  77: 87 */     this.userSymbolType = userSymbolType;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getUserSymbolType()
/*  81:    */   {
/*  82: 90 */     return this.userSymbolType;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getNotifyUrl()
/*  86:    */   {
/*  87: 98 */     return this.notifyUrl;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setNotifyUrl(String notifyUrl)
/*  91:    */   {
/*  92:102 */     this.notifyUrl = notifyUrl;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getApiVersion()
/*  96:    */   {
/*  97:106 */     return this.apiVersion;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setApiVersion(String apiVersion)
/* 101:    */   {
/* 102:110 */     this.apiVersion = apiVersion;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setTerminalType(String terminalType)
/* 106:    */   {
/* 107:114 */     this.terminalType = terminalType;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getTerminalType()
/* 111:    */   {
/* 112:118 */     return this.terminalType;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setTerminalInfo(String terminalInfo)
/* 116:    */   {
/* 117:122 */     this.terminalInfo = terminalInfo;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public String getTerminalInfo()
/* 121:    */   {
/* 122:126 */     return this.terminalInfo;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setProdCode(String prodCode)
/* 126:    */   {
/* 127:130 */     this.prodCode = prodCode;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public String getProdCode()
/* 131:    */   {
/* 132:134 */     return this.prodCode;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public String getApiMethodName()
/* 136:    */   {
/* 137:138 */     return "alipay.point.order.add";
/* 138:    */   }
/* 139:    */   
/* 140:    */   public Map<String, String> getTextParams()
/* 141:    */   {
/* 142:142 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 143:143 */     txtParams.put("memo", this.memo);
/* 144:144 */     txtParams.put("merchant_order_no", this.merchantOrderNo);
/* 145:145 */     txtParams.put("order_time", this.orderTime);
/* 146:146 */     txtParams.put("point_count", this.pointCount);
/* 147:147 */     txtParams.put("user_symbol", this.userSymbol);
/* 148:148 */     txtParams.put("user_symbol_type", this.userSymbolType);
/* 149:149 */     if (this.udfParams != null) {
/* 150:150 */       txtParams.putAll(this.udfParams);
/* 151:    */     }
/* 152:152 */     return txtParams;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void putOtherTextParam(String key, String value)
/* 156:    */   {
/* 157:156 */     if (this.udfParams == null) {
/* 158:157 */       this.udfParams = new AlipayHashMap();
/* 159:    */     }
/* 160:159 */     this.udfParams.put(key, value);
/* 161:    */   }
/* 162:    */   
/* 163:    */   public Class<AlipayPointOrderAddResponse> getResponseClass()
/* 164:    */   {
/* 165:163 */     return AlipayPointOrderAddResponse.class;
/* 166:    */   }
/* 167:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayPointOrderAddRequest
 * JD-Core Version:    0.7.0.1
 */