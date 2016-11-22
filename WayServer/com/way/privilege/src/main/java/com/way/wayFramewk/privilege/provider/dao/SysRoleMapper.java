package com.way.wayFramewk.privilege.provider.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.github.pagehelper.Page;
import com.way.wayFramewk.privilege.entity.SysRole;
import com.way.wayFramewk.privilege.entity.SysRoleExample;

@Repository
public interface SysRoleMapper {
    int countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    Page<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}