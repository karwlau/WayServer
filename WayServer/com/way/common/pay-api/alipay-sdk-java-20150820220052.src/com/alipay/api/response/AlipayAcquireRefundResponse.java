/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayAcquireRefundResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7197978517267534739L;
/*  10:    */   @ApiField("buyer_logon_id")
/*  11:    */   private String buyerLogonId;
/*  12:    */   @ApiField("buyer_user_id")
/*  13:    */   private String buyerUserId;
/*  14:    */   @ApiField("detail_error_code")
/*  15:    */   private String detailErrorCode;
/*  16:    */   @ApiField("detail_error_des")
/*  17:    */   private String detailErrorDes;
/*  18:    */   @ApiField("fund_change")
/*  19:    */   private String fundChange;
/*  20:    */   @ApiField("out_trade_no")
/*  21:    */   private String outTradeNo;
/*  22:    */   @ApiField("result_code")
/*  23:    */   private String resultCode;
/*  24:    */   @ApiField("trade_no")
/*  25:    */   private String tradeNo;
/*  26:    */   
/*  27:    */   public void setBuyerLogonId(String buyerLogonId)
/*  28:    */   {
/*  29: 75 */     this.buyerLogonId = buyerLogonId;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public String getBuyerLogonId()
/*  33:    */   {
/*  34: 78 */     return this.buyerLogonId;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void setBuyerUserId(String buyerUserId)
/*  38:    */   {
/*  39: 82 */     this.buyerUserId = buyerUserId;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String getBuyerUserId()
/*  43:    */   {
/*  44: 85 */     return this.buyerUserId;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setDetailErrorCode(String detailErrorCode)
/*  48:    */   {
/*  49: 89 */     this.detailErrorCode = detailErrorCode;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String getDetailErrorCode()
/*  53:    */   {
/*  54: 92 */     return this.detailErrorCode;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setDetailErrorDes(String detailErrorDes)
/*  58:    */   {
/*  59: 96 */     this.detailErrorDes = detailErrorDes;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getDetailErrorDes()
/*  63:    */   {
/*  64: 99 */     return this.detailErrorDes;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setFundChange(String fundChange)
/*  68:    */   {
/*  69:103 */     this.fundChange = fundChange;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getFundChange()
/*  73:    */   {
/*  74:106 */     return this.fundChange;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setOutTradeNo(String outTradeNo)
/*  78:    */   {
/*  79:110 */     this.outTradeNo = outTradeNo;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getOutTradeNo()
/*  83:    */   {
/*  84:113 */     return this.outTradeNo;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setResultCode(String resultCode)
/*  88:    */   {
/*  89:117 */     this.resultCode = resultCode;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getResultCode()
/*  93:    */   {
/*  94:120 */     return this.resultCode;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setTradeNo(String tradeNo)
/*  98:    */   {
/*  99:124 */     this.tradeNo = tradeNo;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getTradeNo()
/* 103:    */   {
/* 104:127 */     return this.tradeNo;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayAcquireRefundResponse
 * JD-Core Version:    0.7.0.1
 */