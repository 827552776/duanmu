package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.AccessStockMapper;
import com.louis.kitty.admin.model.AccessStock;
import com.louis.kitty.admin.model.TrStockManage;
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
        if(record.getId() == null || record.getId() == 0) {
            return accessStockMapper.insertSelective(record);
        }
        return accessStockMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(AccessStock record) {
        return accessStockMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<AccessStock> records) {
        for(AccessStock record:records){
            delete(record);
        }
        return 1;
    }

    @Override
    public AccessStock findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("name");
        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("type");
        ColumnFilter columnFilter2 = pageRequest.getColumnFilter("xiType");
        ColumnFilter columnFilter3 = pageRequest.getColumnFilter("qianTime");
        ColumnFilter columnFilter4 = pageRequest.getColumnFilter("houTime");
//        System.out.println(columnFilter.getValue());
//        System.out.println(columnFilter1.getValue());
//        System.out.println(columnFilter2 .getValue());
//        System.out.println(columnFilter3 .getValue());
//        System.out.println(columnFilter4.getValue());
        if(columnFilter != null && columnFilter1 != null && columnFilter2 != null) {
            return MybatisPageHelper.findPage(pageRequest, accessStockMapper, "findPageByName", columnFilter.getValue(),columnFilter1.getValue(),columnFilter2.getValue(),columnFilter3.getValue(),columnFilter4.getValue());
        }else {
            if(columnFilter3 != null && columnFilter4 != null){
                return MybatisPageHelper.findPage(pageRequest, accessStockMapper, "findPageByName", columnFilter.getValue(),columnFilter1.getValue(),columnFilter2.getValue(),columnFilter3.getValue(),columnFilter4.getValue());
            }
            return MybatisPageHelper.findPage(pageRequest, accessStockMapper);
        }

    }

    @Override
    public PageResult findPageAb(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("name");
        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("type");
        ColumnFilter columnFilter2 = pageRequest.getColumnFilter("xiType");
        ColumnFilter columnFilter3 = pageRequest.getColumnFilter("modeBy");
        ColumnFilter columnFilter4 = pageRequest.getColumnFilter("qianTime");
        ColumnFilter columnFilter5 = pageRequest.getColumnFilter("houTime");
        if(columnFilter != null && columnFilter1 != null && columnFilter2 !=null && columnFilter3 != null) {
            return MybatisPageHelper.findPageAb(pageRequest, accessStockMapper, "findPageByNameAndType", columnFilter.getValue(),columnFilter1.getValue(),columnFilter2.getValue(),
                    columnFilter3.getValue(),columnFilter4.getValue(),columnFilter5.getValue());
        } else {
            if( columnFilter4 !=null && columnFilter5 != null){
                return MybatisPageHelper.findPageAb(pageRequest, accessStockMapper, "findPageByNameAndType", columnFilter.getValue(),columnFilter1.getValue(),columnFilter2.getValue(),
                        columnFilter3.getValue(),columnFilter4.getValue(),columnFilter5.getValue());
            }
            return MybatisPageHelper.findPageAb(pageRequest, accessStockMapper);
        }

    }

    @Override
    public PageResult findPage1(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("name");
        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("type");
        ColumnFilter columnFilter2 = pageRequest.getColumnFilter("xiType");
        ColumnFilter columnFilter3 = pageRequest.getColumnFilter("modeBy");
        ColumnFilter columnFilter4 = pageRequest.getColumnFilter("qianTime");
        ColumnFilter columnFilter5 = pageRequest.getColumnFilter("houTime");
        if(columnFilter != null && columnFilter1 != null) {
            return MybatisPageHelper.findPage1(pageRequest, accessStockMapper, "findPageByNameAnd", columnFilter.getValue(),columnFilter1.getValue(),columnFilter2.getValue(),
                    columnFilter3.getValue(),columnFilter4.getValue(),columnFilter5.getValue());
        } else {
            if( columnFilter2 !=null && columnFilter3 != null){
                return MybatisPageHelper.findPage1(pageRequest, accessStockMapper, "findPageByNameAnd", columnFilter.getValue(),columnFilter1.getValue(),columnFilter2.getValue(),
                        columnFilter3.getValue(),columnFilter4.getValue(),columnFilter5.getValue());
            }
            return MybatisPageHelper.findPage1(pageRequest, accessStockMapper);
        }
    }
}
