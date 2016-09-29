package com.way.wayFramewk.privilege.entity;

import java.io.Serializable;

public class SysUserRole implements Serializable {
    private Long userid;

    private Long roleid;

    private static final long serialVersionUID = 1L;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }
}