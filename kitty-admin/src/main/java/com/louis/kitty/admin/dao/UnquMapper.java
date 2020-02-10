package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.Unqu;

import java.util.List;

public interface UnquMapper {
    int insert(Unqu unqu);
    List<Unqu> query(Integer fId);
}
