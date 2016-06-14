/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class Ticket
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 3415245964735113332L;
/*  10:    */   @ApiField("available_amount")
/*  11:    */   private String availableAmount;
/*  12:    */   @ApiField("donate_flag")
/*  13:    */   private String donateFlag;
/*  14:    */   @ApiField("ext_prop")
/*  15:    */   private String extProp;
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
/*  28:    */   @ApiField("name")
/*  29:    */   private String name;
/*  30:    */   @ApiField("refund_flag")
/*  31:    */   private String refundFlag;
/*  32:    */   @ApiField("status")
/*  33:    */   private String status;
/*  34:    */   @ApiField("template_no")
/*  35:    */   private String templateNo;
/*  36:    */   @ApiField("ticket_no")
/*  37:    */   private String ticketNo;
/*  38:    */   @ApiField("ticket_type")
/*  39:    */   private String ticketType;
/*  40:    */   
/*  41:    */   public String getAvailableAmount()
/*  42:    */   {
/*  43:124 */     return this.availableAmount;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setAvailableAmount(String availableAmount)
/*  47:    */   {
/*  48:127 */     this.availableAmount = availableAmount;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getDonateFlag()
/*  52:    */   {
/*  53:131 */     return this.donateFlag;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setDonateFlag(String donateFlag)
/*  57:    */   {
/*  58:134 */     this.donateFlag = donateFlag;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getExtProp()
/*  62:    */   {
/*  63:138 */     return this.extProp;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setExtProp(String extProp)
/*  67:    */   {
/*  68:141 */     this.extProp = extProp;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getGmtActive()
/*  72:    */   {
/*  73:145 */     return this.gmtActive;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setGmtActive(String gmtActive)
/*  77:    */   {
/*  78:148 */     this.gmtActive = gmtActive;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getGmtCreate()
/*  82:    */   {
/*  83:152 */     return this.gmtCreate;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setGmtCreate(String gmtCreate)
/*  87:    */   {
/*  88:155 */     this.gmtCreate = gmtCreate;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getGmtExpired()
/*  92:    */   {
/*  93:159 */     return this.gmtExpired;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setGmtExpired(String gmtExpired)
/*  97:    */   {
/*  98:162 */     this.gmtExpired = gmtExpired;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getInstructions()
/* 102:    */   {
/* 103:166 */     return this.instructions;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setInstructions(String instructions)
/* 107:    */   {
/* 108:169 */     this.instructions = instructions;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getMemo()
/* 112:    */   {
/* 113:173 */     return this.memo;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setMemo(String memo)
/* 117:    */   {
/* 118:176 */     this.memo = memo;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getMerchantUniqId()
/* 122:    */   {
/* 123:180 */     return this.merchantUniqId;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setMerchantUniqId(String merchantUniqId)
/* 127:    */   {
/* 128:183 */     this.merchantUniqId = merchantUniqId;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public String getName()
/* 132:    */   {
/* 133:187 */     return this.name;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setName(String name)
/* 137:    */   {
/* 138:190 */     this.name = name;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public String getRefundFlag()
/* 142:    */   {
/* 143:194 */     return this.refundFlag;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void setRefundFlag(String refundFlag)
/* 147:    */   {
/* 148:197 */     this.refundFlag = refundFlag;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public String getStatus()
/* 152:    */   {
/* 153:201 */     return this.status;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void setStatus(String status)
/* 157:    */   {
/* 158:204 */     this.status = status;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public String getTemplateNo()
/* 162:    */   {
/* 163:208 */     return this.templateNo;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void setTemplateNo(String templateNo)
/* 167:    */   {
/* 168:211 */     this.templateNo = templateNo;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public String getTicketNo()
/* 172:    */   {
/* 173:215 */     return this.ticketNo;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void setTicketNo(String ticketNo)
/* 177:    */   {
/* 178:218 */     this.ticketNo = ticketNo;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public String getTicketType()
/* 182:    */   {
/* 183:222 */     return this.ticketType;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void setTicketType(String ticketType)
/* 187:    */   {
/* 188:225 */     this.ticketType = ticketType;
/* 189:    */   }
/* 190:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.Ticket
 * JD-Core Version:    0.7.0.1
 */