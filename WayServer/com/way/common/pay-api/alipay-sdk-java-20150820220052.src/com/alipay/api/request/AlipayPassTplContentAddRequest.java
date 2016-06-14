/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayPassTplContentAddResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayPassTplContentAddRequest
/*   9:    */   implements AlipayRequest<AlipayPassTplContentAddResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String recognitionInfo;
/*  14:    */   private String recognitionType;
/*  15:    */   private String tplId;
/*  16:    */   private String tplParams;
/*  17:    */   private String terminalType;
/*  18:    */   private String terminalInfo;
/*  19:    */   private String prodCode;
/*  20:    */   private String notifyUrl;
/*  21:    */   
/*  22:    */   public void setRecognitionInfo(String recognitionInfo)
/*  23:    */   {
/*  24: 44 */     this.recognitionInfo = recognitionInfo;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public String getRecognitionInfo()
/*  28:    */   {
/*  29: 47 */     return this.recognitionInfo;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setRecognitionType(String recognitionType)
/*  33:    */   {
/*  34: 51 */     this.recognitionType = recognitionType;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getRecognitionType()
/*  38:    */   {
/*  39: 54 */     return this.recognitionType;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setTplId(String tplId)
/*  43:    */   {
/*  44: 58 */     this.tplId = tplId;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getTplId()
/*  48:    */   {
/*  49: 61 */     return this.tplId;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setTplParams(String tplParams)
/*  53:    */   {
/*  54: 65 */     this.tplParams = tplParams;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getTplParams()
/*  58:    */   {
/*  59: 68 */     return this.tplParams;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getNotifyUrl()
/*  63:    */   {
/*  64: 76 */     return this.notifyUrl;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setNotifyUrl(String notifyUrl)
/*  68:    */   {
/*  69: 80 */     this.notifyUrl = notifyUrl;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getApiVersion()
/*  73:    */   {
/*  74: 84 */     return this.apiVersion;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setApiVersion(String apiVersion)
/*  78:    */   {
/*  79: 88 */     this.apiVersion = apiVersion;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setTerminalType(String terminalType)
/*  83:    */   {
/*  84: 92 */     this.terminalType = terminalType;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getTerminalType()
/*  88:    */   {
/*  89: 96 */     return this.terminalType;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setTerminalInfo(String terminalInfo)
/*  93:    */   {
/*  94:100 */     this.terminalInfo = terminalInfo;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getTerminalInfo()
/*  98:    */   {
/*  99:104 */     return this.terminalInfo;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setProdCode(String prodCode)
/* 103:    */   {
/* 104:108 */     this.prodCode = prodCode;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getProdCode()
/* 108:    */   {
/* 109:112 */     return this.prodCode;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getApiMethodName()
/* 113:    */   {
/* 114:116 */     return "alipay.pass.tpl.content.add";
/* 115:    */   }
/* 116:    */   
/* 117:    */   public Map<String, String> getTextParams()
/* 118:    */   {
/* 119:120 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 120:121 */     txtParams.put("recognition_info", this.recognitionInfo);
/* 121:122 */     txtParams.put("recognition_type", this.recognitionType);
/* 122:123 */     txtParams.put("tpl_id", this.tplId);
/* 123:124 */     txtParams.put("tpl_params", this.tplParams);
/* 124:125 */     if (this.udfParams != null) {
/* 125:126 */       txtParams.putAll(this.udfParams);
/* 126:    */     }
/* 127:128 */     return txtParams;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void putOtherTextParam(String key, String value)
/* 131:    */   {
/* 132:132 */     if (this.udfParams == null) {
/* 133:133 */       this.udfParams = new AlipayHashMap();
/* 134:    */     }
/* 135:135 */     this.udfParams.put(key, value);
/* 136:    */   }
/* 137:    */   
/* 138:    */   public Class<AlipayPassTplContentAddResponse> getResponseClass()
/* 139:    */   {
/* 140:139 */     return AlipayPassTplContentAddResponse.class;
/* 141:    */   }
/* 142:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayPassTplContentAddRequest
 * JD-Core Version:    0.7.0.1
 */