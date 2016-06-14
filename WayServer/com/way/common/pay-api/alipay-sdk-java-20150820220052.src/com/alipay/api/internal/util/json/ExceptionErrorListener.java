/* 1:  */ package com.alipay.api.internal.util.json;
/* 2:  */ 
/* 3:  */ public class ExceptionErrorListener
/* 4:  */   extends BufferErrorListener
/* 5:  */ {
/* 6:  */   public void error(String type, int col)
/* 7:  */   {
/* 8:6 */     super.error(type, col);
/* 9:7 */     throw new IllegalArgumentException(this.buffer.toString());
/* ::  */   }
/* ;:  */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.json.ExceptionErrorListener
 * JD-Core Version:    0.7.0.1
 */