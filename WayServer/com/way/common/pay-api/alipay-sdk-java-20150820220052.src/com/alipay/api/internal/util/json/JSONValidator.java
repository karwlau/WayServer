/*   1:    */ package com.alipay.api.internal.util.json;
/*   2:    */ 
/*   3:    */ import java.text.CharacterIterator;
/*   4:    */ import java.text.StringCharacterIterator;
/*   5:    */ 
/*   6:    */ public class JSONValidator
/*   7:    */ {
/*   8:    */   private JSONErrorListener listener;
/*   9:    */   private CharacterIterator it;
/*  10:    */   private char c;
/*  11:    */   private int col;
/*  12:    */   
/*  13:    */   public JSONValidator(JSONErrorListener listener)
/*  14:    */   {
/*  15: 14 */     this.listener = listener;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public boolean validate(String input)
/*  19:    */   {
/*  20: 18 */     input = input.trim();
/*  21: 19 */     this.listener.start(input);
/*  22: 20 */     boolean ret = valid(input);
/*  23: 21 */     this.listener.end();
/*  24: 22 */     return ret;
/*  25:    */   }
/*  26:    */   
/*  27:    */   private boolean valid(String input)
/*  28:    */   {
/*  29: 26 */     if ("".equals(input)) {
/*  30: 26 */       return true;
/*  31:    */     }
/*  32: 28 */     boolean ret = true;
/*  33: 29 */     this.it = new StringCharacterIterator(input);
/*  34: 30 */     this.c = this.it.first();
/*  35: 31 */     this.col = 1;
/*  36: 32 */     if (!value())
/*  37:    */     {
/*  38: 33 */       ret = error("value", 1);
/*  39:    */     }
/*  40:    */     else
/*  41:    */     {
/*  42: 35 */       skipWhiteSpace();
/*  43: 36 */       if (this.c != 65535) {
/*  44: 37 */         ret = error("end", this.col);
/*  45:    */       }
/*  46:    */     }
/*  47: 41 */     return ret;
/*  48:    */   }
/*  49:    */   
/*  50:    */   private boolean value()
/*  51:    */   {
/*  52: 45 */     return (literal("true")) || (literal("false")) || (literal("null")) || (string()) || (number()) || (object()) || (array());
/*  53:    */   }
/*  54:    */   
/*  55:    */   private boolean literal(String text)
/*  56:    */   {
/*  57: 56 */     CharacterIterator ci = new StringCharacterIterator(text);
/*  58: 57 */     char t = ci.first();
/*  59: 58 */     if (this.c != t) {
/*  60: 58 */       return false;
/*  61:    */     }
/*  62: 60 */     int start = this.col;
/*  63: 61 */     boolean ret = true;
/*  64: 62 */     for (t = ci.next(); t != 65535; t = ci.next()) {
/*  65: 63 */       if (t != nextCharacter())
/*  66:    */       {
/*  67: 64 */         ret = false;
/*  68: 65 */         break;
/*  69:    */       }
/*  70:    */     }
/*  71: 68 */     nextCharacter();
/*  72: 70 */     if (!ret) {
/*  73: 70 */       error("literal " + text, start);
/*  74:    */     }
/*  75: 71 */     return ret;
/*  76:    */   }
/*  77:    */   
/*  78:    */   private boolean array()
/*  79:    */   {
/*  80: 75 */     return aggregate('[', ']', false);
/*  81:    */   }
/*  82:    */   
/*  83:    */   private boolean object()
/*  84:    */   {
/*  85: 79 */     return aggregate('{', '}', true);
/*  86:    */   }
/*  87:    */   
/*  88:    */   private boolean aggregate(char entryCharacter, char exitCharacter, boolean prefix)
/*  89:    */   {
/*  90: 83 */     if (this.c != entryCharacter) {
/*  91: 83 */       return false;
/*  92:    */     }
/*  93: 84 */     nextCharacter();
/*  94: 85 */     skipWhiteSpace();
/*  95: 86 */     if (this.c == exitCharacter)
/*  96:    */     {
/*  97: 87 */       nextCharacter();
/*  98: 88 */       return true;
/*  99:    */     }
/* 100:    */     for (;;)
/* 101:    */     {
/* 102: 92 */       if (prefix)
/* 103:    */       {
/* 104: 93 */         int start = this.col;
/* 105: 94 */         if (!string()) {
/* 106: 94 */           return error("string", start);
/* 107:    */         }
/* 108: 95 */         skipWhiteSpace();
/* 109: 96 */         if (this.c != ':') {
/* 110: 96 */           return error("colon", this.col);
/* 111:    */         }
/* 112: 97 */         nextCharacter();
/* 113: 98 */         skipWhiteSpace();
/* 114:    */       }
/* 115:100 */       if (value())
/* 116:    */       {
/* 117:101 */         skipWhiteSpace();
/* 118:102 */         if (this.c == ',')
/* 119:    */         {
/* 120:103 */           nextCharacter();
/* 121:    */         }
/* 122:    */         else
/* 123:    */         {
/* 124:104 */           if (this.c == exitCharacter) {
/* 125:    */             break;
/* 126:    */           }
/* 127:107 */           return error("comma or " + exitCharacter, this.col);
/* 128:    */         }
/* 129:    */       }
/* 130:    */       else
/* 131:    */       {
/* 132:110 */         return error("value", this.col);
/* 133:    */       }
/* 134:112 */       skipWhiteSpace();
/* 135:    */     }
/* 136:115 */     nextCharacter();
/* 137:116 */     return true;
/* 138:    */   }
/* 139:    */   
/* 140:    */   private boolean number()
/* 141:    */   {
/* 142:120 */     if ((!Character.isDigit(this.c)) && (this.c != '-')) {
/* 143:120 */       return false;
/* 144:    */     }
/* 145:121 */     int start = this.col;
/* 146:123 */     if (this.c == '-') {
/* 147:123 */       nextCharacter();
/* 148:    */     }
/* 149:125 */     if (this.c == '0')
/* 150:    */     {
/* 151:126 */       nextCharacter();
/* 152:    */     }
/* 153:    */     else
/* 154:    */     {
/* 155:127 */       if (Character.isDigit(this.c)) {
/* 156:128 */         while (Character.isDigit(this.c)) {
/* 157:128 */           nextCharacter();
/* 158:    */         }
/* 159:    */       }
/* 160:130 */       return error("number", start);
/* 161:    */     }
/* 162:133 */     if (this.c == '.')
/* 163:    */     {
/* 164:134 */       nextCharacter();
/* 165:135 */       if (Character.isDigit(this.c)) {
/* 166:136 */         while (Character.isDigit(this.c)) {
/* 167:136 */           nextCharacter();
/* 168:    */         }
/* 169:    */       }
/* 170:138 */       return error("number", start);
/* 171:    */     }
/* 172:142 */     if ((this.c == 'e') || (this.c == 'E'))
/* 173:    */     {
/* 174:143 */       nextCharacter();
/* 175:144 */       if ((this.c == '+') || (this.c == '-')) {
/* 176:145 */         nextCharacter();
/* 177:    */       }
/* 178:147 */       if (Character.isDigit(this.c)) {
/* 179:148 */         while (Character.isDigit(this.c)) {
/* 180:148 */           nextCharacter();
/* 181:    */         }
/* 182:    */       }
/* 183:150 */       return error("number", start);
/* 184:    */     }
/* 185:154 */     return true;
/* 186:    */   }
/* 187:    */   
/* 188:    */   private boolean string()
/* 189:    */   {
/* 190:158 */     if (this.c != '"') {
/* 191:158 */       return false;
/* 192:    */     }
/* 193:160 */     int start = this.col;
/* 194:161 */     boolean escaped = false;
/* 195:163 */     for (nextCharacter(); this.c != 65535; nextCharacter()) {
/* 196:164 */       if ((!escaped) && (this.c == '\\'))
/* 197:    */       {
/* 198:165 */         escaped = true;
/* 199:    */       }
/* 200:166 */       else if (escaped)
/* 201:    */       {
/* 202:167 */         if (!escape()) {
/* 203:168 */           return false;
/* 204:    */         }
/* 205:170 */         escaped = false;
/* 206:    */       }
/* 207:171 */       else if (this.c == '"')
/* 208:    */       {
/* 209:172 */         nextCharacter();
/* 210:173 */         return true;
/* 211:    */       }
/* 212:    */     }
/* 213:177 */     return error("quoted string", start);
/* 214:    */   }
/* 215:    */   
/* 216:    */   private boolean escape()
/* 217:    */   {
/* 218:181 */     int start = this.col - 1;
/* 219:182 */     if ("\\\"/bfnrtu".indexOf(this.c) < 0) {
/* 220:183 */       return error("escape sequence \\\",\\\\,\\/,\\b,\\f,\\n,\\r,\\t or \\uxxxx", start);
/* 221:    */     }
/* 222:185 */     if ((this.c == 'u') && (
/* 223:186 */       (!ishex(nextCharacter())) || (!ishex(nextCharacter())) || (!ishex(nextCharacter())) || (!ishex(nextCharacter())))) {
/* 224:188 */       return error("unicode escape sequence \\uxxxx", start);
/* 225:    */     }
/* 226:191 */     return true;
/* 227:    */   }
/* 228:    */   
/* 229:    */   private boolean ishex(char d)
/* 230:    */   {
/* 231:195 */     return "0123456789abcdefABCDEF".indexOf(this.c) >= 0;
/* 232:    */   }
/* 233:    */   
/* 234:    */   private char nextCharacter()
/* 235:    */   {
/* 236:199 */     this.c = this.it.next();
/* 237:200 */     this.col += 1;
/* 238:201 */     return this.c;
/* 239:    */   }
/* 240:    */   
/* 241:    */   private void skipWhiteSpace()
/* 242:    */   {
/* 243:205 */     while (Character.isWhitespace(this.c)) {
/* 244:206 */       nextCharacter();
/* 245:    */     }
/* 246:    */   }
/* 247:    */   
/* 248:    */   private boolean error(String type, int col)
/* 249:    */   {
/* 250:211 */     if (this.listener != null) {
/* 251:211 */       this.listener.error(type, col);
/* 252:    */     }
/* 253:212 */     return false;
/* 254:    */   }
/* 255:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.json.JSONValidator
 * JD-Core Version:    0.7.0.1
 */