/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class BatchFundItemAOPModel
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 1695856836626479993L;
/*  13:    */   @ApiField("batch_no")
/*  14:    */   private Long batchNo;
/*  15:    */   @ApiField("dback_refundtobank_processing_batch_amount")
/*  16:    */   private String dbackRefundtobankProcessingBatchAmount;
/*  17:    */   @ApiField("dback_refundtobank_success_batch_amount")
/*  18:    */   private String dbackRefundtobankSuccessBatchAmount;
/*  19:    */   @ApiListField("fund_item_list")
/*  20:    */   @ApiField("fund_item_a_o_p_model")
/*  21:    */   private List<FundItemAOPModel> fundItemList;
/*  22:    */   @ApiField("gmt_biz_create_date")
/*  23:    */   private Date gmtBizCreateDate;
/*  24:    */   @ApiField("order_id")
/*  25:    */   private String orderId;
/*  26:    */   @ApiField("total_amount")
/*  27:    */   private String totalAmount;
/*  28:    */   @ApiField("total_amount_with_service_fee")
/*  29:    */   private String totalAmountWithServiceFee;
/*  30:    */   
/*  31:    */   public Long getBatchNo()
/*  32:    */   {
/*  33: 70 */     return this.batchNo;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setBatchNo(Long batchNo)
/*  37:    */   {
/*  38: 73 */     this.batchNo = batchNo;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getDbackRefundtobankProcessingBatchAmount()
/*  42:    */   {
/*  43: 77 */     return this.dbackRefundtobankProcessingBatchAmount;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setDbackRefundtobankProcessingBatchAmount(String dbackRefundtobankProcessingBatchAmount)
/*  47:    */   {
/*  48: 80 */     this.dbackRefundtobankProcessingBatchAmount = dbackRefundtobankProcessingBatchAmount;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getDbackRefundtobankSuccessBatchAmount()
/*  52:    */   {
/*  53: 84 */     return this.dbackRefundtobankSuccessBatchAmount;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setDbackRefundtobankSuccessBatchAmount(String dbackRefundtobankSuccessBatchAmount)
/*  57:    */   {
/*  58: 87 */     this.dbackRefundtobankSuccessBatchAmount = dbackRefundtobankSuccessBatchAmount;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public List<FundItemAOPModel> getFundItemList()
/*  62:    */   {
/*  63: 91 */     return this.fundItemList;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setFundItemList(List<FundItemAOPModel> fundItemList)
/*  67:    */   {
/*  68: 94 */     this.fundItemList = fundItemList;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public Date getGmtBizCreateDate()
/*  72:    */   {
/*  73: 98 */     return this.gmtBizCreateDate;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setGmtBizCreateDate(Date gmtBizCreateDate)
/*  77:    */   {
/*  78:101 */     this.gmtBizCreateDate = gmtBizCreateDate;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String getOrderId()
/*  82:    */   {
/*  83:105 */     return this.orderId;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setOrderId(String orderId)
/*  87:    */   {
/*  88:108 */     this.orderId = orderId;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String getTotalAmount()
/*  92:    */   {
/*  93:112 */     return this.totalAmount;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setTotalAmount(String totalAmount)
/*  97:    */   {
/*  98:115 */     this.totalAmount = totalAmount;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public String getTotalAmountWithServiceFee()
/* 102:    */   {
/* 103:119 */     return this.totalAmountWithServiceFee;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setTotalAmountWithServiceFee(String totalAmountWithServiceFee)
/* 107:    */   {
/* 108:122 */     this.totalAmountWithServiceFee = totalAmountWithServiceFee;
/* 109:    */   }
/* 110:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.BatchFundItemAOPModel
 * JD-Core Version:    0.7.0.1
 */