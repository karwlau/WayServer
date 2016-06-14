/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.MerchantInstConfig;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayEbppMerchantConfigGetResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 8587356481851288544L;
/* 13:   */   @ApiListField("inst_configs")
/* 14:   */   @ApiField("merchant_inst_config")
/* 15:   */   private List<MerchantInstConfig> instConfigs;
/* 16:   */   @ApiField("merchant_user_id")
/* 17:   */   private String merchantUserId;
/* 18:   */   
/* 19:   */   public void setInstConfigs(List<MerchantInstConfig> instConfigs)
/* 20:   */   {
/* 21:34 */     this.instConfigs = instConfigs;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public List<MerchantInstConfig> getInstConfigs()
/* 25:   */   {
/* 26:37 */     return this.instConfigs;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setMerchantUserId(String merchantUserId)
/* 30:   */   {
/* 31:41 */     this.merchantUserId = merchantUserId;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String getMerchantUserId()
/* 35:   */   {
/* 36:44 */     return this.merchantUserId;
/* 37:   */   }
/* 38:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayEbppMerchantConfigGetResponse
 * JD-Core Version:    0.7.0.1
 */