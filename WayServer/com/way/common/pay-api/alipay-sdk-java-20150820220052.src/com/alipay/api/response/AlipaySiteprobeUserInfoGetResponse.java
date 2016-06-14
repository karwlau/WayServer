/*   1:    */ package com.alipay.api.response;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayResponse;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ 
/*   6:    */ public class AlipaySiteprobeUserInfoGetResponse
/*   7:    */   extends AlipayResponse
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = 7347552486855242948L;
/*  10:    */   @ApiField("adv_key")
/*  11:    */   private String advKey;
/*  12:    */   @ApiField("code")
/*  13:    */   private String code;
/*  14:    */   @ApiField("id_card")
/*  15:    */   private String idCard;
/*  16:    */   @ApiField("msg")
/*  17:    */   private String msg;
/*  18:    */   @ApiField("open_id_1")
/*  19:    */   private String openId1;
/*  20:    */   @ApiField("open_id_2")
/*  21:    */   private String openId2;
/*  22:    */   @ApiField("phone")
/*  23:    */   private String phone;
/*  24:    */   
/*  25:    */   public void setAdvKey(String advKey)
/*  26:    */   {
/*  27: 60 */     this.advKey = advKey;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public String getAdvKey()
/*  31:    */   {
/*  32: 63 */     return this.advKey;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void setCode(String code)
/*  36:    */   {
/*  37: 67 */     this.code = code;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public String getCode()
/*  41:    */   {
/*  42: 70 */     return this.code;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void setIdCard(String idCard)
/*  46:    */   {
/*  47: 74 */     this.idCard = idCard;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String getIdCard()
/*  51:    */   {
/*  52: 77 */     return this.idCard;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void setMsg(String msg)
/*  56:    */   {
/*  57: 81 */     this.msg = msg;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public String getMsg()
/*  61:    */   {
/*  62: 84 */     return this.msg;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void setOpenId1(String openId1)
/*  66:    */   {
/*  67: 88 */     this.openId1 = openId1;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public String getOpenId1()
/*  71:    */   {
/*  72: 91 */     return this.openId1;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void setOpenId2(String openId2)
/*  76:    */   {
/*  77: 95 */     this.openId2 = openId2;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String getOpenId2()
/*  81:    */   {
/*  82: 98 */     return this.openId2;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void setPhone(String phone)
/*  86:    */   {
/*  87:102 */     this.phone = phone;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getPhone()
/*  91:    */   {
/*  92:105 */     return this.phone;
/*  93:    */   }
/*  94:    */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipaySiteprobeUserInfoGetResponse
 * JD-Core Version:    0.7.0.1
 */