/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayAssetAccountBindResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayAssetAccountBindRequest
/*   9:    */   implements AlipayRequest<AlipayAssetAccountBindResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String bindScene;
/*  14:    */   private String providerId;
/*  15:    */   private String providerUserId;
/*  16:    */   private String providerUserName;
/*  17:    */   private String terminalType;
/*  18:    */   private String terminalInfo;
/*  19:    */   private String prodCode;
/*  20:    */   private String notifyUrl;
/*  21:    */   
/*  22:    */   public void setBindScene(String bindScene)
/*  23:    */   {
/*  24: 45 */     this.bindScene = bindScene;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public String getBindScene()
/*  28:    */   {
/*  29: 48 */     return this.bindScene;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setProviderId(String providerId)
/*  33:    */   {
/*  34: 52 */     this.providerId = providerId;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getProviderId()
/*  38:    */   {
/*  39: 55 */     return this.providerId;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setProviderUserId(String providerUserId)
/*  43:    */   {
/*  44: 59 */     this.providerUserId = providerUserId;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getProviderUserId()
/*  48:    */   {
/*  49: 62 */     return this.providerUserId;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setProviderUserName(String providerUserName)
/*  53:    */   {
/*  54: 66 */     this.providerUserName = providerUserName;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getProviderUserName()
/*  58:    */   {
/*  59: 69 */     return this.providerUserName;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getNotifyUrl()
/*  63:    */   {
/*  64: 77 */     return this.notifyUrl;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setNotifyUrl(String notifyUrl)
/*  68:    */   {
/*  69: 81 */     this.notifyUrl = notifyUrl;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getApiVersion()
/*  73:    */   {
/*  74: 85 */     return this.apiVersion;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setApiVersion(String apiVersion)
/*  78:    */   {
/*  79: 89 */     this.apiVersion = apiVersion;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setTerminalType(String terminalType)
/*  83:    */   {
/*  84: 93 */     this.terminalType = terminalType;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getTerminalType()
/*  88:    */   {
/*  89: 97 */     return this.terminalType;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setTerminalInfo(String terminalInfo)
/*  93:    */   {
/*  94:101 */     this.terminalInfo = terminalInfo;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getTerminalInfo()
/*  98:    */   {
/*  99:105 */     return this.terminalInfo;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setProdCode(String prodCode)
/* 103:    */   {
/* 104:109 */     this.prodCode = prodCode;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getProdCode()
/* 108:    */   {
/* 109:113 */     return this.prodCode;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getApiMethodName()
/* 113:    */   {
/* 114:117 */     return "alipay.asset.account.bind";
/* 115:    */   }
/* 116:    */   
/* 117:    */   public Map<String, String> getTextParams()
/* 118:    */   {
/* 119:121 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 120:122 */     txtParams.put("bind_scene", this.bindScene);
/* 121:123 */     txtParams.put("provider_id", this.providerId);
/* 122:124 */     txtParams.put("provider_user_id", this.providerUserId);
/* 123:125 */     txtParams.put("provider_user_name", this.providerUserName);
/* 124:126 */     if (this.udfParams != null) {
/* 125:127 */       txtParams.putAll(this.udfParams);
/* 126:    */     }
/* 127:129 */     return txtParams;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void putOtherTextParam(String key, String value)
/* 131:    */   {
/* 132:133 */     if (this.udfParams == null) {
/* 133:134 */       this.udfParams = new AlipayHashMap();
/* 134:    */     }
/* 135:136 */     this.udfParams.put(key, value);
/* 136:    */   }
/* 137:    */   
/* 138:    */   public Class<AlipayAssetAccountBindResponse> getResponseClass()
/* 139:    */   {
/* 140:140 */     return AlipayAssetAccountBindResponse.class;
/* 141:    */   }
/* 142:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayAssetAccountBindRequest
 * JD-Core Version:    0.7.0.1
 */