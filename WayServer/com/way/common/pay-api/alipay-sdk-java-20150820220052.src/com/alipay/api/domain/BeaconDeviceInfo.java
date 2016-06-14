/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class BeaconDeviceInfo
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 7876644547285269514L;
/* 10:   */   @ApiField("actiontype")
/* 11:   */   private String actiontype;
/* 12:   */   @ApiField("inuse")
/* 13:   */   private Boolean inuse;
/* 14:   */   @ApiField("remark")
/* 15:   */   private String remark;
/* 16:   */   @ApiField("sn")
/* 17:   */   private String sn;
/* 18:   */   @ApiField("template")
/* 19:   */   private BeaconTemplate template;
/* 20:   */   @ApiField("uuid")
/* 21:   */   private String uuid;
/* 22:   */   
/* 23:   */   public String getActiontype()
/* 24:   */   {
/* 25:53 */     return this.actiontype;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setActiontype(String actiontype)
/* 29:   */   {
/* 30:56 */     this.actiontype = actiontype;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public Boolean getInuse()
/* 34:   */   {
/* 35:60 */     return this.inuse;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setInuse(Boolean inuse)
/* 39:   */   {
/* 40:63 */     this.inuse = inuse;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getRemark()
/* 44:   */   {
/* 45:67 */     return this.remark;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void setRemark(String remark)
/* 49:   */   {
/* 50:70 */     this.remark = remark;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public String getSn()
/* 54:   */   {
/* 55:74 */     return this.sn;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void setSn(String sn)
/* 59:   */   {
/* 60:77 */     this.sn = sn;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public BeaconTemplate getTemplate()
/* 64:   */   {
/* 65:81 */     return this.template;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public void setTemplate(BeaconTemplate template)
/* 69:   */   {
/* 70:84 */     this.template = template;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String getUuid()
/* 74:   */   {
/* 75:88 */     return this.uuid;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void setUuid(String uuid)
/* 79:   */   {
/* 80:91 */     this.uuid = uuid;
/* 81:   */   }
/* 82:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.BeaconDeviceInfo
 * JD-Core Version:    0.7.0.1
 */