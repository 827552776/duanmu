package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.OrderMain;

import java.util.List;

public interface OrderMainMapper {
    int insert(OrderMain record);
    List<OrderMain> select(Long id);
    int update(OrderMain record);
}
