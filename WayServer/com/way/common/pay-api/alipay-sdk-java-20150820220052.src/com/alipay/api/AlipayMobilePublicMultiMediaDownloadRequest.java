/*   1:    */ package com.alipay.api;
/*   2:    */ 
/*   3:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   4:    */ import java.io.OutputStream;
/*   5:    */ import java.util.Map;
/*   6:    */ 
/*   7:    */ public class AlipayMobilePublicMultiMediaDownloadRequest
/*   8:    */   implements AlipayRequest<AlipayMobilePublicMultiMediaDownloadResponse>
/*   9:    */ {
/*  10:    */   private AlipayHashMap udfParams;
/*  11: 22 */   private String apiVersion = "1.0";
/*  12:    */   private String notifyUrl;
/*  13:    */   private OutputStream outputStream;
/*  14:    */   private String bizContent;
/*  15:    */   private String terminalType;
/*  16:    */   private String terminalInfo;
/*  17:    */   private String prodCode;
/*  18:    */   
/*  19:    */   public void setBizContent(String bizContent)
/*  20:    */   {
/*  21: 31 */     this.bizContent = bizContent;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public String getBizContent()
/*  25:    */   {
/*  26: 35 */     return this.bizContent;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String getApiVersion()
/*  30:    */   {
/*  31: 43 */     return this.apiVersion;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setApiVersion(String apiVersion)
/*  35:    */   {
/*  36: 47 */     this.apiVersion = apiVersion;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void setTerminalType(String terminalType)
/*  40:    */   {
/*  41: 51 */     this.terminalType = terminalType;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public String getTerminalType()
/*  45:    */   {
/*  46: 55 */     return this.terminalType;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setTerminalInfo(String terminalInfo)
/*  50:    */   {
/*  51: 59 */     this.terminalInfo = terminalInfo;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public String getTerminalInfo()
/*  55:    */   {
/*  56: 63 */     return this.terminalInfo;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setProdCode(String prodCode)
/*  60:    */   {
/*  61: 67 */     this.prodCode = prodCode;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getProdCode()
/*  65:    */   {
/*  66: 71 */     return this.prodCode;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getApiMethodName()
/*  70:    */   {
/*  71: 75 */     return "alipay.mobile.public.multimedia.download";
/*  72:    */   }
/*  73:    */   
/*  74:    */   public Map<String, String> getTextParams()
/*  75:    */   {
/*  76: 79 */     AlipayHashMap txtParams = new AlipayHashMap();
/*  77: 80 */     txtParams.put("biz_content", this.bizContent);
/*  78: 81 */     if (this.udfParams != null) {
/*  79: 82 */       txtParams.putAll(this.udfParams);
/*  80:    */     }
/*  81: 84 */     return txtParams;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void putOtherTextParam(String key, String value)
/*  85:    */   {
/*  86: 88 */     if (this.udfParams == null) {
/*  87: 89 */       this.udfParams = new AlipayHashMap();
/*  88:    */     }
/*  89: 91 */     this.udfParams.put(key, value);
/*  90:    */   }
/*  91:    */   
/*  92:    */   public OutputStream getOutputStream()
/*  93:    */   {
/*  94:100 */     return this.outputStream;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setOutputStream(OutputStream outputStream)
/*  98:    */   {
/*  99:109 */     this.outputStream = outputStream;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getNotifyUrl()
/* 103:    */   {
/* 104:118 */     return this.notifyUrl;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setNotifyUrl(String notifyUrl)
/* 108:    */   {
/* 109:127 */     this.notifyUrl = notifyUrl;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public Class<AlipayMobilePublicMultiMediaDownloadResponse> getResponseClass()
/* 113:    */   {
/* 114:131 */     return AlipayMobilePublicMultiMediaDownloadResponse.class;
/* 115:    */   }
/* 116:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.AlipayMobilePublicMultiMediaDownloadRequest
 * JD-Core Version:    0.7.0.1
 */