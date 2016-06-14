/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class AlipayMobileDeviceinfoDynamicinfoAddResponse
/*  7:   */   extends AlipayResponse
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4585216817966767545L;
/* 10:   */   @ApiField("operateresult")
/* 11:   */   private Boolean operateresult;
/* 12:   */   
/* 13:   */   public void setOperateresult(Boolean operateresult)
/* 14:   */   {
/* 15:24 */     this.operateresult = operateresult;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public Boolean getOperateresult()
/* 19:   */   {
/* 20:27 */     return this.operateresult;
/* 21:   */   }
/* 22:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMobileDeviceinfoDynamicinfoAddResponse
 * JD-Core Version:    0.7.0.1
 */