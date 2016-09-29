package com.way.wayFramewk.privilege.service;

import com.way.framework.model.Pagination;
import com.way.wayFramewk.privilege.entity.SysDept;

public interface SysDeptService {
    Pagination<SysDept> findByPage(Pagination<SysDept> page, SysDept record);

    SysDept getById(Long id);

    SysDept save(SysDept record);

    SysDept update(SysDept record);

    Long delete(Long id);
}