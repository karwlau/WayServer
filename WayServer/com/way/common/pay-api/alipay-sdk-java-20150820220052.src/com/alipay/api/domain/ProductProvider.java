/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class ProductProvider
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 4623474891124824648L;
/*  10:    */   @ApiField("agency")
/*  11:    */   private String agency;
/*  12:    */   @ApiField("agency_name")
/*  13:    */   private String agencyName;
/*  14:    */   @ApiField("biz_type")
/*  15:    */   private String bizType;
/*  16:    */   @ApiField("id")
/*  17:    */   private String id;
/*  18:    */   @ApiField("sub_biz_type")
/*  19:    */   private String subBizType;
/*  20:    */   @ApiField("sub_operator")
/*  21:    */   private String subOperator;
/*  22:    */   @ApiField("sub_operator_name")
/*  23:    */   private String subOperatorName;
/*  24:    */   
/*  25:    */   public String getAgency()
/*  26:    */   {
/*  27: 59 */     return this.agency;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setAgency(String agency)
/*  31:    */   {
/*  32: 62 */     this.agency = agency;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getAgencyName()
/*  36:    */   {
/*  37: 66 */     return this.agencyName;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setAgencyName(String agencyName)
/*  41:    */   {
/*  42: 69 */     this.agencyName = agencyName;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getBizType()
/*  46:    */   {
/*  47: 73 */     return this.bizType;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setBizType(String bizType)
/*  51:    */   {
/*  52: 76 */     this.bizType = bizType;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getId()
/*  56:    */   {
/*  57: 80 */     return this.id;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setId(String id)
/*  61:    */   {
/*  62: 83 */     this.id = id;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getSubBizType()
/*  66:    */   {
/*  67: 87 */     return this.subBizType;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setSubBizType(String subBizType)
/*  71:    */   {
/*  72: 90 */     this.subBizType = subBizType;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getSubOperator()
/*  76:    */   {
/*  77: 94 */     return this.subOperator;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setSubOperator(String subOperator)
/*  81:    */   {
/*  82: 97 */     this.subOperator = subOperator;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getSubOperatorName()
/*  86:    */   {
/*  87:101 */     return this.subOperatorName;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setSubOperatorName(String subOperatorName)
/*  91:    */   {
/*  92:104 */     this.subOperatorName = subOperatorName;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.ProductProvider
 * JD-Core Version:    0.7.0.1
 */