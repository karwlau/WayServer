/*  1:   */ package com.alipay.api.internal.util.json;
/*  2:   */ 
/*  3:   */ public class JSONValidatingReader
/*  4:   */   extends JSONReader
/*  5:   */ {
/*  6: 4 */   public static final Object INVALID = new Object();
/*  7:   */   private JSONValidator validator;
/*  8:   */   
/*  9:   */   public JSONValidatingReader(JSONValidator validator)
/* 10:   */   {
/* 11: 8 */     this.validator = validator;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public JSONValidatingReader(JSONErrorListener listener)
/* 15:   */   {
/* 16:12 */     this(new JSONValidator(listener));
/* 17:   */   }
/* 18:   */   
/* 19:   */   public JSONValidatingReader()
/* 20:   */   {
/* 21:16 */     this(new StdoutStreamErrorListener());
/* 22:   */   }
/* 23:   */   
/* 24:   */   public Object read(String string)
/* 25:   */   {
/* 26:20 */     if (!this.validator.validate(string)) {
/* 27:20 */       return INVALID;
/* 28:   */     }
/* 29:21 */     return super.read(string);
/* 30:   */   }
/* 31:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.json.JSONValidatingReader
 * JD-Core Version:    0.7.0.1
 */