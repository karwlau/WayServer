/*   1:    */ package com.alipay.api.internal.util;
/*   2:    */ 
/*   3:    */ public abstract class StringUtils
/*   4:    */ {
/*   5:    */   public static boolean isEmpty(String value)
/*   6:    */   {
/*   7:    */     int strLen;
/*   8: 27 */     if ((value == null) || ((strLen = value.length()) == 0)) {
/*   9: 28 */       return true;
/*  10:    */     }
/*  11:    */     int strLen;
/*  12: 30 */     for (int i = 0; i < strLen; i++) {
/*  13: 31 */       if (!Character.isWhitespace(value.charAt(i))) {
/*  14: 32 */         return false;
/*  15:    */       }
/*  16:    */     }
/*  17: 35 */     return true;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public static boolean isNumeric(Object obj)
/*  21:    */   {
/*  22: 42 */     if (obj == null) {
/*  23: 43 */       return false;
/*  24:    */     }
/*  25: 45 */     char[] chars = obj.toString().toCharArray();
/*  26: 46 */     int length = chars.length;
/*  27: 47 */     if (length < 1) {
/*  28: 48 */       return false;
/*  29:    */     }
/*  30: 50 */     int i = 0;
/*  31: 51 */     if ((length > 1) && (chars[0] == '-')) {}
/*  32: 52 */     for (i = 1; i < length; i++) {
/*  33: 55 */       if (!Character.isDigit(chars[i])) {
/*  34: 56 */         return false;
/*  35:    */       }
/*  36:    */     }
/*  37: 59 */     return true;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public static boolean areNotEmpty(String... values)
/*  41:    */   {
/*  42: 66 */     boolean result = true;
/*  43: 67 */     if ((values == null) || (values.length == 0)) {
/*  44: 68 */       result = false;
/*  45:    */     } else {
/*  46: 70 */       for (String value : values) {
/*  47: 71 */         result &= !isEmpty(value);
/*  48:    */       }
/*  49:    */     }
/*  50: 74 */     return result;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public static String unicodeToChinese(String unicode)
/*  54:    */   {
/*  55: 81 */     StringBuilder out = new StringBuilder();
/*  56: 82 */     if (!isEmpty(unicode)) {
/*  57: 83 */       for (int i = 0; i < unicode.length(); i++) {
/*  58: 84 */         out.append(unicode.charAt(i));
/*  59:    */       }
/*  60:    */     }
/*  61: 87 */     return out.toString();
/*  62:    */   }
/*  63:    */   
/*  64:    */   public static String stripNonValidXMLCharacters(String input)
/*  65:    */   {
/*  66: 94 */     if ((input == null) || ("".equals(input))) {
/*  67: 95 */       return "";
/*  68:    */     }
/*  69: 96 */     StringBuilder out = new StringBuilder();
/*  70: 98 */     for (int i = 0; i < input.length(); i++)
/*  71:    */     {
/*  72: 99 */       char current = input.charAt(i);
/*  73:100 */       if ((current == '\t') || (current == '\n') || (current == '\r') || ((current >= ' ') && (current <= 55295)) || ((current >= 57344) && (current <= 65533)) || ((current >= 65536) && (current <= 1114111))) {
/*  74:104 */         out.append(current);
/*  75:    */       }
/*  76:    */     }
/*  77:106 */     return out.toString();
/*  78:    */   }
/*  79:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.StringUtils
 * JD-Core Version:    0.7.0.1
 */