/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class BeaconTemplate
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 2275194124238528432L;
/* 10:   */   @ApiField("context")
/* 11:   */   private String context;
/* 12:   */   @ApiField("templateid")
/* 13:   */   private String templateid;
/* 14:   */   
/* 15:   */   public String getContext()
/* 16:   */   {
/* 17:29 */     return this.context;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setContext(String context)
/* 21:   */   {
/* 22:32 */     this.context = context;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getTemplateid()
/* 26:   */   {
/* 27:36 */     return this.templateid;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setTemplateid(String templateid)
/* 31:   */   {
/* 32:39 */     this.templateid = templateid;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.BeaconTemplate
 * JD-Core Version:    0.7.0.1
 */