/*   1:    */ package com.alipay.api.internal.parser.json;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayApiException;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.AlipayResponse;
/*   6:    */ import com.alipay.api.SignItem;
/*   7:    */ import com.alipay.api.internal.mapping.Converter;
/*   8:    */ import com.alipay.api.internal.mapping.Converters;
/*   9:    */ import com.alipay.api.internal.mapping.Reader;
/*  10:    */ import com.alipay.api.internal.util.StringUtils;
/*  11:    */ import com.alipay.api.internal.util.json.ExceptionErrorListener;
/*  12:    */ import com.alipay.api.internal.util.json.JSONReader;
/*  13:    */ import com.alipay.api.internal.util.json.JSONValidatingReader;
/*  14:    */ import java.text.DateFormat;
/*  15:    */ import java.text.ParseException;
/*  16:    */ import java.text.SimpleDateFormat;
/*  17:    */ import java.util.ArrayList;
/*  18:    */ import java.util.Collection;
/*  19:    */ import java.util.Date;
/*  20:    */ import java.util.List;
/*  21:    */ import java.util.Map;
/*  22:    */ 
/*  23:    */ public class JsonConverter
/*  24:    */   implements Converter
/*  25:    */ {
/*  26:    */   public <T extends AlipayResponse> T toResponse(String rsp, Class<T> clazz)
/*  27:    */     throws AlipayApiException
/*  28:    */   {
/*  29: 35 */     JSONReader reader = new JSONValidatingReader(new ExceptionErrorListener());
/*  30: 36 */     Object rootObj = reader.read(rsp);
/*  31: 37 */     if ((rootObj instanceof Map))
/*  32:    */     {
/*  33: 38 */       Map<?, ?> rootJson = (Map)rootObj;
/*  34: 39 */       Collection<?> values = rootJson.values();
/*  35: 40 */       for (Object rspObj : values) {
/*  36: 41 */         if ((rspObj instanceof Map))
/*  37:    */         {
/*  38: 42 */           Map<?, ?> rspJson = (Map)rspObj;
/*  39: 43 */           return (AlipayResponse)fromJson(rspJson, clazz);
/*  40:    */         }
/*  41:    */       }
/*  42:    */     }
/*  43: 47 */     return null;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public <T> T fromJson(final Map<?, ?> json, Class<T> clazz)
/*  47:    */     throws AlipayApiException
/*  48:    */   {
/*  49: 60 */     Converters.convert(clazz, new Reader()
/*  50:    */     {
/*  51:    */       public boolean hasReturnField(Object name)
/*  52:    */       {
/*  53: 62 */         return json.containsKey(name);
/*  54:    */       }
/*  55:    */       
/*  56:    */       public Object getPrimitiveObject(Object name)
/*  57:    */       {
/*  58: 66 */         return json.get(name);
/*  59:    */       }
/*  60:    */       
/*  61:    */       public Object getObject(Object name, Class<?> type)
/*  62:    */         throws AlipayApiException
/*  63:    */       {
/*  64: 70 */         Object tmp = json.get(name);
/*  65: 71 */         if ((tmp instanceof Map))
/*  66:    */         {
/*  67: 72 */           Map<?, ?> map = (Map)tmp;
/*  68: 73 */           return JsonConverter.this.fromJson(map, type);
/*  69:    */         }
/*  70: 75 */         return null;
/*  71:    */       }
/*  72:    */       
/*  73:    */       public List<?> getListObjects(Object listName, Object itemName, Class<?> subType)
/*  74:    */         throws AlipayApiException
/*  75:    */       {
/*  76: 81 */         List<Object> listObjs = null;
/*  77:    */         
/*  78: 83 */         Object listTmp = json.get(listName);
/*  79: 84 */         if ((listTmp instanceof Map))
/*  80:    */         {
/*  81: 85 */           Map<?, ?> jsonMap = (Map)listTmp;
/*  82: 86 */           Object itemTmp = jsonMap.get(itemName);
/*  83: 87 */           if ((itemTmp == null) && (listName != null))
/*  84:    */           {
/*  85: 88 */             String listNameStr = listName.toString();
/*  86: 89 */             itemTmp = jsonMap.get(listNameStr.substring(0, listNameStr.length() - 1));
/*  87:    */           }
/*  88: 91 */           if ((itemTmp instanceof List)) {
/*  89: 92 */             listObjs = getListObjectsInner(subType, itemTmp);
/*  90:    */           }
/*  91:    */         }
/*  92: 94 */         else if ((listTmp instanceof List))
/*  93:    */         {
/*  94: 95 */           listObjs = getListObjectsInner(subType, listTmp);
/*  95:    */         }
/*  96: 98 */         return listObjs;
/*  97:    */       }
/*  98:    */       
/*  99:    */       private List<Object> getListObjectsInner(Class<?> subType, Object itemTmp)
/* 100:    */         throws AlipayApiException
/* 101:    */       {
/* 102:104 */         List<Object> listObjs = new ArrayList();
/* 103:105 */         List<?> tmpList = (List)itemTmp;
/* 104:106 */         for (Object subTmp : tmpList)
/* 105:    */         {
/* 106:107 */           Object obj = null;
/* 107:108 */           if (String.class.isAssignableFrom(subType))
/* 108:    */           {
/* 109:109 */             obj = subTmp;
/* 110:    */           }
/* 111:110 */           else if (Long.class.isAssignableFrom(subType))
/* 112:    */           {
/* 113:111 */             obj = subTmp;
/* 114:    */           }
/* 115:112 */           else if (Integer.class.isAssignableFrom(subType))
/* 116:    */           {
/* 117:113 */             obj = subTmp;
/* 118:    */           }
/* 119:114 */           else if (Boolean.class.isAssignableFrom(subType))
/* 120:    */           {
/* 121:115 */             obj = subTmp;
/* 122:    */           }
/* 123:116 */           else if (Date.class.isAssignableFrom(subType))
/* 124:    */           {
/* 125:117 */             DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 126:    */             try
/* 127:    */             {
/* 128:119 */               obj = format.parse(String.valueOf(subTmp));
/* 129:    */             }
/* 130:    */             catch (ParseException e)
/* 131:    */             {
/* 132:121 */               throw new AlipayApiException(e);
/* 133:    */             }
/* 134:    */           }
/* 135:123 */           else if ((subTmp instanceof Map))
/* 136:    */           {
/* 137:124 */             Map<?, ?> subMap = (Map)subTmp;
/* 138:125 */             obj = JsonConverter.this.fromJson(subMap, subType);
/* 139:    */           }
/* 140:128 */           if (obj != null) {
/* 141:129 */             listObjs.add(obj);
/* 142:    */           }
/* 143:    */         }
/* 144:132 */         return listObjs;
/* 145:    */       }
/* 146:    */     });
/* 147:    */   }
/* 148:    */   
/* 149:    */   public SignItem getSignItem(AlipayRequest<?> request, AlipayResponse response)
/* 150:    */     throws AlipayApiException
/* 151:    */   {
/* 152:144 */     String body = response.getBody();
/* 153:147 */     if (StringUtils.isEmpty(body)) {
/* 154:149 */       return null;
/* 155:    */     }
/* 156:152 */     SignItem signItem = new SignItem();
/* 157:    */     
/* 158:    */ 
/* 159:155 */     String sign = getSign(body);
/* 160:156 */     signItem.setSign(sign);
/* 161:    */     
/* 162:    */ 
/* 163:159 */     String signSourceData = getSignSourceData(request, body);
/* 164:160 */     signItem.setSignSourceDate(signSourceData);
/* 165:    */     
/* 166:162 */     return signItem;
/* 167:    */   }
/* 168:    */   
/* 169:    */   private String getSignSourceData(AlipayRequest<?> request, String body)
/* 170:    */   {
/* 171:174 */     String rootNode = request.getApiMethodName().replace('.', '_') + "_response";
/* 172:    */     
/* 173:176 */     String errorRootNode = "error_response";
/* 174:    */     
/* 175:178 */     int indexOfRootNode = body.indexOf(rootNode);
/* 176:179 */     int indexOfErrorRoot = body.indexOf(errorRootNode);
/* 177:182 */     if (indexOfRootNode > 0) {
/* 178:184 */       return parseSignSourceData(body, rootNode, indexOfRootNode);
/* 179:    */     }
/* 180:187 */     if (indexOfErrorRoot > 0) {
/* 181:189 */       return parseSignSourceData(body, errorRootNode, indexOfErrorRoot);
/* 182:    */     }
/* 183:191 */     return null;
/* 184:    */   }
/* 185:    */   
/* 186:    */   private String parseSignSourceData(String body, String rootNode, int indexOfRootNode)
/* 187:    */   {
/* 188:207 */     int signDataStartIndex = indexOfRootNode + rootNode.length() + 2;
/* 189:208 */     int indexOfSign = body.indexOf("\"sign\"");
/* 190:210 */     if (indexOfSign < 0) {
/* 191:212 */       return null;
/* 192:    */     }
/* 193:216 */     int signDataEndIndex = indexOfSign - 1;
/* 194:    */     
/* 195:218 */     return body.substring(signDataStartIndex, signDataEndIndex);
/* 196:    */   }
/* 197:    */   
/* 198:    */   private String getSign(String body)
/* 199:    */   {
/* 200:229 */     JSONReader reader = new JSONValidatingReader(new ExceptionErrorListener());
/* 201:230 */     Object rootObj = reader.read(body);
/* 202:231 */     Map<?, ?> rootJson = (Map)rootObj;
/* 203:    */     
/* 204:233 */     return (String)rootJson.get("sign");
/* 205:    */   }
/* 206:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.parser.json.JsonConverter
 * JD-Core Version:    0.7.0.1
 */