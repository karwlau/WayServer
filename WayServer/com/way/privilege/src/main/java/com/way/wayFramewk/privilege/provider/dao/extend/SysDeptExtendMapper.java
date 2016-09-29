package com.way.wayFramewk.privilege.provider.dao.extend;

import com.way.framework.model.Pagination;
import com.way.wayFramewk.privilege.entity.SysDept;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysDeptExtendMapper {
	List<SysDept> selectByPage(@Param("page") Pagination<SysDept> page, @Param("info") SysDept info);
}