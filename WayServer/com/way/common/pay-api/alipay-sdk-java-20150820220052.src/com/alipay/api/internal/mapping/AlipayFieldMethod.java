/*  1:   */ package com.alipay.api.internal.mapping;
/*  2:   */ 
/*  3:   */ import java.lang.reflect.Field;
/*  4:   */ import java.lang.reflect.Method;
/*  5:   */ 
/*  6:   */ public class AlipayFieldMethod
/*  7:   */ {
/*  8:   */   private Field field;
/*  9:   */   private Method method;
/* 10:   */   
/* 11:   */   public Field getField()
/* 12:   */   {
/* 13:33 */     return this.field;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void setField(Field field)
/* 17:   */   {
/* 18:42 */     this.field = field;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public Method getMethod()
/* 22:   */   {
/* 23:51 */     return this.method;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void setMethod(Method method)
/* 27:   */   {
/* 28:60 */     this.method = method;
/* 29:   */   }
/* 30:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.mapping.AlipayFieldMethod
 * JD-Core Version:    0.7.0.1
 */