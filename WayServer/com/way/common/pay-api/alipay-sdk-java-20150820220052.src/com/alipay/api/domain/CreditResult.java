/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class CreditResult
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 5417838374225882284L;
/*  11:    */   @ApiField("credit_line")
/*  12:    */   private String creditLine;
/*  13:    */   @ApiField("credit_no")
/*  14:    */   private String creditNo;
/*  15:    */   @ApiField("credit_term")
/*  16:    */   private Long creditTerm;
/*  17:    */   @ApiField("credit_term_unit")
/*  18:    */   private String creditTermUnit;
/*  19:    */   @ApiField("effective_date")
/*  20:    */   private Date effectiveDate;
/*  21:    */   @ApiField("expire_date")
/*  22:    */   private Date expireDate;
/*  23:    */   @ApiField("fee_rate")
/*  24:    */   private String feeRate;
/*  25:    */   @ApiField("interest_rate")
/*  26:    */   private String interestRate;
/*  27:    */   @ApiField("loan_term")
/*  28:    */   private Long loanTerm;
/*  29:    */   @ApiField("loan_term_unit")
/*  30:    */   private String loanTermUnit;
/*  31:    */   @ApiField("repayment_mode")
/*  32:    */   private String repaymentMode;
/*  33:    */   
/*  34:    */   public String getCreditLine()
/*  35:    */   {
/*  36: 85 */     return this.creditLine;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void setCreditLine(String creditLine)
/*  40:    */   {
/*  41: 88 */     this.creditLine = creditLine;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public String getCreditNo()
/*  45:    */   {
/*  46: 92 */     return this.creditNo;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void setCreditNo(String creditNo)
/*  50:    */   {
/*  51: 95 */     this.creditNo = creditNo;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public Long getCreditTerm()
/*  55:    */   {
/*  56: 99 */     return this.creditTerm;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void setCreditTerm(Long creditTerm)
/*  60:    */   {
/*  61:102 */     this.creditTerm = creditTerm;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String getCreditTermUnit()
/*  65:    */   {
/*  66:106 */     return this.creditTermUnit;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setCreditTermUnit(String creditTermUnit)
/*  70:    */   {
/*  71:109 */     this.creditTermUnit = creditTermUnit;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public Date getEffectiveDate()
/*  75:    */   {
/*  76:113 */     return this.effectiveDate;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setEffectiveDate(Date effectiveDate)
/*  80:    */   {
/*  81:116 */     this.effectiveDate = effectiveDate;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public Date getExpireDate()
/*  85:    */   {
/*  86:120 */     return this.expireDate;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setExpireDate(Date expireDate)
/*  90:    */   {
/*  91:123 */     this.expireDate = expireDate;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getFeeRate()
/*  95:    */   {
/*  96:127 */     return this.feeRate;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setFeeRate(String feeRate)
/* 100:    */   {
/* 101:130 */     this.feeRate = feeRate;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getInterestRate()
/* 105:    */   {
/* 106:134 */     return this.interestRate;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setInterestRate(String interestRate)
/* 110:    */   {
/* 111:137 */     this.interestRate = interestRate;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public Long getLoanTerm()
/* 115:    */   {
/* 116:141 */     return this.loanTerm;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setLoanTerm(Long loanTerm)
/* 120:    */   {
/* 121:144 */     this.loanTerm = loanTerm;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getLoanTermUnit()
/* 125:    */   {
/* 126:148 */     return this.loanTermUnit;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setLoanTermUnit(String loanTermUnit)
/* 130:    */   {
/* 131:151 */     this.loanTermUnit = loanTermUnit;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String getRepaymentMode()
/* 135:    */   {
/* 136:155 */     return this.repaymentMode;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setRepaymentMode(String repaymentMode)
/* 140:    */   {
/* 141:158 */     this.repaymentMode = repaymentMode;
/* 142:    */   }
/* 143:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.CreditResult
 * JD-Core Version:    0.7.0.1
 */