/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayPassSyncAddResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayPassSyncAddRequest
/*   9:    */   implements AlipayRequest<AlipayPassSyncAddResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String fileContent;
/*  14:    */   private String outTradeNo;
/*  15:    */   private String partnerId;
/*  16:    */   private String userId;
/*  17:    */   private String terminalType;
/*  18:    */   private String terminalInfo;
/*  19:    */   private String prodCode;
/*  20:    */   private String notifyUrl;
/*  21:    */   
/*  22:    */   public void setFileContent(String fileContent)
/*  23:    */   {
/*  24: 41 */     this.fileContent = fileContent;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public String getFileContent()
/*  28:    */   {
/*  29: 44 */     return this.fileContent;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setOutTradeNo(String outTradeNo)
/*  33:    */   {
/*  34: 48 */     this.outTradeNo = outTradeNo;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getOutTradeNo()
/*  38:    */   {
/*  39: 51 */     return this.outTradeNo;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setPartnerId(String partnerId)
/*  43:    */   {
/*  44: 55 */     this.partnerId = partnerId;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getPartnerId()
/*  48:    */   {
/*  49: 58 */     return this.partnerId;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setUserId(String userId)
/*  53:    */   {
/*  54: 62 */     this.userId = userId;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getUserId()
/*  58:    */   {
/*  59: 65 */     return this.userId;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getNotifyUrl()
/*  63:    */   {
/*  64: 73 */     return this.notifyUrl;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setNotifyUrl(String notifyUrl)
/*  68:    */   {
/*  69: 77 */     this.notifyUrl = notifyUrl;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getApiVersion()
/*  73:    */   {
/*  74: 81 */     return this.apiVersion;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setApiVersion(String apiVersion)
/*  78:    */   {
/*  79: 85 */     this.apiVersion = apiVersion;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setTerminalType(String terminalType)
/*  83:    */   {
/*  84: 89 */     this.terminalType = terminalType;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getTerminalType()
/*  88:    */   {
/*  89: 93 */     return this.terminalType;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setTerminalInfo(String terminalInfo)
/*  93:    */   {
/*  94: 97 */     this.terminalInfo = terminalInfo;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getTerminalInfo()
/*  98:    */   {
/*  99:101 */     return this.terminalInfo;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setProdCode(String prodCode)
/* 103:    */   {
/* 104:105 */     this.prodCode = prodCode;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getProdCode()
/* 108:    */   {
/* 109:109 */     return this.prodCode;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getApiMethodName()
/* 113:    */   {
/* 114:113 */     return "alipay.pass.sync.add";
/* 115:    */   }
/* 116:    */   
/* 117:    */   public Map<String, String> getTextParams()
/* 118:    */   {
/* 119:117 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 120:118 */     txtParams.put("file_content", this.fileContent);
/* 121:119 */     txtParams.put("out_trade_no", this.outTradeNo);
/* 122:120 */     txtParams.put("partner_id", this.partnerId);
/* 123:121 */     txtParams.put("user_id", this.userId);
/* 124:122 */     if (this.udfParams != null) {
/* 125:123 */       txtParams.putAll(this.udfParams);
/* 126:    */     }
/* 127:125 */     return txtParams;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void putOtherTextParam(String key, String value)
/* 131:    */   {
/* 132:129 */     if (this.udfParams == null) {
/* 133:130 */       this.udfParams = new AlipayHashMap();
/* 134:    */     }
/* 135:132 */     this.udfParams.put(key, value);
/* 136:    */   }
/* 137:    */   
/* 138:    */   public Class<AlipayPassSyncAddResponse> getResponseClass()
/* 139:    */   {
/* 140:136 */     return AlipayPassSyncAddResponse.class;
/* 141:    */   }
/* 142:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayPassSyncAddRequest
 * JD-Core Version:    0.7.0.1
 */