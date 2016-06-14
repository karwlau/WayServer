/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayTransferThirdpartyBillCreateResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayTransferThirdpartyBillCreateRequest
/*   9:    */   implements AlipayRequest<AlipayTransferThirdpartyBillCreateResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String amount;
/*  14:    */   private String currency;
/*  15:    */   private String extParam;
/*  16:    */   private String memo;
/*  17:    */   private String partnerId;
/*  18:    */   private String payeeAccount;
/*  19:    */   private String payeeType;
/*  20:    */   private String payerAccount;
/*  21:    */   private String payerType;
/*  22:    */   private String paymentId;
/*  23:    */   private String paymentSource;
/*  24:    */   private String title;
/*  25:    */   private String terminalType;
/*  26:    */   private String terminalInfo;
/*  27:    */   private String prodCode;
/*  28:    */   private String notifyUrl;
/*  29:    */   
/*  30:    */   public void setAmount(String amount)
/*  31:    */   {
/*  32: 88 */     this.amount = amount;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getAmount()
/*  36:    */   {
/*  37: 91 */     return this.amount;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setCurrency(String currency)
/*  41:    */   {
/*  42: 95 */     this.currency = currency;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getCurrency()
/*  46:    */   {
/*  47: 98 */     return this.currency;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setExtParam(String extParam)
/*  51:    */   {
/*  52:102 */     this.extParam = extParam;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getExtParam()
/*  56:    */   {
/*  57:105 */     return this.extParam;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setMemo(String memo)
/*  61:    */   {
/*  62:109 */     this.memo = memo;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getMemo()
/*  66:    */   {
/*  67:112 */     return this.memo;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setPartnerId(String partnerId)
/*  71:    */   {
/*  72:116 */     this.partnerId = partnerId;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getPartnerId()
/*  76:    */   {
/*  77:119 */     return this.partnerId;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setPayeeAccount(String payeeAccount)
/*  81:    */   {
/*  82:123 */     this.payeeAccount = payeeAccount;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getPayeeAccount()
/*  86:    */   {
/*  87:126 */     return this.payeeAccount;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setPayeeType(String payeeType)
/*  91:    */   {
/*  92:130 */     this.payeeType = payeeType;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getPayeeType()
/*  96:    */   {
/*  97:133 */     return this.payeeType;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setPayerAccount(String payerAccount)
/* 101:    */   {
/* 102:137 */     this.payerAccount = payerAccount;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getPayerAccount()
/* 106:    */   {
/* 107:140 */     return this.payerAccount;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setPayerType(String payerType)
/* 111:    */   {
/* 112:144 */     this.payerType = payerType;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public String getPayerType()
/* 116:    */   {
/* 117:147 */     return this.payerType;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void setPaymentId(String paymentId)
/* 121:    */   {
/* 122:151 */     this.paymentId = paymentId;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public String getPaymentId()
/* 126:    */   {
/* 127:154 */     return this.paymentId;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void setPaymentSource(String paymentSource)
/* 131:    */   {
/* 132:158 */     this.paymentSource = paymentSource;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public String getPaymentSource()
/* 136:    */   {
/* 137:161 */     return this.paymentSource;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void setTitle(String title)
/* 141:    */   {
/* 142:165 */     this.title = title;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getTitle()
/* 146:    */   {
/* 147:168 */     return this.title;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public String getNotifyUrl()
/* 151:    */   {
/* 152:176 */     return this.notifyUrl;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void setNotifyUrl(String notifyUrl)
/* 156:    */   {
/* 157:180 */     this.notifyUrl = notifyUrl;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public String getApiVersion()
/* 161:    */   {
/* 162:184 */     return this.apiVersion;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void setApiVersion(String apiVersion)
/* 166:    */   {
/* 167:188 */     this.apiVersion = apiVersion;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void setTerminalType(String terminalType)
/* 171:    */   {
/* 172:192 */     this.terminalType = terminalType;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public String getTerminalType()
/* 176:    */   {
/* 177:196 */     return this.terminalType;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public void setTerminalInfo(String terminalInfo)
/* 181:    */   {
/* 182:200 */     this.terminalInfo = terminalInfo;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public String getTerminalInfo()
/* 186:    */   {
/* 187:204 */     return this.terminalInfo;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public void setProdCode(String prodCode)
/* 191:    */   {
/* 192:208 */     this.prodCode = prodCode;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public String getProdCode()
/* 196:    */   {
/* 197:212 */     return this.prodCode;
/* 198:    */   }
/* 199:    */   
/* 200:    */   public String getApiMethodName()
/* 201:    */   {
/* 202:216 */     return "alipay.transfer.thirdparty.bill.create";
/* 203:    */   }
/* 204:    */   
/* 205:    */   public Map<String, String> getTextParams()
/* 206:    */   {
/* 207:220 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 208:221 */     txtParams.put("amount", this.amount);
/* 209:222 */     txtParams.put("currency", this.currency);
/* 210:223 */     txtParams.put("ext_param", this.extParam);
/* 211:224 */     txtParams.put("memo", this.memo);
/* 212:225 */     txtParams.put("partner_id", this.partnerId);
/* 213:226 */     txtParams.put("payee_account", this.payeeAccount);
/* 214:227 */     txtParams.put("payee_type", this.payeeType);
/* 215:228 */     txtParams.put("payer_account", this.payerAccount);
/* 216:229 */     txtParams.put("payer_type", this.payerType);
/* 217:230 */     txtParams.put("payment_id", this.paymentId);
/* 218:231 */     txtParams.put("payment_source", this.paymentSource);
/* 219:232 */     txtParams.put("title", this.title);
/* 220:233 */     if (this.udfParams != null) {
/* 221:234 */       txtParams.putAll(this.udfParams);
/* 222:    */     }
/* 223:236 */     return txtParams;
/* 224:    */   }
/* 225:    */   
/* 226:    */   public void putOtherTextParam(String key, String value)
/* 227:    */   {
/* 228:240 */     if (this.udfParams == null) {
/* 229:241 */       this.udfParams = new AlipayHashMap();
/* 230:    */     }
/* 231:243 */     this.udfParams.put(key, value);
/* 232:    */   }
/* 233:    */   
/* 234:    */   public Class<AlipayTransferThirdpartyBillCreateResponse> getResponseClass()
/* 235:    */   {
/* 236:247 */     return AlipayTransferThirdpartyBillCreateResponse.class;
/* 237:    */   }
/* 238:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayTransferThirdpartyBillCreateRequest
 * JD-Core Version:    0.7.0.1
 */