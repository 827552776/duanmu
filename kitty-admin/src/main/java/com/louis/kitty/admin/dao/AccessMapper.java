package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.AccessStock;

import java.util.List;

public interface AccessMapper {
    List<AccessStock> findPage();
    int insertSelective(AccessStock record);

    int updateByPrimaryKeySelective(AccessStock record);
}
