/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayPassCodeAddResponse;
/*   6:    */ import java.util.List;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayPassCodeAddRequest
/*  10:    */   implements AlipayRequest<AlipayPassCodeAddResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String fileContent;
/*  15:    */   private String recognitionInfo;
/*  16:    */   private String recognitionType;
/*  17:    */   private List<String> verifyType;
/*  18:    */   private String terminalType;
/*  19:    */   private String terminalInfo;
/*  20:    */   private String prodCode;
/*  21:    */   private String notifyUrl;
/*  22:    */   
/*  23:    */   public void setFileContent(String fileContent)
/*  24:    */   {
/*  25: 46 */     this.fileContent = fileContent;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public String getFileContent()
/*  29:    */   {
/*  30: 49 */     return this.fileContent;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setRecognitionInfo(String recognitionInfo)
/*  34:    */   {
/*  35: 53 */     this.recognitionInfo = recognitionInfo;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getRecognitionInfo()
/*  39:    */   {
/*  40: 56 */     return this.recognitionInfo;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setRecognitionType(String recognitionType)
/*  44:    */   {
/*  45: 60 */     this.recognitionType = recognitionType;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getRecognitionType()
/*  49:    */   {
/*  50: 63 */     return this.recognitionType;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setVerifyType(List<String> verifyType)
/*  54:    */   {
/*  55: 67 */     this.verifyType = verifyType;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public List<String> getVerifyType()
/*  59:    */   {
/*  60: 70 */     return this.verifyType;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public String getNotifyUrl()
/*  64:    */   {
/*  65: 78 */     return this.notifyUrl;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setNotifyUrl(String notifyUrl)
/*  69:    */   {
/*  70: 82 */     this.notifyUrl = notifyUrl;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getApiVersion()
/*  74:    */   {
/*  75: 86 */     return this.apiVersion;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setApiVersion(String apiVersion)
/*  79:    */   {
/*  80: 90 */     this.apiVersion = apiVersion;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setTerminalType(String terminalType)
/*  84:    */   {
/*  85: 94 */     this.terminalType = terminalType;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getTerminalType()
/*  89:    */   {
/*  90: 98 */     return this.terminalType;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setTerminalInfo(String terminalInfo)
/*  94:    */   {
/*  95:102 */     this.terminalInfo = terminalInfo;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getTerminalInfo()
/*  99:    */   {
/* 100:106 */     return this.terminalInfo;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setProdCode(String prodCode)
/* 104:    */   {
/* 105:110 */     this.prodCode = prodCode;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public String getProdCode()
/* 109:    */   {
/* 110:114 */     return this.prodCode;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String getApiMethodName()
/* 114:    */   {
/* 115:118 */     return "alipay.pass.code.add";
/* 116:    */   }
/* 117:    */   
/* 118:    */   public Map<String, String> getTextParams()
/* 119:    */   {
/* 120:122 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 121:123 */     txtParams.put("file_content", this.fileContent);
/* 122:124 */     txtParams.put("recognition_info", this.recognitionInfo);
/* 123:125 */     txtParams.put("recognition_type", this.recognitionType);
/* 124:126 */     txtParams.put("verify_type", this.verifyType);
/* 125:127 */     if (this.udfParams != null) {
/* 126:128 */       txtParams.putAll(this.udfParams);
/* 127:    */     }
/* 128:130 */     return txtParams;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void putOtherTextParam(String key, String value)
/* 132:    */   {
/* 133:134 */     if (this.udfParams == null) {
/* 134:135 */       this.udfParams = new AlipayHashMap();
/* 135:    */     }
/* 136:137 */     this.udfParams.put(key, value);
/* 137:    */   }
/* 138:    */   
/* 139:    */   public Class<AlipayPassCodeAddResponse> getResponseClass()
/* 140:    */   {
/* 141:141 */     return AlipayPassCodeAddResponse.class;
/* 142:    */   }
/* 143:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayPassCodeAddRequest
 * JD-Core Version:    0.7.0.1
 */