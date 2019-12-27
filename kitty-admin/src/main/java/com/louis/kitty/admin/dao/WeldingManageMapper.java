package com.louis.kitty.admin.dao;



import com.louis.kitty.admin.model.MaterialManage;
import com.louis.kitty.admin.model.WeldingManage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WeldingManageMapper {
    List<WeldingManage> findPage();
    List<WeldingManage> findPageAb();
    int insertSelective(WeldingManage record);
    int updateByPrimaryKeySelective(WeldingManage record);
}
