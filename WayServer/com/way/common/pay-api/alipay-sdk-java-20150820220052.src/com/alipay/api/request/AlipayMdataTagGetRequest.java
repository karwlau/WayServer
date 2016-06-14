/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayMdataTagGetResponse;
/*   6:    */ import java.util.List;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayMdataTagGetRequest
/*  10:    */   implements AlipayRequest<AlipayMdataTagGetResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private List<String> requiredTags;
/*  15:    */   private String userId;
/*  16:    */   private String terminalType;
/*  17:    */   private String terminalInfo;
/*  18:    */   private String prodCode;
/*  19:    */   private String notifyUrl;
/*  20:    */   
/*  21:    */   public void setRequiredTags(List<String> requiredTags)
/*  22:    */   {
/*  23: 32 */     this.requiredTags = requiredTags;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public List<String> getRequiredTags()
/*  27:    */   {
/*  28: 35 */     return this.requiredTags;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void setUserId(String userId)
/*  32:    */   {
/*  33: 39 */     this.userId = userId;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public String getUserId()
/*  37:    */   {
/*  38: 42 */     return this.userId;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getNotifyUrl()
/*  42:    */   {
/*  43: 50 */     return this.notifyUrl;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setNotifyUrl(String notifyUrl)
/*  47:    */   {
/*  48: 54 */     this.notifyUrl = notifyUrl;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getApiVersion()
/*  52:    */   {
/*  53: 58 */     return this.apiVersion;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setApiVersion(String apiVersion)
/*  57:    */   {
/*  58: 62 */     this.apiVersion = apiVersion;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setTerminalType(String terminalType)
/*  62:    */   {
/*  63: 66 */     this.terminalType = terminalType;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getTerminalType()
/*  67:    */   {
/*  68: 70 */     return this.terminalType;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setTerminalInfo(String terminalInfo)
/*  72:    */   {
/*  73: 74 */     this.terminalInfo = terminalInfo;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getTerminalInfo()
/*  77:    */   {
/*  78: 78 */     return this.terminalInfo;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setProdCode(String prodCode)
/*  82:    */   {
/*  83: 82 */     this.prodCode = prodCode;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getProdCode()
/*  87:    */   {
/*  88: 86 */     return this.prodCode;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getApiMethodName()
/*  92:    */   {
/*  93: 90 */     return "alipay.mdata.tag.get";
/*  94:    */   }
/*  95:    */   
/*  96:    */   public Map<String, String> getTextParams()
/*  97:    */   {
/*  98: 94 */     AlipayHashMap txtParams = new AlipayHashMap();
/*  99: 95 */     txtParams.put("required_tags", this.requiredTags);
/* 100: 96 */     txtParams.put("user_id", this.userId);
/* 101: 97 */     if (this.udfParams != null) {
/* 102: 98 */       txtParams.putAll(this.udfParams);
/* 103:    */     }
/* 104:100 */     return txtParams;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void putOtherTextParam(String key, String value)
/* 108:    */   {
/* 109:104 */     if (this.udfParams == null) {
/* 110:105 */       this.udfParams = new AlipayHashMap();
/* 111:    */     }
/* 112:107 */     this.udfParams.put(key, value);
/* 113:    */   }
/* 114:    */   
/* 115:    */   public Class<AlipayMdataTagGetResponse> getResponseClass()
/* 116:    */   {
/* 117:111 */     return AlipayMdataTagGetResponse.class;
/* 118:    */   }
/* 119:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayMdataTagGetRequest
 * JD-Core Version:    0.7.0.1
 */