package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.AccessStockMapper;
import com.louis.kitty.admin.model.AccessStock;
import com.louis.kitty.admin.sevice.AccessStockService;
import com.louis.kitty.core.page.ColumnFilter;
import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessStockServiceImpl implements AccessStockService {
    @Autowired
    private AccessStockMapper accessStockMapper;
    @Override
    public int save(AccessStock record) {
        return 0;
    }

    @Override
    public int delete(AccessStock record) {
        return 0;
    }

    @Override
    public int delete(List<AccessStock> records) {
        return 0;
    }

    @Override
    public AccessStock findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("label");
        if(columnFilter != null) {
            return MybatisPageHelper.findPage(pageRequest, accessStockMapper, "findPageByLabel", columnFilter.getValue());
        }
        return MybatisPageHelper.findPage(pageRequest, accessStockMapper);
    }
}
