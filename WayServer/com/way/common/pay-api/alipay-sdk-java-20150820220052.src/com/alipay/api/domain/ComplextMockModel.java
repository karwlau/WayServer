/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ComplextMockModel
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1862452644468716333L;
/* 10:   */   @ApiField("biz_model")
/* 11:   */   private SimpleMockModel bizModel;
/* 12:   */   @ApiField("biz_num")
/* 13:   */   private Long bizNum;
/* 14:   */   @ApiField("biz_type")
/* 15:   */   private String bizType;
/* 16:   */   
/* 17:   */   public SimpleMockModel getBizModel()
/* 18:   */   {
/* 19:35 */     return this.bizModel;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setBizModel(SimpleMockModel bizModel)
/* 23:   */   {
/* 24:38 */     this.bizModel = bizModel;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public Long getBizNum()
/* 28:   */   {
/* 29:42 */     return this.bizNum;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setBizNum(Long bizNum)
/* 33:   */   {
/* 34:45 */     this.bizNum = bizNum;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getBizType()
/* 38:   */   {
/* 39:49 */     return this.bizType;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setBizType(String bizType)
/* 43:   */   {
/* 44:52 */     this.bizType = bizType;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.ComplextMockModel
 * JD-Core Version:    0.7.0.1
 */