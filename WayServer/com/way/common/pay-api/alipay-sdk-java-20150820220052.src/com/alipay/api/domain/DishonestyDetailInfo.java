/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class DishonestyDetailInfo
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 1876941136746971125L;
/*  10:    */   @ApiField("behavior")
/*  11:    */   private String behavior;
/*  12:    */   @ApiField("case_code")
/*  13:    */   private String caseCode;
/*  14:    */   @ApiField("enforce_court")
/*  15:    */   private String enforceCourt;
/*  16:    */   @ApiField("id_number")
/*  17:    */   private String idNumber;
/*  18:    */   @ApiField("name")
/*  19:    */   private String name;
/*  20:    */   @ApiField("performance")
/*  21:    */   private String performance;
/*  22:    */   @ApiField("publish_date")
/*  23:    */   private String publishDate;
/*  24:    */   @ApiField("region")
/*  25:    */   private String region;
/*  26:    */   
/*  27:    */   public String getBehavior()
/*  28:    */   {
/*  29: 65 */     return this.behavior;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void setBehavior(String behavior)
/*  33:    */   {
/*  34: 68 */     this.behavior = behavior;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public String getCaseCode()
/*  38:    */   {
/*  39: 72 */     return this.caseCode;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void setCaseCode(String caseCode)
/*  43:    */   {
/*  44: 75 */     this.caseCode = caseCode;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getEnforceCourt()
/*  48:    */   {
/*  49: 79 */     return this.enforceCourt;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void setEnforceCourt(String enforceCourt)
/*  53:    */   {
/*  54: 82 */     this.enforceCourt = enforceCourt;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public String getIdNumber()
/*  58:    */   {
/*  59: 86 */     return this.idNumber;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void setIdNumber(String idNumber)
/*  63:    */   {
/*  64: 89 */     this.idNumber = idNumber;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public String getName()
/*  68:    */   {
/*  69: 93 */     return this.name;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void setName(String name)
/*  73:    */   {
/*  74: 96 */     this.name = name;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public String getPerformance()
/*  78:    */   {
/*  79:100 */     return this.performance;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void setPerformance(String performance)
/*  83:    */   {
/*  84:103 */     this.performance = performance;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String getPublishDate()
/*  88:    */   {
/*  89:107 */     return this.publishDate;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void setPublishDate(String publishDate)
/*  93:    */   {
/*  94:110 */     this.publishDate = publishDate;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String getRegion()
/*  98:    */   {
/*  99:114 */     return this.region;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public void setRegion(String region)
/* 103:    */   {
/* 104:117 */     this.region = region;
/* 105:    */   }
/* 106:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.DishonestyDetailInfo
 * JD-Core Version:    0.7.0.1
 */