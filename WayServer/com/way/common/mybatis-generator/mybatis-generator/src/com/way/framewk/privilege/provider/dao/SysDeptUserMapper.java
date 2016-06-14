package com.way.framewk.privilege.provider.dao;

import com.way.framewk.privilege.entity.SysDeptUser;
import com.way.framewk.privilege.entity.SysDeptUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDeptUserMapper {
    int countByExample(SysDeptUserExample example);

    int deleteByExample(SysDeptUserExample example);

    int insert(SysDeptUser record);

    int insertSelective(SysDeptUser record);

    List<SysDeptUser> selectByExample(SysDeptUserExample example);

    int updateByExampleSelective(@Param("record") SysDeptUser record, @Param("example") SysDeptUserExample example);

    int updateByExample(@Param("record") SysDeptUser record, @Param("example") SysDeptUserExample example);
}