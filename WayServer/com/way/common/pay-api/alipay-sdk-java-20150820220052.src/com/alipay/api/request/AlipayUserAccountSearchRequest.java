/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayUserAccountSearchResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayUserAccountSearchRequest
/*   9:    */   implements AlipayRequest<AlipayUserAccountSearchResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String endTime;
/*  14:    */   private String fields;
/*  15:    */   private String pageNo;
/*  16:    */   private String pageSize;
/*  17:    */   private String startTime;
/*  18:    */   private String type;
/*  19:    */   private String terminalType;
/*  20:    */   private String terminalInfo;
/*  21:    */   private String prodCode;
/*  22:    */   private String notifyUrl;
/*  23:    */   
/*  24:    */   public void setEndTime(String endTime)
/*  25:    */   {
/*  26: 51 */     this.endTime = endTime;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String getEndTime()
/*  30:    */   {
/*  31: 54 */     return this.endTime;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setFields(String fields)
/*  35:    */   {
/*  36: 58 */     this.fields = fields;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getFields()
/*  40:    */   {
/*  41: 61 */     return this.fields;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setPageNo(String pageNo)
/*  45:    */   {
/*  46: 65 */     this.pageNo = pageNo;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getPageNo()
/*  50:    */   {
/*  51: 68 */     return this.pageNo;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setPageSize(String pageSize)
/*  55:    */   {
/*  56: 72 */     this.pageSize = pageSize;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getPageSize()
/*  60:    */   {
/*  61: 75 */     return this.pageSize;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setStartTime(String startTime)
/*  65:    */   {
/*  66: 79 */     this.startTime = startTime;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getStartTime()
/*  70:    */   {
/*  71: 82 */     return this.startTime;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setType(String type)
/*  75:    */   {
/*  76: 86 */     this.type = type;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getType()
/*  80:    */   {
/*  81: 89 */     return this.type;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getNotifyUrl()
/*  85:    */   {
/*  86: 97 */     return this.notifyUrl;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setNotifyUrl(String notifyUrl)
/*  90:    */   {
/*  91:101 */     this.notifyUrl = notifyUrl;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getApiVersion()
/*  95:    */   {
/*  96:105 */     return this.apiVersion;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setApiVersion(String apiVersion)
/* 100:    */   {
/* 101:109 */     this.apiVersion = apiVersion;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setTerminalType(String terminalType)
/* 105:    */   {
/* 106:113 */     this.terminalType = terminalType;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getTerminalType()
/* 110:    */   {
/* 111:117 */     return this.terminalType;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setTerminalInfo(String terminalInfo)
/* 115:    */   {
/* 116:121 */     this.terminalInfo = terminalInfo;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public String getTerminalInfo()
/* 120:    */   {
/* 121:125 */     return this.terminalInfo;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setProdCode(String prodCode)
/* 125:    */   {
/* 126:129 */     this.prodCode = prodCode;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public String getProdCode()
/* 130:    */   {
/* 131:133 */     return this.prodCode;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getApiMethodName()
/* 135:    */   {
/* 136:137 */     return "alipay.user.account.search";
/* 137:    */   }
/* 138:    */   
/* 139:    */   public Map<String, String> getTextParams()
/* 140:    */   {
/* 141:141 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 142:142 */     txtParams.put("end_time", this.endTime);
/* 143:143 */     txtParams.put("fields", this.fields);
/* 144:144 */     txtParams.put("page_no", this.pageNo);
/* 145:145 */     txtParams.put("page_size", this.pageSize);
/* 146:146 */     txtParams.put("start_time", this.startTime);
/* 147:147 */     txtParams.put("type", this.type);
/* 148:148 */     if (this.udfParams != null) {
/* 149:149 */       txtParams.putAll(this.udfParams);
/* 150:    */     }
/* 151:151 */     return txtParams;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void putOtherTextParam(String key, String value)
/* 155:    */   {
/* 156:155 */     if (this.udfParams == null) {
/* 157:156 */       this.udfParams = new AlipayHashMap();
/* 158:    */     }
/* 159:158 */     this.udfParams.put(key, value);
/* 160:    */   }
/* 161:    */   
/* 162:    */   public Class<AlipayUserAccountSearchResponse> getResponseClass()
/* 163:    */   {
/* 164:162 */     return AlipayUserAccountSearchResponse.class;
/* 165:    */   }
/* 166:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayUserAccountSearchRequest
 * JD-Core Version:    0.7.0.1
 */