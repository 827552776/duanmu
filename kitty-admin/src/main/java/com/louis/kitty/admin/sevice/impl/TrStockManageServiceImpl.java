package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.TrStockManageMapper;
import com.louis.kitty.admin.model.MaterialManage;
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
        return trStockManageMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<TrStockManage> records) {
        for(TrStockManage record:records){
            delete(record);
        }
        return 1;
    }

    @Override
    public TrStockManage findById(Long id) {
        return null;
    }


    @Override
    public PageResult findPage(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("trName");
        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("trType");
        ColumnFilter columnFilter2 = pageRequest.getColumnFilter("trSubdivide");
        if(columnFilter != null && columnFilter1 != null) {
            return MybatisPageHelper.findPage(pageRequest, trStockManageMapper, "findPageByNameAndType", columnFilter.getValue(),columnFilter1.getValue(),columnFilter2.getValue());
        } else {
            if(columnFilter2 != null){
                return MybatisPageHelper.findPage(pageRequest, trStockManageMapper, "findPageByNameAndType", columnFilter.getValue(),columnFilter1.getValue(),columnFilter2.getValue());
            }
            return MybatisPageHelper.findPage(pageRequest, trStockManageMapper);
        }

    }

    @Override
    public PageResult findPageAb(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("trName");
//        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("intTime");
//        ColumnFilter columnFilter2 = pageRequest.getColumnFilter("endDate");
        if( columnFilter !=null) {
            return MybatisPageHelper.findPageAb(pageRequest, trStockManageMapper, "findPageByTrName", columnFilter.getValue());
        }
        return MybatisPageHelper.findPageAb(pageRequest, trStockManageMapper);
    }
}
