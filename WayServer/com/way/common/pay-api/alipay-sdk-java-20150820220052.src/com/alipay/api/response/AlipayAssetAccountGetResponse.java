/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.AssetAccountResult;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipayAssetAccountGetResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 1587527915818515787L;
/* 13:   */   @ApiListField("asset_list")
/* 14:   */   @ApiField("asset_account_result")
/* 15:   */   private List<AssetAccountResult> assetList;
/* 16:   */   
/* 17:   */   public void setAssetList(List<AssetAccountResult> assetList)
/* 18:   */   {
/* 19:28 */     this.assetList = assetList;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public List<AssetAccountResult> getAssetList()
/* 23:   */   {
/* 24:31 */     return this.assetList;
/* 25:   */   }
/* 26:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayAssetAccountGetResponse
 * JD-Core Version:    0.7.0.1
 */