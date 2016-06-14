/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class AlipayMobilePublicLabelQueryResponse
/*  9:   */   extends AlipayResponse
/* 10:   */ {
/* 11:   */   private static final long serialVersionUID = 8751171711859747314L;
/* 12:   */   @ApiField("code")
/* 13:   */   private String code;
/* 14:   */   @ApiListField("labels")
/* 15:   */   @ApiField("string")
/* 16:   */   private List<String> labels;
/* 17:   */   @ApiField("msg")
/* 18:   */   private String msg;
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
/* 30:   */   public void setLabels(List<String> labels)
/* 31:   */   {
/* 32:46 */     this.labels = labels;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public List<String> getLabels()
/* 36:   */   {
/* 37:49 */     return this.labels;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void setMsg(String msg)
/* 41:   */   {
/* 42:53 */     this.msg = msg;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public String getMsg()
/* 46:   */   {
/* 47:56 */     return this.msg;
/* 48:   */   }
/* 49:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMobilePublicLabelQueryResponse
 * JD-Core Version:    0.7.0.1
 */