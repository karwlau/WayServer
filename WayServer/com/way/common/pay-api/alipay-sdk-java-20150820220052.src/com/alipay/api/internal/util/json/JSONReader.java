/*   1:    */ package com.alipay.api.internal.util.json;
/*   2:    */ 
/*   3:    */ import java.math.BigDecimal;
/*   4:    */ import java.math.BigInteger;
/*   5:    */ import java.text.CharacterIterator;
/*   6:    */ import java.text.StringCharacterIterator;
/*   7:    */ import java.util.ArrayList;
/*   8:    */ import java.util.HashMap;
/*   9:    */ import java.util.List;
/*  10:    */ import java.util.Map;
/*  11:    */ 
/*  12:    */ public abstract class JSONReader
/*  13:    */ {
/*  14: 19 */   private static final Object OBJECT_END = new Object();
/*  15: 20 */   private static final Object ARRAY_END = new Object();
/*  16: 21 */   private static final Object COLON = new Object();
/*  17: 22 */   private static final Object COMMA = new Object();
/*  18:    */   public static final int FIRST = 0;
/*  19:    */   public static final int CURRENT = 1;
/*  20:    */   public static final int NEXT = 2;
/*  21: 27 */   private static Map<Character, Character> escapes = new HashMap();
/*  22:    */   private CharacterIterator it;
/*  23:    */   private char c;
/*  24:    */   private Object token;
/*  25:    */   
/*  26:    */   static
/*  27:    */   {
/*  28: 29 */     escapes.put(Character.valueOf('"'), Character.valueOf('"'));
/*  29: 30 */     escapes.put(Character.valueOf('\\'), Character.valueOf('\\'));
/*  30: 31 */     escapes.put(Character.valueOf('/'), Character.valueOf('/'));
/*  31: 32 */     escapes.put(Character.valueOf('b'), Character.valueOf('\b'));
/*  32: 33 */     escapes.put(Character.valueOf('f'), Character.valueOf('\f'));
/*  33: 34 */     escapes.put(Character.valueOf('n'), Character.valueOf('\n'));
/*  34: 35 */     escapes.put(Character.valueOf('r'), Character.valueOf('\r'));
/*  35: 36 */     escapes.put(Character.valueOf('t'), Character.valueOf('\t'));
/*  36:    */   }
/*  37:    */   
/*  38: 42 */   private StringBuffer buf = new StringBuffer();
/*  39:    */   
/*  40:    */   private char next()
/*  41:    */   {
/*  42: 45 */     this.c = this.it.next();
/*  43: 46 */     return this.c;
/*  44:    */   }
/*  45:    */   
/*  46:    */   private void skipWhiteSpace()
/*  47:    */   {
/*  48: 50 */     while (Character.isWhitespace(this.c)) {
/*  49: 51 */       next();
/*  50:    */     }
/*  51:    */   }
/*  52:    */   
/*  53:    */   public Object read(CharacterIterator ci, int start)
/*  54:    */   {
/*  55: 56 */     this.it = ci;
/*  56: 57 */     switch (start)
/*  57:    */     {
/*  58:    */     case 0: 
/*  59: 59 */       this.c = this.it.first();
/*  60: 60 */       break;
/*  61:    */     case 1: 
/*  62: 62 */       this.c = this.it.current();
/*  63: 63 */       break;
/*  64:    */     case 2: 
/*  65: 65 */       this.c = this.it.next();
/*  66:    */     }
/*  67: 68 */     return read();
/*  68:    */   }
/*  69:    */   
/*  70:    */   public Object read(CharacterIterator it)
/*  71:    */   {
/*  72: 72 */     return read(it, 2);
/*  73:    */   }
/*  74:    */   
/*  75:    */   public Object read(String string)
/*  76:    */   {
/*  77: 76 */     return read(new StringCharacterIterator(string), 0);
/*  78:    */   }
/*  79:    */   
/*  80:    */   private Object read()
/*  81:    */   {
/*  82: 80 */     skipWhiteSpace();
/*  83: 81 */     char ch = this.c;
/*  84: 82 */     next();
/*  85: 83 */     switch (ch)
/*  86:    */     {
/*  87:    */     case '"': 
/*  88: 84 */       this.token = string(); break;
/*  89:    */     case '[': 
/*  90: 85 */       this.token = array(); break;
/*  91:    */     case ']': 
/*  92: 86 */       this.token = ARRAY_END; break;
/*  93:    */     case ',': 
/*  94: 87 */       this.token = COMMA; break;
/*  95:    */     case '{': 
/*  96: 88 */       this.token = object(); break;
/*  97:    */     case '}': 
/*  98: 89 */       this.token = OBJECT_END; break;
/*  99:    */     case ':': 
/* 100: 90 */       this.token = COLON; break;
/* 101:    */     case 't': 
/* 102: 92 */       next();next();next();
/* 103: 93 */       this.token = Boolean.TRUE;
/* 104: 94 */       break;
/* 105:    */     case 'f': 
/* 106: 96 */       next();next();next();next();
/* 107: 97 */       this.token = Boolean.FALSE;
/* 108: 98 */       break;
/* 109:    */     case 'n': 
/* 110:100 */       next();next();next();
/* 111:101 */       this.token = null;
/* 112:102 */       break;
/* 113:    */     default: 
/* 114:104 */       this.c = this.it.previous();
/* 115:105 */       if ((Character.isDigit(this.c)) || (this.c == '-')) {
/* 116:106 */         this.token = number();
/* 117:    */       }
/* 118:    */       break;
/* 119:    */     }
/* 120:110 */     return this.token;
/* 121:    */   }
/* 122:    */   
/* 123:    */   private Object object()
/* 124:    */   {
/* 125:114 */     Map<Object, Object> ret = new HashMap();
/* 126:115 */     Object key = read();
/* 127:116 */     while (this.token != OBJECT_END)
/* 128:    */     {
/* 129:117 */       read();
/* 130:118 */       if (this.token != OBJECT_END)
/* 131:    */       {
/* 132:119 */         ret.put(key, read());
/* 133:120 */         if (read() == COMMA) {
/* 134:121 */           key = read();
/* 135:    */         }
/* 136:    */       }
/* 137:    */     }
/* 138:126 */     return ret;
/* 139:    */   }
/* 140:    */   
/* 141:    */   private Object array()
/* 142:    */   {
/* 143:130 */     List<Object> ret = new ArrayList();
/* 144:131 */     Object value = read();
/* 145:132 */     while (this.token != ARRAY_END)
/* 146:    */     {
/* 147:133 */       ret.add(value);
/* 148:134 */       if (read() == COMMA) {
/* 149:135 */         value = read();
/* 150:    */       }
/* 151:    */     }
/* 152:138 */     return ret;
/* 153:    */   }
/* 154:    */   
/* 155:    */   private Object number()
/* 156:    */   {
/* 157:142 */     int length = 0;
/* 158:143 */     boolean isFloatingPoint = false;
/* 159:144 */     this.buf.setLength(0);
/* 160:146 */     if (this.c == '-') {
/* 161:147 */       add();
/* 162:    */     }
/* 163:149 */     length += addDigits();
/* 164:150 */     if (this.c == '.')
/* 165:    */     {
/* 166:151 */       add();
/* 167:152 */       length += addDigits();
/* 168:153 */       isFloatingPoint = true;
/* 169:    */     }
/* 170:155 */     if ((this.c == 'e') || (this.c == 'E'))
/* 171:    */     {
/* 172:156 */       add();
/* 173:157 */       if ((this.c == '+') || (this.c == '-')) {
/* 174:158 */         add();
/* 175:    */       }
/* 176:160 */       addDigits();
/* 177:161 */       isFloatingPoint = true;
/* 178:    */     }
/* 179:164 */     String s = this.buf.toString();
/* 180:165 */     return length < 19 ? Long.valueOf(s) : isFloatingPoint ? new BigDecimal(s) : length < 17 ? Double.valueOf(s) : new BigInteger(s);
/* 181:    */   }
/* 182:    */   
/* 183:    */   private int addDigits()
/* 184:    */   {
/* 185:172 */     for (int ret = 0; Character.isDigit(this.c); ret++) {
/* 186:173 */       add();
/* 187:    */     }
/* 188:175 */     return ret;
/* 189:    */   }
/* 190:    */   
/* 191:    */   private Object string()
/* 192:    */   {
/* 193:179 */     this.buf.setLength(0);
/* 194:180 */     while (this.c != '"') {
/* 195:181 */       if (this.c == '\\')
/* 196:    */       {
/* 197:182 */         next();
/* 198:183 */         if (this.c == 'u')
/* 199:    */         {
/* 200:184 */           add(unicode());
/* 201:    */         }
/* 202:    */         else
/* 203:    */         {
/* 204:186 */           Object value = escapes.get(Character.valueOf(this.c));
/* 205:187 */           if (value != null) {
/* 206:188 */             add(((Character)value).charValue());
/* 207:    */           }
/* 208:    */         }
/* 209:    */       }
/* 210:    */       else
/* 211:    */       {
/* 212:192 */         add();
/* 213:    */       }
/* 214:    */     }
/* 215:195 */     next();
/* 216:    */     
/* 217:197 */     return this.buf.toString();
/* 218:    */   }
/* 219:    */   
/* 220:    */   private void add(char cc)
/* 221:    */   {
/* 222:201 */     this.buf.append(cc);
/* 223:202 */     next();
/* 224:    */   }
/* 225:    */   
/* 226:    */   private void add()
/* 227:    */   {
/* 228:206 */     add(this.c);
/* 229:    */   }
/* 230:    */   
/* 231:    */   private char unicode()
/* 232:    */   {
/* 233:210 */     int value = 0;
/* 234:211 */     for (int i = 0; i < 4; i++) {
/* 235:212 */       switch (next())
/* 236:    */       {
/* 237:    */       case '0': 
/* 238:    */       case '1': 
/* 239:    */       case '2': 
/* 240:    */       case '3': 
/* 241:    */       case '4': 
/* 242:    */       case '5': 
/* 243:    */       case '6': 
/* 244:    */       case '7': 
/* 245:    */       case '8': 
/* 246:    */       case '9': 
/* 247:215 */         value = (value << 4) + this.c - 48;
/* 248:216 */         break;
/* 249:    */       case 'a': 
/* 250:    */       case 'b': 
/* 251:    */       case 'c': 
/* 252:    */       case 'd': 
/* 253:    */       case 'e': 
/* 254:    */       case 'f': 
/* 255:218 */         value = (value << 4) + this.c - 107;
/* 256:219 */         break;
/* 257:    */       case 'A': 
/* 258:    */       case 'B': 
/* 259:    */       case 'C': 
/* 260:    */       case 'D': 
/* 261:    */       case 'E': 
/* 262:    */       case 'F': 
/* 263:221 */         value = (value << 4) + this.c - 75;
/* 264:    */       }
/* 265:    */     }
/* 266:225 */     return (char)value;
/* 267:    */   }
/* 268:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.json.JSONReader
 * JD-Core Version:    0.7.0.1
 */