package com.louis.kitty.admin.dao;



import com.louis.kitty.admin.model.ShenHe;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShenHeMapper {
    int deleteByPrimaryKey(Long id);
    List<ShenHe> findPage();
    int insertSelective(ShenHe record);
    int updateByPrimaryKeySelective(ShenHe record);
    List<ShenHe> findPageByNameAndSource(@Param(value = "name") String name);
}
