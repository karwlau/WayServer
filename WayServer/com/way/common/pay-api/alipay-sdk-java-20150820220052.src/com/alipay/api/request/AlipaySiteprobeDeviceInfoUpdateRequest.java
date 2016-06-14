/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipaySiteprobeDeviceInfoUpdateResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipaySiteprobeDeviceInfoUpdateRequest
/*   9:    */   implements AlipayRequest<AlipaySiteprobeDeviceInfoUpdateResponse>
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
/*  21: 34 */     this.bizContent = bizContent;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public String getBizContent()
/*  25:    */   {
/*  26: 37 */     return this.bizContent;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String getNotifyUrl()
/*  30:    */   {
/*  31: 45 */     return this.notifyUrl;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setNotifyUrl(String notifyUrl)
/*  35:    */   {
/*  36: 49 */     this.notifyUrl = notifyUrl;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getApiVersion()
/*  40:    */   {
/*  41: 53 */     return this.apiVersion;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setApiVersion(String apiVersion)
/*  45:    */   {
/*  46: 57 */     this.apiVersion = apiVersion;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setTerminalType(String terminalType)
/*  50:    */   {
/*  51: 61 */     this.terminalType = terminalType;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public String getTerminalType()
/*  55:    */   {
/*  56: 65 */     return this.terminalType;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setTerminalInfo(String terminalInfo)
/*  60:    */   {
/*  61: 69 */     this.terminalInfo = terminalInfo;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getTerminalInfo()
/*  65:    */   {
/*  66: 73 */     return this.terminalInfo;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setProdCode(String prodCode)
/*  70:    */   {
/*  71: 77 */     this.prodCode = prodCode;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getProdCode()
/*  75:    */   {
/*  76: 81 */     return this.prodCode;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getApiMethodName()
/*  80:    */   {
/*  81: 85 */     return "alipay.siteprobe.device.info.update";
/*  82:    */   }
/*  83:    */   
/*  84:    */   public Map<String, String> getTextParams()
/*  85:    */   {
/*  86: 89 */     AlipayHashMap txtParams = new AlipayHashMap();
/*  87: 90 */     txtParams.put("biz_content", this.bizContent);
/*  88: 91 */     if (this.udfParams != null) {
/*  89: 92 */       txtParams.putAll(this.udfParams);
/*  90:    */     }
/*  91: 94 */     return txtParams;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void putOtherTextParam(String key, String value)
/*  95:    */   {
/*  96: 98 */     if (this.udfParams == null) {
/*  97: 99 */       this.udfParams = new AlipayHashMap();
/*  98:    */     }
/*  99:101 */     this.udfParams.put(key, value);
/* 100:    */   }
/* 101:    */   
/* 102:    */   public Class<AlipaySiteprobeDeviceInfoUpdateResponse> getResponseClass()
/* 103:    */   {
/* 104:105 */     return AlipaySiteprobeDeviceInfoUpdateResponse.class;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipaySiteprobeDeviceInfoUpdateRequest
 * JD-Core Version:    0.7.0.1
 */