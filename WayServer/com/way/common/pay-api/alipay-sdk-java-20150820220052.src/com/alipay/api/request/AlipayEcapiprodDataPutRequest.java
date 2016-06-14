/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayEcapiprodDataPutResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayEcapiprodDataPutRequest
/*   9:    */   implements AlipayRequest<AlipayEcapiprodDataPutResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String category;
/*  14:    */   private String charSet;
/*  15:    */   private String collectingTaskId;
/*  16:    */   private String entityCode;
/*  17:    */   private String entityName;
/*  18:    */   private String entityType;
/*  19:    */   private String isvCode;
/*  20:    */   private String jsonData;
/*  21:    */   private String orgCode;
/*  22:    */   private String terminalType;
/*  23:    */   private String terminalInfo;
/*  24:    */   private String prodCode;
/*  25:    */   private String notifyUrl;
/*  26:    */   
/*  27:    */   public void setCategory(String category)
/*  28:    */   {
/*  29: 66 */     this.category = category;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public String getCategory()
/*  33:    */   {
/*  34: 69 */     return this.category;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void setCharSet(String charSet)
/*  38:    */   {
/*  39: 73 */     this.charSet = charSet;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String getCharSet()
/*  43:    */   {
/*  44: 76 */     return this.charSet;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setCollectingTaskId(String collectingTaskId)
/*  48:    */   {
/*  49: 80 */     this.collectingTaskId = collectingTaskId;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String getCollectingTaskId()
/*  53:    */   {
/*  54: 83 */     return this.collectingTaskId;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setEntityCode(String entityCode)
/*  58:    */   {
/*  59: 87 */     this.entityCode = entityCode;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getEntityCode()
/*  63:    */   {
/*  64: 90 */     return this.entityCode;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setEntityName(String entityName)
/*  68:    */   {
/*  69: 94 */     this.entityName = entityName;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getEntityName()
/*  73:    */   {
/*  74: 97 */     return this.entityName;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setEntityType(String entityType)
/*  78:    */   {
/*  79:101 */     this.entityType = entityType;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getEntityType()
/*  83:    */   {
/*  84:104 */     return this.entityType;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setIsvCode(String isvCode)
/*  88:    */   {
/*  89:108 */     this.isvCode = isvCode;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getIsvCode()
/*  93:    */   {
/*  94:111 */     return this.isvCode;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setJsonData(String jsonData)
/*  98:    */   {
/*  99:115 */     this.jsonData = jsonData;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getJsonData()
/* 103:    */   {
/* 104:118 */     return this.jsonData;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setOrgCode(String orgCode)
/* 108:    */   {
/* 109:122 */     this.orgCode = orgCode;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getOrgCode()
/* 113:    */   {
/* 114:125 */     return this.orgCode;
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
/* 169:173 */     return "alipay.ecapiprod.data.put";
/* 170:    */   }
/* 171:    */   
/* 172:    */   public Map<String, String> getTextParams()
/* 173:    */   {
/* 174:177 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 175:178 */     txtParams.put("category", this.category);
/* 176:179 */     txtParams.put("char_set", this.charSet);
/* 177:180 */     txtParams.put("collecting_task_id", this.collectingTaskId);
/* 178:181 */     txtParams.put("entity_code", this.entityCode);
/* 179:182 */     txtParams.put("entity_name", this.entityName);
/* 180:183 */     txtParams.put("entity_type", this.entityType);
/* 181:184 */     txtParams.put("isv_code", this.isvCode);
/* 182:185 */     txtParams.put("json_data", this.jsonData);
/* 183:186 */     txtParams.put("org_code", this.orgCode);
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
/* 198:    */   public Class<AlipayEcapiprodDataPutResponse> getResponseClass()
/* 199:    */   {
/* 200:201 */     return AlipayEcapiprodDataPutResponse.class;
/* 201:    */   }
/* 202:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayEcapiprodDataPutRequest
 * JD-Core Version:    0.7.0.1
 */