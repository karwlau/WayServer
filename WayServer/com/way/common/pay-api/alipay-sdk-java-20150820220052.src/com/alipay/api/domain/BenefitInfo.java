/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class BenefitInfo
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 6411268423465868258L;
/*  11:    */   @ApiField("benefit_info_id")
/*  12:    */   private String benefitInfoId;
/*  13:    */   @ApiField("benefit_name")
/*  14:    */   private String benefitName;
/*  15:    */   @ApiField("benefit_name_cn")
/*  16:    */   private String benefitNameCn;
/*  17:    */   @ApiField("benefit_type")
/*  18:    */   private String benefitType;
/*  19:    */   @ApiField("dispatch_dt")
/*  20:    */   private Date dispatchDt;
/*  21:    */   @ApiField("end_dt")
/*  22:    */   private Date endDt;
/*  23:    */   @ApiField("start_dt")
/*  24:    */   private Date startDt;
/*  25:    */   @ApiField("status")
/*  26:    */   private String status;
/*  27:    */   
/*  28:    */   public String getBenefitInfoId()
/*  29:    */   {
/*  30: 70 */     return this.benefitInfoId;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setBenefitInfoId(String benefitInfoId)
/*  34:    */   {
/*  35: 73 */     this.benefitInfoId = benefitInfoId;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getBenefitName()
/*  39:    */   {
/*  40: 77 */     return this.benefitName;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setBenefitName(String benefitName)
/*  44:    */   {
/*  45: 80 */     this.benefitName = benefitName;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getBenefitNameCn()
/*  49:    */   {
/*  50: 84 */     return this.benefitNameCn;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setBenefitNameCn(String benefitNameCn)
/*  54:    */   {
/*  55: 87 */     this.benefitNameCn = benefitNameCn;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getBenefitType()
/*  59:    */   {
/*  60: 91 */     return this.benefitType;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setBenefitType(String benefitType)
/*  64:    */   {
/*  65: 94 */     this.benefitType = benefitType;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public Date getDispatchDt()
/*  69:    */   {
/*  70: 98 */     return this.dispatchDt;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setDispatchDt(Date dispatchDt)
/*  74:    */   {
/*  75:101 */     this.dispatchDt = dispatchDt;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public Date getEndDt()
/*  79:    */   {
/*  80:105 */     return this.endDt;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setEndDt(Date endDt)
/*  84:    */   {
/*  85:108 */     this.endDt = endDt;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public Date getStartDt()
/*  89:    */   {
/*  90:112 */     return this.startDt;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setStartDt(Date startDt)
/*  94:    */   {
/*  95:115 */     this.startDt = startDt;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String getStatus()
/*  99:    */   {
/* 100:119 */     return this.status;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void setStatus(String status)
/* 104:    */   {
/* 105:122 */     this.status = status;
/* 106:    */   }
/* 107:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.BenefitInfo
 * JD-Core Version:    0.7.0.1
 */