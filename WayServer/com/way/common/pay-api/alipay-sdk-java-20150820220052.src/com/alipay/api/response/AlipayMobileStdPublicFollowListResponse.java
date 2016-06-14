/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.Data;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayMobileStdPublicFollowListResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 8217835825476144681L;
/* 11:   */   @ApiField("count")
/* 12:   */   private String count;
/* 13:   */   @ApiField("data")
/* 14:   */   private Data data;
/* 15:   */   @ApiField("next_user_id")
/* 16:   */   private String nextUserId;
/* 17:   */   
/* 18:   */   public void setCount(String count)
/* 19:   */   {
/* 20:37 */     this.count = count;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public String getCount()
/* 24:   */   {
/* 25:40 */     return this.count;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setData(Data data)
/* 29:   */   {
/* 30:44 */     this.data = data;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public Data getData()
/* 34:   */   {
/* 35:47 */     return this.data;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setNextUserId(String nextUserId)
/* 39:   */   {
/* 40:51 */     this.nextUserId = nextUserId;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public String getNextUserId()
/* 44:   */   {
/* 45:54 */     return this.nextUserId;
/* 46:   */   }
/* 47:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMobileStdPublicFollowListResponse
 * JD-Core Version:    0.7.0.1
 */