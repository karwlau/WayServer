/*   1:    */ package com.alipay.api.request;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayUploadRequest;
/*   4:    */ import com.alipay.api.FileItem;
/*   5:    */ import com.alipay.api.internal.util.AlipayHashMap;
/*   6:    */ import com.alipay.api.response.AlipayZdatafrontDatatransferedFileuploadResponse;
/*   7:    */ import java.util.HashMap;
/*   8:    */ import java.util.Map;
/*   9:    */ 
/*  10:    */ public class AlipayZdatafrontDatatransferedFileuploadRequest
/*  11:    */   implements AlipayUploadRequest<AlipayZdatafrontDatatransferedFileuploadResponse>
/*  12:    */ {
/*  13:    */   private AlipayHashMap udfParams;
/*  14: 20 */   private String apiVersion = "1.0";
/*  15:    */   private String columns;
/*  16:    */   private FileItem file;
/*  17:    */   private String fileDescription;
/*  18:    */   private String fileDigest;
/*  19:    */   private String fileType;
/*  20:    */   private String primaryKey;
/*  21:    */   private Long records;
/*  22:    */   private String typeId;
/*  23:    */   private String terminalType;
/*  24:    */   private String terminalInfo;
/*  25:    */   private String prodCode;
/*  26:    */   private String notifyUrl;
/*  27:    */   
/*  28:    */   public void setColumns(String columns)
/*  29:    */   {
/*  30: 63 */     this.columns = columns;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public String getColumns()
/*  34:    */   {
/*  35: 66 */     return this.columns;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void setFile(FileItem file)
/*  39:    */   {
/*  40: 70 */     this.file = file;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public FileItem getFile()
/*  44:    */   {
/*  45: 73 */     return this.file;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void setFileDescription(String fileDescription)
/*  49:    */   {
/*  50: 77 */     this.fileDescription = fileDescription;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public String getFileDescription()
/*  54:    */   {
/*  55: 80 */     return this.fileDescription;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void setFileDigest(String fileDigest)
/*  59:    */   {
/*  60: 84 */     this.fileDigest = fileDigest;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public String getFileDigest()
/*  64:    */   {
/*  65: 87 */     return this.fileDigest;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void setFileType(String fileType)
/*  69:    */   {
/*  70: 91 */     this.fileType = fileType;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public String getFileType()
/*  74:    */   {
/*  75: 94 */     return this.fileType;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void setPrimaryKey(String primaryKey)
/*  79:    */   {
/*  80: 98 */     this.primaryKey = primaryKey;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public String getPrimaryKey()
/*  84:    */   {
/*  85:101 */     return this.primaryKey;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void setRecords(Long records)
/*  89:    */   {
/*  90:105 */     this.records = records;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public Long getRecords()
/*  94:    */   {
/*  95:108 */     return this.records;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void setTypeId(String typeId)
/*  99:    */   {
/* 100:112 */     this.typeId = typeId;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String getTypeId()
/* 104:    */   {
/* 105:115 */     return this.typeId;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public String getNotifyUrl()
/* 109:    */   {
/* 110:123 */     return this.notifyUrl;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void setNotifyUrl(String notifyUrl)
/* 114:    */   {
/* 115:127 */     this.notifyUrl = notifyUrl;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getApiVersion()
/* 119:    */   {
/* 120:131 */     return this.apiVersion;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void setApiVersion(String apiVersion)
/* 124:    */   {
/* 125:134 */     this.apiVersion = apiVersion;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void setTerminalType(String terminalType)
/* 129:    */   {
/* 130:138 */     this.terminalType = terminalType;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public String getTerminalType()
/* 134:    */   {
/* 135:142 */     return this.terminalType;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void setTerminalInfo(String terminalInfo)
/* 139:    */   {
/* 140:146 */     this.terminalInfo = terminalInfo;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public String getTerminalInfo()
/* 144:    */   {
/* 145:150 */     return this.terminalInfo;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public String getProdCode()
/* 149:    */   {
/* 150:154 */     return this.prodCode;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void setProdCode(String prodCode)
/* 154:    */   {
/* 155:158 */     this.prodCode = prodCode;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public String getApiMethodName()
/* 159:    */   {
/* 160:162 */     return "alipay.zdatafront.datatransfered.fileupload";
/* 161:    */   }
/* 162:    */   
/* 163:    */   public Map<String, String> getTextParams()
/* 164:    */   {
/* 165:166 */     AlipayHashMap txtParams = new AlipayHashMap();
/* 166:167 */     txtParams.put("columns", this.columns);
/* 167:168 */     txtParams.put("file_description", this.fileDescription);
/* 168:169 */     txtParams.put("file_digest", this.fileDigest);
/* 169:170 */     txtParams.put("file_type", this.fileType);
/* 170:171 */     txtParams.put("primary_key", this.primaryKey);
/* 171:172 */     txtParams.put("records", this.records);
/* 172:173 */     txtParams.put("type_id", this.typeId);
/* 173:174 */     if (this.udfParams != null) {
/* 174:175 */       txtParams.putAll(this.udfParams);
/* 175:    */     }
/* 176:177 */     return txtParams;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void putOtherTextParam(String key, String value)
/* 180:    */   {
/* 181:181 */     if (this.udfParams == null) {
/* 182:182 */       this.udfParams = new AlipayHashMap();
/* 183:    */     }
/* 184:184 */     this.udfParams.put(key, value);
/* 185:    */   }
/* 186:    */   
/* 187:    */   public Map<String, FileItem> getFileParams()
/* 188:    */   {
/* 189:188 */     Map<String, FileItem> params = new HashMap();
/* 190:189 */     params.put("file", this.file);
/* 191:190 */     return params;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public Class<AlipayZdatafrontDatatransferedFileuploadResponse> getResponseClass()
/* 195:    */   {
/* 196:194 */     return AlipayZdatafrontDatatransferedFileuploadResponse.class;
/* 197:    */   }
/* 198:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.request.AlipayZdatafrontDatatransferedFileuploadRequest
 * JD-Core Version:    0.7.0.1
 */