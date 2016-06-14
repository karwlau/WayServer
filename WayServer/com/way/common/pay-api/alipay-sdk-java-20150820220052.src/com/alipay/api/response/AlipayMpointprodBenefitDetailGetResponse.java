/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.BenefitInfo;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayMpointprodBenefitDetailGetResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 6588365869734188498L;
/* 13:   */   @ApiListField("benefit_infos")
/* 14:   */   @ApiField("benefit_info")
/* 15:   */   private List<BenefitInfo> benefitInfos;
/* 16:   */   @ApiField("code")
/* 17:   */   private String code;
/* 18:   */   @ApiField("msg")
/* 19:   */   private String msg;
/* 20:   */   
/* 21:   */   public void setBenefitInfos(List<BenefitInfo> benefitInfos)
/* 22:   */   {
/* 23:40 */     this.benefitInfos = benefitInfos;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public List<BenefitInfo> getBenefitInfos()
/* 27:   */   {
/* 28:43 */     return this.benefitInfos;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setCode(String code)
/* 32:   */   {
/* 33:47 */     this.code = code;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public String getCode()
/* 37:   */   {
/* 38:50 */     return this.code;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setMsg(String msg)
/* 42:   */   {
/* 43:54 */     this.msg = msg;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public String getMsg()
/* 47:   */   {
/* 48:57 */     return this.msg;
/* 49:   */   }
/* 50:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMpointprodBenefitDetailGetResponse
 * JD-Core Version:    0.7.0.1
 */