/*  1:   */ package com.alipay.api.internal.util.json;
/*  2:   */ 
/*  3:   */ public class JSONValidatingWriter
/*  4:   */   extends JSONWriter
/*  5:   */ {
/*  6:   */   private JSONValidator validator;
/*  7:   */   
/*  8:   */   public JSONValidatingWriter(JSONValidator validator, boolean emitClassName)
/*  9:   */   {
/* 10: 8 */     super(emitClassName);
/* 11: 9 */     this.validator = validator;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public JSONValidatingWriter(JSONValidator validator)
/* 15:   */   {
/* 16:13 */     this.validator = validator;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public JSONValidatingWriter(JSONErrorListener listener, boolean emitClassName)
/* 20:   */   {
/* 21:17 */     this(new JSONValidator(listener), emitClassName);
/* 22:   */   }
/* 23:   */   
/* 24:   */   public JSONValidatingWriter(JSONErrorListener listener)
/* 25:   */   {
/* 26:21 */     this(new JSONValidator(listener));
/* 27:   */   }
/* 28:   */   
/* 29:   */   public JSONValidatingWriter()
/* 30:   */   {
/* 31:25 */     this(new StdoutStreamErrorListener());
/* 32:   */   }
/* 33:   */   
/* 34:   */   public JSONValidatingWriter(boolean emitClassName)
/* 35:   */   {
/* 36:29 */     this(new StdoutStreamErrorListener(), emitClassName);
/* 37:   */   }
/* 38:   */   
/* 39:   */   private String validate(String text)
/* 40:   */   {
/* 41:33 */     this.validator.validate(text);
/* 42:34 */     return text;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public String write(Object object)
/* 46:   */   {
/* 47:38 */     return validate(super.write(object));
/* 48:   */   }
/* 49:   */   
/* 50:   */   public String write(long n)
/* 51:   */   {
/* 52:42 */     return validate(super.write(n));
/* 53:   */   }
/* 54:   */   
/* 55:   */   public String write(double d)
/* 56:   */   {
/* 57:46 */     return validate(super.write(d));
/* 58:   */   }
/* 59:   */   
/* 60:   */   public String write(char c)
/* 61:   */   {
/* 62:50 */     return validate(super.write(c));
/* 63:   */   }
/* 64:   */   
/* 65:   */   public String write(boolean b)
/* 66:   */   {
/* 67:54 */     return validate(super.write(b));
/* 68:   */   }
/* 69:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.json.JSONValidatingWriter
 * JD-Core Version:    0.7.0.1
 */