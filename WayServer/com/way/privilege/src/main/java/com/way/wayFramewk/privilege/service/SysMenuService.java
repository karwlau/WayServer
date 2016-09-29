package com.way.wayFramewk.privilege.service;

import com.way.framework.model.Pagination;
import com.way.wayFramewk.privilege.entity.SysMenu;

public interface SysMenuService {
    Pagination<SysMenu> findByPage(Pagination<SysMenu> page, SysMenu record);

    SysMenu getById(Long id);

    SysMenu save(SysMenu record);

    SysMenu update(SysMenu record);

    Long delete(Long id);
}