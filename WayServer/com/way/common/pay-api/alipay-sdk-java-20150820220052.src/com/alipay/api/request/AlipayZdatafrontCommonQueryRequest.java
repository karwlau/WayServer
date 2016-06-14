/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayZdatafrontCommonQueryResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayZdatafrontCommonQueryRequest
/*   9:    */   implements AlipayRequest<AlipayZdatafrontCommonQueryResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private Long cacheInterval;
/*  14:    */   private String queryConditions;
/*  15:    */   private String serviceName;
/*  16:    */   private String visitBiz;
/*  17:    */   private String visitBizLine;
/*  18:    */   private String visitDomain;
/*  19:    */   private String terminalType;
/*  20:    */   private String terminalInfo;
/*  21:    */   private String prodCode;
/*  22:    */   private String notifyUrl;
/*  23:    */   
/*  24:    */   public void setCacheInterval(Long cacheInterval)
/*  25:    */   {
/*  26: 53 */     this.cacheInterval = cacheInterval;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public Long getCacheInterval()
/*  30:    */   {
/*  31: 56 */     return this.cacheInterval;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setQueryConditions(String queryConditions)
/*  35:    */   {
/*  36: 60 */     this.queryConditions = queryConditions;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getQueryConditions()
/*  40:    */   {
/*  41: 63 */     return this.queryConditions;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setServiceName(String serviceName)
/*  45:    */   {
/*  46: 67 */     this.serviceName = serviceName;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getServiceName()
/*  50:    */   {
/*  51: 70 */     return this.serviceName;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setVisitBiz(String visitBiz)
/*  55:    */   {
/*  56: 74 */     this.visitBiz = visitBiz;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getVisitBiz()
/*  60:    */   {
/*  61: 77 */     return this.visitBiz;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setVisitBizLine(String visitBizLine)
/*  65:    */   {
/*  66: 81 */     this.visitBizLine = visitBizLine;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getVisitBizLine()
/*  70:    */   {
/*  71: 84 */     return this.visitBizLine;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setVisitDomain(String visitDomain)
/*  75:    */   {
/*  76: 88 */     this.visitDomain = visitDomain;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getVisitDomain()
/*  80:    */   {
/*  81: 91 */     return this.visitDomain;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getNotifyUrl()
/*  85:    */   {
/*  86: 99 */     return this.notifyUrl;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setNotifyUrl(String notifyUrl)
/*  90:    */   {
/*  91:103 */     this.notifyUrl = notifyUrl;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getApiVersion()
/*  95:    */   {
/*  96:107 */     return this.apiVersion;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setApiVersion(String apiVersion)
/* 100:    */   {
/* 101:111 */     this.apiVersion = apiVersion;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setTerminalType(String terminalType)
/* 105:    */   {
/* 106:115 */     this.terminalType = terminalType;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getTerminalType()
/* 110:    */   {
/* 111:119 */     return this.terminalType;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setTerminalInfo(String terminalInfo)
/* 115:    */   {
/* 116:123 */     this.terminalInfo = terminalInfo;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public String getTerminalInfo()
/* 120:    */   {
/* 121:127 */     return this.terminalInfo;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setProdCode(String prodCode)
/* 125:    */   {
/* 126:131 */     this.prodCode = prodCode;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public String getProdCode()
/* 130:    */   {
/* 131:135 */     return this.prodCode;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getApiMethodName()
/* 135:    */   {
/* 136:139 */     return "alipay.zdatafront.common.query";
/* 137:    */   }
/* 138:    */   
/* 139:    */   public Map<String, String> getTextParams()
/* 140:    */   {
/* 141:143 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 142:144 */     txtParams.put("cache_interval", this.cacheInterval);
/* 143:145 */     txtParams.put("query_conditions", this.queryConditions);
/* 144:146 */     txtParams.put("service_name", this.serviceName);
/* 145:147 */     txtParams.put("visit_biz", this.visitBiz);
/* 146:148 */     txtParams.put("visit_biz_line", this.visitBizLine);
/* 147:149 */     txtParams.put("visit_domain", this.visitDomain);
/* 148:150 */     if (this.udfParams != null) {
/* 149:151 */       txtParams.putAll(this.udfParams);
/* 150:    */     }
/* 151:153 */     return txtParams;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void putOtherTextParam(String key, String value)
/* 155:    */   {
/* 156:157 */     if (this.udfParams == null) {
/* 157:158 */       this.udfParams = new AlipayHashMap();
/* 158:    */     }
/* 159:160 */     this.udfParams.put(key, value);
/* 160:    */   }
/* 161:    */   
/* 162:    */   public Class<AlipayZdatafrontCommonQueryResponse> getResponseClass()
/* 163:    */   {
/* 164:164 */     return AlipayZdatafrontCommonQueryResponse.class;
/* 165:    */   }
/* 166:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayZdatafrontCommonQueryRequest
 * JD-Core Version:    0.7.0.1
 */