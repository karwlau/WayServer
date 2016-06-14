/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayUserTradeSearchResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayUserTradeSearchRequest
/*   9:    */   implements AlipayRequest<AlipayUserTradeSearchResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String alipayOrderNo;
/*  14:    */   private String endTime;
/*  15:    */   private String merchantOrderNo;
/*  16:    */   private String orderFrom;
/*  17:    */   private String orderStatus;
/*  18:    */   private String orderType;
/*  19:    */   private String pageNo;
/*  20:    */   private String pageSize;
/*  21:    */   private String startTime;
/*  22:    */   private String terminalType;
/*  23:    */   private String terminalInfo;
/*  24:    */   private String prodCode;
/*  25:    */   private String notifyUrl;
/*  26:    */   
/*  27:    */   public void setAlipayOrderNo(String alipayOrderNo)
/*  28:    */   {
/*  29: 66 */     this.alipayOrderNo = alipayOrderNo;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public String getAlipayOrderNo()
/*  33:    */   {
/*  34: 69 */     return this.alipayOrderNo;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void setEndTime(String endTime)
/*  38:    */   {
/*  39: 73 */     this.endTime = endTime;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String getEndTime()
/*  43:    */   {
/*  44: 76 */     return this.endTime;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setMerchantOrderNo(String merchantOrderNo)
/*  48:    */   {
/*  49: 80 */     this.merchantOrderNo = merchantOrderNo;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String getMerchantOrderNo()
/*  53:    */   {
/*  54: 83 */     return this.merchantOrderNo;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setOrderFrom(String orderFrom)
/*  58:    */   {
/*  59: 87 */     this.orderFrom = orderFrom;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getOrderFrom()
/*  63:    */   {
/*  64: 90 */     return this.orderFrom;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setOrderStatus(String orderStatus)
/*  68:    */   {
/*  69: 94 */     this.orderStatus = orderStatus;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getOrderStatus()
/*  73:    */   {
/*  74: 97 */     return this.orderStatus;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setOrderType(String orderType)
/*  78:    */   {
/*  79:101 */     this.orderType = orderType;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getOrderType()
/*  83:    */   {
/*  84:104 */     return this.orderType;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setPageNo(String pageNo)
/*  88:    */   {
/*  89:108 */     this.pageNo = pageNo;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getPageNo()
/*  93:    */   {
/*  94:111 */     return this.pageNo;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setPageSize(String pageSize)
/*  98:    */   {
/*  99:115 */     this.pageSize = pageSize;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getPageSize()
/* 103:    */   {
/* 104:118 */     return this.pageSize;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setStartTime(String startTime)
/* 108:    */   {
/* 109:122 */     this.startTime = startTime;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getStartTime()
/* 113:    */   {
/* 114:125 */     return this.startTime;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public String getNotifyUrl()
/* 118:    */   {
/* 119:133 */     return this.notifyUrl;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void setNotifyUrl(String notifyUrl)
/* 123:    */   {
/* 124:137 */     this.notifyUrl = notifyUrl;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getApiVersion()
/* 128:    */   {
/* 129:141 */     return this.apiVersion;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void setApiVersion(String apiVersion)
/* 133:    */   {
/* 134:145 */     this.apiVersion = apiVersion;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void setTerminalType(String terminalType)
/* 138:    */   {
/* 139:149 */     this.terminalType = terminalType;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public String getTerminalType()
/* 143:    */   {
/* 144:153 */     return this.terminalType;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void setTerminalInfo(String terminalInfo)
/* 148:    */   {
/* 149:157 */     this.terminalInfo = terminalInfo;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public String getTerminalInfo()
/* 153:    */   {
/* 154:161 */     return this.terminalInfo;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void setProdCode(String prodCode)
/* 158:    */   {
/* 159:165 */     this.prodCode = prodCode;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public String getProdCode()
/* 163:    */   {
/* 164:169 */     return this.prodCode;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public String getApiMethodName()
/* 168:    */   {
/* 169:173 */     return "alipay.user.trade.search";
/* 170:    */   }
/* 171:    */   
/* 172:    */   public Map<String, String> getTextParams()
/* 173:    */   {
/* 174:177 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 175:178 */     txtParams.put("alipay_order_no", this.alipayOrderNo);
/* 176:179 */     txtParams.put("end_time", this.endTime);
/* 177:180 */     txtParams.put("merchant_order_no", this.merchantOrderNo);
/* 178:181 */     txtParams.put("order_from", this.orderFrom);
/* 179:182 */     txtParams.put("order_status", this.orderStatus);
/* 180:183 */     txtParams.put("order_type", this.orderType);
/* 181:184 */     txtParams.put("page_no", this.pageNo);
/* 182:185 */     txtParams.put("page_size", this.pageSize);
/* 183:186 */     txtParams.put("start_time", this.startTime);
/* 184:187 */     if (this.udfParams != null) {
/* 185:188 */       txtParams.putAll(this.udfParams);
/* 186:    */     }
/* 187:190 */     return txtParams;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public void putOtherTextParam(String key, String value)
/* 191:    */   {
/* 192:194 */     if (this.udfParams == null) {
/* 193:195 */       this.udfParams = new AlipayHashMap();
/* 194:    */     }
/* 195:197 */     this.udfParams.put(key, value);
/* 196:    */   }
/* 197:    */   
/* 198:    */   public Class<AlipayUserTradeSearchResponse> getResponseClass()
/* 199:    */   {
/* 200:201 */     return AlipayUserTradeSearchResponse.class;
/* 201:    */   }
/* 202:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayUserTradeSearchRequest
 * JD-Core Version:    0.7.0.1
 */