/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class AccountRecord
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 4536825161478786285L;
/*  11:    */   @ApiField("alipay_order_no")
/*  12:    */   private String alipayOrderNo;
/*  13:    */   @ApiField("balance")
/*  14:    */   private String balance;
/*  15:    */   @ApiField("business_type")
/*  16:    */   private String businessType;
/*  17:    */   @ApiField("create_time")
/*  18:    */   private Date createTime;
/*  19:    */   @ApiField("in_amount")
/*  20:    */   private String inAmount;
/*  21:    */   @ApiField("memo")
/*  22:    */   private String memo;
/*  23:    */   @ApiField("merchant_order_no")
/*  24:    */   private String merchantOrderNo;
/*  25:    */   @ApiField("opt_user_id")
/*  26:    */   private String optUserId;
/*  27:    */   @ApiField("out_amount")
/*  28:    */   private String outAmount;
/*  29:    */   @ApiField("self_user_id")
/*  30:    */   private String selfUserId;
/*  31:    */   @ApiField("type")
/*  32:    */   private String type;
/*  33:    */   
/*  34:    */   public String getAlipayOrderNo()
/*  35:    */   {
/*  36: 85 */     return this.alipayOrderNo;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void setAlipayOrderNo(String alipayOrderNo)
/*  40:    */   {
/*  41: 88 */     this.alipayOrderNo = alipayOrderNo;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public String getBalance()
/*  45:    */   {
/*  46: 92 */     return this.balance;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setBalance(String balance)
/*  50:    */   {
/*  51: 95 */     this.balance = balance;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public String getBusinessType()
/*  55:    */   {
/*  56: 99 */     return this.businessType;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setBusinessType(String businessType)
/*  60:    */   {
/*  61:102 */     this.businessType = businessType;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public Date getCreateTime()
/*  65:    */   {
/*  66:106 */     return this.createTime;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setCreateTime(Date createTime)
/*  70:    */   {
/*  71:109 */     this.createTime = createTime;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getInAmount()
/*  75:    */   {
/*  76:113 */     return this.inAmount;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setInAmount(String inAmount)
/*  80:    */   {
/*  81:116 */     this.inAmount = inAmount;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getMemo()
/*  85:    */   {
/*  86:120 */     return this.memo;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setMemo(String memo)
/*  90:    */   {
/*  91:123 */     this.memo = memo;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getMerchantOrderNo()
/*  95:    */   {
/*  96:127 */     return this.merchantOrderNo;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setMerchantOrderNo(String merchantOrderNo)
/* 100:    */   {
/* 101:130 */     this.merchantOrderNo = merchantOrderNo;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getOptUserId()
/* 105:    */   {
/* 106:134 */     return this.optUserId;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setOptUserId(String optUserId)
/* 110:    */   {
/* 111:137 */     this.optUserId = optUserId;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getOutAmount()
/* 115:    */   {
/* 116:141 */     return this.outAmount;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setOutAmount(String outAmount)
/* 120:    */   {
/* 121:144 */     this.outAmount = outAmount;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getSelfUserId()
/* 125:    */   {
/* 126:148 */     return this.selfUserId;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setSelfUserId(String selfUserId)
/* 130:    */   {
/* 131:151 */     this.selfUserId = selfUserId;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getType()
/* 135:    */   {
/* 136:155 */     return this.type;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setType(String type)
/* 140:    */   {
/* 141:158 */     this.type = type;
/* 142:    */   }
/* 143:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.AccountRecord
 * JD-Core Version:    0.7.0.1
 */