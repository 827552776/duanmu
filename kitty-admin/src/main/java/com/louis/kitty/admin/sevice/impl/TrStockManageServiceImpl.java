package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.TrStockManageMapper;
import com.louis.kitty.admin.model.TrStockManage;
import com.louis.kitty.admin.sevice.TrSrockManageService;
import com.louis.kitty.core.page.ColumnFilter;
import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrStockManageServiceImpl implements TrSrockManageService {
   @Autowired
   private TrStockManageMapper trStockManageMapper;
   @Override
    public int save(TrStockManage record) {
        if(record.getId() == null || record.getId() == 0) {
            return trStockManageMapper.insertSelective(record);
        }
        return trStockManageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(TrStockManage record) {
        return 0;
    }

    @Override
    public int delete(List<TrStockManage> records) {
        return 0;
    }

    @Override
    public TrStockManage findById(Long id) {
        return null;
    }


    @Override
    public PageResult findPage(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("label");
        if(columnFilter != null) {
            return MybatisPageHelper.findPage(pageRequest, trStockManageMapper, "findPageByLabel", columnFilter.getValue());
        }
        return MybatisPageHelper.findPage(pageRequest, trStockManageMapper);
    }
}
