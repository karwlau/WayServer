/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayEbppPdeductBillPayStatusResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayEbppPdeductBillPayStatusRequest
/*   9:    */   implements AlipayRequest<AlipayEbppPdeductBillPayStatusResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String agreementId;
/*  14:    */   private String outOrderNo;
/*  15:    */   private String terminalType;
/*  16:    */   private String terminalInfo;
/*  17:    */   private String prodCode;
/*  18:    */   private String notifyUrl;
/*  19:    */   
/*  20:    */   public void setAgreementId(String agreementId)
/*  21:    */   {
/*  22: 31 */     this.agreementId = agreementId;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public String getAgreementId()
/*  26:    */   {
/*  27: 34 */     return this.agreementId;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setOutOrderNo(String outOrderNo)
/*  31:    */   {
/*  32: 38 */     this.outOrderNo = outOrderNo;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getOutOrderNo()
/*  36:    */   {
/*  37: 41 */     return this.outOrderNo;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getNotifyUrl()
/*  41:    */   {
/*  42: 49 */     return this.notifyUrl;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setNotifyUrl(String notifyUrl)
/*  46:    */   {
/*  47: 53 */     this.notifyUrl = notifyUrl;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getApiVersion()
/*  51:    */   {
/*  52: 57 */     return this.apiVersion;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setApiVersion(String apiVersion)
/*  56:    */   {
/*  57: 61 */     this.apiVersion = apiVersion;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setTerminalType(String terminalType)
/*  61:    */   {
/*  62: 65 */     this.terminalType = terminalType;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getTerminalType()
/*  66:    */   {
/*  67: 69 */     return this.terminalType;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setTerminalInfo(String terminalInfo)
/*  71:    */   {
/*  72: 73 */     this.terminalInfo = terminalInfo;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getTerminalInfo()
/*  76:    */   {
/*  77: 77 */     return this.terminalInfo;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setProdCode(String prodCode)
/*  81:    */   {
/*  82: 81 */     this.prodCode = prodCode;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getProdCode()
/*  86:    */   {
/*  87: 85 */     return this.prodCode;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getApiMethodName()
/*  91:    */   {
/*  92: 89 */     return "alipay.ebpp.pdeduct.bill.pay.status";
/*  93:    */   }
/*  94:    */   
/*  95:    */   public Map<String, String> getTextParams()
/*  96:    */   {
/*  97: 93 */     AlipayHashMap txtParams = new AlipayHashMap();
/*  98: 94 */     txtParams.put("agreement_id", this.agreementId);
/*  99: 95 */     txtParams.put("out_order_no", this.outOrderNo);
/* 100: 96 */     if (this.udfParams != null) {
/* 101: 97 */       txtParams.putAll(this.udfParams);
/* 102:    */     }
/* 103: 99 */     return txtParams;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void putOtherTextParam(String key, String value)
/* 107:    */   {
/* 108:103 */     if (this.udfParams == null) {
/* 109:104 */       this.udfParams = new AlipayHashMap();
/* 110:    */     }
/* 111:106 */     this.udfParams.put(key, value);
/* 112:    */   }
/* 113:    */   
/* 114:    */   public Class<AlipayEbppPdeductBillPayStatusResponse> getResponseClass()
/* 115:    */   {
/* 116:110 */     return AlipayEbppPdeductBillPayStatusResponse.class;
/* 117:    */   }
/* 118:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayEbppPdeductBillPayStatusRequest
 * JD-Core Version:    0.7.0.1
 */