package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import com.louis.kitty.admin.dao.OrderMainMapper;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.sevice.OrderMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderMainServiceImpl implements OrderMainService {
    @Autowired
    private OrderMainMapper orderMainMapper;
    int num = 0;
    @Override
    public int save(OrderMain orderMain) {
        //获取id
        Long id = orderMain.getId();
        //判断id是否为空
        if(id == null){
            num = orderMainMapper.insert(orderMain);
        }else{
            num = orderMainMapper.update(orderMain);
        }
        return num;
    }

    @Override
    public int delete(OrderMain record) {
        return 0;
    }

    @Override
    public int delete(List<OrderMain> records) {
        return 0;
    }

    @Override
    public OrderMain findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
