/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class AlipayPointOrderGetResponse
/*   8:    */   extends AlipayResponse
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 7242293384458575149L;
/*  11:    */   @ApiField("alipay_order_no")
/*  12:    */   private String alipayOrderNo;
/*  13:    */   @ApiField("create_time")
/*  14:    */   private Date createTime;
/*  15:    */   @ApiField("dispatch_user_id")
/*  16:    */   private String dispatchUserId;
/*  17:    */   @ApiField("memo")
/*  18:    */   private String memo;
/*  19:    */   @ApiField("merchant_order_no")
/*  20:    */   private String merchantOrderNo;
/*  21:    */   @ApiField("order_status")
/*  22:    */   private String orderStatus;
/*  23:    */   @ApiField("point_count")
/*  24:    */   private Long pointCount;
/*  25:    */   @ApiField("receive_user_id")
/*  26:    */   private String receiveUserId;
/*  27:    */   
/*  28:    */   public void setAlipayOrderNo(String alipayOrderNo)
/*  29:    */   {
/*  30: 67 */     this.alipayOrderNo = alipayOrderNo;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public String getAlipayOrderNo()
/*  34:    */   {
/*  35: 70 */     return this.alipayOrderNo;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void setCreateTime(Date createTime)
/*  39:    */   {
/*  40: 74 */     this.createTime = createTime;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public Date getCreateTime()
/*  44:    */   {
/*  45: 77 */     return this.createTime;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void setDispatchUserId(String dispatchUserId)
/*  49:    */   {
/*  50: 81 */     this.dispatchUserId = dispatchUserId;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public String getDispatchUserId()
/*  54:    */   {
/*  55: 84 */     return this.dispatchUserId;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void setMemo(String memo)
/*  59:    */   {
/*  60: 88 */     this.memo = memo;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public String getMemo()
/*  64:    */   {
/*  65: 91 */     return this.memo;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setMerchantOrderNo(String merchantOrderNo)
/*  69:    */   {
/*  70: 95 */     this.merchantOrderNo = merchantOrderNo;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getMerchantOrderNo()
/*  74:    */   {
/*  75: 98 */     return this.merchantOrderNo;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setOrderStatus(String orderStatus)
/*  79:    */   {
/*  80:102 */     this.orderStatus = orderStatus;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public String getOrderStatus()
/*  84:    */   {
/*  85:105 */     return this.orderStatus;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setPointCount(Long pointCount)
/*  89:    */   {
/*  90:109 */     this.pointCount = pointCount;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public Long getPointCount()
/*  94:    */   {
/*  95:112 */     return this.pointCount;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void setReceiveUserId(String receiveUserId)
/*  99:    */   {
/* 100:116 */     this.receiveUserId = receiveUserId;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String getReceiveUserId()
/* 104:    */   {
/* 105:119 */     return this.receiveUserId;
/* 106:    */   }
/* 107:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayPointOrderGetResponse
 * JD-Core Version:    0.7.0.1
 */