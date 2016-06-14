/*   1:    */ package com.alipay.api;
/*   2:    */ 
/*   3:    */ import com.alipay.api.internal.mapping.ApiField;
/*   4:    */ import com.alipay.api.internal.util.StringUtils;
/*   5:    */ import java.io.Serializable;
/*   6:    */ import java.util.Map;
/*   7:    */ 
/*   8:    */ public abstract class AlipayResponse
/*   9:    */   implements Serializable
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 5014379068811962022L;
/*  12:    */   @ApiField("code")
/*  13:    */   private String code;
/*  14:    */   @ApiField("msg")
/*  15:    */   private String msg;
/*  16:    */   @ApiField("sub_code")
/*  17:    */   private String subCode;
/*  18:    */   @ApiField("sub_msg")
/*  19:    */   private String subMsg;
/*  20:    */   private String body;
/*  21:    */   private Map<String, String> params;
/*  22:    */   
/*  23:    */   @Deprecated
/*  24:    */   public String getErrorCode()
/*  25:    */   {
/*  26: 40 */     return getCode();
/*  27:    */   }
/*  28:    */   
/*  29:    */   @Deprecated
/*  30:    */   public void setErrorCode(String errorCode)
/*  31:    */   {
/*  32: 50 */     setCode(errorCode);
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String getCode()
/*  36:    */   {
/*  37: 59 */     return this.code;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void setCode(String code)
/*  41:    */   {
/*  42: 68 */     this.code = code;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String getMsg()
/*  46:    */   {
/*  47: 72 */     return this.msg;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void setMsg(String msg)
/*  51:    */   {
/*  52: 76 */     this.msg = msg;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public String getSubCode()
/*  56:    */   {
/*  57: 80 */     return this.subCode;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void setSubCode(String subCode)
/*  61:    */   {
/*  62: 84 */     this.subCode = subCode;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String getSubMsg()
/*  66:    */   {
/*  67: 88 */     return this.subMsg;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void setSubMsg(String subMsg)
/*  71:    */   {
/*  72: 92 */     this.subMsg = subMsg;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String getBody()
/*  76:    */   {
/*  77: 96 */     return this.body;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void setBody(String body)
/*  81:    */   {
/*  82:100 */     this.body = body;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public Map<String, String> getParams()
/*  86:    */   {
/*  87:104 */     return this.params;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void setParams(Map<String, String> params)
/*  91:    */   {
/*  92:108 */     this.params = params;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public boolean isSuccess()
/*  96:    */   {
/*  97:112 */     return StringUtils.isEmpty(this.subCode);
/*  98:    */   }
/*  99:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.AlipayResponse
 * JD-Core Version:    0.7.0.1
 */