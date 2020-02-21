package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.AccessStock;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccessStockMapper {
    List<AccessStock> findPage();
    List<AccessStock> findPageAb();
    int deleteByPrimaryKey(Long id);
    int insertSelective(AccessStock record);
    List<AccessStock> findPageByNameAndType(@Param(value="name") String name, @Param(value="type") String type,@Param(value="xiType") String xiType, @Param(value="modeBy") String modeBy);
    int updateByPrimaryKeySelective(AccessStock record);
    List<AccessStock> findPageByName(@Param(value="name") String name, @Param(value="type") String type,@Param(value="xiType") String xiType);
}
