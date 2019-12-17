package com.louis.kitty.admin.dao;



import com.louis.kitty.admin.model.MaterialManage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MaterialManageMapper {
    List<MaterialManage> findPage();
    List<MaterialManage> findPageAb();
    int insertSelective(MaterialManage record);

    int updateByPrimaryKeySelective(MaterialManage record);
    List<MaterialManage> findPageByNameAndmName(@Param(value="name") String name,@Param(value="mName") String mName);
}
