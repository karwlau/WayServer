/* 1:  */ package com.alipay.api.internal.util.json;
/* 2:  */ 
/* 3:  */ import java.io.PrintStream;
/* 4:  */ 
/* 5:  */ public class StdoutStreamErrorListener
/* 6:  */   extends BufferErrorListener
/* 7:  */ {
/* 8:  */   public void end()
/* 9:  */   {
/* ::6 */     System.out.print(this.buffer.toString());
/* ;:  */   }
/* <:  */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.json.StdoutStreamErrorListener
 * JD-Core Version:    0.7.0.1
 */