package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.AccessMaterial;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MaterialIntMapper {
    List<AccessMaterial> findPage();
    List<AccessMaterial> findPageByNameAndMName(@Param(value="name") String name,@Param(value="mName") String mName,@Param(value="com") String com,
                                                @Param(value="qianTime") String qianTime,@Param(value="houTime") String houTime);
}
