/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayEcapiprodDrawndnRepaymentrecordQueryResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayEcapiprodDrawndnRepaymentrecordQueryRequest
/*   9:    */   implements AlipayRequest<AlipayEcapiprodDrawndnRepaymentrecordQueryResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String drawndnNo;
/*  14:    */   private String end;
/*  15:    */   private String entityCode;
/*  16:    */   private String entityName;
/*  17:    */   private String isvCode;
/*  18:    */   private String orgCode;
/*  19:    */   private String start;
/*  20:    */   private String terminalType;
/*  21:    */   private String terminalInfo;
/*  22:    */   private String prodCode;
/*  23:    */   private String notifyUrl;
/*  24:    */   
/*  25:    */   public void setDrawndnNo(String drawndnNo)
/*  26:    */   {
/*  27: 56 */     this.drawndnNo = drawndnNo;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public String getDrawndnNo()
/*  31:    */   {
/*  32: 59 */     return this.drawndnNo;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setEnd(String end)
/*  36:    */   {
/*  37: 63 */     this.end = end;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getEnd()
/*  41:    */   {
/*  42: 66 */     return this.end;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setEntityCode(String entityCode)
/*  46:    */   {
/*  47: 70 */     this.entityCode = entityCode;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getEntityCode()
/*  51:    */   {
/*  52: 73 */     return this.entityCode;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setEntityName(String entityName)
/*  56:    */   {
/*  57: 77 */     this.entityName = entityName;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getEntityName()
/*  61:    */   {
/*  62: 80 */     return this.entityName;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setIsvCode(String isvCode)
/*  66:    */   {
/*  67: 84 */     this.isvCode = isvCode;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getIsvCode()
/*  71:    */   {
/*  72: 87 */     return this.isvCode;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setOrgCode(String orgCode)
/*  76:    */   {
/*  77: 91 */     this.orgCode = orgCode;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getOrgCode()
/*  81:    */   {
/*  82: 94 */     return this.orgCode;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setStart(String start)
/*  86:    */   {
/*  87: 98 */     this.start = start;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getStart()
/*  91:    */   {
/*  92:101 */     return this.start;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public String getNotifyUrl()
/*  96:    */   {
/*  97:109 */     return this.notifyUrl;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void setNotifyUrl(String notifyUrl)
/* 101:    */   {
/* 102:113 */     this.notifyUrl = notifyUrl;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String getApiVersion()
/* 106:    */   {
/* 107:117 */     return this.apiVersion;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void setApiVersion(String apiVersion)
/* 111:    */   {
/* 112:121 */     this.apiVersion = apiVersion;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setTerminalType(String terminalType)
/* 116:    */   {
/* 117:125 */     this.terminalType = terminalType;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public String getTerminalType()
/* 121:    */   {
/* 122:129 */     return this.terminalType;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void setTerminalInfo(String terminalInfo)
/* 126:    */   {
/* 127:133 */     this.terminalInfo = terminalInfo;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public String getTerminalInfo()
/* 131:    */   {
/* 132:137 */     return this.terminalInfo;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void setProdCode(String prodCode)
/* 136:    */   {
/* 137:141 */     this.prodCode = prodCode;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String getProdCode()
/* 141:    */   {
/* 142:145 */     return this.prodCode;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public String getApiMethodName()
/* 146:    */   {
/* 147:149 */     return "alipay.ecapiprod.drawndn.repaymentrecord.query";
/* 148:    */   }
/* 149:    */   
/* 150:    */   public Map<String, String> getTextParams()
/* 151:    */   {
/* 152:153 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 153:154 */     txtParams.put("drawndn_no", this.drawndnNo);
/* 154:155 */     txtParams.put("end", this.end);
/* 155:156 */     txtParams.put("entity_code", this.entityCode);
/* 156:157 */     txtParams.put("entity_name", this.entityName);
/* 157:158 */     txtParams.put("isv_code", this.isvCode);
/* 158:159 */     txtParams.put("org_code", this.orgCode);
/* 159:160 */     txtParams.put("start", this.start);
/* 160:161 */     if (this.udfParams != null) {
/* 161:162 */       txtParams.putAll(this.udfParams);
/* 162:    */     }
/* 163:164 */     return txtParams;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void putOtherTextParam(String key, String value)
/* 167:    */   {
/* 168:168 */     if (this.udfParams == null) {
/* 169:169 */       this.udfParams = new AlipayHashMap();
/* 170:    */     }
/* 171:171 */     this.udfParams.put(key, value);
/* 172:    */   }
/* 173:    */   
/* 174:    */   public Class<AlipayEcapiprodDrawndnRepaymentrecordQueryResponse> getResponseClass()
/* 175:    */   {
/* 176:175 */     return AlipayEcapiprodDrawndnRepaymentrecordQueryResponse.class;
/* 177:    */   }
/* 178:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayEcapiprodDrawndnRepaymentrecordQueryRequest
 * JD-Core Version:    0.7.0.1
 */