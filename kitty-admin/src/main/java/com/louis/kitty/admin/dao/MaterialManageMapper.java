package com.louis.kitty.admin.dao;



import com.louis.kitty.admin.model.MaterialManage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MaterialManageMapper {
    int deleteByPrimaryKey(Long id);
    List<MaterialManage> findPage();
    List<MaterialManage> findPageZI();
    List<MaterialManage> findPageAb();
    int insertSelective(MaterialManage record);

    int updateByPrimaryKeySelective(MaterialManage record);
    List<MaterialManage> findPageByNameAndmName(@Param(value="name") String name,@Param(value="mName") String mName,
                                                @Param(value="com") String com);
    List<MaterialManage> findPageByNameAndCom(@Param(value="name") String name,@Param(value="com") String com);
    List<MaterialManage> findPageByName(@Param(value="name") String name,@Param(value="com") String com);
    List<MaterialManage> queryTogeter(String id);
}
