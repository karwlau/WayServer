/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.domain.TradeFundBill;
/*   5:    */ import com.alipay.api.internal.mapping.ApiField;
/*   6:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   7:    */ import java.util.Date;
/*   8:    */ import java.util.List;
/*   9:    */ 
/*  10:    */ public class AlipayTradePayResponse
/*  11:    */   extends AlipayResponse
/*  12:    */ {
/*  13:    */   private static final long serialVersionUID = 5486392667335794176L;
/*  14:    */   @ApiField("buyer_logon_id")
/*  15:    */   private String buyerLogonId;
/*  16:    */   @ApiField("buyer_pay_amount")
/*  17:    */   private String buyerPayAmount;
/*  18:    */   @ApiField("card_balance")
/*  19:    */   private String cardBalance;
/*  20:    */   @ApiListField("fund_bill_list")
/*  21:    */   @ApiField("trade_fund_bill")
/*  22:    */   private List<TradeFundBill> fundBillList;
/*  23:    */   @ApiField("gmt_payment")
/*  24:    */   private Date gmtPayment;
/*  25:    */   @ApiField("invoice_amount")
/*  26:    */   private String invoiceAmount;
/*  27:    */   @ApiField("open_id")
/*  28:    */   private String openId;
/*  29:    */   @ApiField("out_trade_no")
/*  30:    */   private String outTradeNo;
/*  31:    */   @ApiField("point_amount")
/*  32:    */   private String pointAmount;
/*  33:    */   @ApiField("receipt_amount")
/*  34:    */   private String receiptAmount;
/*  35:    */   @ApiField("store_name")
/*  36:    */   private String storeName;
/*  37:    */   @ApiField("total_amount")
/*  38:    */   private String totalAmount;
/*  39:    */   @ApiField("trade_no")
/*  40:    */   private String tradeNo;
/*  41:    */   
/*  42:    */   public void setBuyerLogonId(String buyerLogonId)
/*  43:    */   {
/*  44:101 */     this.buyerLogonId = buyerLogonId;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getBuyerLogonId()
/*  48:    */   {
/*  49:104 */     return this.buyerLogonId;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setBuyerPayAmount(String buyerPayAmount)
/*  53:    */   {
/*  54:108 */     this.buyerPayAmount = buyerPayAmount;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getBuyerPayAmount()
/*  58:    */   {
/*  59:111 */     return this.buyerPayAmount;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setCardBalance(String cardBalance)
/*  63:    */   {
/*  64:115 */     this.cardBalance = cardBalance;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getCardBalance()
/*  68:    */   {
/*  69:118 */     return this.cardBalance;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setFundBillList(List<TradeFundBill> fundBillList)
/*  73:    */   {
/*  74:122 */     this.fundBillList = fundBillList;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public List<TradeFundBill> getFundBillList()
/*  78:    */   {
/*  79:125 */     return this.fundBillList;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setGmtPayment(Date gmtPayment)
/*  83:    */   {
/*  84:129 */     this.gmtPayment = gmtPayment;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public Date getGmtPayment()
/*  88:    */   {
/*  89:132 */     return this.gmtPayment;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setInvoiceAmount(String invoiceAmount)
/*  93:    */   {
/*  94:136 */     this.invoiceAmount = invoiceAmount;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getInvoiceAmount()
/*  98:    */   {
/*  99:139 */     return this.invoiceAmount;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setOpenId(String openId)
/* 103:    */   {
/* 104:143 */     this.openId = openId;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public String getOpenId()
/* 108:    */   {
/* 109:146 */     return this.openId;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void setOutTradeNo(String outTradeNo)
/* 113:    */   {
/* 114:150 */     this.outTradeNo = outTradeNo;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public String getOutTradeNo()
/* 118:    */   {
/* 119:153 */     return this.outTradeNo;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void setPointAmount(String pointAmount)
/* 123:    */   {
/* 124:157 */     this.pointAmount = pointAmount;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getPointAmount()
/* 128:    */   {
/* 129:160 */     return this.pointAmount;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void setReceiptAmount(String receiptAmount)
/* 133:    */   {
/* 134:164 */     this.receiptAmount = receiptAmount;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public String getReceiptAmount()
/* 138:    */   {
/* 139:167 */     return this.receiptAmount;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void setStoreName(String storeName)
/* 143:    */   {
/* 144:171 */     this.storeName = storeName;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public String getStoreName()
/* 148:    */   {
/* 149:174 */     return this.storeName;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void setTotalAmount(String totalAmount)
/* 153:    */   {
/* 154:178 */     this.totalAmount = totalAmount;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public String getTotalAmount()
/* 158:    */   {
/* 159:181 */     return this.totalAmount;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void setTradeNo(String tradeNo)
/* 163:    */   {
/* 164:185 */     this.tradeNo = tradeNo;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public String getTradeNo()
/* 168:    */   {
/* 169:188 */     return this.tradeNo;
/* 170:    */   }
/* 171:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayTradePayResponse
 * JD-Core Version:    0.7.0.1
 */