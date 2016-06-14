/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayAcquirePrecreateResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 3546632798185643621L;
/*  10:    */   @ApiField("detail_error_code")
/*  11:    */   private String detailErrorCode;
/*  12:    */   @ApiField("detail_error_des")
/*  13:    */   private String detailErrorDes;
/*  14:    */   @ApiField("error")
/*  15:    */   private String error;
/*  16:    */   @ApiField("is_success")
/*  17:    */   private String isSuccess;
/*  18:    */   @ApiField("out_trade_no")
/*  19:    */   private String outTradeNo;
/*  20:    */   @ApiField("pic_url")
/*  21:    */   private String picUrl;
/*  22:    */   @ApiField("qr_code")
/*  23:    */   private String qrCode;
/*  24:    */   @ApiField("result_code")
/*  25:    */   private String resultCode;
/*  26:    */   @ApiField("trade_no")
/*  27:    */   private String tradeNo;
/*  28:    */   @ApiField("voucher_type")
/*  29:    */   private String voucherType;
/*  30:    */   
/*  31:    */   public void setDetailErrorCode(String detailErrorCode)
/*  32:    */   {
/*  33: 89 */     this.detailErrorCode = detailErrorCode;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public String getDetailErrorCode()
/*  37:    */   {
/*  38: 92 */     return this.detailErrorCode;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setDetailErrorDes(String detailErrorDes)
/*  42:    */   {
/*  43: 96 */     this.detailErrorDes = detailErrorDes;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public String getDetailErrorDes()
/*  47:    */   {
/*  48: 99 */     return this.detailErrorDes;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setError(String error)
/*  52:    */   {
/*  53:103 */     this.error = error;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String getError()
/*  57:    */   {
/*  58:106 */     return this.error;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setIsSuccess(String isSuccess)
/*  62:    */   {
/*  63:110 */     this.isSuccess = isSuccess;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getIsSuccess()
/*  67:    */   {
/*  68:113 */     return this.isSuccess;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setOutTradeNo(String outTradeNo)
/*  72:    */   {
/*  73:117 */     this.outTradeNo = outTradeNo;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String getOutTradeNo()
/*  77:    */   {
/*  78:120 */     return this.outTradeNo;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setPicUrl(String picUrl)
/*  82:    */   {
/*  83:124 */     this.picUrl = picUrl;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getPicUrl()
/*  87:    */   {
/*  88:127 */     return this.picUrl;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setQrCode(String qrCode)
/*  92:    */   {
/*  93:131 */     this.qrCode = qrCode;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String getQrCode()
/*  97:    */   {
/*  98:134 */     return this.qrCode;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setResultCode(String resultCode)
/* 102:    */   {
/* 103:138 */     this.resultCode = resultCode;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public String getResultCode()
/* 107:    */   {
/* 108:141 */     return this.resultCode;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setTradeNo(String tradeNo)
/* 112:    */   {
/* 113:145 */     this.tradeNo = tradeNo;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public String getTradeNo()
/* 117:    */   {
/* 118:148 */     return this.tradeNo;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void setVoucherType(String voucherType)
/* 122:    */   {
/* 123:152 */     this.voucherType = voucherType;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public String getVoucherType()
/* 127:    */   {
/* 128:155 */     return this.voucherType;
/* 129:    */   }
/* 130:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayAcquirePrecreateResponse
 * JD-Core Version:    0.7.0.1
 */