package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.OrderOutMapper;
import com.louis.kitty.admin.model.OrderOut;
import com.louis.kitty.admin.sevice.OrderOutService;
import com.louis.kitty.core.page.ColumnFilter;
import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderOutServiceImpl implements OrderOutService {

    @Autowired
    private OrderOutMapper orderOutMapper;

    @Override
    public int save(OrderOut record) {
        return 0;
    }

    @Override
    public int delete(OrderOut record) {
        return 0;
    }

    @Override
    public int delete(List<OrderOut> records) {
        return 0;
    }

    @Override
    public OrderOut findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }

    @Override
    public PageResult findPageOutQuery(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("cust");
        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("mouldNm");
        if(columnFilter != null&&columnFilter1 != null) {
            return MybatisPageHelper.findPage(pageRequest,orderOutMapper,"findPageByCustAndmName",columnFilter.getValue(),columnFilter1.getValue());
        } else {
            return MybatisPageHelper.findPageOut(pageRequest, orderOutMapper);
        }
    }
}
