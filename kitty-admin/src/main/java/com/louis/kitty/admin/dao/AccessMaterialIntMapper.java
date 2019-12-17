package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.AccessMaterial;

import java.util.List;

public interface AccessMaterialIntMapper {
    List<AccessMaterial> findPage();
    int insertSelective(AccessMaterial record);

    int updateByPrimaryKeySelective(AccessMaterial record);
}
