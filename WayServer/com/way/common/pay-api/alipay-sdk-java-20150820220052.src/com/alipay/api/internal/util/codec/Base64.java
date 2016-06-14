/*   1:    */ package com.alipay.api.internal.util.codec;
/*   2:    */ 
/*   3:    */ public class Base64
/*   4:    */   implements BinaryEncoder, BinaryDecoder
/*   5:    */ {
/*   6:    */   static final int CHUNK_SIZE = 76;
/*   7: 51 */   static final byte[] CHUNK_SEPARATOR = "\r\n".getBytes();
/*   8:    */   static final int BASELENGTH = 255;
/*   9:    */   static final int LOOKUPLENGTH = 64;
/*  10:    */   static final int EIGHTBIT = 8;
/*  11:    */   static final int SIXTEENBIT = 16;
/*  12:    */   static final int TWENTYFOURBITGROUP = 24;
/*  13:    */   static final int FOURBYTE = 4;
/*  14:    */   static final int SIGN = -128;
/*  15:    */   static final byte PAD = 61;
/*  16: 95 */   private static byte[] base64Alphabet = new byte['ÿ'];
/*  17: 96 */   private static byte[] lookUpBase64Alphabet = new byte[64];
/*  18:    */   
/*  19:    */   static
/*  20:    */   {
/*  21:100 */     for (int i = 0; i < 255; i++) {
/*  22:101 */       base64Alphabet[i] = -1;
/*  23:    */     }
/*  24:103 */     for (int i = 90; i >= 65; i--) {
/*  25:104 */       base64Alphabet[i] = ((byte)(i - 65));
/*  26:    */     }
/*  27:106 */     for (int i = 122; i >= 97; i--) {
/*  28:107 */       base64Alphabet[i] = ((byte)(i - 97 + 26));
/*  29:    */     }
/*  30:109 */     for (int i = 57; i >= 48; i--) {
/*  31:110 */       base64Alphabet[i] = ((byte)(i - 48 + 52));
/*  32:    */     }
/*  33:113 */     base64Alphabet[43] = 62;
/*  34:114 */     base64Alphabet[47] = 63;
/*  35:116 */     for (int i = 0; i <= 25; i++) {
/*  36:117 */       lookUpBase64Alphabet[i] = ((byte)(65 + i));
/*  37:    */     }
/*  38:120 */     int i = 26;
/*  39:120 */     for (int j = 0; i <= 51; j++)
/*  40:    */     {
/*  41:121 */       lookUpBase64Alphabet[i] = ((byte)(97 + j));i++;
/*  42:    */     }
/*  43:124 */     int i = 52;
/*  44:124 */     for (int j = 0; i <= 61; j++)
/*  45:    */     {
/*  46:125 */       lookUpBase64Alphabet[i] = ((byte)(48 + j));i++;
/*  47:    */     }
/*  48:128 */     lookUpBase64Alphabet[62] = 43;
/*  49:129 */     lookUpBase64Alphabet[63] = 47;
/*  50:    */   }
/*  51:    */   
/*  52:    */   private static boolean isBase64(byte octect)
/*  53:    */   {
/*  54:133 */     if (octect == 61) {
/*  55:134 */       return true;
/*  56:    */     }
/*  57:135 */     if (base64Alphabet[octect] == -1) {
/*  58:136 */       return false;
/*  59:    */     }
/*  60:138 */     return true;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public static boolean isArrayByteBase64(byte[] arrayOctect)
/*  64:    */   {
/*  65:152 */     arrayOctect = discardWhitespace(arrayOctect);
/*  66:    */     
/*  67:154 */     int length = arrayOctect.length;
/*  68:155 */     if (length == 0) {
/*  69:158 */       return true;
/*  70:    */     }
/*  71:160 */     for (int i = 0; i < length; i++) {
/*  72:161 */       if (!isBase64(arrayOctect[i])) {
/*  73:162 */         return false;
/*  74:    */       }
/*  75:    */     }
/*  76:165 */     return true;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public static byte[] encodeBase64(byte[] binaryData)
/*  80:    */   {
/*  81:176 */     return encodeBase64(binaryData, false);
/*  82:    */   }
/*  83:    */   
/*  84:    */   public static byte[] encodeBase64Chunked(byte[] binaryData)
/*  85:    */   {
/*  86:187 */     return encodeBase64(binaryData, true);
/*  87:    */   }
/*  88:    */   
/*  89:    */   public Object decode(Object pObject)
/*  90:    */     throws DecoderException
/*  91:    */   {
/*  92:204 */     if (!(pObject instanceof byte[])) {
/*  93:205 */       throw new DecoderException("Parameter supplied to Base64 decode is not a byte[]");
/*  94:    */     }
/*  95:207 */     return decode((byte[])pObject);
/*  96:    */   }
/*  97:    */   
/*  98:    */   public byte[] decode(byte[] pArray)
/*  99:    */   {
/* 100:218 */     return decodeBase64(pArray);
/* 101:    */   }
/* 102:    */   
/* 103:    */   public static byte[] encodeBase64(byte[] binaryData, boolean isChunked)
/* 104:    */   {
/* 105:231 */     int lengthDataBits = binaryData.length * 8;
/* 106:232 */     int fewerThan24bits = lengthDataBits % 24;
/* 107:233 */     int numberTriplets = lengthDataBits / 24;
/* 108:234 */     byte[] encodedData = null;
/* 109:235 */     int encodedDataLength = 0;
/* 110:236 */     int nbrChunks = 0;
/* 111:238 */     if (fewerThan24bits != 0) {
/* 112:240 */       encodedDataLength = (numberTriplets + 1) * 4;
/* 113:    */     } else {
/* 114:243 */       encodedDataLength = numberTriplets * 4;
/* 115:    */     }
/* 116:249 */     if (isChunked)
/* 117:    */     {
/* 118:251 */       nbrChunks = CHUNK_SEPARATOR.length == 0 ? 0 : (int)Math.ceil(encodedDataLength / 76.0F);
/* 119:    */       
/* 120:253 */       encodedDataLength += nbrChunks * CHUNK_SEPARATOR.length;
/* 121:    */     }
/* 122:256 */     encodedData = new byte[encodedDataLength];
/* 123:    */     
/* 124:258 */     byte k = 0;byte l = 0;byte b1 = 0;byte b2 = 0;byte b3 = 0;
/* 125:    */     
/* 126:260 */     int encodedIndex = 0;
/* 127:261 */     int dataIndex = 0;
/* 128:262 */     int i = 0;
/* 129:263 */     int nextSeparatorIndex = 76;
/* 130:264 */     int chunksSoFar = 0;
/* 131:267 */     for (i = 0; i < numberTriplets; i++)
/* 132:    */     {
/* 133:268 */       dataIndex = i * 3;
/* 134:269 */       b1 = binaryData[dataIndex];
/* 135:270 */       b2 = binaryData[(dataIndex + 1)];
/* 136:271 */       b3 = binaryData[(dataIndex + 2)];
/* 137:    */       
/* 138:    */ 
/* 139:    */ 
/* 140:275 */       l = (byte)(b2 & 0xF);
/* 141:276 */       k = (byte)(b1 & 0x3);
/* 142:    */       
/* 143:278 */       byte val1 = (b1 & 0xFFFFFF80) == 0 ? (byte)(b1 >> 2) : (byte)(b1 >> 2 ^ 0xC0);
/* 144:    */       
/* 145:280 */       byte val2 = (b2 & 0xFFFFFF80) == 0 ? (byte)(b2 >> 4) : (byte)(b2 >> 4 ^ 0xF0);
/* 146:    */       
/* 147:282 */       byte val3 = (b3 & 0xFFFFFF80) == 0 ? (byte)(b3 >> 6) : (byte)(b3 >> 6 ^ 0xFC);
/* 148:    */       
/* 149:    */ 
/* 150:285 */       encodedData[encodedIndex] = lookUpBase64Alphabet[val1];
/* 151:    */       
/* 152:    */ 
/* 153:    */ 
/* 154:289 */       encodedData[(encodedIndex + 1)] = lookUpBase64Alphabet[(val2 | k << 4)];
/* 155:    */       
/* 156:291 */       encodedData[(encodedIndex + 2)] = lookUpBase64Alphabet[(l << 2 | val3)];
/* 157:    */       
/* 158:293 */       encodedData[(encodedIndex + 3)] = lookUpBase64Alphabet[(b3 & 0x3F)];
/* 159:    */       
/* 160:295 */       encodedIndex += 4;
/* 161:298 */       if (isChunked) {
/* 162:300 */         if (encodedIndex == nextSeparatorIndex)
/* 163:    */         {
/* 164:301 */           System.arraycopy(CHUNK_SEPARATOR, 0, encodedData, encodedIndex, CHUNK_SEPARATOR.length);
/* 165:    */           
/* 166:    */ 
/* 167:    */ 
/* 168:    */ 
/* 169:    */ 
/* 170:307 */           chunksSoFar++;
/* 171:308 */           nextSeparatorIndex = 76 * (chunksSoFar + 1) + chunksSoFar * CHUNK_SEPARATOR.length;
/* 172:    */           
/* 173:    */ 
/* 174:311 */           encodedIndex += CHUNK_SEPARATOR.length;
/* 175:    */         }
/* 176:    */       }
/* 177:    */     }
/* 178:317 */     dataIndex = i * 3;
/* 179:319 */     if (fewerThan24bits == 8)
/* 180:    */     {
/* 181:320 */       b1 = binaryData[dataIndex];
/* 182:321 */       k = (byte)(b1 & 0x3);
/* 183:    */       
/* 184:    */ 
/* 185:324 */       byte val1 = (b1 & 0xFFFFFF80) == 0 ? (byte)(b1 >> 2) : (byte)(b1 >> 2 ^ 0xC0);
/* 186:    */       
/* 187:326 */       encodedData[encodedIndex] = lookUpBase64Alphabet[val1];
/* 188:327 */       encodedData[(encodedIndex + 1)] = lookUpBase64Alphabet[(k << 4)];
/* 189:328 */       encodedData[(encodedIndex + 2)] = 61;
/* 190:329 */       encodedData[(encodedIndex + 3)] = 61;
/* 191:    */     }
/* 192:330 */     else if (fewerThan24bits == 16)
/* 193:    */     {
/* 194:332 */       b1 = binaryData[dataIndex];
/* 195:333 */       b2 = binaryData[(dataIndex + 1)];
/* 196:334 */       l = (byte)(b2 & 0xF);
/* 197:335 */       k = (byte)(b1 & 0x3);
/* 198:    */       
/* 199:337 */       byte val1 = (b1 & 0xFFFFFF80) == 0 ? (byte)(b1 >> 2) : (byte)(b1 >> 2 ^ 0xC0);
/* 200:    */       
/* 201:339 */       byte val2 = (b2 & 0xFFFFFF80) == 0 ? (byte)(b2 >> 4) : (byte)(b2 >> 4 ^ 0xF0);
/* 202:    */       
/* 203:    */ 
/* 204:342 */       encodedData[encodedIndex] = lookUpBase64Alphabet[val1];
/* 205:343 */       encodedData[(encodedIndex + 1)] = lookUpBase64Alphabet[(val2 | k << 4)];
/* 206:    */       
/* 207:345 */       encodedData[(encodedIndex + 2)] = lookUpBase64Alphabet[(l << 2)];
/* 208:346 */       encodedData[(encodedIndex + 3)] = 61;
/* 209:    */     }
/* 210:349 */     if (isChunked) {
/* 211:351 */       if (chunksSoFar < nbrChunks) {
/* 212:352 */         System.arraycopy(CHUNK_SEPARATOR, 0, encodedData, encodedDataLength - CHUNK_SEPARATOR.length, CHUNK_SEPARATOR.length);
/* 213:    */       }
/* 214:    */     }
/* 215:361 */     return encodedData;
/* 216:    */   }
/* 217:    */   
/* 218:    */   public static byte[] decodeBase64(byte[] base64Data)
/* 219:    */   {
/* 220:372 */     base64Data = discardNonBase64(base64Data);
/* 221:375 */     if (base64Data.length == 0) {
/* 222:376 */       return new byte[0];
/* 223:    */     }
/* 224:379 */     int numberQuadruple = base64Data.length / 4;
/* 225:380 */     byte[] decodedData = null;
/* 226:381 */     byte b1 = 0;byte b2 = 0;byte b3 = 0;byte b4 = 0;byte marker0 = 0;byte marker1 = 0;
/* 227:    */     
/* 228:    */ 
/* 229:    */ 
/* 230:385 */     int encodedIndex = 0;
/* 231:386 */     int dataIndex = 0;
/* 232:    */     
/* 233:    */ 
/* 234:389 */     int lastData = base64Data.length;
/* 235:391 */     while (base64Data[(lastData - 1)] == 61)
/* 236:    */     {
/* 237:392 */       lastData--;
/* 238:392 */       if (lastData == 0) {
/* 239:393 */         return new byte[0];
/* 240:    */       }
/* 241:    */     }
/* 242:396 */     decodedData = new byte[lastData - numberQuadruple];
/* 243:399 */     for (int i = 0; i < numberQuadruple; i++)
/* 244:    */     {
/* 245:400 */       dataIndex = i * 4;
/* 246:401 */       marker0 = base64Data[(dataIndex + 2)];
/* 247:402 */       marker1 = base64Data[(dataIndex + 3)];
/* 248:    */       
/* 249:404 */       b1 = base64Alphabet[base64Data[dataIndex]];
/* 250:405 */       b2 = base64Alphabet[base64Data[(dataIndex + 1)]];
/* 251:407 */       if ((marker0 != 61) && (marker1 != 61))
/* 252:    */       {
/* 253:409 */         b3 = base64Alphabet[marker0];
/* 254:410 */         b4 = base64Alphabet[marker1];
/* 255:    */         
/* 256:412 */         decodedData[encodedIndex] = ((byte)(b1 << 2 | b2 >> 4));
/* 257:413 */         decodedData[(encodedIndex + 1)] = ((byte)((b2 & 0xF) << 4 | b3 >> 2 & 0xF));
/* 258:    */         
/* 259:415 */         decodedData[(encodedIndex + 2)] = ((byte)(b3 << 6 | b4));
/* 260:    */       }
/* 261:416 */       else if (marker0 == 61)
/* 262:    */       {
/* 263:418 */         decodedData[encodedIndex] = ((byte)(b1 << 2 | b2 >> 4));
/* 264:    */       }
/* 265:419 */       else if (marker1 == 61)
/* 266:    */       {
/* 267:421 */         b3 = base64Alphabet[marker0];
/* 268:    */         
/* 269:423 */         decodedData[encodedIndex] = ((byte)(b1 << 2 | b2 >> 4));
/* 270:424 */         decodedData[(encodedIndex + 1)] = ((byte)((b2 & 0xF) << 4 | b3 >> 2 & 0xF));
/* 271:    */       }
/* 272:427 */       encodedIndex += 3;
/* 273:    */     }
/* 274:429 */     return decodedData;
/* 275:    */   }
/* 276:    */   
/* 277:    */   static byte[] discardWhitespace(byte[] data)
/* 278:    */   {
/* 279:440 */     byte[] groomedData = new byte[data.length];
/* 280:441 */     int bytesCopied = 0;
/* 281:443 */     for (int i = 0; i < data.length; i++) {
/* 282:444 */       switch (data[i])
/* 283:    */       {
/* 284:    */       case 9: 
/* 285:    */       case 10: 
/* 286:    */       case 13: 
/* 287:    */       case 32: 
/* 288:    */         break;
/* 289:    */       default: 
/* 290:451 */         groomedData[(bytesCopied++)] = data[i];
/* 291:    */       }
/* 292:    */     }
/* 293:455 */     byte[] packedData = new byte[bytesCopied];
/* 294:    */     
/* 295:457 */     System.arraycopy(groomedData, 0, packedData, 0, bytesCopied);
/* 296:    */     
/* 297:459 */     return packedData;
/* 298:    */   }
/* 299:    */   
/* 300:    */   static byte[] discardNonBase64(byte[] data)
/* 301:    */   {
/* 302:472 */     byte[] groomedData = new byte[data.length];
/* 303:473 */     int bytesCopied = 0;
/* 304:475 */     for (int i = 0; i < data.length; i++) {
/* 305:476 */       if (isBase64(data[i])) {
/* 306:477 */         groomedData[(bytesCopied++)] = data[i];
/* 307:    */       }
/* 308:    */     }
/* 309:481 */     byte[] packedData = new byte[bytesCopied];
/* 310:    */     
/* 311:483 */     System.arraycopy(groomedData, 0, packedData, 0, bytesCopied);
/* 312:    */     
/* 313:485 */     return packedData;
/* 314:    */   }
/* 315:    */   
/* 316:    */   public Object encode(Object pObject)
/* 317:    */     throws EncoderException
/* 318:    */   {
/* 319:504 */     if (!(pObject instanceof byte[])) {
/* 320:505 */       throw new EncoderException("Parameter supplied to Base64 encode is not a byte[]");
/* 321:    */     }
/* 322:508 */     return encode((byte[])pObject);
/* 323:    */   }
/* 324:    */   
/* 325:    */   public byte[] encode(byte[] pArray)
/* 326:    */   {
/* 327:519 */     return encodeBase64(pArray, false);
/* 328:    */   }
/* 329:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.codec.Base64
 * JD-Core Version:    0.7.0.1
 */