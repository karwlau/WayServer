/*  1:   */ package com.alipay.api.response;
/*  2:   */ 
/*  3:   */ import com.alipay.api.AlipayResponse;
/*  4:   */ import com.alipay.api.domain.InstoreUser;
/*  5:   */ import com.alipay.api.internal.mapping.ApiField;
/*  6:   */ import com.alipay.api.internal.mapping.ApiListField;
/*  7:   */ import java.util.List;
/*  8:   */ 
/*  9:   */ public class AlipaySiteprobeInstoreUserResponse
/* 10:   */   extends AlipayResponse
/* 11:   */ {
/* 12:   */   private static final long serialVersionUID = 1413365243338352979L;
/* 13:   */   @ApiField("code")
/* 14:   */   private String code;
/* 15:   */   @ApiField("msg")
/* 16:   */   private String msg;
/* 17:   */   @ApiListField("users")
/* 18:   */   @ApiField("instore_user")
/* 19:   */   private List<InstoreUser> users;
/* 20:   */   
/* 21:   */   public void setCode(String code)
/* 22:   */   {
/* 23:40 */     this.code = code;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String getCode()
/* 27:   */   {
/* 28:43 */     return this.code;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setMsg(String msg)
/* 32:   */   {
/* 33:47 */     this.msg = msg;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public String getMsg()
/* 37:   */   {
/* 38:50 */     return this.msg;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setUsers(List<InstoreUser> users)
/* 42:   */   {
/* 43:54 */     this.users = users;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public List<InstoreUser> getUsers()
/* 47:   */   {
/* 48:57 */     return this.users;
/* 49:   */   }
/* 50:   */ }


/* Location:           D:\Server\m2\repository\com\pentahohub\nexus\alipay-sdk-java\20150820220052\alipay-sdk-java-20150820220052.jar
 * Qualified Name:     com.alipay.api.response.AlipaySiteprobeInstoreUserResponse
 * JD-Core Version:    0.7.0.1
 */