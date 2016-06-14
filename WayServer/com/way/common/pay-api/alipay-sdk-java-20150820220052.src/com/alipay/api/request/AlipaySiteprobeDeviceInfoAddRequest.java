/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipaySiteprobeDeviceInfoAddResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipaySiteprobeDeviceInfoAddRequest
/*   9:    */   implements AlipayRequest<AlipaySiteprobeDeviceInfoAddResponse>
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
/*  21: 33 */     this.bizContent = bizContent;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public String getBizContent()
/*  25:    */   {
/*  26: 36 */     return this.bizContent;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String getNotifyUrl()
/*  30:    */   {
/*  31: 44 */     return this.notifyUrl;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setNotifyUrl(String notifyUrl)
/*  35:    */   {
/*  36: 48 */     this.notifyUrl = notifyUrl;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getApiVersion()
/*  40:    */   {
/*  41: 52 */     return this.apiVersion;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setApiVersion(String apiVersion)
/*  45:    */   {
/*  46: 56 */     this.apiVersion = apiVersion;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setTerminalType(String terminalType)
/*  50:    */   {
/*  51: 60 */     this.terminalType = terminalType;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public String getTerminalType()
/*  55:    */   {
/*  56: 64 */     return this.terminalType;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setTerminalInfo(String terminalInfo)
/*  60:    */   {
/*  61: 68 */     this.terminalInfo = terminalInfo;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getTerminalInfo()
/*  65:    */   {
/*  66: 72 */     return this.terminalInfo;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setProdCode(String prodCode)
/*  70:    */   {
/*  71: 76 */     this.prodCode = prodCode;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getProdCode()
/*  75:    */   {
/*  76: 80 */     return this.prodCode;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getApiMethodName()
/*  80:    */   {
/*  81: 84 */     return "alipay.siteprobe.device.info.add";
/*  82:    */   }
/*  83:    */   
/*  84:    */   public Map<String, String> getTextParams()
/*  85:    */   {
/*  86: 88 */     AlipayHashMap txtParams = new AlipayHashMap();
/*  87: 89 */     txtParams.put("biz_content", this.bizContent);
/*  88: 90 */     if (this.udfParams != null) {
/*  89: 91 */       txtParams.putAll(this.udfParams);
/*  90:    */     }
/*  91: 93 */     return txtParams;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void putOtherTextParam(String key, String value)
/*  95:    */   {
/*  96: 97 */     if (this.udfParams == null) {
/*  97: 98 */       this.udfParams = new AlipayHashMap();
/*  98:    */     }
/*  99:100 */     this.udfParams.put(key, value);
/* 100:    */   }
/* 101:    */   
/* 102:    */   public Class<AlipaySiteprobeDeviceInfoAddResponse> getResponseClass()
/* 103:    */   {
/* 104:104 */     return AlipaySiteprobeDeviceInfoAddResponse.class;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipaySiteprobeDeviceInfoAddRequest
 * JD-Core Version:    0.7.0.1
 */