/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayEbppBillAddResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 6467132673367573448L;
/*  10:    */   @ApiField("alipay_order_no")
/*  11:    */   private String alipayOrderNo;
/*  12:    */   @ApiField("bank_bill_no")
/*  13:    */   private String bankBillNo;
/*  14:    */   @ApiField("bill_date")
/*  15:    */   private String billDate;
/*  16:    */   @ApiField("bill_key")
/*  17:    */   private String billKey;
/*  18:    */   @ApiField("charge_inst")
/*  19:    */   private String chargeInst;
/*  20:    */   @ApiField("charge_inst_name")
/*  21:    */   private String chargeInstName;
/*  22:    */   @ApiField("extend_field")
/*  23:    */   private String extendField;
/*  24:    */   @ApiField("merchant_order_no")
/*  25:    */   private String merchantOrderNo;
/*  26:    */   @ApiField("order_type")
/*  27:    */   private String orderType;
/*  28:    */   @ApiField("owner_name")
/*  29:    */   private String ownerName;
/*  30:    */   @ApiField("pay_amount")
/*  31:    */   private String payAmount;
/*  32:    */   @ApiField("service_amount")
/*  33:    */   private String serviceAmount;
/*  34:    */   @ApiField("sub_order_type")
/*  35:    */   private String subOrderType;
/*  36:    */   
/*  37:    */   public void setAlipayOrderNo(String alipayOrderNo)
/*  38:    */   {
/*  39: 97 */     this.alipayOrderNo = alipayOrderNo;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String getAlipayOrderNo()
/*  43:    */   {
/*  44:100 */     return this.alipayOrderNo;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setBankBillNo(String bankBillNo)
/*  48:    */   {
/*  49:104 */     this.bankBillNo = bankBillNo;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String getBankBillNo()
/*  53:    */   {
/*  54:107 */     return this.bankBillNo;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setBillDate(String billDate)
/*  58:    */   {
/*  59:111 */     this.billDate = billDate;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getBillDate()
/*  63:    */   {
/*  64:114 */     return this.billDate;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setBillKey(String billKey)
/*  68:    */   {
/*  69:118 */     this.billKey = billKey;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getBillKey()
/*  73:    */   {
/*  74:121 */     return this.billKey;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setChargeInst(String chargeInst)
/*  78:    */   {
/*  79:125 */     this.chargeInst = chargeInst;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getChargeInst()
/*  83:    */   {
/*  84:128 */     return this.chargeInst;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setChargeInstName(String chargeInstName)
/*  88:    */   {
/*  89:132 */     this.chargeInstName = chargeInstName;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getChargeInstName()
/*  93:    */   {
/*  94:135 */     return this.chargeInstName;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setExtendField(String extendField)
/*  98:    */   {
/*  99:139 */     this.extendField = extendField;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getExtendField()
/* 103:    */   {
/* 104:142 */     return this.extendField;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setMerchantOrderNo(String merchantOrderNo)
/* 108:    */   {
/* 109:146 */     this.merchantOrderNo = merchantOrderNo;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public String getMerchantOrderNo()
/* 113:    */   {
/* 114:149 */     return this.merchantOrderNo;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void setOrderType(String orderType)
/* 118:    */   {
/* 119:153 */     this.orderType = orderType;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public String getOrderType()
/* 123:    */   {
/* 124:156 */     return this.orderType;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void setOwnerName(String ownerName)
/* 128:    */   {
/* 129:160 */     this.ownerName = ownerName;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public String getOwnerName()
/* 133:    */   {
/* 134:163 */     return this.ownerName;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void setPayAmount(String payAmount)
/* 138:    */   {
/* 139:167 */     this.payAmount = payAmount;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public String getPayAmount()
/* 143:    */   {
/* 144:170 */     return this.payAmount;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void setServiceAmount(String serviceAmount)
/* 148:    */   {
/* 149:174 */     this.serviceAmount = serviceAmount;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public String getServiceAmount()
/* 153:    */   {
/* 154:177 */     return this.serviceAmount;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void setSubOrderType(String subOrderType)
/* 158:    */   {
/* 159:181 */     this.subOrderType = subOrderType;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public String getSubOrderType()
/* 163:    */   {
/* 164:184 */     return this.subOrderType;
/* 165:    */   }
/* 166:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayEbppBillAddResponse
 * JD-Core Version:    0.7.0.1
 */