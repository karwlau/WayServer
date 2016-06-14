/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayEbppBillSearchResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayEbppBillSearchRequest
/*   9:    */   implements AlipayRequest<AlipayEbppBillSearchResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String billKey;
/*  14:    */   private String chargeInst;
/*  15:    */   private String chargeoffInst;
/*  16:    */   private String companyId;
/*  17:    */   private String extend;
/*  18:    */   private String orderType;
/*  19:    */   private String subOrderType;
/*  20:    */   private String terminalType;
/*  21:    */   private String terminalInfo;
/*  22:    */   private String prodCode;
/*  23:    */   private String notifyUrl;
/*  24:    */   
/*  25:    */   public void setBillKey(String billKey)
/*  26:    */   {
/*  27: 57 */     this.billKey = billKey;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public String getBillKey()
/*  31:    */   {
/*  32: 60 */     return this.billKey;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setChargeInst(String chargeInst)
/*  36:    */   {
/*  37: 64 */     this.chargeInst = chargeInst;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getChargeInst()
/*  41:    */   {
/*  42: 67 */     return this.chargeInst;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setChargeoffInst(String chargeoffInst)
/*  46:    */   {
/*  47: 71 */     this.chargeoffInst = chargeoffInst;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getChargeoffInst()
/*  51:    */   {
/*  52: 74 */     return this.chargeoffInst;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setCompanyId(String companyId)
/*  56:    */   {
/*  57: 78 */     this.companyId = companyId;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getCompanyId()
/*  61:    */   {
/*  62: 81 */     return this.companyId;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setExtend(String extend)
/*  66:    */   {
/*  67: 85 */     this.extend = extend;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getExtend()
/*  71:    */   {
/*  72: 88 */     return this.extend;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setOrderType(String orderType)
/*  76:    */   {
/*  77: 92 */     this.orderType = orderType;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getOrderType()
/*  81:    */   {
/*  82: 95 */     return this.orderType;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setSubOrderType(String subOrderType)
/*  86:    */   {
/*  87: 99 */     this.subOrderType = subOrderType;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getSubOrderType()
/*  91:    */   {
/*  92:102 */     return this.subOrderType;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getNotifyUrl()
/*  96:    */   {
/*  97:110 */     return this.notifyUrl;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setNotifyUrl(String notifyUrl)
/* 101:    */   {
/* 102:114 */     this.notifyUrl = notifyUrl;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getApiVersion()
/* 106:    */   {
/* 107:118 */     return this.apiVersion;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setApiVersion(String apiVersion)
/* 111:    */   {
/* 112:122 */     this.apiVersion = apiVersion;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setTerminalType(String terminalType)
/* 116:    */   {
/* 117:126 */     this.terminalType = terminalType;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public String getTerminalType()
/* 121:    */   {
/* 122:130 */     return this.terminalType;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setTerminalInfo(String terminalInfo)
/* 126:    */   {
/* 127:134 */     this.terminalInfo = terminalInfo;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public String getTerminalInfo()
/* 131:    */   {
/* 132:138 */     return this.terminalInfo;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void setProdCode(String prodCode)
/* 136:    */   {
/* 137:142 */     this.prodCode = prodCode;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String getProdCode()
/* 141:    */   {
/* 142:146 */     return this.prodCode;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getApiMethodName()
/* 146:    */   {
/* 147:150 */     return "alipay.ebpp.bill.search";
/* 148:    */   }
/* 149:    */   
/* 150:    */   public Map<String, String> getTextParams()
/* 151:    */   {
/* 152:154 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 153:155 */     txtParams.put("bill_key", this.billKey);
/* 154:156 */     txtParams.put("charge_inst", this.chargeInst);
/* 155:157 */     txtParams.put("chargeoff_inst", this.chargeoffInst);
/* 156:158 */     txtParams.put("company_id", this.companyId);
/* 157:159 */     txtParams.put("extend", this.extend);
/* 158:160 */     txtParams.put("order_type", this.orderType);
/* 159:161 */     txtParams.put("sub_order_type", this.subOrderType);
/* 160:162 */     if (this.udfParams != null) {
/* 161:163 */       txtParams.putAll(this.udfParams);
/* 162:    */     }
/* 163:165 */     return txtParams;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void putOtherTextParam(String key, String value)
/* 167:    */   {
/* 168:169 */     if (this.udfParams == null) {
/* 169:170 */       this.udfParams = new AlipayHashMap();
/* 170:    */     }
/* 171:172 */     this.udfParams.put(key, value);
/* 172:    */   }
/* 173:    */   
/* 174:    */   public Class<AlipayEbppBillSearchResponse> getResponseClass()
/* 175:    */   {
/* 176:176 */     return AlipayEbppBillSearchResponse.class;
/* 177:    */   }
/* 178:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayEbppBillSearchRequest
 * JD-Core Version:    0.7.0.1
 */