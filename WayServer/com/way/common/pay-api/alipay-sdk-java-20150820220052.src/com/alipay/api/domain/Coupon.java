/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class Coupon
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 6758366398565778249L;
/*  10:    */   @ApiField("available_amount")
/*  11:    */   private String availableAmount;
/*  12:    */   @ApiField("coupon_no")
/*  13:    */   private String couponNo;
/*  14:    */   @ApiField("deduct_amount")
/*  15:    */   private String deductAmount;
/*  16:    */   @ApiField("gmt_active")
/*  17:    */   private String gmtActive;
/*  18:    */   @ApiField("gmt_create")
/*  19:    */   private String gmtCreate;
/*  20:    */   @ApiField("gmt_expired")
/*  21:    */   private String gmtExpired;
/*  22:    */   @ApiField("instructions")
/*  23:    */   private String instructions;
/*  24:    */   @ApiField("memo")
/*  25:    */   private String memo;
/*  26:    */   @ApiField("merchant_uniq_id")
/*  27:    */   private String merchantUniqId;
/*  28:    */   @ApiField("multi_use_flag")
/*  29:    */   private String multiUseFlag;
/*  30:    */   @ApiField("name")
/*  31:    */   private String name;
/*  32:    */   @ApiField("refund_flag")
/*  33:    */   private String refundFlag;
/*  34:    */   @ApiField("status")
/*  35:    */   private String status;
/*  36:    */   @ApiField("template_no")
/*  37:    */   private String templateNo;
/*  38:    */   @ApiField("user_id")
/*  39:    */   private String userId;
/*  40:    */   
/*  41:    */   public String getAvailableAmount()
/*  42:    */   {
/*  43:107 */     return this.availableAmount;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setAvailableAmount(String availableAmount)
/*  47:    */   {
/*  48:110 */     this.availableAmount = availableAmount;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getCouponNo()
/*  52:    */   {
/*  53:114 */     return this.couponNo;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setCouponNo(String couponNo)
/*  57:    */   {
/*  58:117 */     this.couponNo = couponNo;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getDeductAmount()
/*  62:    */   {
/*  63:121 */     return this.deductAmount;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setDeductAmount(String deductAmount)
/*  67:    */   {
/*  68:124 */     this.deductAmount = deductAmount;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getGmtActive()
/*  72:    */   {
/*  73:128 */     return this.gmtActive;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setGmtActive(String gmtActive)
/*  77:    */   {
/*  78:131 */     this.gmtActive = gmtActive;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getGmtCreate()
/*  82:    */   {
/*  83:135 */     return this.gmtCreate;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setGmtCreate(String gmtCreate)
/*  87:    */   {
/*  88:138 */     this.gmtCreate = gmtCreate;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getGmtExpired()
/*  92:    */   {
/*  93:142 */     return this.gmtExpired;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setGmtExpired(String gmtExpired)
/*  97:    */   {
/*  98:145 */     this.gmtExpired = gmtExpired;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getInstructions()
/* 102:    */   {
/* 103:149 */     return this.instructions;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setInstructions(String instructions)
/* 107:    */   {
/* 108:152 */     this.instructions = instructions;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getMemo()
/* 112:    */   {
/* 113:156 */     return this.memo;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setMemo(String memo)
/* 117:    */   {
/* 118:159 */     this.memo = memo;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getMerchantUniqId()
/* 122:    */   {
/* 123:163 */     return this.merchantUniqId;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setMerchantUniqId(String merchantUniqId)
/* 127:    */   {
/* 128:166 */     this.merchantUniqId = merchantUniqId;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public String getMultiUseFlag()
/* 132:    */   {
/* 133:170 */     return this.multiUseFlag;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setMultiUseFlag(String multiUseFlag)
/* 137:    */   {
/* 138:173 */     this.multiUseFlag = multiUseFlag;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public String getName()
/* 142:    */   {
/* 143:177 */     return this.name;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void setName(String name)
/* 147:    */   {
/* 148:180 */     this.name = name;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public String getRefundFlag()
/* 152:    */   {
/* 153:184 */     return this.refundFlag;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void setRefundFlag(String refundFlag)
/* 157:    */   {
/* 158:187 */     this.refundFlag = refundFlag;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public String getStatus()
/* 162:    */   {
/* 163:191 */     return this.status;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void setStatus(String status)
/* 167:    */   {
/* 168:194 */     this.status = status;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public String getTemplateNo()
/* 172:    */   {
/* 173:198 */     return this.templateNo;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void setTemplateNo(String templateNo)
/* 177:    */   {
/* 178:201 */     this.templateNo = templateNo;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public String getUserId()
/* 182:    */   {
/* 183:205 */     return this.userId;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void setUserId(String userId)
/* 187:    */   {
/* 188:208 */     this.userId = userId;
/* 189:    */   }
/* 190:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.Coupon
 * JD-Core Version:    0.7.0.1
 */