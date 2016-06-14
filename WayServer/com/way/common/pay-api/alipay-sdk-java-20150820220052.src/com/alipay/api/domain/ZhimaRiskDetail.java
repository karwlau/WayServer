/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class ZhimaRiskDetail
/*   8:    */   extends AlipayObject
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 6581475429426423752L;
/*  11:    */   @ApiField("data_type")
/*  12:    */   private String dataType;
/*  13:    */   @ApiField("extendinfo")
/*  14:    */   private String extendinfo;
/*  15:    */   @ApiField("risk_code")
/*  16:    */   private String riskCode;
/*  17:    */   @ApiField("risk_type")
/*  18:    */   private String riskType;
/*  19:    */   @ApiField("settlement")
/*  20:    */   private String settlement;
/*  21:    */   @ApiField("statement")
/*  22:    */   private String statement;
/*  23:    */   @ApiField("status")
/*  24:    */   private String status;
/*  25:    */   @ApiField("type")
/*  26:    */   private String type;
/*  27:    */   @ApiField("update")
/*  28:    */   private Date update;
/*  29:    */   
/*  30:    */   public String getDataType()
/*  31:    */   {
/*  32: 73 */     return this.dataType;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setDataType(String dataType)
/*  36:    */   {
/*  37: 76 */     this.dataType = dataType;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getExtendinfo()
/*  41:    */   {
/*  42: 80 */     return this.extendinfo;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setExtendinfo(String extendinfo)
/*  46:    */   {
/*  47: 83 */     this.extendinfo = extendinfo;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getRiskCode()
/*  51:    */   {
/*  52: 87 */     return this.riskCode;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setRiskCode(String riskCode)
/*  56:    */   {
/*  57: 90 */     this.riskCode = riskCode;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getRiskType()
/*  61:    */   {
/*  62: 94 */     return this.riskType;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setRiskType(String riskType)
/*  66:    */   {
/*  67: 97 */     this.riskType = riskType;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getSettlement()
/*  71:    */   {
/*  72:101 */     return this.settlement;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setSettlement(String settlement)
/*  76:    */   {
/*  77:104 */     this.settlement = settlement;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getStatement()
/*  81:    */   {
/*  82:108 */     return this.statement;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setStatement(String statement)
/*  86:    */   {
/*  87:111 */     this.statement = statement;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getStatus()
/*  91:    */   {
/*  92:115 */     return this.status;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void setStatus(String status)
/*  96:    */   {
/*  97:118 */     this.status = status;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public String getType()
/* 101:    */   {
/* 102:122 */     return this.type;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void setType(String type)
/* 106:    */   {
/* 107:125 */     this.type = type;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public Date getUpdate()
/* 111:    */   {
/* 112:129 */     return this.update;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void setUpdate(Date update)
/* 116:    */   {
/* 117:132 */     this.update = update;
/* 118:    */   }
/* 119:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.ZhimaRiskDetail
 * JD-Core Version:    0.7.0.1
 */