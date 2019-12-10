package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.BCustomerMapper;
import com.louis.kitty.admin.model.BCustomer;
import com.louis.kitty.admin.sevice.BCustomerService;
import com.louis.kitty.core.page.ColumnFilter;
import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BCustomerServiceImpl implements BCustomerService {
    @Autowired
    private BCustomerMapper bCustomerMapper;
    @Override
    public int save(BCustomer record) {
        return 0;
    }

    @Override
    public int delete(BCustomer record) {
        return 0;
    }

    @Override
    public int delete(List<BCustomer> records) {
        return 0;
    }

    @Override
    public BCustomer findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("label");
        if(columnFilter != null) {
            return MybatisPageHelper.findPage(pageRequest, bCustomerMapper, "findPageByLabel", columnFilter.getValue());
        }
        return MybatisPageHelper.findPage(pageRequest, bCustomerMapper);
    }

    @Override
    public List<BCustomer> findByLable(String lable) {
        return null;
    }

    @Override
    public List<BCustomer> query() {
        return bCustomerMapper.query();
    }
}
