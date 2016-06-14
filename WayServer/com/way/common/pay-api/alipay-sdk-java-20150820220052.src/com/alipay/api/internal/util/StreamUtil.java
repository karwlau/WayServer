/*   1:    */ package com.alipay.api.internal.util;
/*   2:    */ 
/*   3:    */ import java.io.IOException;
/*   4:    */ import java.io.InputStream;
/*   5:    */ import java.io.InputStreamReader;
/*   6:    */ import java.io.OutputStream;
/*   7:    */ import java.io.Reader;
/*   8:    */ import java.io.StringWriter;
/*   9:    */ import java.io.Writer;
/*  10:    */ 
/*  11:    */ public class StreamUtil
/*  12:    */ {
/*  13:    */   private static final int DEFAULT_BUFFER_SIZE = 8192;
/*  14:    */   
/*  15:    */   public static void io(InputStream in, OutputStream out)
/*  16:    */     throws IOException
/*  17:    */   {
/*  18: 23 */     io(in, out, -1);
/*  19:    */   }
/*  20:    */   
/*  21:    */   public static void io(InputStream in, OutputStream out, int bufferSize)
/*  22:    */     throws IOException
/*  23:    */   {
/*  24: 27 */     if (bufferSize == -1) {
/*  25: 28 */       bufferSize = 8192;
/*  26:    */     }
/*  27: 31 */     byte[] buffer = new byte[bufferSize];
/*  28:    */     int amount;
/*  29: 34 */     while ((amount = in.read(buffer)) >= 0) {
/*  30: 35 */       out.write(buffer, 0, amount);
/*  31:    */     }
/*  32:    */   }
/*  33:    */   
/*  34:    */   public static void io(Reader in, Writer out)
/*  35:    */     throws IOException
/*  36:    */   {
/*  37: 40 */     io(in, out, -1);
/*  38:    */   }
/*  39:    */   
/*  40:    */   public static void io(Reader in, Writer out, int bufferSize)
/*  41:    */     throws IOException
/*  42:    */   {
/*  43: 44 */     if (bufferSize == -1) {
/*  44: 45 */       bufferSize = 4096;
/*  45:    */     }
/*  46: 48 */     char[] buffer = new char[bufferSize];
/*  47:    */     int amount;
/*  48: 51 */     while ((amount = in.read(buffer)) >= 0) {
/*  49: 52 */       out.write(buffer, 0, amount);
/*  50:    */     }
/*  51:    */   }
/*  52:    */   
/*  53:    */   public static OutputStream synchronizedOutputStream(OutputStream out)
/*  54:    */   {
/*  55: 57 */     return new SynchronizedOutputStream(out);
/*  56:    */   }
/*  57:    */   
/*  58:    */   public static OutputStream synchronizedOutputStream(OutputStream out, Object lock)
/*  59:    */   {
/*  60: 61 */     return new SynchronizedOutputStream(out, lock);
/*  61:    */   }
/*  62:    */   
/*  63:    */   public static String readText(InputStream in)
/*  64:    */     throws IOException
/*  65:    */   {
/*  66: 65 */     return readText(in, null, -1);
/*  67:    */   }
/*  68:    */   
/*  69:    */   public static String readText(InputStream in, String encoding)
/*  70:    */     throws IOException
/*  71:    */   {
/*  72: 69 */     return readText(in, encoding, -1);
/*  73:    */   }
/*  74:    */   
/*  75:    */   public static String readText(InputStream in, String encoding, int bufferSize)
/*  76:    */     throws IOException
/*  77:    */   {
/*  78: 74 */     Reader reader = encoding == null ? new InputStreamReader(in) : new InputStreamReader(in, encoding);
/*  79:    */     
/*  80:    */ 
/*  81: 77 */     return readText(reader, bufferSize);
/*  82:    */   }
/*  83:    */   
/*  84:    */   public static String readText(Reader reader)
/*  85:    */     throws IOException
/*  86:    */   {
/*  87: 81 */     return readText(reader, -1);
/*  88:    */   }
/*  89:    */   
/*  90:    */   public static String readText(Reader reader, int bufferSize)
/*  91:    */     throws IOException
/*  92:    */   {
/*  93: 85 */     StringWriter writer = new StringWriter();
/*  94:    */     
/*  95: 87 */     io(reader, writer, bufferSize);
/*  96: 88 */     return writer.toString();
/*  97:    */   }
/*  98:    */   
/*  99:    */   private static class SynchronizedOutputStream
/* 100:    */     extends OutputStream
/* 101:    */   {
/* 102:    */     private OutputStream out;
/* 103:    */     private Object lock;
/* 104:    */     
/* 105:    */     SynchronizedOutputStream(OutputStream out)
/* 106:    */     {
/* 107: 96 */       this(out, out);
/* 108:    */     }
/* 109:    */     
/* 110:    */     SynchronizedOutputStream(OutputStream out, Object lock)
/* 111:    */     {
/* 112:100 */       this.out = out;
/* 113:101 */       this.lock = lock;
/* 114:    */     }
/* 115:    */     
/* 116:    */     public void write(int datum)
/* 117:    */       throws IOException
/* 118:    */     {
/* 119:105 */       synchronized (this.lock)
/* 120:    */       {
/* 121:106 */         this.out.write(datum);
/* 122:    */       }
/* 123:    */     }
/* 124:    */     
/* 125:    */     public void write(byte[] data)
/* 126:    */       throws IOException
/* 127:    */     {
/* 128:111 */       synchronized (this.lock)
/* 129:    */       {
/* 130:112 */         this.out.write(data);
/* 131:    */       }
/* 132:    */     }
/* 133:    */     
/* 134:    */     public void write(byte[] data, int offset, int length)
/* 135:    */       throws IOException
/* 136:    */     {
/* 137:117 */       synchronized (this.lock)
/* 138:    */       {
/* 139:118 */         this.out.write(data, offset, length);
/* 140:    */       }
/* 141:    */     }
/* 142:    */     
/* 143:    */     public void flush()
/* 144:    */       throws IOException
/* 145:    */     {
/* 146:123 */       synchronized (this.lock)
/* 147:    */       {
/* 148:124 */         this.out.flush();
/* 149:    */       }
/* 150:    */     }
/* 151:    */     
/* 152:    */     public void close()
/* 153:    */       throws IOException
/* 154:    */     {
/* 155:129 */       synchronized (this.lock)
/* 156:    */       {
/* 157:130 */         this.out.close();
/* 158:    */       }
/* 159:    */     }
/* 160:    */   }
/* 161:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.internal.util.StreamUtil
 * JD-Core Version:    0.7.0.1
 */