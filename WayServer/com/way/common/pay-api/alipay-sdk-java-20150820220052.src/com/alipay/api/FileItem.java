/*   1:    */ package com.alipay.api;
/*   2:    */ 
/*   3:    */ import com.alipay.api.internal.util.AlipayUtils;
/*   4:    */ import java.io.ByteArrayOutputStream;
/*   5:    */ import java.io.File;
/*   6:    */ import java.io.FileInputStream;
/*   7:    */ import java.io.IOException;
/*   8:    */ import java.io.InputStream;
/*   9:    */ 
/*  10:    */ public class FileItem
/*  11:    */ {
/*  12:    */   private String fileName;
/*  13:    */   private String mimeType;
/*  14:    */   private byte[] content;
/*  15:    */   private File file;
/*  16:    */   
/*  17:    */   public FileItem(File file)
/*  18:    */   {
/*  19: 30 */     this.file = file;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public FileItem(String filePath)
/*  23:    */   {
/*  24: 39 */     this(new File(filePath));
/*  25:    */   }
/*  26:    */   
/*  27:    */   public FileItem(String fileName, byte[] content)
/*  28:    */   {
/*  29: 49 */     this.fileName = fileName;
/*  30: 50 */     this.content = content;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public FileItem(String fileName, byte[] content, String mimeType)
/*  34:    */   {
/*  35: 61 */     this(fileName, content);
/*  36: 62 */     this.mimeType = mimeType;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getFileName()
/*  40:    */   {
/*  41: 66 */     if ((this.fileName == null) && (this.file != null) && (this.file.exists())) {
/*  42: 67 */       this.fileName = this.file.getName();
/*  43:    */     }
/*  44: 69 */     return this.fileName;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public String getMimeType()
/*  48:    */     throws IOException
/*  49:    */   {
/*  50: 73 */     if (this.mimeType == null) {
/*  51: 74 */       this.mimeType = AlipayUtils.getMimeType(getContent());
/*  52:    */     }
/*  53: 76 */     return this.mimeType;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public byte[] getContent()
/*  57:    */     throws IOException
/*  58:    */   {
/*  59: 80 */     if ((this.content == null) && (this.file != null) && (this.file.exists()))
/*  60:    */     {
/*  61: 81 */       InputStream in = null;
/*  62: 82 */       ByteArrayOutputStream out = null;
/*  63:    */       try
/*  64:    */       {
/*  65: 85 */         in = new FileInputStream(this.file);
/*  66: 86 */         out = new ByteArrayOutputStream();
/*  67:    */         int ch;
/*  68: 88 */         while ((ch = in.read()) != -1) {
/*  69: 89 */           out.write(ch);
/*  70:    */         }
/*  71: 91 */         this.content = out.toByteArray();
/*  72:    */       }
/*  73:    */       finally
/*  74:    */       {
/*  75: 93 */         if (out != null) {
/*  76: 94 */           out.close();
/*  77:    */         }
/*  78: 96 */         if (in != null) {
/*  79: 97 */           in.close();
/*  80:    */         }
/*  81:    */       }
/*  82:    */     }
/*  83:101 */     return this.content;
/*  84:    */   }
/*  85:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.FileItem
 * JD-Core Version:    0.7.0.1
 */