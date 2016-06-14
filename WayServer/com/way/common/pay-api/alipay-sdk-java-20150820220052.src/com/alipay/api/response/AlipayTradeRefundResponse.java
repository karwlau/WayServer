/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.domain.TradeFundBill;
/*   5:    */ import com.alipay.api.internal.mapping.ApiField;
/*   6:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   7:    */ import java.util.Date;
/*   8:    */ import java.util.List;
/*   9:    */ 
/*  10:    */ public class AlipayTradeRefundResponse
/*  11:    */   extends AlipayResponse
/*  12:    */ {
/*  13:    */   private static final long serialVersionUID = 1734785227264544829L;
/*  14:    */   @ApiField("buyer_logon_id")
/*  15:    */   private String buyerLogonId;
/*  16:    */   @ApiField("fund_change")
/*  17:    */   private String fundChange;
/*  18:    */   @ApiField("gmt_refund_pay")
/*  19:    */   private Date gmtRefundPay;
/*  20:    */   @ApiField("open_id")
/*  21:    */   private String openId;
/*  22:    */   @ApiField("out_trade_no")
/*  23:    */   private String outTradeNo;
/*  24:    */   @ApiListField("refund_detail_item_list")
/*  25:    */   @ApiField("trade_fund_bill")
/*  26:    */   private List<TradeFundBill> refundDetailItemList;
/*  27:    */   @ApiField("refund_fee")
/*  28:    */   private String refundFee;
/*  29:    */   @ApiField("store_name")
/*  30:    */   private String storeName;
/*  31:    */   @ApiField("trade_no")
/*  32:    */   private String tradeNo;
/*  33:    */   
/*  34:    */   public void setBuyerLogonId(String buyerLogonId)
/*  35:    */   {
/*  36: 77 */     this.buyerLogonId = buyerLogonId;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getBuyerLogonId()
/*  40:    */   {
/*  41: 80 */     return this.buyerLogonId;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setFundChange(String fundChange)
/*  45:    */   {
/*  46: 84 */     this.fundChange = fundChange;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String getFundChange()
/*  50:    */   {
/*  51: 87 */     return this.fundChange;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setGmtRefundPay(Date gmtRefundPay)
/*  55:    */   {
/*  56: 91 */     this.gmtRefundPay = gmtRefundPay;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public Date getGmtRefundPay()
/*  60:    */   {
/*  61: 94 */     return this.gmtRefundPay;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setOpenId(String openId)
/*  65:    */   {
/*  66: 98 */     this.openId = openId;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String getOpenId()
/*  70:    */   {
/*  71:101 */     return this.openId;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setOutTradeNo(String outTradeNo)
/*  75:    */   {
/*  76:105 */     this.outTradeNo = outTradeNo;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public String getOutTradeNo()
/*  80:    */   {
/*  81:108 */     return this.outTradeNo;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setRefundDetailItemList(List<TradeFundBill> refundDetailItemList)
/*  85:    */   {
/*  86:112 */     this.refundDetailItemList = refundDetailItemList;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public List<TradeFundBill> getRefundDetailItemList()
/*  90:    */   {
/*  91:115 */     return this.refundDetailItemList;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setRefundFee(String refundFee)
/*  95:    */   {
/*  96:119 */     this.refundFee = refundFee;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String getRefundFee()
/* 100:    */   {
/* 101:122 */     return this.refundFee;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setStoreName(String storeName)
/* 105:    */   {
/* 106:126 */     this.storeName = storeName;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public String getStoreName()
/* 110:    */   {
/* 111:129 */     return this.storeName;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setTradeNo(String tradeNo)
/* 115:    */   {
/* 116:133 */     this.tradeNo = tradeNo;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public String getTradeNo()
/* 120:    */   {
/* 121:136 */     return this.tradeNo;
/* 122:    */   }
/* 123:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayTradeRefundResponse
 * JD-Core Version:    0.7.0.1
 */