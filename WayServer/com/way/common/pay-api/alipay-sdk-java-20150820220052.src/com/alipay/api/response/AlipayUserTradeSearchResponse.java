/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.TradeRecord;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayUserTradeSearchResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 4157987617726933517L;
/* 13:   */   @ApiField("total_pages")
/* 14:   */   private String totalPages;
/* 15:   */   @ApiField("total_results")
/* 16:   */   private String totalResults;
/* 17:   */   @ApiListField("trade_records")
/* 18:   */   @ApiField("trade_record")
/* 19:   */   private List<TradeRecord> tradeRecords;
/* 20:   */   
/* 21:   */   public void setTotalPages(String totalPages)
/* 22:   */   {
/* 23:40 */     this.totalPages = totalPages;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String getTotalPages()
/* 27:   */   {
/* 28:43 */     return this.totalPages;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setTotalResults(String totalResults)
/* 32:   */   {
/* 33:47 */     this.totalResults = totalResults;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public String getTotalResults()
/* 37:   */   {
/* 38:50 */     return this.totalResults;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setTradeRecords(List<TradeRecord> tradeRecords)
/* 42:   */   {
/* 43:54 */     this.tradeRecords = tradeRecords;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public List<TradeRecord> getTradeRecords()
/* 47:   */   {
/* 48:57 */     return this.tradeRecords;
/* 49:   */   }
/* 50:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayUserTradeSearchResponse
 * JD-Core Version:    0.7.0.1
 */