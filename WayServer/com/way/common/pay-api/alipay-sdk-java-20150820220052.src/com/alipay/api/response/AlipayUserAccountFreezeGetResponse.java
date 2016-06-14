/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.AccountFreeze;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayUserAccountFreezeGetResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 8543182261366479189L;
/* 13:   */   @ApiListField("freeze_items")
/* 14:   */   @ApiField("account_freeze")
/* 15:   */   private List<AccountFreeze> freezeItems;
/* 16:   */   @ApiField("total_results")
/* 17:   */   private String totalResults;
/* 18:   */   
/* 19:   */   public void setFreezeItems(List<AccountFreeze> freezeItems)
/* 20:   */   {
/* 21:34 */     this.freezeItems = freezeItems;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public List<AccountFreeze> getFreezeItems()
/* 25:   */   {
/* 26:37 */     return this.freezeItems;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setTotalResults(String totalResults)
/* 30:   */   {
/* 31:41 */     this.totalResults = totalResults;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getTotalResults()
/* 35:   */   {
/* 36:44 */     return this.totalResults;
/* 37:   */   }
/* 38:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayUserAccountFreezeGetResponse
 * JD-Core Version:    0.7.0.1
 */