/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayEbppBillAddResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayEbppBillAddRequest
/*   9:    */   implements AlipayRequest<AlipayEbppBillAddResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String bankBillNo;
/*  14:    */   private String billDate;
/*  15:    */   private String billKey;
/*  16:    */   private String chargeInst;
/*  17:    */   private String extendField;
/*  18:    */   private String merchantOrderNo;
/*  19:    */   private String mobile;
/*  20:    */   private String orderType;
/*  21:    */   private String ownerName;
/*  22:    */   private String payAmount;
/*  23:    */   private String serviceAmount;
/*  24:    */   private String subOrderType;
/*  25:    */   private String trafficLocation;
/*  26:    */   private String trafficRegulations;
/*  27:    */   private String terminalType;
/*  28:    */   private String terminalInfo;
/*  29:    */   private String prodCode;
/*  30:    */   private String notifyUrl;
/*  31:    */   
/*  32:    */   public void setBankBillNo(String bankBillNo)
/*  33:    */   {
/*  34: 91 */     this.bankBillNo = bankBillNo;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getBankBillNo()
/*  38:    */   {
/*  39: 94 */     return this.bankBillNo;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setBillDate(String billDate)
/*  43:    */   {
/*  44: 98 */     this.billDate = billDate;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getBillDate()
/*  48:    */   {
/*  49:101 */     return this.billDate;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setBillKey(String billKey)
/*  53:    */   {
/*  54:105 */     this.billKey = billKey;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getBillKey()
/*  58:    */   {
/*  59:108 */     return this.billKey;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setChargeInst(String chargeInst)
/*  63:    */   {
/*  64:112 */     this.chargeInst = chargeInst;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getChargeInst()
/*  68:    */   {
/*  69:115 */     return this.chargeInst;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setExtendField(String extendField)
/*  73:    */   {
/*  74:119 */     this.extendField = extendField;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getExtendField()
/*  78:    */   {
/*  79:122 */     return this.extendField;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setMerchantOrderNo(String merchantOrderNo)
/*  83:    */   {
/*  84:126 */     this.merchantOrderNo = merchantOrderNo;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getMerchantOrderNo()
/*  88:    */   {
/*  89:129 */     return this.merchantOrderNo;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setMobile(String mobile)
/*  93:    */   {
/*  94:133 */     this.mobile = mobile;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getMobile()
/*  98:    */   {
/*  99:136 */     return this.mobile;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setOrderType(String orderType)
/* 103:    */   {
/* 104:140 */     this.orderType = orderType;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getOrderType()
/* 108:    */   {
/* 109:143 */     return this.orderType;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void setOwnerName(String ownerName)
/* 113:    */   {
/* 114:147 */     this.ownerName = ownerName;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public String getOwnerName()
/* 118:    */   {
/* 119:150 */     return this.ownerName;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void setPayAmount(String payAmount)
/* 123:    */   {
/* 124:154 */     this.payAmount = payAmount;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getPayAmount()
/* 128:    */   {
/* 129:157 */     return this.payAmount;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void setServiceAmount(String serviceAmount)
/* 133:    */   {
/* 134:161 */     this.serviceAmount = serviceAmount;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public String getServiceAmount()
/* 138:    */   {
/* 139:164 */     return this.serviceAmount;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void setSubOrderType(String subOrderType)
/* 143:    */   {
/* 144:168 */     this.subOrderType = subOrderType;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public String getSubOrderType()
/* 148:    */   {
/* 149:171 */     return this.subOrderType;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void setTrafficLocation(String trafficLocation)
/* 153:    */   {
/* 154:175 */     this.trafficLocation = trafficLocation;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public String getTrafficLocation()
/* 158:    */   {
/* 159:178 */     return this.trafficLocation;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void setTrafficRegulations(String trafficRegulations)
/* 163:    */   {
/* 164:182 */     this.trafficRegulations = trafficRegulations;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public String getTrafficRegulations()
/* 168:    */   {
/* 169:185 */     return this.trafficRegulations;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public String getNotifyUrl()
/* 173:    */   {
/* 174:193 */     return this.notifyUrl;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public void setNotifyUrl(String notifyUrl)
/* 178:    */   {
/* 179:197 */     this.notifyUrl = notifyUrl;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public String getApiVersion()
/* 183:    */   {
/* 184:201 */     return this.apiVersion;
/* 185:    */   }
/* 186:    */   
/* 187:    */   public void setApiVersion(String apiVersion)
/* 188:    */   {
/* 189:205 */     this.apiVersion = apiVersion;
/* 190:    */   }
/* 191:    */   
/* 192:    */   public void setTerminalType(String terminalType)
/* 193:    */   {
/* 194:209 */     this.terminalType = terminalType;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public String getTerminalType()
/* 198:    */   {
/* 199:213 */     return this.terminalType;
/* 200:    */   }
/* 201:    */   
/* 202:    */   public void setTerminalInfo(String terminalInfo)
/* 203:    */   {
/* 204:217 */     this.terminalInfo = terminalInfo;
/* 205:    */   }
/* 206:    */   
/* 207:    */   public String getTerminalInfo()
/* 208:    */   {
/* 209:221 */     return this.terminalInfo;
/* 210:    */   }
/* 211:    */   
/* 212:    */   public void setProdCode(String prodCode)
/* 213:    */   {
/* 214:225 */     this.prodCode = prodCode;
/* 215:    */   }
/* 216:    */   
/* 217:    */   public String getProdCode()
/* 218:    */   {
/* 219:229 */     return this.prodCode;
/* 220:    */   }
/* 221:    */   
/* 222:    */   public String getApiMethodName()
/* 223:    */   {
/* 224:233 */     return "alipay.ebpp.bill.add";
/* 225:    */   }
/* 226:    */   
/* 227:    */   public Map<String, String> getTextParams()
/* 228:    */   {
/* 229:237 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 230:238 */     txtParams.put("bank_bill_no", this.bankBillNo);
/* 231:239 */     txtParams.put("bill_date", this.billDate);
/* 232:240 */     txtParams.put("bill_key", this.billKey);
/* 233:241 */     txtParams.put("charge_inst", this.chargeInst);
/* 234:242 */     txtParams.put("extend_field", this.extendField);
/* 235:243 */     txtParams.put("merchant_order_no", this.merchantOrderNo);
/* 236:244 */     txtParams.put("mobile", this.mobile);
/* 237:245 */     txtParams.put("order_type", this.orderType);
/* 238:246 */     txtParams.put("owner_name", this.ownerName);
/* 239:247 */     txtParams.put("pay_amount", this.payAmount);
/* 240:248 */     txtParams.put("service_amount", this.serviceAmount);
/* 241:249 */     txtParams.put("sub_order_type", this.subOrderType);
/* 242:250 */     txtParams.put("traffic_location", this.trafficLocation);
/* 243:251 */     txtParams.put("traffic_regulations", this.trafficRegulations);
/* 244:252 */     if (this.udfParams != null) {
/* 245:253 */       txtParams.putAll(this.udfParams);
/* 246:    */     }
/* 247:255 */     return txtParams;
/* 248:    */   }
/* 249:    */   
/* 250:    */   public void putOtherTextParam(String key, String value)
/* 251:    */   {
/* 252:259 */     if (this.udfParams == null) {
/* 253:260 */       this.udfParams = new AlipayHashMap();
/* 254:    */     }
/* 255:262 */     this.udfParams.put(key, value);
/* 256:    */   }
/* 257:    */   
/* 258:    */   public Class<AlipayEbppBillAddResponse> getResponseClass()
/* 259:    */   {
/* 260:266 */     return AlipayEbppBillAddResponse.class;
/* 261:    */   }
/* 262:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayEbppBillAddRequest
 * JD-Core Version:    0.7.0.1
 */