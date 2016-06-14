/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class UnfreezeOrderDetail
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 1852272584992335963L;
/*  11:    */   @ApiField("alipay_order_no")
/*  12:    */   private String alipayOrderNo;
/*  13:    */   @ApiField("create_time")
/*  14:    */   private Date createTime;
/*  15:    */   @ApiField("memo")
/*  16:    */   private String memo;
/*  17:    */   @ApiField("merchant_order_no")
/*  18:    */   private String merchantOrderNo;
/*  19:    */   @ApiField("modified_time")
/*  20:    */   private Date modifiedTime;
/*  21:    */   @ApiField("order_amount")
/*  22:    */   private String orderAmount;
/*  23:    */   @ApiField("order_status")
/*  24:    */   private String orderStatus;
/*  25:    */   @ApiField("unfreeze_amount")
/*  26:    */   private String unfreezeAmount;
/*  27:    */   
/*  28:    */   public String getAlipayOrderNo()
/*  29:    */   {
/*  30: 67 */     return this.alipayOrderNo;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setAlipayOrderNo(String alipayOrderNo)
/*  34:    */   {
/*  35: 70 */     this.alipayOrderNo = alipayOrderNo;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public Date getCreateTime()
/*  39:    */   {
/*  40: 74 */     return this.createTime;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setCreateTime(Date createTime)
/*  44:    */   {
/*  45: 77 */     this.createTime = createTime;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getMemo()
/*  49:    */   {
/*  50: 81 */     return this.memo;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setMemo(String memo)
/*  54:    */   {
/*  55: 84 */     this.memo = memo;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getMerchantOrderNo()
/*  59:    */   {
/*  60: 88 */     return this.merchantOrderNo;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setMerchantOrderNo(String merchantOrderNo)
/*  64:    */   {
/*  65: 91 */     this.merchantOrderNo = merchantOrderNo;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public Date getModifiedTime()
/*  69:    */   {
/*  70: 95 */     return this.modifiedTime;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setModifiedTime(Date modifiedTime)
/*  74:    */   {
/*  75: 98 */     this.modifiedTime = modifiedTime;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getOrderAmount()
/*  79:    */   {
/*  80:102 */     return this.orderAmount;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setOrderAmount(String orderAmount)
/*  84:    */   {
/*  85:105 */     this.orderAmount = orderAmount;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getOrderStatus()
/*  89:    */   {
/*  90:109 */     return this.orderStatus;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setOrderStatus(String orderStatus)
/*  94:    */   {
/*  95:112 */     this.orderStatus = orderStatus;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getUnfreezeAmount()
/*  99:    */   {
/* 100:116 */     return this.unfreezeAmount;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setUnfreezeAmount(String unfreezeAmount)
/* 104:    */   {
/* 105:119 */     this.unfreezeAmount = unfreezeAmount;
/* 106:    */   }
/* 107:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.UnfreezeOrderDetail
 * JD-Core Version:    0.7.0.1
 */