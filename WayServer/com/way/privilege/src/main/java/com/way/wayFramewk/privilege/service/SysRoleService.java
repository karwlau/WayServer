package com.way.wayFramewk.privilege.service;

import com.way.framework.model.Pagination;
import com.way.wayFramewk.privilege.entity.SysRole;

public interface SysRoleService {
    Pagination<SysRole> findByPage(Pagination<SysRole> page, SysRole record);

    SysRole getById(Long id);

    SysRole save(SysRole record);

    SysRole update(SysRole record);

    Long delete(Long id);
}