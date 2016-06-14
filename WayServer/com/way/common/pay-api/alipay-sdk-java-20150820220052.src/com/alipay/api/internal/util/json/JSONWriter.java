/*   1:    */ package com.alipay.api.internal.util.json;
/*   2:    */ 
/*   3:    */ import java.beans.BeanInfo;
/*   4:    */ import java.beans.IntrospectionException;
/*   5:    */ import java.beans.Introspector;
/*   6:    */ import java.beans.PropertyDescriptor;
/*   7:    */ import java.lang.reflect.Array;
/*   8:    */ import java.lang.reflect.Field;
/*   9:    */ import java.lang.reflect.InvocationTargetException;
/*  10:    */ import java.lang.reflect.Method;
/*  11:    */ import java.text.CharacterIterator;
/*  12:    */ import java.text.DateFormat;
/*  13:    */ import java.text.SimpleDateFormat;
/*  14:    */ import java.text.StringCharacterIterator;
/*  15:    */ import java.util.Collection;
/*  16:    */ import java.util.Date;
/*  17:    */ import java.util.Iterator;
/*  18:    */ import java.util.Map;
/*  19:    */ import java.util.Map.Entry;
/*  20:    */ import java.util.Set;
/*  21:    */ import java.util.Stack;
/*  22:    */ import java.util.TimeZone;
/*  23:    */ 
/*  24:    */ public class JSONWriter
/*  25:    */ {
/*  26: 26 */   private StringBuffer buf = new StringBuffer();
/*  27: 27 */   private Stack<Object> calls = new Stack();
/*  28: 28 */   private boolean emitClassName = true;
/*  29:    */   private DateFormat format;
/*  30:    */   
/*  31:    */   public JSONWriter(boolean emitClassName)
/*  32:    */   {
/*  33: 32 */     this.emitClassName = emitClassName;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public JSONWriter()
/*  37:    */   {
/*  38: 36 */     this(false);
/*  39:    */   }
/*  40:    */   
/*  41:    */   public JSONWriter(DateFormat format)
/*  42:    */   {
/*  43: 40 */     this(false);
/*  44: 41 */     this.format = format;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String write(Object object)
/*  48:    */   {
/*  49: 45 */     this.buf.setLength(0);
/*  50: 46 */     value(object);
/*  51: 47 */     return this.buf.toString();
/*  52:    */   }
/*  53:    */   
/*  54:    */   public String write(long n)
/*  55:    */   {
/*  56: 51 */     return String.valueOf(n);
/*  57:    */   }
/*  58:    */   
/*  59:    */   public String write(double d)
/*  60:    */   {
/*  61: 55 */     return String.valueOf(d);
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String write(char c)
/*  65:    */   {
/*  66: 59 */     return "\"" + c + "\"";
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String write(boolean b)
/*  70:    */   {
/*  71: 63 */     return String.valueOf(b);
/*  72:    */   }
/*  73:    */   
/*  74:    */   private void value(Object object)
/*  75:    */   {
/*  76: 67 */     if ((object == null) || (cyclic(object)))
/*  77:    */     {
/*  78: 68 */       add(null);
/*  79:    */     }
/*  80:    */     else
/*  81:    */     {
/*  82: 70 */       this.calls.push(object);
/*  83: 71 */       if ((object instanceof Class)) {
/*  84: 71 */         string(object);
/*  85: 72 */       } else if ((object instanceof Boolean)) {
/*  86: 72 */         bool(((Boolean)object).booleanValue());
/*  87: 73 */       } else if ((object instanceof Number)) {
/*  88: 73 */         add(object);
/*  89: 74 */       } else if ((object instanceof String)) {
/*  90: 74 */         string(object);
/*  91: 75 */       } else if ((object instanceof Character)) {
/*  92: 75 */         string(object);
/*  93: 76 */       } else if ((object instanceof Map)) {
/*  94: 76 */         map((Map)object);
/*  95: 77 */       } else if (object.getClass().isArray()) {
/*  96: 77 */         array(object);
/*  97: 78 */       } else if ((object instanceof Iterator)) {
/*  98: 78 */         array((Iterator)object);
/*  99: 79 */       } else if ((object instanceof Collection)) {
/* 100: 79 */         array(((Collection)object).iterator());
/* 101: 80 */       } else if ((object instanceof Date)) {
/* 102: 80 */         date((Date)object);
/* 103:    */       } else {
/* 104: 81 */         bean(object);
/* 105:    */       }
/* 106: 82 */       this.calls.pop();
/* 107:    */     }
/* 108:    */   }
/* 109:    */   
/* 110:    */   private boolean cyclic(Object object)
/* 111:    */   {
/* 112: 87 */     Iterator<Object> it = this.calls.iterator();
/* 113: 88 */     while (it.hasNext())
/* 114:    */     {
/* 115: 89 */       Object called = it.next();
/* 116: 90 */       if (object == called) {
/* 117: 90 */         return true;
/* 118:    */       }
/* 119:    */     }
/* 120: 92 */     return false;
/* 121:    */   }
/* 122:    */   
/* 123:    */   private void bean(Object object)
/* 124:    */   {
/* 125: 96 */     add("{");
/* 126:    */     
/* 127: 98 */     boolean addedSomething = false;
/* 128:    */     try
/* 129:    */     {
/* 130:100 */       BeanInfo info = Introspector.getBeanInfo(object.getClass());
/* 131:101 */       PropertyDescriptor[] props = info.getPropertyDescriptors();
/* 132:102 */       for (int i = 0; i < props.length; i++)
/* 133:    */       {
/* 134:103 */         PropertyDescriptor prop = props[i];
/* 135:104 */         String name = prop.getName();
/* 136:105 */         Method accessor = prop.getReadMethod();
/* 137:106 */         if (((this.emitClassName) || (!"class".equals(name))) && (accessor != null))
/* 138:    */         {
/* 139:107 */           if (!accessor.isAccessible()) {
/* 140:107 */             accessor.setAccessible(true);
/* 141:    */           }
/* 142:108 */           Object value = accessor.invoke(object, (Object[])null);
/* 143:109 */           if (value != null)
/* 144:    */           {
/* 145:110 */             if (addedSomething) {
/* 146:110 */               add(',');
/* 147:    */             }
/* 148:111 */             add(name, value);
/* 149:112 */             addedSomething = true;
/* 150:    */           }
/* 151:    */         }
/* 152:    */       }
/* 153:115 */       Field[] ff = object.getClass().getFields();
/* 154:116 */       for (int i = 0; i < ff.length; i++)
/* 155:    */       {
/* 156:117 */         Field field = ff[i];
/* 157:118 */         Object value = field.get(object);
/* 158:119 */         if (value != null)
/* 159:    */         {
/* 160:120 */           if (addedSomething) {
/* 161:120 */             add(',');
/* 162:    */           }
/* 163:121 */           add(field.getName(), value);
/* 164:122 */           addedSomething = true;
/* 165:    */         }
/* 166:    */       }
/* 167:    */     }
/* 168:    */     catch (IllegalAccessException iae)
/* 169:    */     {
/* 170:125 */       iae.printStackTrace();
/* 171:    */     }
/* 172:    */     catch (InvocationTargetException ite)
/* 173:    */     {
/* 174:127 */       ite.getCause().printStackTrace();
/* 175:128 */       ite.printStackTrace();
/* 176:    */     }
/* 177:    */     catch (IntrospectionException ie)
/* 178:    */     {
/* 179:130 */       ie.printStackTrace();
/* 180:    */     }
/* 181:132 */     add("}");
/* 182:    */   }
/* 183:    */   
/* 184:    */   private void add(String name, Object value)
/* 185:    */   {
/* 186:136 */     add('"');
/* 187:137 */     add(name);
/* 188:138 */     add("\":");
/* 189:139 */     value(value);
/* 190:    */   }
/* 191:    */   
/* 192:    */   private void map(Map<?, ?> map)
/* 193:    */   {
/* 194:143 */     add("{");
/* 195:144 */     Iterator<?> it = map.entrySet().iterator();
/* 196:145 */     while (it.hasNext())
/* 197:    */     {
/* 198:146 */       Map.Entry<?, ?> e = (Map.Entry)it.next();
/* 199:147 */       value(e.getKey());
/* 200:148 */       add(":");
/* 201:149 */       value(e.getValue());
/* 202:150 */       if (it.hasNext()) {
/* 203:150 */         add(',');
/* 204:    */       }
/* 205:    */     }
/* 206:152 */     add("}");
/* 207:    */   }
/* 208:    */   
/* 209:    */   private void array(Iterator<?> it)
/* 210:    */   {
/* 211:156 */     add("[");
/* 212:157 */     while (it.hasNext())
/* 213:    */     {
/* 214:158 */       value(it.next());
/* 215:159 */       if (it.hasNext()) {
/* 216:159 */         add(",");
/* 217:    */       }
/* 218:    */     }
/* 219:161 */     add("]");
/* 220:    */   }
/* 221:    */   
/* 222:    */   private void array(Object object)
/* 223:    */   {
/* 224:165 */     add("[");
/* 225:166 */     int length = Array.getLength(object);
/* 226:167 */     for (int i = 0; i < length; i++)
/* 227:    */     {
/* 228:168 */       value(Array.get(object, i));
/* 229:169 */       if (i < length - 1) {
/* 230:169 */         add(',');
/* 231:    */       }
/* 232:    */     }
/* 233:171 */     add("]");
/* 234:    */   }
/* 235:    */   
/* 236:    */   private void bool(boolean b)
/* 237:    */   {
/* 238:175 */     add(b ? "true" : "false");
/* 239:    */   }
/* 240:    */   
/* 241:    */   private void date(Date date)
/* 242:    */   {
/* 243:179 */     if (this.format == null)
/* 244:    */     {
/* 245:180 */       this.format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 246:181 */       this.format.setTimeZone(TimeZone.getTimeZone("GMT+8"));
/* 247:    */     }
/* 248:183 */     add("\"");
/* 249:184 */     add(this.format.format(date));
/* 250:185 */     add("\"");
/* 251:    */   }
/* 252:    */   
/* 253:    */   private void string(Object obj)
/* 254:    */   {
/* 255:189 */     add('"');
/* 256:190 */     CharacterIterator it = new StringCharacterIterator(obj.toString());
/* 257:191 */     for (char c = it.first(); c != 65535; c = it.next()) {
/* 258:192 */       if (c == '"') {
/* 259:192 */         add("\\\"");
/* 260:193 */       } else if (c == '\\') {
/* 261:193 */         add("\\\\");
/* 262:194 */       } else if (c == '/') {
/* 263:194 */         add("\\/");
/* 264:195 */       } else if (c == '\b') {
/* 265:195 */         add("\\b");
/* 266:196 */       } else if (c == '\f') {
/* 267:196 */         add("\\f");
/* 268:197 */       } else if (c == '\n') {
/* 269:197 */         add("\\n");
/* 270:198 */       } else if (c == '\r') {
/* 271:198 */         add("\\r");
/* 272:199 */       } else if (c == '\t') {
/* 273:199 */         add("\\t");
/* 274:200 */       } else if (Character.isISOControl(c)) {
/* 275:201 */         unicode(c);
/* 276:    */       } else {
/* 277:203 */         add(c);
/* 278:    */       }
/* 279:    */     }
/* 280:206 */     add('"');
/* 281:    */   }
/* 282:    */   
/* 283:    */   private void add(Object obj)
/* 284:    */   {
/* 285:210 */     this.buf.append(obj);
/* 286:    */   }
/* 287:    */   
/* 288:    */   private void add(char c)
/* 289:    */   {
/* 290:214 */     this.buf.append(c);
/* 291:    */   }
/* 292:    */   
/* 293:217 */   static char[] hex = "0123456789ABCDEF".toCharArray();
/* 294:    */   
/* 295:    */   private void unicode(char c)
/* 296:    */   {
/* 297:220 */     add("\\u");
/* 298:221 */     int n = c;
/* 299:222 */     for (int i = 0; i < 4; i++)
/* 300:    */     {
/* 301:223 */       int digit = (n & 0xF000) >> 12;
/* 302:224 */       add(hex[digit]);
/* 303:225 */       n <<= 4;
/* 304:    */     }
/* 305:    */   }
/* 306:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.json.JSONWriter
 * JD-Core Version:    0.7.0.1
 */