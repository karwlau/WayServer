/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.QueryInstBillInfo;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayEbppBillSearchResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 4725271316599852545L;
/* 13:   */   @ApiField("cachekey")
/* 14:   */   private String cachekey;
/* 15:   */   @ApiListField("inst_bill_info_list")
/* 16:   */   @ApiField("query_inst_bill_info")
/* 17:   */   private List<QueryInstBillInfo> instBillInfoList;
/* 18:   */   
/* 19:   */   public void setCachekey(String cachekey)
/* 20:   */   {
/* 21:34 */     this.cachekey = cachekey;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public String getCachekey()
/* 25:   */   {
/* 26:37 */     return this.cachekey;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setInstBillInfoList(List<QueryInstBillInfo> instBillInfoList)
/* 30:   */   {
/* 31:41 */     this.instBillInfoList = instBillInfoList;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public List<QueryInstBillInfo> getInstBillInfoList()
/* 35:   */   {
/* 36:44 */     return this.instBillInfoList;
/* 37:   */   }
/* 38:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayEbppBillSearchResponse
 * JD-Core Version:    0.7.0.1
 */