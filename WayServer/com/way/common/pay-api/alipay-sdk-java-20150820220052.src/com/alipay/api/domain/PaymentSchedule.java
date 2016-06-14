/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class PaymentSchedule
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 8741687488764241861L;
/*  11:    */   @ApiField("date")
/*  12:    */   private Date date;
/*  13:    */   @ApiField("repaid_interest_total")
/*  14:    */   private String repaidInterestTotal;
/*  15:    */   @ApiField("repaid_penalty_total")
/*  16:    */   private String repaidPenaltyTotal;
/*  17:    */   @ApiField("repaid_principal_total")
/*  18:    */   private String repaidPrincipalTotal;
/*  19:    */   @ApiField("start_date")
/*  20:    */   private Date startDate;
/*  21:    */   @ApiField("term")
/*  22:    */   private Long term;
/*  23:    */   @ApiField("unpaid_interest_total")
/*  24:    */   private String unpaidInterestTotal;
/*  25:    */   @ApiField("unpaid_penalty_total")
/*  26:    */   private String unpaidPenaltyTotal;
/*  27:    */   @ApiField("unpaid_principal_total")
/*  28:    */   private String unpaidPrincipalTotal;
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
/*  40:    */   public String getRepaidInterestTotal()
/*  41:    */   {
/*  42: 80 */     return this.repaidInterestTotal;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setRepaidInterestTotal(String repaidInterestTotal)
/*  46:    */   {
/*  47: 83 */     this.repaidInterestTotal = repaidInterestTotal;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getRepaidPenaltyTotal()
/*  51:    */   {
/*  52: 87 */     return this.repaidPenaltyTotal;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setRepaidPenaltyTotal(String repaidPenaltyTotal)
/*  56:    */   {
/*  57: 90 */     this.repaidPenaltyTotal = repaidPenaltyTotal;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getRepaidPrincipalTotal()
/*  61:    */   {
/*  62: 94 */     return this.repaidPrincipalTotal;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setRepaidPrincipalTotal(String repaidPrincipalTotal)
/*  66:    */   {
/*  67: 97 */     this.repaidPrincipalTotal = repaidPrincipalTotal;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public Date getStartDate()
/*  71:    */   {
/*  72:101 */     return this.startDate;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setStartDate(Date startDate)
/*  76:    */   {
/*  77:104 */     this.startDate = startDate;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public Long getTerm()
/*  81:    */   {
/*  82:108 */     return this.term;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setTerm(Long term)
/*  86:    */   {
/*  87:111 */     this.term = term;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getUnpaidInterestTotal()
/*  91:    */   {
/*  92:115 */     return this.unpaidInterestTotal;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setUnpaidInterestTotal(String unpaidInterestTotal)
/*  96:    */   {
/*  97:118 */     this.unpaidInterestTotal = unpaidInterestTotal;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getUnpaidPenaltyTotal()
/* 101:    */   {
/* 102:122 */     return this.unpaidPenaltyTotal;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setUnpaidPenaltyTotal(String unpaidPenaltyTotal)
/* 106:    */   {
/* 107:125 */     this.unpaidPenaltyTotal = unpaidPenaltyTotal;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public String getUnpaidPrincipalTotal()
/* 111:    */   {
/* 112:129 */     return this.unpaidPrincipalTotal;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setUnpaidPrincipalTotal(String unpaidPrincipalTotal)
/* 116:    */   {
/* 117:132 */     this.unpaidPrincipalTotal = unpaidPrincipalTotal;
/* 118:    */   }
/* 119:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.PaymentSchedule
 * JD-Core Version:    0.7.0.1
 */