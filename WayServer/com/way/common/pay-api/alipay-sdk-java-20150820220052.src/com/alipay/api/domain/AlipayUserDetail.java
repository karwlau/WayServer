/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayUserDetail
/*   7:    */   extends AlipayObject
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7587392273619998976L;
/*  10:    */   @ApiField("alipay_user_id")
/*  11:    */   private String alipayUserId;
/*  12:    */   @ApiField("certified")
/*  13:    */   private Boolean certified;
/*  14:    */   @ApiField("logon_id")
/*  15:    */   private String logonId;
/*  16:    */   @ApiField("real_name")
/*  17:    */   private String realName;
/*  18:    */   @ApiField("sex")
/*  19:    */   private String sex;
/*  20:    */   @ApiField("user_status")
/*  21:    */   private String userStatus;
/*  22:    */   @ApiField("user_type")
/*  23:    */   private String userType;
/*  24:    */   
/*  25:    */   public String getAlipayUserId()
/*  26:    */   {
/*  27: 59 */     return this.alipayUserId;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setAlipayUserId(String alipayUserId)
/*  31:    */   {
/*  32: 62 */     this.alipayUserId = alipayUserId;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public Boolean getCertified()
/*  36:    */   {
/*  37: 66 */     return this.certified;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setCertified(Boolean certified)
/*  41:    */   {
/*  42: 69 */     this.certified = certified;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getLogonId()
/*  46:    */   {
/*  47: 73 */     return this.logonId;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setLogonId(String logonId)
/*  51:    */   {
/*  52: 76 */     this.logonId = logonId;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getRealName()
/*  56:    */   {
/*  57: 80 */     return this.realName;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setRealName(String realName)
/*  61:    */   {
/*  62: 83 */     this.realName = realName;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getSex()
/*  66:    */   {
/*  67: 87 */     return this.sex;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setSex(String sex)
/*  71:    */   {
/*  72: 90 */     this.sex = sex;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getUserStatus()
/*  76:    */   {
/*  77: 94 */     return this.userStatus;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setUserStatus(String userStatus)
/*  81:    */   {
/*  82: 97 */     this.userStatus = userStatus;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String getUserType()
/*  86:    */   {
/*  87:101 */     return this.userType;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setUserType(String userType)
/*  91:    */   {
/*  92:104 */     this.userType = userType;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.AlipayUserDetail
 * JD-Core Version:    0.7.0.1
 */