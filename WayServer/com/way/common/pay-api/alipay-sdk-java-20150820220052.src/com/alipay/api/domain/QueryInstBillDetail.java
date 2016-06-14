/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class QueryInstBillDetail
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 4523846981824154454L;
/* 10:   */   @ApiField("key")
/* 11:   */   private String key;
/* 12:   */   @ApiField("name")
/* 13:   */   private String name;
/* 14:   */   @ApiField("value")
/* 15:   */   private String value;
/* 16:   */   
/* 17:   */   public String getKey()
/* 18:   */   {
/* 19:35 */     return this.key;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setKey(String key)
/* 23:   */   {
/* 24:38 */     this.key = key;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getName()
/* 28:   */   {
/* 29:42 */     return this.name;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setName(String name)
/* 33:   */   {
/* 34:45 */     this.name = name;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getValue()
/* 38:   */   {
/* 39:49 */     return this.value;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setValue(String value)
/* 43:   */   {
/* 44:52 */     this.value = value;
/* 45:   */   }
/* 46:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.QueryInstBillDetail
 * JD-Core Version:    0.7.0.1
 */