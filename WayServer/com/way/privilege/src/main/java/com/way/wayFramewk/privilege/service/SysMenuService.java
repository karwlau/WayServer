package com.way.wayFramewk.privilege.service;

import java.util.List;

import com.way.framework.model.Pagination;
import com.way.wayFramewk.privilege.entity.SysMenu;

public interface SysMenuService {
    Pagination<SysMenu> findByPage(Pagination<SysMenu> page, SysMenu record);

    SysMenu getById(Long id);

    SysMenu save(SysMenu record);

    SysMenu update(SysMenu record);

    Long delete(Long id);
    
    List<SysMenu> getSysList();
    
    List<SysMenu> getSysList(Long userId);
    
    List<SysMenu> getListByParentId(Long parentId);
    
    List<SysMenu> getListByParentIdUserId(Long parent,Long userId);
}