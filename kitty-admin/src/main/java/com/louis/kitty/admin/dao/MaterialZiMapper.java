package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.Material;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MaterialZiMapper {
    List<Material> findAll();
    List<Material> findPage();
    int insertSelective(Material record);
    List<Material> findPageByLabel(@Param(value = "label") String label);
    int updateByPrimaryKeySelective(Material record);
}
