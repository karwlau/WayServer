/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.domain.TradeFundBill;
/*   5:    */ import com.alipay.api.internal.mapping.ApiField;
/*   6:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   7:    */ import java.util.Date;
/*   8:    */ import java.util.List;
/*   9:    */ 
/*  10:    */ public class AlipayTradeQueryResponse
/*  11:    */   extends AlipayResponse
/*  12:    */ {
/*  13:    */   private static final long serialVersionUID = 3758917654533684255L;
/*  14:    */   @ApiField("alipay_store_id")
/*  15:    */   private String alipayStoreId;
/*  16:    */   @ApiField("buyer_logon_id")
/*  17:    */   private String buyerLogonId;
/*  18:    */   @ApiField("buyer_pay_amount")
/*  19:    */   private String buyerPayAmount;
/*  20:    */   @ApiListField("fund_bill_list")
/*  21:    */   @ApiField("trade_fund_bill")
/*  22:    */   private List<TradeFundBill> fundBillList;
/*  23:    */   @ApiField("invoice_amount")
/*  24:    */   private String invoiceAmount;
/*  25:    */   @ApiField("open_id")
/*  26:    */   private String openId;
/*  27:    */   @ApiField("out_trade_no")
/*  28:    */   private String outTradeNo;
/*  29:    */   @ApiField("point_amount")
/*  30:    */   private String pointAmount;
/*  31:    */   @ApiField("receipt_amount")
/*  32:    */   private String receiptAmount;
/*  33:    */   @ApiField("send_pay_date")
/*  34:    */   private Date sendPayDate;
/*  35:    */   @ApiField("store_id")
/*  36:    */   private String storeId;
/*  37:    */   @ApiField("terminal_id")
/*  38:    */   private String terminalId;
/*  39:    */   @ApiField("total_amount")
/*  40:    */   private String totalAmount;
/*  41:    */   @ApiField("trade_no")
/*  42:    */   private String tradeNo;
/*  43:    */   @ApiField("trade_status")
/*  44:    */   private String tradeStatus;
/*  45:    */   
/*  46:    */   public void setAlipayStoreId(String alipayStoreId)
/*  47:    */   {
/*  48:113 */     this.alipayStoreId = alipayStoreId;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getAlipayStoreId()
/*  52:    */   {
/*  53:116 */     return this.alipayStoreId;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setBuyerLogonId(String buyerLogonId)
/*  57:    */   {
/*  58:120 */     this.buyerLogonId = buyerLogonId;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getBuyerLogonId()
/*  62:    */   {
/*  63:123 */     return this.buyerLogonId;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setBuyerPayAmount(String buyerPayAmount)
/*  67:    */   {
/*  68:127 */     this.buyerPayAmount = buyerPayAmount;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getBuyerPayAmount()
/*  72:    */   {
/*  73:130 */     return this.buyerPayAmount;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setFundBillList(List<TradeFundBill> fundBillList)
/*  77:    */   {
/*  78:134 */     this.fundBillList = fundBillList;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public List<TradeFundBill> getFundBillList()
/*  82:    */   {
/*  83:137 */     return this.fundBillList;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setInvoiceAmount(String invoiceAmount)
/*  87:    */   {
/*  88:141 */     this.invoiceAmount = invoiceAmount;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getInvoiceAmount()
/*  92:    */   {
/*  93:144 */     return this.invoiceAmount;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setOpenId(String openId)
/*  97:    */   {
/*  98:148 */     this.openId = openId;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getOpenId()
/* 102:    */   {
/* 103:151 */     return this.openId;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setOutTradeNo(String outTradeNo)
/* 107:    */   {
/* 108:155 */     this.outTradeNo = outTradeNo;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public String getOutTradeNo()
/* 112:    */   {
/* 113:158 */     return this.outTradeNo;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setPointAmount(String pointAmount)
/* 117:    */   {
/* 118:162 */     this.pointAmount = pointAmount;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String getPointAmount()
/* 122:    */   {
/* 123:165 */     return this.pointAmount;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void setReceiptAmount(String receiptAmount)
/* 127:    */   {
/* 128:169 */     this.receiptAmount = receiptAmount;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public String getReceiptAmount()
/* 132:    */   {
/* 133:172 */     return this.receiptAmount;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void setSendPayDate(Date sendPayDate)
/* 137:    */   {
/* 138:176 */     this.sendPayDate = sendPayDate;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public Date getSendPayDate()
/* 142:    */   {
/* 143:179 */     return this.sendPayDate;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void setStoreId(String storeId)
/* 147:    */   {
/* 148:183 */     this.storeId = storeId;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public String getStoreId()
/* 152:    */   {
/* 153:186 */     return this.storeId;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void setTerminalId(String terminalId)
/* 157:    */   {
/* 158:190 */     this.terminalId = terminalId;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public String getTerminalId()
/* 162:    */   {
/* 163:193 */     return this.terminalId;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void setTotalAmount(String totalAmount)
/* 167:    */   {
/* 168:197 */     this.totalAmount = totalAmount;
/* 169:    */   }
/* 170:    */   
/* 171:    */   public String getTotalAmount()
/* 172:    */   {
/* 173:200 */     return this.totalAmount;
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void setTradeNo(String tradeNo)
/* 177:    */   {
/* 178:204 */     this.tradeNo = tradeNo;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public String getTradeNo()
/* 182:    */   {
/* 183:207 */     return this.tradeNo;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void setTradeStatus(String tradeStatus)
/* 187:    */   {
/* 188:211 */     this.tradeStatus = tradeStatus;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public String getTradeStatus()
/* 192:    */   {
/* 193:214 */     return this.tradeStatus;
/* 194:    */   }
/* 195:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayTradeQueryResponse
 * JD-Core Version:    0.7.0.1
 */