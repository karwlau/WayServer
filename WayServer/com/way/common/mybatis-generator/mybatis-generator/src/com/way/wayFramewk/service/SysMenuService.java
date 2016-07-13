package com.way.wayFramewk.service;

public interface SysMenuService {
    Pagination findByPage(Pagination page, SysMenu info);

    SysMenu getById(Long id);

    SysMenu save(SysMenu record);

    SysMenu update(SysMenu record);

    Long delete(Long id);
}