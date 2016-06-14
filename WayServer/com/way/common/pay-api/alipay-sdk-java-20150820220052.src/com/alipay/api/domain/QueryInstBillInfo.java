/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;
/*   7:    */ 
/*   8:    */ public class QueryInstBillInfo
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 5279211497912871327L;
/*  12:    */   @ApiField("amount")
/*  13:    */   private String amount;
/*  14:    */   @ApiField("balance")
/*  15:    */   private String balance;
/*  16:    */   @ApiField("bill_date")
/*  17:    */   private String billDate;
/*  18:    */   @ApiListField("bill_detail")
/*  19:    */   @ApiField("query_inst_bill_detail")
/*  20:    */   private List<QueryInstBillDetail> billDetail;
/*  21:    */   @ApiField("bill_fines")
/*  22:    */   private String billFines;
/*  23:    */   @ApiField("bill_key")
/*  24:    */   private String billKey;
/*  25:    */   @ApiField("bill_user_name")
/*  26:    */   private String billUserName;
/*  27:    */   @ApiField("charge_inst")
/*  28:    */   private String chargeInst;
/*  29:    */   @ApiField("charge_uniq_id")
/*  30:    */   private String chargeUniqId;
/*  31:    */   @ApiField("chargeoff_inst")
/*  32:    */   private String chargeoffInst;
/*  33:    */   @ApiField("company_id")
/*  34:    */   private String companyId;
/*  35:    */   @ApiField("extend")
/*  36:    */   private String extend;
/*  37:    */   @ApiField("order_type")
/*  38:    */   private String orderType;
/*  39:    */   @ApiField("out_id")
/*  40:    */   private String outId;
/*  41:    */   @ApiField("return_message")
/*  42:    */   private String returnMessage;
/*  43:    */   @ApiField("sub_order_type")
/*  44:    */   private String subOrderType;
/*  45:    */   
/*  46:    */   public String getAmount()
/*  47:    */   {
/*  48:117 */     return this.amount;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setAmount(String amount)
/*  52:    */   {
/*  53:120 */     this.amount = amount;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String getBalance()
/*  57:    */   {
/*  58:124 */     return this.balance;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setBalance(String balance)
/*  62:    */   {
/*  63:127 */     this.balance = balance;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getBillDate()
/*  67:    */   {
/*  68:131 */     return this.billDate;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setBillDate(String billDate)
/*  72:    */   {
/*  73:134 */     this.billDate = billDate;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public List<QueryInstBillDetail> getBillDetail()
/*  77:    */   {
/*  78:138 */     return this.billDetail;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setBillDetail(List<QueryInstBillDetail> billDetail)
/*  82:    */   {
/*  83:141 */     this.billDetail = billDetail;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getBillFines()
/*  87:    */   {
/*  88:145 */     return this.billFines;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setBillFines(String billFines)
/*  92:    */   {
/*  93:148 */     this.billFines = billFines;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String getBillKey()
/*  97:    */   {
/*  98:152 */     return this.billKey;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setBillKey(String billKey)
/* 102:    */   {
/* 103:155 */     this.billKey = billKey;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public String getBillUserName()
/* 107:    */   {
/* 108:159 */     return this.billUserName;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setBillUserName(String billUserName)
/* 112:    */   {
/* 113:162 */     this.billUserName = billUserName;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public String getChargeInst()
/* 117:    */   {
/* 118:166 */     return this.chargeInst;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void setChargeInst(String chargeInst)
/* 122:    */   {
/* 123:169 */     this.chargeInst = chargeInst;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public String getChargeUniqId()
/* 127:    */   {
/* 128:173 */     return this.chargeUniqId;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void setChargeUniqId(String chargeUniqId)
/* 132:    */   {
/* 133:176 */     this.chargeUniqId = chargeUniqId;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public String getChargeoffInst()
/* 137:    */   {
/* 138:180 */     return this.chargeoffInst;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void setChargeoffInst(String chargeoffInst)
/* 142:    */   {
/* 143:183 */     this.chargeoffInst = chargeoffInst;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public String getCompanyId()
/* 147:    */   {
/* 148:187 */     return this.companyId;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void setCompanyId(String companyId)
/* 152:    */   {
/* 153:190 */     this.companyId = companyId;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public String getExtend()
/* 157:    */   {
/* 158:194 */     return this.extend;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void setExtend(String extend)
/* 162:    */   {
/* 163:197 */     this.extend = extend;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public String getOrderType()
/* 167:    */   {
/* 168:201 */     return this.orderType;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public void setOrderType(String orderType)
/* 172:    */   {
/* 173:204 */     this.orderType = orderType;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public String getOutId()
/* 177:    */   {
/* 178:208 */     return this.outId;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public void setOutId(String outId)
/* 182:    */   {
/* 183:211 */     this.outId = outId;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public String getReturnMessage()
/* 187:    */   {
/* 188:215 */     return this.returnMessage;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public void setReturnMessage(String returnMessage)
/* 192:    */   {
/* 193:218 */     this.returnMessage = returnMessage;
/* 194:    */   }
/* 195:    */   
/* 196:    */   public String getSubOrderType()
/* 197:    */   {
/* 198:222 */     return this.subOrderType;
/* 199:    */   }
/* 200:    */   
/* 201:    */   public void setSubOrderType(String subOrderType)
/* 202:    */   {
/* 203:225 */     this.subOrderType = subOrderType;
/* 204:    */   }
/* 205:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.QueryInstBillInfo
 * JD-Core Version:    0.7.0.1
 */