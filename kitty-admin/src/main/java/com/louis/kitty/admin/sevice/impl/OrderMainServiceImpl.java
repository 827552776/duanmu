package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.OrderMainMapper;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.sevice.OrderMainService;
import com.louis.kitty.core.page.ColumnFilter;
import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
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
        String id = orderMain.getId();
        String temp = orderMainMapper.select(id);

        if(temp == null){
            num = orderMainMapper.insert(orderMain);
        }else{
            num = orderMainMapper.update(orderMain);
        }
        return num;
    }

    @Override
    public int delete(OrderMain record) {

        return orderMainMapper.delete(record.getId());
    }

    @Override
    public int delete(List<OrderMain> records) {
        for(OrderMain record:records){
        delete(record);
        }
        return 1;
    }

    @Override
    public OrderMain findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("cust");
        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("mouldNm");
        if(columnFilter != null&&columnFilter1 != null) {
            return MybatisPageHelper.findPage(pageRequest,orderMainMapper,"findPageByLabel",columnFilter.getValue(),columnFilter1.getValue());
        }
        return MybatisPageHelper.findPage(pageRequest,orderMainMapper);
    }
    @Override
    public int updateSts(OrderMain main) {
      String id = main.getId();
        return orderMainMapper.updateStsB(id);
    }

    @Override
    public int updateStsC(OrderMain main) {
        String id =main.getId();
        return orderMainMapper.updateStsC(id);
    }

    @Override
    public PageResult findPageAb(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("mouldNm");

        if(columnFilter.getValue() != "") {
            return MybatisPageHelper.findPage(pageRequest, orderMainMapper, "findPageAboo", columnFilter.getValue());
        }
        return MybatisPageHelper.findPageAb(pageRequest, orderMainMapper);
    }

    @Override
    public String queryPrimaryKey() {
        return orderMainMapper.selectPrimaryKey();
    }


}
