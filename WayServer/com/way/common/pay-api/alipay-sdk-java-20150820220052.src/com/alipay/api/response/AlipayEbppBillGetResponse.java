/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayEbppBillGetResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 8696641166954868939L;
/*  10:    */   @ApiField("alipay_order_no")
/*  11:    */   private String alipayOrderNo;
/*  12:    */   @ApiField("bill_date")
/*  13:    */   private String billDate;
/*  14:    */   @ApiField("bill_key")
/*  15:    */   private String billKey;
/*  16:    */   @ApiField("charge_inst")
/*  17:    */   private String chargeInst;
/*  18:    */   @ApiField("charge_inst_name")
/*  19:    */   private String chargeInstName;
/*  20:    */   @ApiField("merchant_order_no")
/*  21:    */   private String merchantOrderNo;
/*  22:    */   @ApiField("order_status")
/*  23:    */   private String orderStatus;
/*  24:    */   @ApiField("order_type")
/*  25:    */   private String orderType;
/*  26:    */   @ApiField("owner_name")
/*  27:    */   private String ownerName;
/*  28:    */   @ApiField("pay_amount")
/*  29:    */   private String payAmount;
/*  30:    */   @ApiField("pay_time")
/*  31:    */   private String payTime;
/*  32:    */   @ApiField("service_amount")
/*  33:    */   private String serviceAmount;
/*  34:    */   @ApiField("sub_order_type")
/*  35:    */   private String subOrderType;
/*  36:    */   @ApiField("traffic_location")
/*  37:    */   private String trafficLocation;
/*  38:    */   @ApiField("traffic_regulations")
/*  39:    */   private String trafficRegulations;
/*  40:    */   
/*  41:    */   public void setAlipayOrderNo(String alipayOrderNo)
/*  42:    */   {
/*  43:108 */     this.alipayOrderNo = alipayOrderNo;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public String getAlipayOrderNo()
/*  47:    */   {
/*  48:111 */     return this.alipayOrderNo;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setBillDate(String billDate)
/*  52:    */   {
/*  53:115 */     this.billDate = billDate;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String getBillDate()
/*  57:    */   {
/*  58:118 */     return this.billDate;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setBillKey(String billKey)
/*  62:    */   {
/*  63:122 */     this.billKey = billKey;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getBillKey()
/*  67:    */   {
/*  68:125 */     return this.billKey;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setChargeInst(String chargeInst)
/*  72:    */   {
/*  73:129 */     this.chargeInst = chargeInst;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getChargeInst()
/*  77:    */   {
/*  78:132 */     return this.chargeInst;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setChargeInstName(String chargeInstName)
/*  82:    */   {
/*  83:136 */     this.chargeInstName = chargeInstName;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getChargeInstName()
/*  87:    */   {
/*  88:139 */     return this.chargeInstName;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setMerchantOrderNo(String merchantOrderNo)
/*  92:    */   {
/*  93:143 */     this.merchantOrderNo = merchantOrderNo;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String getMerchantOrderNo()
/*  97:    */   {
/*  98:146 */     return this.merchantOrderNo;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setOrderStatus(String orderStatus)
/* 102:    */   {
/* 103:150 */     this.orderStatus = orderStatus;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public String getOrderStatus()
/* 107:    */   {
/* 108:153 */     return this.orderStatus;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setOrderType(String orderType)
/* 112:    */   {
/* 113:157 */     this.orderType = orderType;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public String getOrderType()
/* 117:    */   {
/* 118:160 */     return this.orderType;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void setOwnerName(String ownerName)
/* 122:    */   {
/* 123:164 */     this.ownerName = ownerName;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public String getOwnerName()
/* 127:    */   {
/* 128:167 */     return this.ownerName;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void setPayAmount(String payAmount)
/* 132:    */   {
/* 133:171 */     this.payAmount = payAmount;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public String getPayAmount()
/* 137:    */   {
/* 138:174 */     return this.payAmount;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void setPayTime(String payTime)
/* 142:    */   {
/* 143:178 */     this.payTime = payTime;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public String getPayTime()
/* 147:    */   {
/* 148:181 */     return this.payTime;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void setServiceAmount(String serviceAmount)
/* 152:    */   {
/* 153:185 */     this.serviceAmount = serviceAmount;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public String getServiceAmount()
/* 157:    */   {
/* 158:188 */     return this.serviceAmount;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void setSubOrderType(String subOrderType)
/* 162:    */   {
/* 163:192 */     this.subOrderType = subOrderType;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public String getSubOrderType()
/* 167:    */   {
/* 168:195 */     return this.subOrderType;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public void setTrafficLocation(String trafficLocation)
/* 172:    */   {
/* 173:199 */     this.trafficLocation = trafficLocation;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public String getTrafficLocation()
/* 177:    */   {
/* 178:202 */     return this.trafficLocation;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public void setTrafficRegulations(String trafficRegulations)
/* 182:    */   {
/* 183:206 */     this.trafficRegulations = trafficRegulations;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public String getTrafficRegulations()
/* 187:    */   {
/* 188:209 */     return this.trafficRegulations;
/* 189:    */   }
/* 190:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayEbppBillGetResponse
 * JD-Core Version:    0.7.0.1
 */