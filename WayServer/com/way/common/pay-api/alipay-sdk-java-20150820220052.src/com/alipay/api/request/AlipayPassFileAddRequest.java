/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayPassFileAddResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayPassFileAddRequest
/*   9:    */   implements AlipayRequest<AlipayPassFileAddResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String fileContent;
/*  14:    */   private String recognitionInfo;
/*  15:    */   private String recognitionType;
/*  16:    */   private String terminalType;
/*  17:    */   private String terminalInfo;
/*  18:    */   private String prodCode;
/*  19:    */   private String notifyUrl;
/*  20:    */   
/*  21:    */   public void setFileContent(String fileContent)
/*  22:    */   {
/*  23: 39 */     this.fileContent = fileContent;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public String getFileContent()
/*  27:    */   {
/*  28: 42 */     return this.fileContent;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void setRecognitionInfo(String recognitionInfo)
/*  32:    */   {
/*  33: 46 */     this.recognitionInfo = recognitionInfo;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public String getRecognitionInfo()
/*  37:    */   {
/*  38: 49 */     return this.recognitionInfo;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setRecognitionType(String recognitionType)
/*  42:    */   {
/*  43: 53 */     this.recognitionType = recognitionType;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public String getRecognitionType()
/*  47:    */   {
/*  48: 56 */     return this.recognitionType;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getNotifyUrl()
/*  52:    */   {
/*  53: 64 */     return this.notifyUrl;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setNotifyUrl(String notifyUrl)
/*  57:    */   {
/*  58: 68 */     this.notifyUrl = notifyUrl;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getApiVersion()
/*  62:    */   {
/*  63: 72 */     return this.apiVersion;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setApiVersion(String apiVersion)
/*  67:    */   {
/*  68: 76 */     this.apiVersion = apiVersion;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setTerminalType(String terminalType)
/*  72:    */   {
/*  73: 80 */     this.terminalType = terminalType;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getTerminalType()
/*  77:    */   {
/*  78: 84 */     return this.terminalType;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setTerminalInfo(String terminalInfo)
/*  82:    */   {
/*  83: 88 */     this.terminalInfo = terminalInfo;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getTerminalInfo()
/*  87:    */   {
/*  88: 92 */     return this.terminalInfo;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setProdCode(String prodCode)
/*  92:    */   {
/*  93: 96 */     this.prodCode = prodCode;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String getProdCode()
/*  97:    */   {
/*  98:100 */     return this.prodCode;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getApiMethodName()
/* 102:    */   {
/* 103:104 */     return "alipay.pass.file.add";
/* 104:    */   }
/* 105:    */   
/* 106:    */   public Map<String, String> getTextParams()
/* 107:    */   {
/* 108:108 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 109:109 */     txtParams.put("file_content", this.fileContent);
/* 110:110 */     txtParams.put("recognition_info", this.recognitionInfo);
/* 111:111 */     txtParams.put("recognition_type", this.recognitionType);
/* 112:112 */     if (this.udfParams != null) {
/* 113:113 */       txtParams.putAll(this.udfParams);
/* 114:    */     }
/* 115:115 */     return txtParams;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void putOtherTextParam(String key, String value)
/* 119:    */   {
/* 120:119 */     if (this.udfParams == null) {
/* 121:120 */       this.udfParams = new AlipayHashMap();
/* 122:    */     }
/* 123:122 */     this.udfParams.put(key, value);
/* 124:    */   }
/* 125:    */   
/* 126:    */   public Class<AlipayPassFileAddResponse> getResponseClass()
/* 127:    */   {
/* 128:126 */     return AlipayPassFileAddResponse.class;
/* 129:    */   }
/* 130:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayPassFileAddRequest
 * JD-Core Version:    0.7.0.1
 */