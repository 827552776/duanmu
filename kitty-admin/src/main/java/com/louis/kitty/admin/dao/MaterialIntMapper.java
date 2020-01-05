package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.AccessMaterial;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MaterialIntMapper {
    List<AccessMaterial> findPage();
    List<AccessMaterial> findPageByName(@Param(value="name") String name);
}
