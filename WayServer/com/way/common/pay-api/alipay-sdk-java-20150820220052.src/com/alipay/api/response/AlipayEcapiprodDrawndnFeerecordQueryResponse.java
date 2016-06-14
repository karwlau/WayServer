/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.FeeRecords;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayEcapiprodDrawndnFeerecordQueryResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 1243859462365836495L;
/* 13:   */   @ApiListField("fee_records")
/* 14:   */   @ApiField("fee_records")
/* 15:   */   private List<FeeRecords> feeRecords;
/* 16:   */   @ApiField("request_id")
/* 17:   */   private String requestId;
/* 18:   */   
/* 19:   */   public void setFeeRecords(List<FeeRecords> feeRecords)
/* 20:   */   {
/* 21:34 */     this.feeRecords = feeRecords;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public List<FeeRecords> getFeeRecords()
/* 25:   */   {
/* 26:37 */     return this.feeRecords;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setRequestId(String requestId)
/* 30:   */   {
/* 31:41 */     this.requestId = requestId;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getRequestId()
/* 35:   */   {
/* 36:44 */     return this.requestId;
/* 37:   */   }
/* 38:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayEcapiprodDrawndnFeerecordQueryResponse
 * JD-Core Version:    0.7.0.1
 */