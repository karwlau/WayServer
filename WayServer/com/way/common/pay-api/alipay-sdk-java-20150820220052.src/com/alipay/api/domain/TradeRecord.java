/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class TradeRecord
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 7885649927625137556L;
/*  11:    */   @ApiField("alipay_order_no")
/*  12:    */   private String alipayOrderNo;
/*  13:    */   @ApiField("create_time")
/*  14:    */   private Date createTime;
/*  15:    */   @ApiField("in_out_type")
/*  16:    */   private String inOutType;
/*  17:    */   @ApiField("merchant_order_no")
/*  18:    */   private String merchantOrderNo;
/*  19:    */   @ApiField("modified_time")
/*  20:    */   private Date modifiedTime;
/*  21:    */   @ApiField("opposite_logon_id")
/*  22:    */   private String oppositeLogonId;
/*  23:    */   @ApiField("opposite_name")
/*  24:    */   private String oppositeName;
/*  25:    */   @ApiField("opposite_user_id")
/*  26:    */   private String oppositeUserId;
/*  27:    */   @ApiField("order_from")
/*  28:    */   private String orderFrom;
/*  29:    */   @ApiField("order_status")
/*  30:    */   private String orderStatus;
/*  31:    */   @ApiField("order_title")
/*  32:    */   private String orderTitle;
/*  33:    */   @ApiField("order_type")
/*  34:    */   private String orderType;
/*  35:    */   @ApiField("owner_logon_id")
/*  36:    */   private String ownerLogonId;
/*  37:    */   @ApiField("owner_name")
/*  38:    */   private String ownerName;
/*  39:    */   @ApiField("owner_user_id")
/*  40:    */   private String ownerUserId;
/*  41:    */   @ApiField("partner_id")
/*  42:    */   private String partnerId;
/*  43:    */   @ApiField("service_charge")
/*  44:    */   private String serviceCharge;
/*  45:    */   @ApiField("total_amount")
/*  46:    */   private String totalAmount;
/*  47:    */   
/*  48:    */   public String getAlipayOrderNo()
/*  49:    */   {
/*  50:127 */     return this.alipayOrderNo;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setAlipayOrderNo(String alipayOrderNo)
/*  54:    */   {
/*  55:130 */     this.alipayOrderNo = alipayOrderNo;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public Date getCreateTime()
/*  59:    */   {
/*  60:134 */     return this.createTime;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setCreateTime(Date createTime)
/*  64:    */   {
/*  65:137 */     this.createTime = createTime;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getInOutType()
/*  69:    */   {
/*  70:141 */     return this.inOutType;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setInOutType(String inOutType)
/*  74:    */   {
/*  75:144 */     this.inOutType = inOutType;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getMerchantOrderNo()
/*  79:    */   {
/*  80:148 */     return this.merchantOrderNo;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setMerchantOrderNo(String merchantOrderNo)
/*  84:    */   {
/*  85:151 */     this.merchantOrderNo = merchantOrderNo;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public Date getModifiedTime()
/*  89:    */   {
/*  90:155 */     return this.modifiedTime;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setModifiedTime(Date modifiedTime)
/*  94:    */   {
/*  95:158 */     this.modifiedTime = modifiedTime;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getOppositeLogonId()
/*  99:    */   {
/* 100:162 */     return this.oppositeLogonId;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setOppositeLogonId(String oppositeLogonId)
/* 104:    */   {
/* 105:165 */     this.oppositeLogonId = oppositeLogonId;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public String getOppositeName()
/* 109:    */   {
/* 110:169 */     return this.oppositeName;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setOppositeName(String oppositeName)
/* 114:    */   {
/* 115:172 */     this.oppositeName = oppositeName;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getOppositeUserId()
/* 119:    */   {
/* 120:176 */     return this.oppositeUserId;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void setOppositeUserId(String oppositeUserId)
/* 124:    */   {
/* 125:179 */     this.oppositeUserId = oppositeUserId;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public String getOrderFrom()
/* 129:    */   {
/* 130:183 */     return this.orderFrom;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void setOrderFrom(String orderFrom)
/* 134:    */   {
/* 135:186 */     this.orderFrom = orderFrom;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public String getOrderStatus()
/* 139:    */   {
/* 140:190 */     return this.orderStatus;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void setOrderStatus(String orderStatus)
/* 144:    */   {
/* 145:193 */     this.orderStatus = orderStatus;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public String getOrderTitle()
/* 149:    */   {
/* 150:197 */     return this.orderTitle;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void setOrderTitle(String orderTitle)
/* 154:    */   {
/* 155:200 */     this.orderTitle = orderTitle;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public String getOrderType()
/* 159:    */   {
/* 160:204 */     return this.orderType;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void setOrderType(String orderType)
/* 164:    */   {
/* 165:207 */     this.orderType = orderType;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public String getOwnerLogonId()
/* 169:    */   {
/* 170:211 */     return this.ownerLogonId;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void setOwnerLogonId(String ownerLogonId)
/* 174:    */   {
/* 175:214 */     this.ownerLogonId = ownerLogonId;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public String getOwnerName()
/* 179:    */   {
/* 180:218 */     return this.ownerName;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void setOwnerName(String ownerName)
/* 184:    */   {
/* 185:221 */     this.ownerName = ownerName;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public String getOwnerUserId()
/* 189:    */   {
/* 190:225 */     return this.ownerUserId;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public void setOwnerUserId(String ownerUserId)
/* 194:    */   {
/* 195:228 */     this.ownerUserId = ownerUserId;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public String getPartnerId()
/* 199:    */   {
/* 200:232 */     return this.partnerId;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public void setPartnerId(String partnerId)
/* 204:    */   {
/* 205:235 */     this.partnerId = partnerId;
/* 206:    */   }
/* 207:    */   
/* 208:    */   public String getServiceCharge()
/* 209:    */   {
/* 210:239 */     return this.serviceCharge;
/* 211:    */   }
/* 212:    */   
/* 213:    */   public void setServiceCharge(String serviceCharge)
/* 214:    */   {
/* 215:242 */     this.serviceCharge = serviceCharge;
/* 216:    */   }
/* 217:    */   
/* 218:    */   public String getTotalAmount()
/* 219:    */   {
/* 220:246 */     return this.totalAmount;
/* 221:    */   }
/* 222:    */   
/* 223:    */   public void setTotalAmount(String totalAmount)
/* 224:    */   {
/* 225:249 */     this.totalAmount = totalAmount;
/* 226:    */   }
/* 227:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.TradeRecord
 * JD-Core Version:    0.7.0.1
 */