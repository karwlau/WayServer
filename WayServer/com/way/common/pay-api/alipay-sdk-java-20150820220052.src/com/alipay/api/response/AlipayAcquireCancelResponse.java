/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipayAcquireCancelResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 8492827227381786418L;
/*  10:    */   @ApiField("detail_error_code")
/*  11:    */   private String detailErrorCode;
/*  12:    */   @ApiField("detail_error_des")
/*  13:    */   private String detailErrorDes;
/*  14:    */   @ApiField("out_trade_no")
/*  15:    */   private String outTradeNo;
/*  16:    */   @ApiField("result_code")
/*  17:    */   private String resultCode;
/*  18:    */   @ApiField("retry_flag")
/*  19:    */   private String retryFlag;
/*  20:    */   @ApiField("trade_no")
/*  21:    */   private String tradeNo;
/*  22:    */   
/*  23:    */   public void setDetailErrorCode(String detailErrorCode)
/*  24:    */   {
/*  25: 62 */     this.detailErrorCode = detailErrorCode;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public String getDetailErrorCode()
/*  29:    */   {
/*  30: 65 */     return this.detailErrorCode;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setDetailErrorDes(String detailErrorDes)
/*  34:    */   {
/*  35: 69 */     this.detailErrorDes = detailErrorDes;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String getDetailErrorDes()
/*  39:    */   {
/*  40: 72 */     return this.detailErrorDes;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setOutTradeNo(String outTradeNo)
/*  44:    */   {
/*  45: 76 */     this.outTradeNo = outTradeNo;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public String getOutTradeNo()
/*  49:    */   {
/*  50: 79 */     return this.outTradeNo;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setResultCode(String resultCode)
/*  54:    */   {
/*  55: 83 */     this.resultCode = resultCode;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getResultCode()
/*  59:    */   {
/*  60: 86 */     return this.resultCode;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setRetryFlag(String retryFlag)
/*  64:    */   {
/*  65: 90 */     this.retryFlag = retryFlag;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getRetryFlag()
/*  69:    */   {
/*  70: 93 */     return this.retryFlag;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setTradeNo(String tradeNo)
/*  74:    */   {
/*  75: 97 */     this.tradeNo = tradeNo;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getTradeNo()
/*  79:    */   {
/*  80:100 */     return this.tradeNo;
/*  81:    */   }
/*  82:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayAcquireCancelResponse
 * JD-Core Version:    0.7.0.1
 */