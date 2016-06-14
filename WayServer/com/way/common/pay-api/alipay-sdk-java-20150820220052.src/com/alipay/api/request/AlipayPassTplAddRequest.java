/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayPassTplAddResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayPassTplAddRequest
/*   9:    */   implements AlipayRequest<AlipayPassTplAddResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String tplContent;
/*  14:    */   private String uniqueId;
/*  15:    */   private String terminalType;
/*  16:    */   private String terminalInfo;
/*  17:    */   private String prodCode;
/*  18:    */   private String notifyUrl;
/*  19:    */   
/*  20:    */   public void setTplContent(String tplContent)
/*  21:    */   {
/*  22: 32 */     this.tplContent = tplContent;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public String getTplContent()
/*  26:    */   {
/*  27: 35 */     return this.tplContent;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setUniqueId(String uniqueId)
/*  31:    */   {
/*  32: 39 */     this.uniqueId = uniqueId;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getUniqueId()
/*  36:    */   {
/*  37: 42 */     return this.uniqueId;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getNotifyUrl()
/*  41:    */   {
/*  42: 50 */     return this.notifyUrl;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setNotifyUrl(String notifyUrl)
/*  46:    */   {
/*  47: 54 */     this.notifyUrl = notifyUrl;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getApiVersion()
/*  51:    */   {
/*  52: 58 */     return this.apiVersion;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setApiVersion(String apiVersion)
/*  56:    */   {
/*  57: 62 */     this.apiVersion = apiVersion;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setTerminalType(String terminalType)
/*  61:    */   {
/*  62: 66 */     this.terminalType = terminalType;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getTerminalType()
/*  66:    */   {
/*  67: 70 */     return this.terminalType;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setTerminalInfo(String terminalInfo)
/*  71:    */   {
/*  72: 74 */     this.terminalInfo = terminalInfo;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getTerminalInfo()
/*  76:    */   {
/*  77: 78 */     return this.terminalInfo;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setProdCode(String prodCode)
/*  81:    */   {
/*  82: 82 */     this.prodCode = prodCode;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getProdCode()
/*  86:    */   {
/*  87: 86 */     return this.prodCode;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getApiMethodName()
/*  91:    */   {
/*  92: 90 */     return "alipay.pass.tpl.add";
/*  93:    */   }
/*  94:    */   
/*  95:    */   public Map<String, String> getTextParams()
/*  96:    */   {
/*  97: 94 */     AlipayHashMap txtParams = new AlipayHashMap();
/*  98: 95 */     txtParams.put("tpl_content", this.tplContent);
/*  99: 96 */     txtParams.put("unique_id", this.uniqueId);
/* 100: 97 */     if (this.udfParams != null) {
/* 101: 98 */       txtParams.putAll(this.udfParams);
/* 102:    */     }
/* 103:100 */     return txtParams;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void putOtherTextParam(String key, String value)
/* 107:    */   {
/* 108:104 */     if (this.udfParams == null) {
/* 109:105 */       this.udfParams = new AlipayHashMap();
/* 110:    */     }
/* 111:107 */     this.udfParams.put(key, value);
/* 112:    */   }
/* 113:    */   
/* 114:    */   public Class<AlipayPassTplAddResponse> getResponseClass()
/* 115:    */   {
/* 116:111 */     return AlipayPassTplAddResponse.class;
/* 117:    */   }
/* 118:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayPassTplAddRequest
 * JD-Core Version:    0.7.0.1
 */