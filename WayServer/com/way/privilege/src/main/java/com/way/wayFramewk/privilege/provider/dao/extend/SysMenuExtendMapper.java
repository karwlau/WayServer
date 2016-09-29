package com.way.wayFramewk.privilege.provider.dao.extend;

import com.way.framework.model.Pagination;
import com.way.wayFramewk.privilege.entity.SysMenu;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysMenuExtendMapper {
    List<SysMenu> selectByPage(@Param("page") Pagination<SysMenu> page, @Param("info") SysMenu info);
}