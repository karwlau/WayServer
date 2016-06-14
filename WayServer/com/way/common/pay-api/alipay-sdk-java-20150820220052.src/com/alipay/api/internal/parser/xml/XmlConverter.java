/*   1:    */ package com.alipay.api.internal.parser.xml;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayApiException;
/*   4:    */ import com.alipay.api.AlipayRequest;
/*   5:    */ import com.alipay.api.AlipayResponse;
/*   6:    */ import com.alipay.api.SignItem;
/*   7:    */ import com.alipay.api.internal.mapping.Converter;
/*   8:    */ import com.alipay.api.internal.mapping.Converters;
/*   9:    */ import com.alipay.api.internal.mapping.Reader;
/*  10:    */ import com.alipay.api.internal.util.StringUtils;
/*  11:    */ import com.alipay.api.internal.util.XmlUtils;
/*  12:    */ import java.text.DateFormat;
/*  13:    */ import java.text.ParseException;
/*  14:    */ import java.text.SimpleDateFormat;
/*  15:    */ import java.util.ArrayList;
/*  16:    */ import java.util.Date;
/*  17:    */ import java.util.List;
/*  18:    */ import org.w3c.dom.Element;
/*  19:    */ 
/*  20:    */ public class XmlConverter
/*  21:    */   implements Converter
/*  22:    */ {
/*  23:    */   public <T extends AlipayResponse> T toResponse(String rsp, Class<T> clazz)
/*  24:    */     throws AlipayApiException
/*  25:    */   {
/*  26: 33 */     Element root = XmlUtils.getRootElementFromString(rsp);
/*  27: 34 */     return (AlipayResponse)getModelFromXML(root, clazz);
/*  28:    */   }
/*  29:    */   
/*  30:    */   private <T> T getModelFromXML(final Element element, Class<T> clazz)
/*  31:    */     throws AlipayApiException
/*  32:    */   {
/*  33: 38 */     if (element == null) {
/*  34: 39 */       return null;
/*  35:    */     }
/*  36: 41 */     Converters.convert(clazz, new Reader()
/*  37:    */     {
/*  38:    */       public boolean hasReturnField(Object name)
/*  39:    */       {
/*  40: 43 */         Element childE = XmlUtils.getChildElement(element, (String)name);
/*  41: 44 */         return childE != null;
/*  42:    */       }
/*  43:    */       
/*  44:    */       public Object getPrimitiveObject(Object name)
/*  45:    */       {
/*  46: 48 */         return XmlUtils.getElementValue(element, (String)name);
/*  47:    */       }
/*  48:    */       
/*  49:    */       public Object getObject(Object name, Class<?> type)
/*  50:    */         throws AlipayApiException
/*  51:    */       {
/*  52: 52 */         Element childE = XmlUtils.getChildElement(element, (String)name);
/*  53: 53 */         if (childE != null) {
/*  54: 54 */           return XmlConverter.this.getModelFromXML(childE, type);
/*  55:    */         }
/*  56: 56 */         return null;
/*  57:    */       }
/*  58:    */       
/*  59:    */       public List<?> getListObjects(Object listName, Object itemName, Class<?> subType)
/*  60:    */         throws AlipayApiException
/*  61:    */       {
/*  62: 62 */         List<Object> list = null;
/*  63: 63 */         Element listE = XmlUtils.getChildElement(element, (String)listName);
/*  64: 65 */         if (listE != null)
/*  65:    */         {
/*  66: 66 */           list = new ArrayList();
/*  67: 67 */           List<Element> itemEs = XmlUtils.getChildElements(listE, (String)itemName);
/*  68: 68 */           for (Element itemE : itemEs)
/*  69:    */           {
/*  70: 69 */             Object obj = null;
/*  71: 70 */             String value = XmlUtils.getElementValue(itemE);
/*  72: 72 */             if (String.class.isAssignableFrom(subType))
/*  73:    */             {
/*  74: 73 */               obj = value;
/*  75:    */             }
/*  76: 74 */             else if (Long.class.isAssignableFrom(subType))
/*  77:    */             {
/*  78: 75 */               obj = Long.valueOf(value);
/*  79:    */             }
/*  80: 76 */             else if (Integer.class.isAssignableFrom(subType))
/*  81:    */             {
/*  82: 77 */               obj = Integer.valueOf(value);
/*  83:    */             }
/*  84: 78 */             else if (Boolean.class.isAssignableFrom(subType))
/*  85:    */             {
/*  86: 79 */               obj = Boolean.valueOf(value);
/*  87:    */             }
/*  88: 80 */             else if (Date.class.isAssignableFrom(subType))
/*  89:    */             {
/*  90: 81 */               DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/*  91:    */               try
/*  92:    */               {
/*  93: 84 */                 obj = format.parse(value);
/*  94:    */               }
/*  95:    */               catch (ParseException e)
/*  96:    */               {
/*  97: 86 */                 throw new AlipayApiException(e);
/*  98:    */               }
/*  99:    */             }
/* 100:    */             else
/* 101:    */             {
/* 102: 89 */               obj = XmlConverter.this.getModelFromXML(itemE, subType);
/* 103:    */             }
/* 104: 91 */             if (obj != null) {
/* 105: 92 */               list.add(obj);
/* 106:    */             }
/* 107:    */           }
/* 108:    */         }
/* 109: 95 */         return list;
/* 110:    */       }
/* 111:    */     });
/* 112:    */   }
/* 113:    */   
/* 114:    */   public SignItem getSignItem(AlipayRequest<?> request, AlipayResponse response)
/* 115:    */     throws AlipayApiException
/* 116:    */   {
/* 117:106 */     String body = response.getBody();
/* 118:109 */     if (StringUtils.isEmpty(body)) {
/* 119:111 */       return null;
/* 120:    */     }
/* 121:114 */     SignItem signItem = new SignItem();
/* 122:    */     
/* 123:    */ 
/* 124:117 */     String sign = getSign(body);
/* 125:118 */     signItem.setSign(sign);
/* 126:    */     
/* 127:    */ 
/* 128:121 */     String signSourceData = getSignSourceData(request, body);
/* 129:122 */     signItem.setSignSourceDate(signSourceData);
/* 130:    */     
/* 131:124 */     return signItem;
/* 132:    */   }
/* 133:    */   
/* 134:    */   private String getSignSourceData(AlipayRequest<?> request, String body)
/* 135:    */   {
/* 136:136 */     String rootNode = request.getApiMethodName().replace('.', '_') + "_response";
/* 137:    */     
/* 138:138 */     String errorRootNode = "error_response";
/* 139:    */     
/* 140:140 */     int indexOfRootNode = body.indexOf(rootNode);
/* 141:141 */     int indexOfErrorRoot = body.indexOf(errorRootNode);
/* 142:144 */     if (indexOfRootNode > 0) {
/* 143:146 */       return parseSignSourceData(body, rootNode, indexOfRootNode);
/* 144:    */     }
/* 145:148 */     if (indexOfErrorRoot > 0) {
/* 146:150 */       return parseSignSourceData(body, errorRootNode, indexOfErrorRoot);
/* 147:    */     }
/* 148:152 */     return null;
/* 149:    */   }
/* 150:    */   
/* 151:    */   private String getSign(String body)
/* 152:    */   {
/* 153:164 */     String signNodeName = "<sign>";
/* 154:165 */     String signEndNodeName = "</sign>";
/* 155:    */     
/* 156:167 */     int indexOfSignNode = body.indexOf(signNodeName);
/* 157:168 */     int indexOfSignEndNode = body.indexOf(signEndNodeName);
/* 158:170 */     if ((indexOfSignNode < 0) || (indexOfSignEndNode < 0)) {
/* 159:171 */       return null;
/* 160:    */     }
/* 161:175 */     return body.substring(indexOfSignNode + signNodeName.length(), indexOfSignEndNode);
/* 162:    */   }
/* 163:    */   
/* 164:    */   private String parseSignSourceData(String body, String rootNode, int indexOfRootNode)
/* 165:    */   {
/* 166:189 */     int signDataStartIndex = indexOfRootNode + rootNode.length() + 1;
/* 167:190 */     int indexOfSign = body.indexOf("<sign");
/* 168:192 */     if (indexOfSign < 0) {
/* 169:194 */       return null;
/* 170:    */     }
/* 171:198 */     int signDataEndIndex = indexOfSign;
/* 172:    */     
/* 173:200 */     return body.substring(signDataStartIndex, signDataEndIndex);
/* 174:    */   }
/* 175:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.parser.xml.XmlConverter
 * JD-Core Version:    0.7.0.1
 */