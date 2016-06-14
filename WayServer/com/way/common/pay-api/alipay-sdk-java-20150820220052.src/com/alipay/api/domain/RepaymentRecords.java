/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class RepaymentRecords
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 3514945764287899753L;
/*  11:    */   @ApiField("date")
/*  12:    */   private Date date;
/*  13:    */   @ApiField("interest")
/*  14:    */   private String interest;
/*  15:    */   @ApiField("overdue_interest")
/*  16:    */   private String overdueInterest;
/*  17:    */   @ApiField("overdue_interest_penalty")
/*  18:    */   private String overdueInterestPenalty;
/*  19:    */   @ApiField("overdue_principal")
/*  20:    */   private String overduePrincipal;
/*  21:    */   @ApiField("overdue_principal_penalty")
/*  22:    */   private String overduePrincipalPenalty;
/*  23:    */   @ApiField("principal")
/*  24:    */   private String principal;
/*  25:    */   @ApiField("remarks")
/*  26:    */   private String remarks;
/*  27:    */   @ApiField("total_amount")
/*  28:    */   private String totalAmount;
/*  29:    */   
/*  30:    */   public Date getDate()
/*  31:    */   {
/*  32: 73 */     return this.date;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setDate(Date date)
/*  36:    */   {
/*  37: 76 */     this.date = date;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getInterest()
/*  41:    */   {
/*  42: 80 */     return this.interest;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setInterest(String interest)
/*  46:    */   {
/*  47: 83 */     this.interest = interest;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getOverdueInterest()
/*  51:    */   {
/*  52: 87 */     return this.overdueInterest;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setOverdueInterest(String overdueInterest)
/*  56:    */   {
/*  57: 90 */     this.overdueInterest = overdueInterest;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getOverdueInterestPenalty()
/*  61:    */   {
/*  62: 94 */     return this.overdueInterestPenalty;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setOverdueInterestPenalty(String overdueInterestPenalty)
/*  66:    */   {
/*  67: 97 */     this.overdueInterestPenalty = overdueInterestPenalty;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getOverduePrincipal()
/*  71:    */   {
/*  72:101 */     return this.overduePrincipal;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setOverduePrincipal(String overduePrincipal)
/*  76:    */   {
/*  77:104 */     this.overduePrincipal = overduePrincipal;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getOverduePrincipalPenalty()
/*  81:    */   {
/*  82:108 */     return this.overduePrincipalPenalty;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setOverduePrincipalPenalty(String overduePrincipalPenalty)
/*  86:    */   {
/*  87:111 */     this.overduePrincipalPenalty = overduePrincipalPenalty;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getPrincipal()
/*  91:    */   {
/*  92:115 */     return this.principal;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setPrincipal(String principal)
/*  96:    */   {
/*  97:118 */     this.principal = principal;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getRemarks()
/* 101:    */   {
/* 102:122 */     return this.remarks;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setRemarks(String remarks)
/* 106:    */   {
/* 107:125 */     this.remarks = remarks;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getTotalAmount()
/* 111:    */   {
/* 112:129 */     return this.totalAmount;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setTotalAmount(String totalAmount)
/* 116:    */   {
/* 117:132 */     this.totalAmount = totalAmount;
/* 118:    */   }
/* 119:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.RepaymentRecords
 * JD-Core Version:    0.7.0.1
 */