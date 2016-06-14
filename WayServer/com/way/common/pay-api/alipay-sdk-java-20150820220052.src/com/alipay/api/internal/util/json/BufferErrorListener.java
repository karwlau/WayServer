/*  1:   */ package com.alipay.api.internal.util.json;
/*  2:   */ 
/*  3:   */ public class BufferErrorListener
/*  4:   */   implements JSONErrorListener
/*  5:   */ {
/*  6:   */   protected StringBuffer buffer;
/*  7:   */   private String input;
/*  8:   */   
/*  9:   */   public BufferErrorListener(StringBuffer buffer)
/* 10:   */   {
/* 11: 9 */     this.buffer = buffer;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public BufferErrorListener()
/* 15:   */   {
/* 16:13 */     this(new StringBuffer());
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void start(String input)
/* 20:   */   {
/* 21:17 */     this.input = input;
/* 22:18 */     this.buffer.setLength(0);
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void error(String type, int col)
/* 26:   */   {
/* 27:22 */     this.buffer.append("expected ");
/* 28:23 */     this.buffer.append(type);
/* 29:24 */     this.buffer.append(" at column ");
/* 30:25 */     this.buffer.append(col);
/* 31:26 */     this.buffer.append("\n");
/* 32:27 */     this.buffer.append(this.input);
/* 33:28 */     this.buffer.append("\n");
/* 34:29 */     indent(col - 1, this.buffer);
/* 35:30 */     this.buffer.append("^");
/* 36:   */   }
/* 37:   */   
/* 38:   */   private void indent(int n, StringBuffer ret)
/* 39:   */   {
/* 40:34 */     for (int i = 0; i < n; i++) {
/* 41:35 */       ret.append(' ');
/* 42:   */     }
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void end() {}
/* 46:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.json.BufferErrorListener
 * JD-Core Version:    0.7.0.1
 */