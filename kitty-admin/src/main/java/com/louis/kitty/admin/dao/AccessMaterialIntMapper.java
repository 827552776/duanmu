package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.AccessMaterial;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccessMaterialIntMapper {
    List<AccessMaterial> findPage1();
    List<AccessMaterial> findPage();
    int insertSelective(AccessMaterial record);

    int updateByPrimaryKeySelective(AccessMaterial record);
    List<AccessMaterial> findPageByType(@Param(value="type") String type);
}
