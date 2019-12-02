package com.louis.kitty.admin.dao;


import com.louis.kitty.admin.model.TrStockManage;

import java.util.List;

public interface TrStockManageMapper {
    List<TrStockManage> findPage();

    int insertSelective(TrStockManage record);

    int updateByPrimaryKeySelective(TrStockManage record);
}
