/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayMicropayOrderFreezeResponse;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class AlipayMicropayOrderFreezeRequest
/*  10:    */   implements AlipayRequest<AlipayMicropayOrderFreezeResponse>
/*  11:    */ {
/*  12:    */   private AlipayHashMap udfParams;
/*  13: 19 */   private String apiVersion = "1.0";
/*  14:    */   private String amount;
/*  15:    */   private Date expireTime;
/*  16:    */   private String memo;
/*  17:    */   private String merchantOrderNo;
/*  18:    */   private String payConfirm;
/*  19:    */   private String terminalType;
/*  20:    */   private String terminalInfo;
/*  21:    */   private String prodCode;
/*  22:    */   private String notifyUrl;
/*  23:    */   
/*  24:    */   public void setAmount(String amount)
/*  25:    */   {
/*  26: 47 */     this.amount = amount;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String getAmount()
/*  30:    */   {
/*  31: 50 */     return this.amount;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setExpireTime(Date expireTime)
/*  35:    */   {
/*  36: 54 */     this.expireTime = expireTime;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public Date getExpireTime()
/*  40:    */   {
/*  41: 57 */     return this.expireTime;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setMemo(String memo)
/*  45:    */   {
/*  46: 61 */     this.memo = memo;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getMemo()
/*  50:    */   {
/*  51: 64 */     return this.memo;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setMerchantOrderNo(String merchantOrderNo)
/*  55:    */   {
/*  56: 68 */     this.merchantOrderNo = merchantOrderNo;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getMerchantOrderNo()
/*  60:    */   {
/*  61: 71 */     return this.merchantOrderNo;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setPayConfirm(String payConfirm)
/*  65:    */   {
/*  66: 75 */     this.payConfirm = payConfirm;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getPayConfirm()
/*  70:    */   {
/*  71: 78 */     return this.payConfirm;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getNotifyUrl()
/*  75:    */   {
/*  76: 86 */     return this.notifyUrl;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setNotifyUrl(String notifyUrl)
/*  80:    */   {
/*  81: 90 */     this.notifyUrl = notifyUrl;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getApiVersion()
/*  85:    */   {
/*  86: 94 */     return this.apiVersion;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setApiVersion(String apiVersion)
/*  90:    */   {
/*  91: 98 */     this.apiVersion = apiVersion;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setTerminalType(String terminalType)
/*  95:    */   {
/*  96:102 */     this.terminalType = terminalType;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getTerminalType()
/* 100:    */   {
/* 101:106 */     return this.terminalType;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setTerminalInfo(String terminalInfo)
/* 105:    */   {
/* 106:110 */     this.terminalInfo = terminalInfo;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getTerminalInfo()
/* 110:    */   {
/* 111:114 */     return this.terminalInfo;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setProdCode(String prodCode)
/* 115:    */   {
/* 116:118 */     this.prodCode = prodCode;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public String getProdCode()
/* 120:    */   {
/* 121:122 */     return this.prodCode;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getApiMethodName()
/* 125:    */   {
/* 126:126 */     return "alipay.micropay.order.freeze";
/* 127:    */   }
/* 128:    */   
/* 129:    */   public Map<String, String> getTextParams()
/* 130:    */   {
/* 131:130 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 132:131 */     txtParams.put("amount", this.amount);
/* 133:132 */     txtParams.put("expire_time", this.expireTime);
/* 134:133 */     txtParams.put("memo", this.memo);
/* 135:134 */     txtParams.put("merchant_order_no", this.merchantOrderNo);
/* 136:135 */     txtParams.put("pay_confirm", this.payConfirm);
/* 137:136 */     if (this.udfParams != null) {
/* 138:137 */       txtParams.putAll(this.udfParams);
/* 139:    */     }
/* 140:139 */     return txtParams;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void putOtherTextParam(String key, String value)
/* 144:    */   {
/* 145:143 */     if (this.udfParams == null) {
/* 146:144 */       this.udfParams = new AlipayHashMap();
/* 147:    */     }
/* 148:146 */     this.udfParams.put(key, value);
/* 149:    */   }
/* 150:    */   
/* 151:    */   public Class<AlipayMicropayOrderFreezeResponse> getResponseClass()
/* 152:    */   {
/* 153:150 */     return AlipayMicropayOrderFreezeResponse.class;
/* 154:    */   }
/* 155:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayMicropayOrderFreezeRequest
 * JD-Core Version:    0.7.0.1
 */