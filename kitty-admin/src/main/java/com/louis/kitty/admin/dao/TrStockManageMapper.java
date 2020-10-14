package com.louis.kitty.admin.dao;


import com.louis.kitty.admin.model.TrStockManage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TrStockManageMapper {
    List<TrStockManage> findPage();
    List<TrStockManage> findPageAb();
    int deleteByPrimaryKey(Long id);
    int insertSelective(TrStockManage record);
    int updateByPrimaryKeySelective(TrStockManage record);
    List<TrStockManage> findPageByNameAndType(@Param(value="trName") String trName, @Param(value="trType") String trType, @Param(value="trSubdivide") String trSubdivide);
    List<TrStockManage> findPageByTrName(@Param(value = "trName") String trName);
}
