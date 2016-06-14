/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class MicroPayOrderDetail
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 3759587142834128882L;
/*  11:    */   @ApiField("alipay_order_no")
/*  12:    */   private String alipayOrderNo;
/*  13:    */   @ApiField("alipay_user_id")
/*  14:    */   private String alipayUserId;
/*  15:    */   @ApiField("available_amount")
/*  16:    */   private String availableAmount;
/*  17:    */   @ApiField("create_time")
/*  18:    */   private Date createTime;
/*  19:    */   @ApiField("expire_time")
/*  20:    */   private Date expireTime;
/*  21:    */   @ApiField("freeze_amount")
/*  22:    */   private String freezeAmount;
/*  23:    */   @ApiField("memo")
/*  24:    */   private String memo;
/*  25:    */   @ApiField("merchant_order_no")
/*  26:    */   private String merchantOrderNo;
/*  27:    */   @ApiField("modified_time")
/*  28:    */   private Date modifiedTime;
/*  29:    */   @ApiField("order_status")
/*  30:    */   private String orderStatus;
/*  31:    */   @ApiField("pay_amount")
/*  32:    */   private String payAmount;
/*  33:    */   @ApiField("pay_confirm")
/*  34:    */   private String payConfirm;
/*  35:    */   
/*  36:    */   public String getAlipayOrderNo()
/*  37:    */   {
/*  38: 91 */     return this.alipayOrderNo;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setAlipayOrderNo(String alipayOrderNo)
/*  42:    */   {
/*  43: 94 */     this.alipayOrderNo = alipayOrderNo;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public String getAlipayUserId()
/*  47:    */   {
/*  48: 98 */     return this.alipayUserId;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setAlipayUserId(String alipayUserId)
/*  52:    */   {
/*  53:101 */     this.alipayUserId = alipayUserId;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String getAvailableAmount()
/*  57:    */   {
/*  58:105 */     return this.availableAmount;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setAvailableAmount(String availableAmount)
/*  62:    */   {
/*  63:108 */     this.availableAmount = availableAmount;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public Date getCreateTime()
/*  67:    */   {
/*  68:112 */     return this.createTime;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setCreateTime(Date createTime)
/*  72:    */   {
/*  73:115 */     this.createTime = createTime;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public Date getExpireTime()
/*  77:    */   {
/*  78:119 */     return this.expireTime;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setExpireTime(Date expireTime)
/*  82:    */   {
/*  83:122 */     this.expireTime = expireTime;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getFreezeAmount()
/*  87:    */   {
/*  88:126 */     return this.freezeAmount;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setFreezeAmount(String freezeAmount)
/*  92:    */   {
/*  93:129 */     this.freezeAmount = freezeAmount;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String getMemo()
/*  97:    */   {
/*  98:133 */     return this.memo;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setMemo(String memo)
/* 102:    */   {
/* 103:136 */     this.memo = memo;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public String getMerchantOrderNo()
/* 107:    */   {
/* 108:140 */     return this.merchantOrderNo;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setMerchantOrderNo(String merchantOrderNo)
/* 112:    */   {
/* 113:143 */     this.merchantOrderNo = merchantOrderNo;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public Date getModifiedTime()
/* 117:    */   {
/* 118:147 */     return this.modifiedTime;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void setModifiedTime(Date modifiedTime)
/* 122:    */   {
/* 123:150 */     this.modifiedTime = modifiedTime;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public String getOrderStatus()
/* 127:    */   {
/* 128:154 */     return this.orderStatus;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void setOrderStatus(String orderStatus)
/* 132:    */   {
/* 133:157 */     this.orderStatus = orderStatus;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public String getPayAmount()
/* 137:    */   {
/* 138:161 */     return this.payAmount;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void setPayAmount(String payAmount)
/* 142:    */   {
/* 143:164 */     this.payAmount = payAmount;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public String getPayConfirm()
/* 147:    */   {
/* 148:168 */     return this.payConfirm;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void setPayConfirm(String payConfirm)
/* 152:    */   {
/* 153:171 */     this.payConfirm = payConfirm;
/* 154:    */   }
/* 155:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.MicroPayOrderDetail
 * JD-Core Version:    0.7.0.1
 */