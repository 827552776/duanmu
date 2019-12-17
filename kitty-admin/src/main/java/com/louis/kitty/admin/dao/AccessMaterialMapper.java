package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.AccessMaterial;
import com.louis.kitty.admin.model.AccessStock;

import java.util.List;

public interface AccessMaterialMapper {
    List<AccessMaterial> findPage();
    int insertSelective(AccessMaterial record);

    int updateByPrimaryKeySelective(AccessMaterial record);
}
