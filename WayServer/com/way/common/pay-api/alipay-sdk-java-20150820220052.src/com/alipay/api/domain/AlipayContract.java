/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public class AlipayContract
/*  8:   */   extends AlipayObject
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 1742113226144723649L;
/* 11:   */   @ApiField("alipay_user_id")
/* 12:   */   private String alipayUserId;
/* 13:   */   @ApiField("contract_content")
/* 14:   */   private String contractContent;
/* 15:   */   @ApiField("end_time")
/* 16:   */   private Date endTime;
/* 17:   */   @ApiField("page_url")
/* 18:   */   private String pageUrl;
/* 19:   */   @ApiField("start_time")
/* 20:   */   private Date startTime;
/* 21:   */   @ApiField("subscribe")
/* 22:   */   private Boolean subscribe;
/* 23:   */   
/* 24:   */   public String getAlipayUserId()
/* 25:   */   {
/* 26:55 */     return this.alipayUserId;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setAlipayUserId(String alipayUserId)
/* 30:   */   {
/* 31:58 */     this.alipayUserId = alipayUserId;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getContractContent()
/* 35:   */   {
/* 36:62 */     return this.contractContent;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setContractContent(String contractContent)
/* 40:   */   {
/* 41:65 */     this.contractContent = contractContent;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public Date getEndTime()
/* 45:   */   {
/* 46:69 */     return this.endTime;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setEndTime(Date endTime)
/* 50:   */   {
/* 51:72 */     this.endTime = endTime;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public String getPageUrl()
/* 55:   */   {
/* 56:76 */     return this.pageUrl;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void setPageUrl(String pageUrl)
/* 60:   */   {
/* 61:79 */     this.pageUrl = pageUrl;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public Date getStartTime()
/* 65:   */   {
/* 66:83 */     return this.startTime;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public void setStartTime(Date startTime)
/* 70:   */   {
/* 71:86 */     this.startTime = startTime;
/* 72:   */   }
/* 73:   */   
/* 74:   */   public Boolean getSubscribe()
/* 75:   */   {
/* 76:90 */     return this.subscribe;
/* 77:   */   }
/* 78:   */   
/* 79:   */   public void setSubscribe(Boolean subscribe)
/* 80:   */   {
/* 81:93 */     this.subscribe = subscribe;
/* 82:   */   }
/* 83:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.AlipayContract
 * JD-Core Version:    0.7.0.1
 */