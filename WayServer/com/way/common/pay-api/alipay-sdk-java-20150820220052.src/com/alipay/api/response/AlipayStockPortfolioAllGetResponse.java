/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayStockPortfolioAllGetResponse
/*  9:   */   extends AlipayResponse
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 6578557914516873588L;
/* 12:   */   @ApiField("code")
/* 13:   */   private String code;
/* 14:   */   @ApiField("msg")
/* 15:   */   private String msg;
/* 16:   */   @ApiListField("symbol_list")
/* 17:   */   @ApiField("string")
/* 18:   */   private List<String> symbolList;
/* 19:   */   
/* 20:   */   public void setCode(String code)
/* 21:   */   {
/* 22:39 */     this.code = code;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getCode()
/* 26:   */   {
/* 27:42 */     return this.code;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setMsg(String msg)
/* 31:   */   {
/* 32:46 */     this.msg = msg;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public String getMsg()
/* 36:   */   {
/* 37:49 */     return this.msg;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void setSymbolList(List<String> symbolList)
/* 41:   */   {
/* 42:53 */     this.symbolList = symbolList;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public List<String> getSymbolList()
/* 46:   */   {
/* 47:56 */     return this.symbolList;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayStockPortfolioAllGetResponse
 * JD-Core Version:    0.7.0.1
 */