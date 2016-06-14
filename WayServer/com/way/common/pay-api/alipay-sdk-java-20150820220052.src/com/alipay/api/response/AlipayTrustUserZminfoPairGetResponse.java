/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class AlipayTrustUserZminfoPairGetResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 7389454314668437627L;
/* 11:   */   @ApiField("apply_zm_info")
/* 12:   */   private String applyZmInfo;
/* 13:   */   @ApiField("expire_time")
/* 14:   */   private Date expireTime;
/* 15:   */   @ApiField("owner_zm_info")
/* 16:   */   private String ownerZmInfo;
/* 17:   */   
/* 18:   */   public void setApplyZmInfo(String applyZmInfo)
/* 19:   */   {
/* 20:37 */     this.applyZmInfo = applyZmInfo;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public String getApplyZmInfo()
/* 24:   */   {
/* 25:40 */     return this.applyZmInfo;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setExpireTime(Date expireTime)
/* 29:   */   {
/* 30:44 */     this.expireTime = expireTime;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public Date getExpireTime()
/* 34:   */   {
/* 35:47 */     return this.expireTime;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setOwnerZmInfo(String ownerZmInfo)
/* 39:   */   {
/* 40:51 */     this.ownerZmInfo = ownerZmInfo;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getOwnerZmInfo()
/* 44:   */   {
/* 45:54 */     return this.ownerZmInfo;
/* 46:   */   }
/* 47:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayTrustUserZminfoPairGetResponse
 * JD-Core Version:    0.7.0.1
 */