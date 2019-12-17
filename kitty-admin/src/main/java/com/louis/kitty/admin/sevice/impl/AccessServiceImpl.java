package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.AccessMapper;
import com.louis.kitty.admin.dao.AccessStockMapper;
import com.louis.kitty.admin.model.AccessStock;
import com.louis.kitty.admin.sevice.AccessService;
import com.louis.kitty.admin.sevice.AccessStockService;
import com.louis.kitty.core.page.ColumnFilter;
import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessServiceImpl implements AccessService {
    @Autowired
    private AccessMapper accessMapper;
    @Override
    public int save(AccessStock record) {
        if(record.getId() == null || record.getId() == 0) {
            return accessMapper.insertSelective(record);
        }
        return accessMapper.updateByPrimaryKeySelective(record);
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
            return MybatisPageHelper.findPage(pageRequest, accessMapper, "findPageByLabel", columnFilter.getValue());
        }
        return MybatisPageHelper.findPage(pageRequest, accessMapper);
    }

}
