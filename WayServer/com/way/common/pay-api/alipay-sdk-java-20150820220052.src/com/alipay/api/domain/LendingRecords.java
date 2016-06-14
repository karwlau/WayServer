/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class LendingRecords
/*  8:   */   extends AlipayObject
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 6348214216464221238L;
/* 11:   */   @ApiField("date")
/* 12:   */   private Date date;
/* 13:   */   @ApiField("remark")
/* 14:   */   private String remark;
/* 15:   */   @ApiField("total_amount")
/* 16:   */   private String totalAmount;
/* 17:   */   
/* 18:   */   public Date getDate()
/* 19:   */   {
/* 20:37 */     return this.date;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void setDate(Date date)
/* 24:   */   {
/* 25:40 */     this.date = date;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String getRemark()
/* 29:   */   {
/* 30:44 */     return this.remark;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void setRemark(String remark)
/* 34:   */   {
/* 35:47 */     this.remark = remark;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public String getTotalAmount()
/* 39:   */   {
/* 40:51 */     return this.totalAmount;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void setTotalAmount(String totalAmount)
/* 44:   */   {
/* 45:54 */     this.totalAmount = totalAmount;
/* 46:   */   }
/* 47:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.LendingRecords
 * JD-Core Version:    0.7.0.1
 */