/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMobileRecommendGetResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1618591712569289727L;
/* 10:   */   @ApiField("ext_info")
/* 11:   */   private String extInfo;
/* 12:   */   @ApiField("items")
/* 13:   */   private String items;
/* 14:   */   @ApiField("recommend_id")
/* 15:   */   private String recommendId;
/* 16:   */   
/* 17:   */   public void setExtInfo(String extInfo)
/* 18:   */   {
/* 19:36 */     this.extInfo = extInfo;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public String getExtInfo()
/* 23:   */   {
/* 24:39 */     return this.extInfo;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void setItems(String items)
/* 28:   */   {
/* 29:43 */     this.items = items;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String getItems()
/* 33:   */   {
/* 34:46 */     return this.items;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void setRecommendId(String recommendId)
/* 38:   */   {
/* 39:50 */     this.recommendId = recommendId;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String getRecommendId()
/* 43:   */   {
/* 44:53 */     return this.recommendId;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMobileRecommendGetResponse
 * JD-Core Version:    0.7.0.1
 */