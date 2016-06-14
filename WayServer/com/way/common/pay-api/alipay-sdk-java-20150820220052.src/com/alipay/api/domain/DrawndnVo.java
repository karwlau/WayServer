/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class DrawndnVo
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 3691387114584523816L;
/*  11:    */   @ApiField("actual_collected_interest")
/*  12:    */   private String actualCollectedInterest;
/*  13:    */   @ApiField("balance")
/*  14:    */   private String balance;
/*  15:    */   @ApiField("collected_principal_and_interest")
/*  16:    */   private String collectedPrincipalAndInterest;
/*  17:    */   @ApiField("credit_no")
/*  18:    */   private String creditNo;
/*  19:    */   @ApiField("drawndn_date")
/*  20:    */   private Date drawndnDate;
/*  21:    */   @ApiField("drawndn_no")
/*  22:    */   private String drawndnNo;
/*  23:    */   @ApiField("due_date")
/*  24:    */   private Date dueDate;
/*  25:    */   @ApiField("five_tier_classification")
/*  26:    */   private String fiveTierClassification;
/*  27:    */   @ApiField("interest")
/*  28:    */   private String interest;
/*  29:    */   @ApiField("interest_rate")
/*  30:    */   private String interestRate;
/*  31:    */   @ApiField("lending_amount")
/*  32:    */   private String lendingAmount;
/*  33:    */   @ApiField("overduce_terms")
/*  34:    */   private Long overduceTerms;
/*  35:    */   @ApiField("overdue_days")
/*  36:    */   private Long overdueDays;
/*  37:    */   @ApiField("overdue_interest")
/*  38:    */   private String overdueInterest;
/*  39:    */   @ApiField("overdue_interest_penalty")
/*  40:    */   private String overdueInterestPenalty;
/*  41:    */   @ApiField("overdue_principal")
/*  42:    */   private String overduePrincipal;
/*  43:    */   @ApiField("overdue_principal_penalty")
/*  44:    */   private String overduePrincipalPenalty;
/*  45:    */   @ApiField("status")
/*  46:    */   private String status;
/*  47:    */   
/*  48:    */   public String getActualCollectedInterest()
/*  49:    */   {
/*  50:127 */     return this.actualCollectedInterest;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setActualCollectedInterest(String actualCollectedInterest)
/*  54:    */   {
/*  55:130 */     this.actualCollectedInterest = actualCollectedInterest;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getBalance()
/*  59:    */   {
/*  60:134 */     return this.balance;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setBalance(String balance)
/*  64:    */   {
/*  65:137 */     this.balance = balance;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getCollectedPrincipalAndInterest()
/*  69:    */   {
/*  70:141 */     return this.collectedPrincipalAndInterest;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setCollectedPrincipalAndInterest(String collectedPrincipalAndInterest)
/*  74:    */   {
/*  75:144 */     this.collectedPrincipalAndInterest = collectedPrincipalAndInterest;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getCreditNo()
/*  79:    */   {
/*  80:148 */     return this.creditNo;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setCreditNo(String creditNo)
/*  84:    */   {
/*  85:151 */     this.creditNo = creditNo;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public Date getDrawndnDate()
/*  89:    */   {
/*  90:155 */     return this.drawndnDate;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setDrawndnDate(Date drawndnDate)
/*  94:    */   {
/*  95:158 */     this.drawndnDate = drawndnDate;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getDrawndnNo()
/*  99:    */   {
/* 100:162 */     return this.drawndnNo;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setDrawndnNo(String drawndnNo)
/* 104:    */   {
/* 105:165 */     this.drawndnNo = drawndnNo;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public Date getDueDate()
/* 109:    */   {
/* 110:169 */     return this.dueDate;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setDueDate(Date dueDate)
/* 114:    */   {
/* 115:172 */     this.dueDate = dueDate;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getFiveTierClassification()
/* 119:    */   {
/* 120:176 */     return this.fiveTierClassification;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void setFiveTierClassification(String fiveTierClassification)
/* 124:    */   {
/* 125:179 */     this.fiveTierClassification = fiveTierClassification;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public String getInterest()
/* 129:    */   {
/* 130:183 */     return this.interest;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public void setInterest(String interest)
/* 134:    */   {
/* 135:186 */     this.interest = interest;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public String getInterestRate()
/* 139:    */   {
/* 140:190 */     return this.interestRate;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void setInterestRate(String interestRate)
/* 144:    */   {
/* 145:193 */     this.interestRate = interestRate;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public String getLendingAmount()
/* 149:    */   {
/* 150:197 */     return this.lendingAmount;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void setLendingAmount(String lendingAmount)
/* 154:    */   {
/* 155:200 */     this.lendingAmount = lendingAmount;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public Long getOverduceTerms()
/* 159:    */   {
/* 160:204 */     return this.overduceTerms;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void setOverduceTerms(Long overduceTerms)
/* 164:    */   {
/* 165:207 */     this.overduceTerms = overduceTerms;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public Long getOverdueDays()
/* 169:    */   {
/* 170:211 */     return this.overdueDays;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public void setOverdueDays(Long overdueDays)
/* 174:    */   {
/* 175:214 */     this.overdueDays = overdueDays;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public String getOverdueInterest()
/* 179:    */   {
/* 180:218 */     return this.overdueInterest;
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void setOverdueInterest(String overdueInterest)
/* 184:    */   {
/* 185:221 */     this.overdueInterest = overdueInterest;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public String getOverdueInterestPenalty()
/* 189:    */   {
/* 190:225 */     return this.overdueInterestPenalty;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public void setOverdueInterestPenalty(String overdueInterestPenalty)
/* 194:    */   {
/* 195:228 */     this.overdueInterestPenalty = overdueInterestPenalty;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public String getOverduePrincipal()
/* 199:    */   {
/* 200:232 */     return this.overduePrincipal;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public void setOverduePrincipal(String overduePrincipal)
/* 204:    */   {
/* 205:235 */     this.overduePrincipal = overduePrincipal;
/* 206:    */   }
/* 207:    */   
/* 208:    */   public String getOverduePrincipalPenalty()
/* 209:    */   {
/* 210:239 */     return this.overduePrincipalPenalty;
/* 211:    */   }
/* 212:    */   
/* 213:    */   public void setOverduePrincipalPenalty(String overduePrincipalPenalty)
/* 214:    */   {
/* 215:242 */     this.overduePrincipalPenalty = overduePrincipalPenalty;
/* 216:    */   }
/* 217:    */   
/* 218:    */   public String getStatus()
/* 219:    */   {
/* 220:246 */     return this.status;
/* 221:    */   }
/* 222:    */   
/* 223:    */   public void setStatus(String status)
/* 224:    */   {
/* 225:249 */     this.status = status;
/* 226:    */   }
/* 227:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.DrawndnVo
 * JD-Core Version:    0.7.0.1
 */