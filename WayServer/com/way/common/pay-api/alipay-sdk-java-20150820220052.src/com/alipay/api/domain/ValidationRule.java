/*  1:   */ package com.alipay.api.domain;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayObject;
/*  4:   */ import com.alipay.api.internal.mapping.ApiField;
/*  5:   */ 
/*  6:   */ public class ValidationRule
/*  7:   */   extends AlipayObject
/*  8:   */ {
/*  9:   */   private static final long serialVersionUID = 1779799844991495424L;
/* 10:   */   @ApiField("error_msg")
/* 11:   */   private String errorMsg;
/* 12:   */   @ApiField("rule_text")
/* 13:   */   private String ruleText;
/* 14:   */   
/* 15:   */   public String getErrorMsg()
/* 16:   */   {
/* 17:29 */     return this.errorMsg;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setErrorMsg(String errorMsg)
/* 21:   */   {
/* 22:32 */     this.errorMsg = errorMsg;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public String getRuleText()
/* 26:   */   {
/* 27:36 */     return this.ruleText;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setRuleText(String ruleText)
/* 31:   */   {
/* 32:39 */     this.ruleText = ruleText;
/* 33:   */   }
/* 34:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.domain.ValidationRule
 * JD-Core Version:    0.7.0.1
 */