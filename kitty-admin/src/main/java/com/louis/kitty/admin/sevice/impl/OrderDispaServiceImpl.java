package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.OrderDispaMapper;
import com.louis.kitty.admin.model.OrderDispa;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.sevice.OrderDispaService;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDispaServiceImpl implements OrderDispaService{
    @Autowired
    private OrderDispaMapper orderDispaMapper;
    int num = 0;
    @Override
    public int save(OrderDispa orderDispa) {
        //获取ID
        Long id = orderDispa.getId();
        //判断ID
        if(id ==  null) {
            num = orderDispaMapper.insert(orderDispa);
        }else{
            num = orderDispaMapper.update(orderDispa);
        }

        return num;
    }

    @Override
    public int delete(OrderDispa record) {
        return 0;
    }

    @Override
    public int delete(List<OrderDispa> records) {
        return 0;
    }

    @Override
    public OrderDispa findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }

    @Override
    public OrderDispa query(OrderMain orderMain) {
        String fId = orderMain.getId();
        return orderDispaMapper.query(fId);
    }
}
