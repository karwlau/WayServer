/*   1:    */ package com.alipay.api.internal.util;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayApiException;
/*   4:    */ import java.io.ByteArrayInputStream;
/*   5:    */ import java.io.File;
/*   6:    */ import java.io.FileInputStream;
/*   7:    */ import java.io.FileNotFoundException;
/*   8:    */ import java.io.FileOutputStream;
/*   9:    */ import java.io.IOException;
/*  10:    */ import java.io.InputStream;
/*  11:    */ import java.io.OutputStream;
/*  12:    */ import java.io.StringReader;
/*  13:    */ import java.io.StringWriter;
/*  14:    */ import java.io.UnsupportedEncodingException;
/*  15:    */ import java.util.ArrayList;
/*  16:    */ import java.util.List;
/*  17:    */ import java.util.Properties;
/*  18:    */ import java.util.StringTokenizer;
/*  19:    */ import javax.xml.parsers.DocumentBuilder;
/*  20:    */ import javax.xml.parsers.DocumentBuilderFactory;
/*  21:    */ import javax.xml.parsers.ParserConfigurationException;
/*  22:    */ import javax.xml.transform.Result;
/*  23:    */ import javax.xml.transform.Source;
/*  24:    */ import javax.xml.transform.Transformer;
/*  25:    */ import javax.xml.transform.TransformerException;
/*  26:    */ import javax.xml.transform.TransformerFactory;
/*  27:    */ import javax.xml.transform.dom.DOMSource;
/*  28:    */ import javax.xml.transform.stream.StreamResult;
/*  29:    */ import javax.xml.transform.stream.StreamSource;
/*  30:    */ import javax.xml.validation.Schema;
/*  31:    */ import javax.xml.validation.SchemaFactory;
/*  32:    */ import javax.xml.validation.Validator;
/*  33:    */ import org.w3c.dom.Document;
/*  34:    */ import org.w3c.dom.Element;
/*  35:    */ import org.w3c.dom.Node;
/*  36:    */ import org.w3c.dom.NodeList;
/*  37:    */ import org.w3c.dom.Text;
/*  38:    */ import org.xml.sax.SAXException;
/*  39:    */ 
/*  40:    */ public final class XmlUtils
/*  41:    */ {
/*  42:    */   private static final String XMLNS_XSI = "xmlns:xsi";
/*  43:    */   private static final String XSI_SCHEMA_LOCATION = "xsi:schemaLocation";
/*  44:    */   private static final String LOGIC_YES = "yes";
/*  45:    */   private static final String DEFAULT_ENCODE = "UTF-8";
/*  46:    */   private static final String REG_INVALID_CHARS = "&#\\d+;";
/*  47:    */   
/*  48:    */   public static Document newDocument()
/*  49:    */     throws AlipayApiException
/*  50:    */   {
/*  51: 66 */     Document doc = null;
/*  52:    */     try
/*  53:    */     {
/*  54: 69 */       doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
/*  55:    */     }
/*  56:    */     catch (ParserConfigurationException e)
/*  57:    */     {
/*  58: 71 */       throw new AlipayApiException(e);
/*  59:    */     }
/*  60: 74 */     return doc;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public static Document getDocument(File file)
/*  64:    */     throws AlipayApiException
/*  65:    */   {
/*  66: 85 */     InputStream in = getInputStream(file);
/*  67: 86 */     return getDocument(in);
/*  68:    */   }
/*  69:    */   
/*  70:    */   public static Document getDocument(InputStream in)
/*  71:    */     throws AlipayApiException
/*  72:    */   {
/*  73: 97 */     doc = null;
/*  74:    */     try
/*  75:    */     {
/*  76:100 */       DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
/*  77:    */       
/*  78:102 */       return builder.parse(in);
/*  79:    */     }
/*  80:    */     catch (ParserConfigurationException e)
/*  81:    */     {
/*  82:104 */       throw new AlipayApiException(e);
/*  83:    */     }
/*  84:    */     catch (SAXException e)
/*  85:    */     {
/*  86:106 */       throw new AlipayApiException("XML_PARSE_ERROR", e);
/*  87:    */     }
/*  88:    */     catch (IOException e)
/*  89:    */     {
/*  90:108 */       throw new AlipayApiException("XML_READ_ERROR", e);
/*  91:    */     }
/*  92:    */     finally
/*  93:    */     {
/*  94:110 */       if (in != null) {
/*  95:    */         try
/*  96:    */         {
/*  97:112 */           in.close();
/*  98:    */         }
/*  99:    */         catch (IOException e) {}
/* 100:    */       }
/* 101:    */     }
/* 102:    */   }
/* 103:    */   
/* 104:    */   public static Element createRootElement(String tagName)
/* 105:    */     throws AlipayApiException
/* 106:    */   {
/* 107:130 */     Document doc = newDocument();
/* 108:131 */     Element root = doc.createElement(tagName);
/* 109:132 */     doc.appendChild(root);
/* 110:133 */     return root;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public static Element getRootElementFromStream(InputStream in)
/* 114:    */     throws AlipayApiException
/* 115:    */   {
/* 116:145 */     return getDocument(in).getDocumentElement();
/* 117:    */   }
/* 118:    */   
/* 119:    */   public static Element getRootElementFromFile(File file)
/* 120:    */     throws AlipayApiException
/* 121:    */   {
/* 122:157 */     return getDocument(file).getDocumentElement();
/* 123:    */   }
/* 124:    */   
/* 125:    */   private static String getEncoding(String text)
/* 126:    */   {
/* 127:167 */     String result = "UTF-8";
/* 128:    */     
/* 129:169 */     String xml = text.trim();
/* 130:171 */     if (xml.startsWith("<?xml"))
/* 131:    */     {
/* 132:172 */       int end = xml.indexOf("?>");
/* 133:173 */       String sub = xml.substring(0, end);
/* 134:174 */       StringTokenizer tokens = new StringTokenizer(sub, " =\"'");
/* 135:176 */       while (tokens.hasMoreTokens())
/* 136:    */       {
/* 137:177 */         String token = tokens.nextToken();
/* 138:179 */         if ("encoding".equals(token))
/* 139:    */         {
/* 140:180 */           if (!tokens.hasMoreTokens()) {
/* 141:    */             break;
/* 142:    */           }
/* 143:181 */           result = tokens.nextToken(); break;
/* 144:    */         }
/* 145:    */       }
/* 146:    */     }
/* 147:188 */     return result;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public static Element getRootElementFromString(String payload)
/* 151:    */     throws AlipayApiException
/* 152:    */   {
/* 153:200 */     if ((payload == null) || (payload.trim().length() < 1)) {
/* 154:201 */       throw new AlipayApiException("XML_PAYLOAD_EMPTY");
/* 155:    */     }
/* 156:204 */     byte[] bytes = null;
/* 157:    */     try
/* 158:    */     {
/* 159:207 */       payload = StringUtils.stripNonValidXMLCharacters(payload);
/* 160:208 */       String encodeString = getEncoding(payload);
/* 161:209 */       bytes = payload.getBytes(encodeString);
/* 162:    */     }
/* 163:    */     catch (UnsupportedEncodingException e)
/* 164:    */     {
/* 165:211 */       throw new AlipayApiException("XML_ENCODE_ERROR", e);
/* 166:    */     }
/* 167:214 */     InputStream in = new ByteArrayInputStream(bytes);
/* 168:215 */     return getDocument(in).getDocumentElement();
/* 169:    */   }
/* 170:    */   
/* 171:    */   public static List<Element> getElements(Element parent, String tagName)
/* 172:    */   {
/* 173:226 */     NodeList nodes = parent.getElementsByTagName(tagName);
/* 174:227 */     List<Element> elements = new ArrayList();
/* 175:229 */     for (int i = 0; i < nodes.getLength(); i++)
/* 176:    */     {
/* 177:230 */       Node node = nodes.item(i);
/* 178:231 */       if ((node instanceof Element)) {
/* 179:232 */         elements.add((Element)node);
/* 180:    */       }
/* 181:    */     }
/* 182:236 */     return elements;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public static Element getElement(Element parent, String tagName)
/* 186:    */   {
/* 187:247 */     List<Element> children = getElements(parent, tagName);
/* 188:249 */     if (children.isEmpty()) {
/* 189:250 */       return null;
/* 190:    */     }
/* 191:252 */     return (Element)children.get(0);
/* 192:    */   }
/* 193:    */   
/* 194:    */   public static List<Element> getChildElements(Element parent, String tagName)
/* 195:    */   {
/* 196:264 */     NodeList nodes = parent.getElementsByTagName(tagName);
/* 197:265 */     List<Element> elements = new ArrayList();
/* 198:267 */     for (int i = 0; i < nodes.getLength(); i++)
/* 199:    */     {
/* 200:268 */       Node node = nodes.item(i);
/* 201:269 */       if (((node instanceof Element)) && (node.getParentNode() == parent)) {
/* 202:270 */         elements.add((Element)node);
/* 203:    */       }
/* 204:    */     }
/* 205:274 */     return elements;
/* 206:    */   }
/* 207:    */   
/* 208:    */   public static Element getChildElement(Element parent, String tagName)
/* 209:    */   {
/* 210:285 */     List<Element> children = getChildElements(parent, tagName);
/* 211:287 */     if (children.isEmpty()) {
/* 212:288 */       return null;
/* 213:    */     }
/* 214:290 */     return (Element)children.get(0);
/* 215:    */   }
/* 216:    */   
/* 217:    */   public static String getElementValue(Element parent, String tagName)
/* 218:    */   {
/* 219:304 */     Element element = getChildElement(parent, tagName);
/* 220:305 */     if (element != null)
/* 221:    */     {
/* 222:306 */       NodeList nodes = element.getChildNodes();
/* 223:307 */       if ((nodes != null) && (nodes.getLength() > 0)) {
/* 224:308 */         for (int i = 0; i < nodes.getLength(); i++)
/* 225:    */         {
/* 226:309 */           Node node = nodes.item(i);
/* 227:310 */           if ((node instanceof Text)) {
/* 228:311 */             return ((Text)node).getData();
/* 229:    */           }
/* 230:    */         }
/* 231:    */       }
/* 232:    */     }
/* 233:317 */     return null;
/* 234:    */   }
/* 235:    */   
/* 236:    */   public static String getElementValue(Element element)
/* 237:    */   {
/* 238:327 */     if (element != null)
/* 239:    */     {
/* 240:328 */       NodeList nodes = element.getChildNodes();
/* 241:329 */       if ((nodes != null) && (nodes.getLength() > 0)) {
/* 242:330 */         for (int i = 0; i < nodes.getLength(); i++)
/* 243:    */         {
/* 244:331 */           Node node = nodes.item(i);
/* 245:332 */           if ((node instanceof Text)) {
/* 246:333 */             return ((Text)node).getData();
/* 247:    */           }
/* 248:    */         }
/* 249:    */       }
/* 250:    */     }
/* 251:339 */     return null;
/* 252:    */   }
/* 253:    */   
/* 254:    */   public static Element appendElement(Element parent, String tagName)
/* 255:    */   {
/* 256:350 */     Element child = parent.getOwnerDocument().createElement(tagName);
/* 257:351 */     parent.appendChild(child);
/* 258:352 */     return child;
/* 259:    */   }
/* 260:    */   
/* 261:    */   public static Element appendElement(Element parent, String tagName, String value)
/* 262:    */   {
/* 263:365 */     Element child = appendElement(parent, tagName);
/* 264:366 */     child.appendChild(child.getOwnerDocument().createTextNode(value));
/* 265:367 */     return child;
/* 266:    */   }
/* 267:    */   
/* 268:    */   public static void appendElement(Element parent, Element child)
/* 269:    */   {
/* 270:377 */     Node tmp = parent.getOwnerDocument().importNode(child, true);
/* 271:378 */     parent.appendChild(tmp);
/* 272:    */   }
/* 273:    */   
/* 274:    */   public static Element appendCDATAElement(Element parent, String tagName, String value)
/* 275:    */   {
/* 276:391 */     Element child = appendElement(parent, tagName);
/* 277:392 */     if (value == null) {
/* 278:393 */       value = "";
/* 279:    */     }
/* 280:396 */     Node cdata = child.getOwnerDocument().createCDATASection(value);
/* 281:397 */     child.appendChild(cdata);
/* 282:398 */     return child;
/* 283:    */   }
/* 284:    */   
/* 285:    */   public static String childNodeToString(Node node)
/* 286:    */     throws AlipayApiException
/* 287:    */   {
/* 288:409 */     String payload = null;
/* 289:    */     try
/* 290:    */     {
/* 291:412 */       Transformer tf = TransformerFactory.newInstance().newTransformer();
/* 292:    */       
/* 293:414 */       Properties props = tf.getOutputProperties();
/* 294:415 */       props.setProperty("omit-xml-declaration", "yes");
/* 295:416 */       tf.setOutputProperties(props);
/* 296:    */       
/* 297:418 */       StringWriter writer = new StringWriter();
/* 298:419 */       tf.transform(new DOMSource(node), new StreamResult(writer));
/* 299:420 */       payload = writer.toString();
/* 300:421 */       payload = payload.replaceAll("&#\\d+;", " ");
/* 301:    */     }
/* 302:    */     catch (TransformerException e)
/* 303:    */     {
/* 304:423 */       throw new AlipayApiException("XML_TRANSFORM_ERROR", e);
/* 305:    */     }
/* 306:426 */     return payload;
/* 307:    */   }
/* 308:    */   
/* 309:    */   public static String nodeToString(Node node)
/* 310:    */     throws AlipayApiException
/* 311:    */   {
/* 312:437 */     String payload = null;
/* 313:    */     try
/* 314:    */     {
/* 315:440 */       Transformer tf = TransformerFactory.newInstance().newTransformer();
/* 316:    */       
/* 317:442 */       Properties props = tf.getOutputProperties();
/* 318:443 */       props.setProperty("indent", "yes");
/* 319:444 */       props.setProperty("encoding", "UTF-8");
/* 320:445 */       tf.setOutputProperties(props);
/* 321:    */       
/* 322:447 */       StringWriter writer = new StringWriter();
/* 323:448 */       tf.transform(new DOMSource(node), new StreamResult(writer));
/* 324:449 */       payload = writer.toString();
/* 325:450 */       payload = payload.replaceAll("&#\\d+;", " ");
/* 326:    */     }
/* 327:    */     catch (TransformerException e)
/* 328:    */     {
/* 329:452 */       throw new AlipayApiException("XML_TRANSFORM_ERROR", e);
/* 330:    */     }
/* 331:455 */     return payload;
/* 332:    */   }
/* 333:    */   
/* 334:    */   public static String xmlToString(File file)
/* 335:    */     throws AlipayApiException
/* 336:    */   {
/* 337:466 */     Element root = getRootElementFromFile(file);
/* 338:467 */     return nodeToString(root);
/* 339:    */   }
/* 340:    */   
/* 341:    */   public static String xmlToString(InputStream in)
/* 342:    */     throws AlipayApiException
/* 343:    */   {
/* 344:478 */     Element root = getRootElementFromStream(in);
/* 345:479 */     return nodeToString(root);
/* 346:    */   }
/* 347:    */   
/* 348:    */   public static void saveToXml(Node doc, File file)
/* 349:    */     throws AlipayApiException
/* 350:    */   {
/* 351:490 */     OutputStream out = null;
/* 352:    */     try
/* 353:    */     {
/* 354:493 */       Transformer tf = TransformerFactory.newInstance().newTransformer();
/* 355:    */       
/* 356:495 */       Properties props = tf.getOutputProperties();
/* 357:496 */       props.setProperty("method", "xml");
/* 358:497 */       props.setProperty("indent", "yes");
/* 359:498 */       tf.setOutputProperties(props);
/* 360:    */       
/* 361:500 */       DOMSource dom = new DOMSource(doc);
/* 362:501 */       out = getOutputStream(file);
/* 363:502 */       Result result = new StreamResult(out);
/* 364:503 */       tf.transform(dom, result); return;
/* 365:    */     }
/* 366:    */     catch (TransformerException e)
/* 367:    */     {
/* 368:505 */       throw new AlipayApiException("XML_TRANSFORM_ERROR", e);
/* 369:    */     }
/* 370:    */     finally
/* 371:    */     {
/* 372:507 */       if (out != null) {
/* 373:    */         try
/* 374:    */         {
/* 375:509 */           out.close();
/* 376:    */         }
/* 377:    */         catch (IOException e) {}
/* 378:    */       }
/* 379:    */     }
/* 380:    */   }
/* 381:    */   
/* 382:    */   public static void validateXml(Node doc, File schemaFile)
/* 383:    */     throws AlipayApiException
/* 384:    */   {
/* 385:526 */     validateXml(doc, getInputStream(schemaFile));
/* 386:    */   }
/* 387:    */   
/* 388:    */   public static void validateXml(Node doc, InputStream schemaStream)
/* 389:    */     throws AlipayApiException
/* 390:    */   {
/* 391:    */     try
/* 392:    */     {
/* 393:539 */       Source source = new StreamSource(schemaStream);
/* 394:540 */       Schema schema = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema").newSchema(source);
/* 395:    */       
/* 396:    */ 
/* 397:543 */       Validator validator = schema.newValidator();
/* 398:544 */       validator.validate(new DOMSource(doc)); return;
/* 399:    */     }
/* 400:    */     catch (SAXException e)
/* 401:    */     {
/* 402:546 */       throw new AlipayApiException("XML_VALIDATE_ERROR", e);
/* 403:    */     }
/* 404:    */     catch (IOException e)
/* 405:    */     {
/* 406:548 */       throw new AlipayApiException("XML_READ_ERROR", e);
/* 407:    */     }
/* 408:    */     finally
/* 409:    */     {
/* 410:550 */       if (schemaStream != null) {
/* 411:    */         try
/* 412:    */         {
/* 413:552 */           schemaStream.close();
/* 414:    */         }
/* 415:    */         catch (IOException e) {}
/* 416:    */       }
/* 417:    */     }
/* 418:    */   }
/* 419:    */   
/* 420:    */   public static String xmlToHtml(String payload, File xsltFile)
/* 421:    */     throws AlipayApiException
/* 422:    */   {
/* 423:570 */     String result = null;
/* 424:    */     try
/* 425:    */     {
/* 426:573 */       Source template = new StreamSource(xsltFile);
/* 427:574 */       Transformer transformer = TransformerFactory.newInstance().newTransformer(template);
/* 428:    */       
/* 429:    */ 
/* 430:577 */       Properties props = transformer.getOutputProperties();
/* 431:578 */       props.setProperty("omit-xml-declaration", "yes");
/* 432:579 */       transformer.setOutputProperties(props);
/* 433:    */       
/* 434:581 */       StreamSource source = new StreamSource(new StringReader(payload));
/* 435:582 */       StreamResult sr = new StreamResult(new StringWriter());
/* 436:583 */       transformer.transform(source, sr);
/* 437:    */       
/* 438:585 */       result = sr.getWriter().toString();
/* 439:    */     }
/* 440:    */     catch (TransformerException e)
/* 441:    */     {
/* 442:587 */       throw new AlipayApiException("XML_TRANSFORM_ERROR", e);
/* 443:    */     }
/* 444:590 */     return result;
/* 445:    */   }
/* 446:    */   
/* 447:    */   public static void setNamespace(Element element, String namespace, String schemaLocation)
/* 448:    */   {
/* 449:602 */     element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns", namespace);
/* 450:    */     
/* 451:604 */     element.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
/* 452:    */     
/* 453:606 */     element.setAttributeNS("http://www.w3.org/2001/XMLSchema-instance", "xsi:schemaLocation", schemaLocation);
/* 454:    */   }
/* 455:    */   
/* 456:    */   public static String encodeXml(String payload)
/* 457:    */     throws AlipayApiException
/* 458:    */   {
/* 459:618 */     Element root = createRootElement("xml");
/* 460:619 */     root.appendChild(root.getOwnerDocument().createTextNode(payload));
/* 461:620 */     return childNodeToString(root.getFirstChild());
/* 462:    */   }
/* 463:    */   
/* 464:    */   private static InputStream getInputStream(File file)
/* 465:    */     throws AlipayApiException
/* 466:    */   {
/* 467:624 */     InputStream in = null;
/* 468:    */     try
/* 469:    */     {
/* 470:627 */       in = new FileInputStream(file);
/* 471:    */     }
/* 472:    */     catch (FileNotFoundException e)
/* 473:    */     {
/* 474:629 */       throw new AlipayApiException("FILE_NOT_FOUND", e);
/* 475:    */     }
/* 476:632 */     return in;
/* 477:    */   }
/* 478:    */   
/* 479:    */   private static OutputStream getOutputStream(File file)
/* 480:    */     throws AlipayApiException
/* 481:    */   {
/* 482:636 */     OutputStream in = null;
/* 483:    */     try
/* 484:    */     {
/* 485:639 */       in = new FileOutputStream(file);
/* 486:    */     }
/* 487:    */     catch (FileNotFoundException e)
/* 488:    */     {
/* 489:641 */       throw new AlipayApiException("FILE_NOT_FOUND", e);
/* 490:    */     }
/* 491:644 */     return in;
/* 492:    */   }
/* 493:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.XmlUtils
 * JD-Core Version:    0.7.0.1
 */