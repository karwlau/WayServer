/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayPassCodeAddResponse
/*  9:   */   extends AlipayResponse
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 1312578184821397866L;
/* 12:   */   @ApiListField("biz_result")
/* 13:   */   @ApiField("string")
/* 14:   */   private List<String> bizResult;
/* 15:   */   @ApiField("error_code")
/* 16:   */   private String errorCode;
/* 17:   */   @ApiField("success")
/* 18:   */   private Boolean success;
/* 19:   */   
/* 20:   */   public void setBizResult(List<String> bizResult)
/* 21:   */   {
/* 22:39 */     this.bizResult = bizResult;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public List<String> getBizResult()
/* 26:   */   {
/* 27:42 */     return this.bizResult;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setErrorCode(String errorCode)
/* 31:   */   {
/* 32:46 */     this.errorCode = errorCode;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public String getErrorCode()
/* 36:   */   {
/* 37:49 */     return this.errorCode;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void setSuccess(Boolean success)
/* 41:   */   {
/* 42:53 */     this.success = success;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public Boolean getSuccess()
/* 46:   */   {
/* 47:56 */     return this.success;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayPassCodeAddResponse
 * JD-Core Version:    0.7.0.1
 */