package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.AccessStock;

import java.util.List;

public interface AccessStockMapper {
    List<AccessStock> findPage();
}
