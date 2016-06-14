/*   1:    */ package com.alipay.api.internal.mapping;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayApiException;
/*   4:    */ import com.alipay.api.AlipayResponse;
/*   5:    */ import com.alipay.api.internal.util.StringUtils;
/*   6:    */ import java.beans.BeanInfo;
/*   7:    */ import java.beans.Introspector;
/*   8:    */ import java.beans.PropertyDescriptor;
/*   9:    */ import java.lang.reflect.Field;
/*  10:    */ import java.lang.reflect.Method;
/*  11:    */ import java.lang.reflect.ParameterizedType;
/*  12:    */ import java.lang.reflect.Type;
/*  13:    */ import java.text.DateFormat;
/*  14:    */ import java.text.SimpleDateFormat;
/*  15:    */ import java.util.ArrayList;
/*  16:    */ import java.util.Date;
/*  17:    */ import java.util.HashSet;
/*  18:    */ import java.util.List;
/*  19:    */ import java.util.Set;
/*  20:    */ import java.util.TimeZone;
/*  21:    */ 
/*  22:    */ public class Converters
/*  23:    */ {
/*  24: 33 */   public static boolean isCheckJsonType = false;
/*  25: 35 */   private static final Set<String> baseFields = new HashSet();
/*  26: 37 */   private static final Set<String> excludeFields = new HashSet();
/*  27: 40 */   private static final Set<String> overideFields = new HashSet();
/*  28:    */   
/*  29:    */   static
/*  30:    */   {
/*  31: 43 */     baseFields.add("code");
/*  32: 44 */     baseFields.add("msg");
/*  33: 45 */     baseFields.add("subCode");
/*  34: 46 */     baseFields.add("subMsg");
/*  35: 47 */     baseFields.add("body");
/*  36: 48 */     baseFields.add("params");
/*  37: 49 */     baseFields.add("success");
/*  38:    */     
/*  39:    */ 
/*  40:    */ 
/*  41: 53 */     excludeFields.add("errorCode");
/*  42:    */     
/*  43:    */ 
/*  44:    */ 
/*  45:    */ 
/*  46:    */ 
/*  47: 59 */     overideFields.add("code");
/*  48: 60 */     overideFields.add("msg");
/*  49:    */   }
/*  50:    */   
/*  51:    */   public static <T> T convert(Class<T> clazz, Reader reader)
/*  52:    */     throws AlipayApiException
/*  53:    */   {
/*  54: 76 */     T rsp = null;
/*  55:    */     try
/*  56:    */     {
/*  57: 79 */       rsp = clazz.newInstance();
/*  58: 80 */       BeanInfo beanInfo = Introspector.getBeanInfo(clazz);
/*  59: 81 */       PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
/*  60:    */       
/*  61: 83 */       boolean isResponseClazz = AlipayResponse.class.isAssignableFrom(clazz);
/*  62:    */       String itemName;
/*  63:    */       String listName;
/*  64: 85 */       for (PropertyDescriptor pd : pds)
/*  65:    */       {
/*  66: 86 */         Method writeMethod = pd.getWriteMethod();
/*  67: 87 */         if (writeMethod != null)
/*  68:    */         {
/*  69: 91 */           itemName = pd.getName();
/*  70: 92 */           listName = null;
/*  71: 95 */           if ((!isResponseClazz) || (!excludeFields.contains(itemName)))
/*  72:    */           {
/*  73:100 */             List<AlipayFieldMethod> alipayFieldMethods = new ArrayList();
/*  74:102 */             if ((baseFields.contains(itemName)) && (isResponseClazz))
/*  75:    */             {
/*  76:104 */               Field field = AlipayResponse.class.getDeclaredField(itemName);
/*  77:    */               
/*  78:106 */               AlipayFieldMethod alipayFieldMethod = new AlipayFieldMethod();
/*  79:107 */               alipayFieldMethod.setField(field);
/*  80:110 */               if (writeMethod.getDeclaringClass().getName().contains("AlipayResponse"))
/*  81:    */               {
/*  82:112 */                 alipayFieldMethod.setMethod(writeMethod);
/*  83:    */               }
/*  84:    */               else
/*  85:    */               {
/*  86:115 */                 writeMethod = tryGetSetMethod(AlipayResponse.class, field, writeMethod.getName());
/*  87:117 */                 if (writeMethod == null) {
/*  88:    */                   continue;
/*  89:    */                 }
/*  90:121 */                 alipayFieldMethod.setMethod(writeMethod);
/*  91:    */               }
/*  92:123 */               alipayFieldMethods.add(alipayFieldMethod);
/*  93:126 */               if (overideFields.contains(itemName))
/*  94:    */               {
/*  95:128 */                 field = tryGetFieldWithoutExp(clazz, itemName);
/*  96:130 */                 if (field != null)
/*  97:    */                 {
/*  98:132 */                   writeMethod = tryGetSetMethod(clazz, field, writeMethod.getName());
/*  99:133 */                   if (writeMethod == null) {
/* 100:    */                     continue;
/* 101:    */                   }
/* 102:136 */                   alipayFieldMethod = new AlipayFieldMethod();
/* 103:137 */                   alipayFieldMethod.setField(field);
/* 104:138 */                   alipayFieldMethod.setMethod(writeMethod);
/* 105:139 */                   alipayFieldMethods.add(alipayFieldMethod);
/* 106:    */                 }
/* 107:    */               }
/* 108:    */             }
/* 109:    */             else
/* 110:    */             {
/* 111:145 */               Field field = clazz.getDeclaredField(itemName);
/* 112:    */               
/* 113:147 */               AlipayFieldMethod alipayFieldMethod = new AlipayFieldMethod();
/* 114:148 */               alipayFieldMethod.setField(field);
/* 115:149 */               alipayFieldMethod.setMethod(writeMethod);
/* 116:150 */               alipayFieldMethods.add(alipayFieldMethod);
/* 117:    */             }
/* 118:154 */             for (AlipayFieldMethod alipayFieldMethod : alipayFieldMethods)
/* 119:    */             {
/* 120:156 */               Field field = alipayFieldMethod.getField();
/* 121:157 */               Method method = alipayFieldMethod.getMethod();
/* 122:    */               
/* 123:159 */               ApiField jsonField = (ApiField)field.getAnnotation(ApiField.class);
/* 124:160 */               if (jsonField != null) {
/* 125:161 */                 itemName = jsonField.value();
/* 126:    */               }
/* 127:163 */               ApiListField jsonListField = (ApiListField)field.getAnnotation(ApiListField.class);
/* 128:164 */               if (jsonListField != null) {
/* 129:165 */                 listName = jsonListField.value();
/* 130:    */               }
/* 131:168 */               if ((reader.hasReturnField(itemName)) || (
/* 132:169 */                 (listName != null) && (reader.hasReturnField(listName))))
/* 133:    */               {
/* 134:174 */                 Class<?> typeClass = field.getType();
/* 135:176 */                 if (String.class.isAssignableFrom(typeClass))
/* 136:    */                 {
/* 137:177 */                   Object value = reader.getPrimitiveObject(itemName);
/* 138:178 */                   if ((value instanceof String))
/* 139:    */                   {
/* 140:179 */                     method.invoke(rsp, new Object[] { value.toString() });
/* 141:    */                   }
/* 142:    */                   else
/* 143:    */                   {
/* 144:181 */                     if ((isCheckJsonType) && (value != null)) {
/* 145:182 */                       throw new AlipayApiException(itemName + " is not a String");
/* 146:    */                     }
/* 147:184 */                     if (value != null) {
/* 148:185 */                       method.invoke(rsp, new Object[] { value.toString() });
/* 149:    */                     } else {
/* 150:187 */                       method.invoke(rsp, new Object[] { "" });
/* 151:    */                     }
/* 152:    */                   }
/* 153:    */                 }
/* 154:190 */                 else if (Long.class.isAssignableFrom(typeClass))
/* 155:    */                 {
/* 156:191 */                   Object value = reader.getPrimitiveObject(itemName);
/* 157:192 */                   if ((value instanceof Long))
/* 158:    */                   {
/* 159:193 */                     method.invoke(rsp, new Object[] { (Long)value });
/* 160:    */                   }
/* 161:    */                   else
/* 162:    */                   {
/* 163:195 */                     if ((isCheckJsonType) && (value != null)) {
/* 164:196 */                       throw new AlipayApiException(itemName + " is not a Number(Long)");
/* 165:    */                     }
/* 166:198 */                     if (StringUtils.isNumeric(value)) {
/* 167:199 */                       method.invoke(rsp, new Object[] { Long.valueOf(value.toString()) });
/* 168:    */                     }
/* 169:    */                   }
/* 170:    */                 }
/* 171:202 */                 else if (Integer.class.isAssignableFrom(typeClass))
/* 172:    */                 {
/* 173:203 */                   Object value = reader.getPrimitiveObject(itemName);
/* 174:204 */                   if ((value instanceof Integer))
/* 175:    */                   {
/* 176:205 */                     method.invoke(rsp, new Object[] { (Integer)value });
/* 177:    */                   }
/* 178:    */                   else
/* 179:    */                   {
/* 180:207 */                     if ((isCheckJsonType) && (value != null)) {
/* 181:208 */                       throw new AlipayApiException(itemName + " is not a Number(Integer)");
/* 182:    */                     }
/* 183:210 */                     if (StringUtils.isNumeric(value)) {
/* 184:211 */                       method.invoke(rsp, new Object[] { Integer.valueOf(value.toString()) });
/* 185:    */                     }
/* 186:    */                   }
/* 187:    */                 }
/* 188:214 */                 else if (Boolean.class.isAssignableFrom(typeClass))
/* 189:    */                 {
/* 190:215 */                   Object value = reader.getPrimitiveObject(itemName);
/* 191:216 */                   if ((value instanceof Boolean))
/* 192:    */                   {
/* 193:217 */                     method.invoke(rsp, new Object[] { (Boolean)value });
/* 194:    */                   }
/* 195:    */                   else
/* 196:    */                   {
/* 197:219 */                     if ((isCheckJsonType) && (value != null)) {
/* 198:220 */                       throw new AlipayApiException(itemName + " is not a Boolean");
/* 199:    */                     }
/* 200:222 */                     if (value != null) {
/* 201:223 */                       method.invoke(rsp, new Object[] { Boolean.valueOf(value.toString()) });
/* 202:    */                     }
/* 203:    */                   }
/* 204:    */                 }
/* 205:226 */                 else if (Double.class.isAssignableFrom(typeClass))
/* 206:    */                 {
/* 207:227 */                   Object value = reader.getPrimitiveObject(itemName);
/* 208:228 */                   if ((value instanceof Double)) {
/* 209:229 */                     method.invoke(rsp, new Object[] { (Double)value });
/* 210:231 */                   } else if ((isCheckJsonType) && (value != null)) {
/* 211:232 */                     throw new AlipayApiException(itemName + " is not a Double");
/* 212:    */                   }
/* 213:    */                 }
/* 214:235 */                 else if (Number.class.isAssignableFrom(typeClass))
/* 215:    */                 {
/* 216:236 */                   Object value = reader.getPrimitiveObject(itemName);
/* 217:237 */                   if ((value instanceof Number)) {
/* 218:238 */                     method.invoke(rsp, new Object[] { (Number)value });
/* 219:240 */                   } else if ((isCheckJsonType) && (value != null)) {
/* 220:241 */                     throw new AlipayApiException(itemName + " is not a Number");
/* 221:    */                   }
/* 222:    */                 }
/* 223:244 */                 else if (Date.class.isAssignableFrom(typeClass))
/* 224:    */                 {
/* 225:245 */                   DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 226:246 */                   format.setTimeZone(TimeZone.getTimeZone("GMT+8"));
/* 227:247 */                   Object value = reader.getPrimitiveObject(itemName);
/* 228:248 */                   if ((value instanceof String)) {
/* 229:249 */                     method.invoke(rsp, new Object[] { format.parse(value.toString()) });
/* 230:    */                   }
/* 231:    */                 }
/* 232:251 */                 else if (List.class.isAssignableFrom(typeClass))
/* 233:    */                 {
/* 234:252 */                   Type fieldType = field.getGenericType();
/* 235:253 */                   if ((fieldType instanceof ParameterizedType))
/* 236:    */                   {
/* 237:254 */                     ParameterizedType paramType = (ParameterizedType)fieldType;
/* 238:255 */                     Type[] genericTypes = paramType.getActualTypeArguments();
/* 239:256 */                     if ((genericTypes != null) && (genericTypes.length > 0) && 
/* 240:257 */                       ((genericTypes[0] instanceof Class)))
/* 241:    */                     {
/* 242:258 */                       Class<?> subType = (Class)genericTypes[0];
/* 243:259 */                       List<?> listObjs = reader.getListObjects(listName, itemName, subType);
/* 244:261 */                       if (listObjs != null) {
/* 245:262 */                         method.invoke(rsp, new Object[] { listObjs });
/* 246:    */                       }
/* 247:    */                     }
/* 248:    */                   }
/* 249:    */                 }
/* 250:    */                 else
/* 251:    */                 {
/* 252:268 */                   Object obj = reader.getObject(itemName, typeClass);
/* 253:269 */                   if (obj != null) {
/* 254:270 */                     method.invoke(rsp, new Object[] { obj });
/* 255:    */                   }
/* 256:    */                 }
/* 257:    */               }
/* 258:    */             }
/* 259:    */           }
/* 260:    */         }
/* 261:    */       }
/* 262:    */     }
/* 263:    */     catch (Exception e)
/* 264:    */     {
/* 265:277 */       throw new AlipayApiException(e);
/* 266:    */     }
/* 267:280 */     return rsp;
/* 268:    */   }
/* 269:    */   
/* 270:    */   private static Field tryGetFieldWithoutExp(Class<?> clazz, String itemName)
/* 271:    */   {
/* 272:    */     try
/* 273:    */     {
/* 274:296 */       return clazz.getDeclaredField(itemName);
/* 275:    */     }
/* 276:    */     catch (Exception e) {}
/* 277:299 */     return null;
/* 278:    */   }
/* 279:    */   
/* 280:    */   private static <T> Method tryGetSetMethod(Class<T> clazz, Field field, String methodName)
/* 281:    */   {
/* 282:    */     try
/* 283:    */     {
/* 284:313 */       return clazz.getDeclaredMethod(methodName, new Class[] { field.getType() });
/* 285:    */     }
/* 286:    */     catch (Exception e) {}
/* 287:316 */     return null;
/* 288:    */   }
/* 289:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.mapping.Converters
 * JD-Core Version:    0.7.0.1
 */