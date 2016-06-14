/*  1:   */ package com.alipay.api.internal.parser.json;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayApiException;
/*  4:   */ import com.alipay.api.AlipayParser;
/*  5:   */ import com.alipay.api.AlipayRequest;
/*  6:   */ import com.alipay.api.AlipayResponse;
/*  7:   */ import com.alipay.api.SignItem;
/*  8:   */ import com.alipay.api.internal.mapping.Converter;
/*  9:   */ 
/* 10:   */ public class ObjectJsonParser<T extends AlipayResponse>
/* 11:   */   implements AlipayParser<T>
/* 12:   */ {
/* 13:   */   private Class<T> clazz;
/* 14:   */   
/* 15:   */   public ObjectJsonParser(Class<T> clazz)
/* 16:   */   {
/* 17:21 */     this.clazz = clazz;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public T parse(String rsp)
/* 21:   */     throws AlipayApiException
/* 22:   */   {
/* 23:25 */     Converter converter = new JsonConverter();
/* 24:26 */     return converter.toResponse(rsp, this.clazz);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public Class<T> getResponseClass()
/* 28:   */   {
/* 29:30 */     return this.clazz;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public SignItem getSignItem(AlipayRequest<?> request, AlipayResponse response)
/* 33:   */     throws AlipayApiException
/* 34:   */   {
/* 35:39 */     Converter converter = new JsonConverter();
/* 36:   */     
/* 37:41 */     return converter.getSignItem(request, response);
/* 38:   */   }
/* 39:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.parser.json.ObjectJsonParser
 * JD-Core Version:    0.7.0.1
 */