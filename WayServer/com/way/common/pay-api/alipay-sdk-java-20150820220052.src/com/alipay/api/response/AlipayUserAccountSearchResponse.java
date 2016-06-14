/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.AccountRecord;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayUserAccountSearchResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 1713215927639296645L;
/* 13:   */   @ApiListField("account_records")
/* 14:   */   @ApiField("account_record")
/* 15:   */   private List<AccountRecord> accountRecords;
/* 16:   */   @ApiField("total_pages")
/* 17:   */   private Long totalPages;
/* 18:   */   @ApiField("total_results")
/* 19:   */   private Long totalResults;
/* 20:   */   
/* 21:   */   public void setAccountRecords(List<AccountRecord> accountRecords)
/* 22:   */   {
/* 23:40 */     this.accountRecords = accountRecords;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public List<AccountRecord> getAccountRecords()
/* 27:   */   {
/* 28:43 */     return this.accountRecords;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setTotalPages(Long totalPages)
/* 32:   */   {
/* 33:47 */     this.totalPages = totalPages;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public Long getTotalPages()
/* 37:   */   {
/* 38:50 */     return this.totalPages;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setTotalResults(Long totalResults)
/* 42:   */   {
/* 43:54 */     this.totalResults = totalResults;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public Long getTotalResults()
/* 47:   */   {
/* 48:57 */     return this.totalResults;
/* 49:   */   }
/* 50:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayUserAccountSearchResponse
 * JD-Core Version:    0.7.0.1
 */