/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.domain.Coupon;
/*   5:    */ import com.alipay.api.internal.mapping.ApiField;
/*   6:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class AlipayMemberCouponQuerylistResponse
/*  10:    */   extends AlipayResponse
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 5482621199397187837L;
/*  13:    */   @ApiListField("coupon_list")
/*  14:    */   @ApiField("coupon")
/*  15:    */   private List<Coupon> couponList;
/*  16:    */   @ApiField("error_code")
/*  17:    */   private String errorCode;
/*  18:    */   @ApiField("error_msg")
/*  19:    */   private String errorMsg;
/*  20:    */   @ApiField("list_size")
/*  21:    */   private String listSize;
/*  22:    */   @ApiField("success_code")
/*  23:    */   private String successCode;
/*  24:    */   @ApiField("total_num")
/*  25:    */   private String totalNum;
/*  26:    */   
/*  27:    */   public void setCouponList(List<Coupon> couponList)
/*  28:    */   {
/*  29: 64 */     this.couponList = couponList;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public List<Coupon> getCouponList()
/*  33:    */   {
/*  34: 67 */     return this.couponList;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void setErrorCode(String errorCode)
/*  38:    */   {
/*  39: 71 */     this.errorCode = errorCode;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public String getErrorCode()
/*  43:    */   {
/*  44: 74 */     return this.errorCode;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setErrorMsg(String errorMsg)
/*  48:    */   {
/*  49: 78 */     this.errorMsg = errorMsg;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String getErrorMsg()
/*  53:    */   {
/*  54: 81 */     return this.errorMsg;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setListSize(String listSize)
/*  58:    */   {
/*  59: 85 */     this.listSize = listSize;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public String getListSize()
/*  63:    */   {
/*  64: 88 */     return this.listSize;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setSuccessCode(String successCode)
/*  68:    */   {
/*  69: 92 */     this.successCode = successCode;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public String getSuccessCode()
/*  73:    */   {
/*  74: 95 */     return this.successCode;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setTotalNum(String totalNum)
/*  78:    */   {
/*  79: 99 */     this.totalNum = totalNum;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public String getTotalNum()
/*  83:    */   {
/*  84:102 */     return this.totalNum;
/*  85:    */   }
/*  86:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipayMemberCouponQuerylistResponse
 * JD-Core Version:    0.7.0.1
 */