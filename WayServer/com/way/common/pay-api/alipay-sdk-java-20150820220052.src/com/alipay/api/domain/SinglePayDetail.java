/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class SinglePayDetail
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 1425497591166765677L;
/*  11:    */   @ApiField("alipay_order_no")
/*  12:    */   private String alipayOrderNo;
/*  13:    */   @ApiField("amount")
/*  14:    */   private String amount;
/*  15:    */   @ApiField("create_time")
/*  16:    */   private Date createTime;
/*  17:    */   @ApiField("modified_time")
/*  18:    */   private Date modifiedTime;
/*  19:    */   @ApiField("pay_url")
/*  20:    */   private String payUrl;
/*  21:    */   @ApiField("receive_user_id")
/*  22:    */   private String receiveUserId;
/*  23:    */   @ApiField("transfer_order_no")
/*  24:    */   private String transferOrderNo;
/*  25:    */   @ApiField("transfer_out_order_no")
/*  26:    */   private String transferOutOrderNo;
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
/*  38:    */   public String getAmount()
/*  39:    */   {
/*  40: 74 */     return this.amount;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setAmount(String amount)
/*  44:    */   {
/*  45: 77 */     this.amount = amount;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public Date getCreateTime()
/*  49:    */   {
/*  50: 81 */     return this.createTime;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setCreateTime(Date createTime)
/*  54:    */   {
/*  55: 84 */     this.createTime = createTime;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public Date getModifiedTime()
/*  59:    */   {
/*  60: 88 */     return this.modifiedTime;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setModifiedTime(Date modifiedTime)
/*  64:    */   {
/*  65: 91 */     this.modifiedTime = modifiedTime;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getPayUrl()
/*  69:    */   {
/*  70: 95 */     return this.payUrl;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setPayUrl(String payUrl)
/*  74:    */   {
/*  75: 98 */     this.payUrl = payUrl;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getReceiveUserId()
/*  79:    */   {
/*  80:102 */     return this.receiveUserId;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setReceiveUserId(String receiveUserId)
/*  84:    */   {
/*  85:105 */     this.receiveUserId = receiveUserId;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getTransferOrderNo()
/*  89:    */   {
/*  90:109 */     return this.transferOrderNo;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setTransferOrderNo(String transferOrderNo)
/*  94:    */   {
/*  95:112 */     this.transferOrderNo = transferOrderNo;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getTransferOutOrderNo()
/*  99:    */   {
/* 100:116 */     return this.transferOutOrderNo;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setTransferOutOrderNo(String transferOutOrderNo)
/* 104:    */   {
/* 105:119 */     this.transferOutOrderNo = transferOutOrderNo;
/* 106:    */   }
/* 107:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.SinglePayDetail
 * JD-Core Version:    0.7.0.1
 */