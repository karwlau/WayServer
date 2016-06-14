/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.Data;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ 
/*  7:   */ public class AlipayMobilePublicFollowListResponse
/*  8:   */   extends AlipayResponse
/*  9:   */ {
/* 10:   */   private static final long serialVersionUID = 7556298874925329155L;
/* 11:   */   @ApiField("code")
/* 12:   */   private String code;
/* 13:   */   @ApiField("count")
/* 14:   */   private String count;
/* 15:   */   @ApiField("data")
/* 16:   */   private Data data;
/* 17:   */   @ApiField("next_user_id")
/* 18:   */   private String nextUserId;
/* 19:   */   
/* 20:   */   public void setCode(String code)
/* 21:   */   {
/* 22:43 */     this.code = code;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getCode()
/* 26:   */   {
/* 27:46 */     return this.code;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setCount(String count)
/* 31:   */   {
/* 32:50 */     this.count = count;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public String getCount()
/* 36:   */   {
/* 37:53 */     return this.count;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void setData(Data data)
/* 41:   */   {
/* 42:57 */     this.data = data;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public Data getData()
/* 46:   */   {
/* 47:60 */     return this.data;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public void setNextUserId(String nextUserId)
/* 51:   */   {
/* 52:64 */     this.nextUserId = nextUserId;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public String getNextUserId()
/* 56:   */   {
/* 57:67 */     return this.nextUserId;
/* 58:   */   }
/* 59:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMobilePublicFollowListResponse
 * JD-Core Version:    0.7.0.1
 */