/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipaySiteprobeDeviceInfoSearchResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipaySiteprobeDeviceInfoSearchRequest
/*   9:    */   implements AlipayRequest<AlipaySiteprobeDeviceInfoSearchResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String bizContent;
/*  14:    */   private String terminalType;
/*  15:    */   private String terminalInfo;
/*  16:    */   private String prodCode;
/*  17:    */   private String notifyUrl;
/*  18:    */   
/*  19:    */   public void setBizContent(String bizContent)
/*  20:    */   {
/*  21: 29 */     this.bizContent = bizContent;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public String getBizContent()
/*  25:    */   {
/*  26: 32 */     return this.bizContent;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String getNotifyUrl()
/*  30:    */   {
/*  31: 40 */     return this.notifyUrl;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setNotifyUrl(String notifyUrl)
/*  35:    */   {
/*  36: 44 */     this.notifyUrl = notifyUrl;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getApiVersion()
/*  40:    */   {
/*  41: 48 */     return this.apiVersion;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setApiVersion(String apiVersion)
/*  45:    */   {
/*  46: 52 */     this.apiVersion = apiVersion;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setTerminalType(String terminalType)
/*  50:    */   {
/*  51: 56 */     this.terminalType = terminalType;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public String getTerminalType()
/*  55:    */   {
/*  56: 60 */     return this.terminalType;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setTerminalInfo(String terminalInfo)
/*  60:    */   {
/*  61: 64 */     this.terminalInfo = terminalInfo;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getTerminalInfo()
/*  65:    */   {
/*  66: 68 */     return this.terminalInfo;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setProdCode(String prodCode)
/*  70:    */   {
/*  71: 72 */     this.prodCode = prodCode;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getProdCode()
/*  75:    */   {
/*  76: 76 */     return this.prodCode;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getApiMethodName()
/*  80:    */   {
/*  81: 80 */     return "alipay.siteprobe.device.info.search";
/*  82:    */   }
/*  83:    */   
/*  84:    */   public Map<String, String> getTextParams()
/*  85:    */   {
/*  86: 84 */     AlipayHashMap txtParams = new AlipayHashMap();
/*  87: 85 */     txtParams.put("biz_content", this.bizContent);
/*  88: 86 */     if (this.udfParams != null) {
/*  89: 87 */       txtParams.putAll(this.udfParams);
/*  90:    */     }
/*  91: 89 */     return txtParams;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void putOtherTextParam(String key, String value)
/*  95:    */   {
/*  96: 93 */     if (this.udfParams == null) {
/*  97: 94 */       this.udfParams = new AlipayHashMap();
/*  98:    */     }
/*  99: 96 */     this.udfParams.put(key, value);
/* 100:    */   }
/* 101:    */   
/* 102:    */   public Class<AlipaySiteprobeDeviceInfoSearchResponse> getResponseClass()
/* 103:    */   {
/* 104:100 */     return AlipaySiteprobeDeviceInfoSearchResponse.class;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipaySiteprobeDeviceInfoSearchRequest
 * JD-Core Version:    0.7.0.1
 */