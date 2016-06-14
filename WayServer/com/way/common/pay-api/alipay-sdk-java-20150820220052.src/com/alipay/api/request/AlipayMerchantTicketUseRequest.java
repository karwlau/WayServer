/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayMerchantTicketUseResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayMerchantTicketUseRequest
/*   9:    */   implements AlipayRequest<AlipayMerchantTicketUseResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String bizInfo;
/*  14:    */   private String merchantInfo;
/*  15:    */   private String ticketCode;
/*  16:    */   private String terminalType;
/*  17:    */   private String terminalInfo;
/*  18:    */   private String prodCode;
/*  19:    */   private String notifyUrl;
/*  20:    */   
/*  21:    */   public void setBizInfo(String bizInfo)
/*  22:    */   {
/*  23: 40 */     this.bizInfo = bizInfo;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public String getBizInfo()
/*  27:    */   {
/*  28: 43 */     return this.bizInfo;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void setMerchantInfo(String merchantInfo)
/*  32:    */   {
/*  33: 47 */     this.merchantInfo = merchantInfo;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public String getMerchantInfo()
/*  37:    */   {
/*  38: 50 */     return this.merchantInfo;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setTicketCode(String ticketCode)
/*  42:    */   {
/*  43: 54 */     this.ticketCode = ticketCode;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public String getTicketCode()
/*  47:    */   {
/*  48: 57 */     return this.ticketCode;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getNotifyUrl()
/*  52:    */   {
/*  53: 65 */     return this.notifyUrl;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setNotifyUrl(String notifyUrl)
/*  57:    */   {
/*  58: 69 */     this.notifyUrl = notifyUrl;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getApiVersion()
/*  62:    */   {
/*  63: 73 */     return this.apiVersion;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setApiVersion(String apiVersion)
/*  67:    */   {
/*  68: 77 */     this.apiVersion = apiVersion;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setTerminalType(String terminalType)
/*  72:    */   {
/*  73: 81 */     this.terminalType = terminalType;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getTerminalType()
/*  77:    */   {
/*  78: 85 */     return this.terminalType;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setTerminalInfo(String terminalInfo)
/*  82:    */   {
/*  83: 89 */     this.terminalInfo = terminalInfo;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getTerminalInfo()
/*  87:    */   {
/*  88: 93 */     return this.terminalInfo;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setProdCode(String prodCode)
/*  92:    */   {
/*  93: 97 */     this.prodCode = prodCode;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String getProdCode()
/*  97:    */   {
/*  98:101 */     return this.prodCode;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getApiMethodName()
/* 102:    */   {
/* 103:105 */     return "alipay.merchant.ticket.use";
/* 104:    */   }
/* 105:    */   
/* 106:    */   public Map<String, String> getTextParams()
/* 107:    */   {
/* 108:109 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 109:110 */     txtParams.put("biz_info", this.bizInfo);
/* 110:111 */     txtParams.put("merchant_info", this.merchantInfo);
/* 111:112 */     txtParams.put("ticket_code", this.ticketCode);
/* 112:113 */     if (this.udfParams != null) {
/* 113:114 */       txtParams.putAll(this.udfParams);
/* 114:    */     }
/* 115:116 */     return txtParams;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void putOtherTextParam(String key, String value)
/* 119:    */   {
/* 120:120 */     if (this.udfParams == null) {
/* 121:121 */       this.udfParams = new AlipayHashMap();
/* 122:    */     }
/* 123:123 */     this.udfParams.put(key, value);
/* 124:    */   }
/* 125:    */   
/* 126:    */   public Class<AlipayMerchantTicketUseResponse> getResponseClass()
/* 127:    */   {
/* 128:127 */     return AlipayMerchantTicketUseResponse.class;
/* 129:    */   }
/* 130:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayMerchantTicketUseRequest
 * JD-Core Version:    0.7.0.1
 */