/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayMobileRecommendGetResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayMobileRecommendGetRequest
/*   9:    */   implements AlipayRequest<AlipayMobileRecommendGetResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String extInfo;
/*  14:    */   private String limit;
/*  15:    */   private String sceneId;
/*  16:    */   private String startIdx;
/*  17:    */   private String userId;
/*  18:    */   private String terminalType;
/*  19:    */   private String terminalInfo;
/*  20:    */   private String prodCode;
/*  21:    */   private String notifyUrl;
/*  22:    */   
/*  23:    */   public void setExtInfo(String extInfo)
/*  24:    */   {
/*  25: 46 */     this.extInfo = extInfo;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public String getExtInfo()
/*  29:    */   {
/*  30: 49 */     return this.extInfo;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setLimit(String limit)
/*  34:    */   {
/*  35: 53 */     this.limit = limit;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getLimit()
/*  39:    */   {
/*  40: 56 */     return this.limit;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setSceneId(String sceneId)
/*  44:    */   {
/*  45: 60 */     this.sceneId = sceneId;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getSceneId()
/*  49:    */   {
/*  50: 63 */     return this.sceneId;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setStartIdx(String startIdx)
/*  54:    */   {
/*  55: 67 */     this.startIdx = startIdx;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getStartIdx()
/*  59:    */   {
/*  60: 70 */     return this.startIdx;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setUserId(String userId)
/*  64:    */   {
/*  65: 74 */     this.userId = userId;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getUserId()
/*  69:    */   {
/*  70: 77 */     return this.userId;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getNotifyUrl()
/*  74:    */   {
/*  75: 85 */     return this.notifyUrl;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setNotifyUrl(String notifyUrl)
/*  79:    */   {
/*  80: 89 */     this.notifyUrl = notifyUrl;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public String getApiVersion()
/*  84:    */   {
/*  85: 93 */     return this.apiVersion;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setApiVersion(String apiVersion)
/*  89:    */   {
/*  90: 97 */     this.apiVersion = apiVersion;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setTerminalType(String terminalType)
/*  94:    */   {
/*  95:101 */     this.terminalType = terminalType;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getTerminalType()
/*  99:    */   {
/* 100:105 */     return this.terminalType;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setTerminalInfo(String terminalInfo)
/* 104:    */   {
/* 105:109 */     this.terminalInfo = terminalInfo;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public String getTerminalInfo()
/* 109:    */   {
/* 110:113 */     return this.terminalInfo;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setProdCode(String prodCode)
/* 114:    */   {
/* 115:117 */     this.prodCode = prodCode;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getProdCode()
/* 119:    */   {
/* 120:121 */     return this.prodCode;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public String getApiMethodName()
/* 124:    */   {
/* 125:125 */     return "alipay.mobile.recommend.get";
/* 126:    */   }
/* 127:    */   
/* 128:    */   public Map<String, String> getTextParams()
/* 129:    */   {
/* 130:129 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 131:130 */     txtParams.put("ext_info", this.extInfo);
/* 132:131 */     txtParams.put("limit", this.limit);
/* 133:132 */     txtParams.put("scene_id", this.sceneId);
/* 134:133 */     txtParams.put("start_idx", this.startIdx);
/* 135:134 */     txtParams.put("user_id", this.userId);
/* 136:135 */     if (this.udfParams != null) {
/* 137:136 */       txtParams.putAll(this.udfParams);
/* 138:    */     }
/* 139:138 */     return txtParams;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void putOtherTextParam(String key, String value)
/* 143:    */   {
/* 144:142 */     if (this.udfParams == null) {
/* 145:143 */       this.udfParams = new AlipayHashMap();
/* 146:    */     }
/* 147:145 */     this.udfParams.put(key, value);
/* 148:    */   }
/* 149:    */   
/* 150:    */   public Class<AlipayMobileRecommendGetResponse> getResponseClass()
/* 151:    */   {
/* 152:149 */     return AlipayMobileRecommendGetResponse.class;
/* 153:    */   }
/* 154:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayMobileRecommendGetRequest
 * JD-Core Version:    0.7.0.1
 */