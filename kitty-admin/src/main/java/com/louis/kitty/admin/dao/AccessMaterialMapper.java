package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.AccessMaterial;
import com.louis.kitty.admin.model.AccessStock;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccessMaterialMapper {
    List<AccessMaterial> findPage();
    int insertSelective(AccessMaterial record);
    List<AccessMaterial> findPageAb();
    List<AccessMaterial> findPageByName( @Param(value="name") String name,@Param(value="mName") String mName,@Param(value = "waixie") String waixie);
    List<AccessMaterial> findPageByLabel( @Param(value="name") String name,@Param(value="mName") String mName);
    int updateByPrimaryKeySelective(AccessMaterial record);
    int deleteByPrimaryKey(Long id);
}
