package com.way.wayFramewk.privilege.entity;

import java.io.Serializable;

public class SysRoleMenu implements Serializable {
    private Long roleid;

    private Long menuid;

    private static final long serialVersionUID = 1L;

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public Long getMenuid() {
        return menuid;
    }

    public void setMenuid(Long menuid) {
        this.menuid = menuid;
    }
}