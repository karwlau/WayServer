/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayRequest;
/*   4:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   5:    */ import com.alipay.api.response.AlipayEcardEduPublicBindResponse;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public class AlipayEcardEduPublicBindRequest
/*   9:    */   implements AlipayRequest<AlipayEcardEduPublicBindResponse>
/*  10:    */ {
/*  11:    */   private AlipayHashMap udfParams;
/*  12: 18 */   private String apiVersion = "1.0";
/*  13:    */   private String agentCode;
/*  14:    */   private String agreementId;
/*  15:    */   private String alipayUserId;
/*  16:    */   private String cardName;
/*  17:    */   private String cardNo;
/*  18:    */   private String publicId;
/*  19:    */   private String terminalType;
/*  20:    */   private String terminalInfo;
/*  21:    */   private String prodCode;
/*  22:    */   private String notifyUrl;
/*  23:    */   
/*  24:    */   public void setAgentCode(String agentCode)
/*  25:    */   {
/*  26: 51 */     this.agentCode = agentCode;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public String getAgentCode()
/*  30:    */   {
/*  31: 54 */     return this.agentCode;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setAgreementId(String agreementId)
/*  35:    */   {
/*  36: 58 */     this.agreementId = agreementId;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getAgreementId()
/*  40:    */   {
/*  41: 61 */     return this.agreementId;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setAlipayUserId(String alipayUserId)
/*  45:    */   {
/*  46: 65 */     this.alipayUserId = alipayUserId;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getAlipayUserId()
/*  50:    */   {
/*  51: 68 */     return this.alipayUserId;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setCardName(String cardName)
/*  55:    */   {
/*  56: 72 */     this.cardName = cardName;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String getCardName()
/*  60:    */   {
/*  61: 75 */     return this.cardName;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setCardNo(String cardNo)
/*  65:    */   {
/*  66: 79 */     this.cardNo = cardNo;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getCardNo()
/*  70:    */   {
/*  71: 82 */     return this.cardNo;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setPublicId(String publicId)
/*  75:    */   {
/*  76: 86 */     this.publicId = publicId;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getPublicId()
/*  80:    */   {
/*  81: 89 */     return this.publicId;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getNotifyUrl()
/*  85:    */   {
/*  86: 97 */     return this.notifyUrl;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setNotifyUrl(String notifyUrl)
/*  90:    */   {
/*  91:101 */     this.notifyUrl = notifyUrl;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getApiVersion()
/*  95:    */   {
/*  96:105 */     return this.apiVersion;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setApiVersion(String apiVersion)
/* 100:    */   {
/* 101:109 */     this.apiVersion = apiVersion;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setTerminalType(String terminalType)
/* 105:    */   {
/* 106:113 */     this.terminalType = terminalType;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getTerminalType()
/* 110:    */   {
/* 111:117 */     return this.terminalType;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setTerminalInfo(String terminalInfo)
/* 115:    */   {
/* 116:121 */     this.terminalInfo = terminalInfo;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public String getTerminalInfo()
/* 120:    */   {
/* 121:125 */     return this.terminalInfo;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setProdCode(String prodCode)
/* 125:    */   {
/* 126:129 */     this.prodCode = prodCode;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public String getProdCode()
/* 130:    */   {
/* 131:133 */     return this.prodCode;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getApiMethodName()
/* 135:    */   {
/* 136:137 */     return "alipay.ecard.edu.public.bind";
/* 137:    */   }
/* 138:    */   
/* 139:    */   public Map<String, String> getTextParams()
/* 140:    */   {
/* 141:141 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 142:142 */     txtParams.put("agent_code", this.agentCode);
/* 143:143 */     txtParams.put("agreement_id", this.agreementId);
/* 144:144 */     txtParams.put("alipay_user_id", this.alipayUserId);
/* 145:145 */     txtParams.put("card_name", this.cardName);
/* 146:146 */     txtParams.put("card_no", this.cardNo);
/* 147:147 */     txtParams.put("public_id", this.publicId);
/* 148:148 */     if (this.udfParams != null) {
/* 149:149 */       txtParams.putAll(this.udfParams);
/* 150:    */     }
/* 151:151 */     return txtParams;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void putOtherTextParam(String key, String value)
/* 155:    */   {
/* 156:155 */     if (this.udfParams == null) {
/* 157:156 */       this.udfParams = new AlipayHashMap();
/* 158:    */     }
/* 159:158 */     this.udfParams.put(key, value);
/* 160:    */   }
/* 161:    */   
/* 162:    */   public Class<AlipayEcardEduPublicBindResponse> getResponseClass()
/* 163:    */   {
/* 164:162 */     return AlipayEcardEduPublicBindResponse.class;
/* 165:    */   }
/* 166:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayEcardEduPublicBindRequest
 * JD-Core Version:    0.7.0.1
 */