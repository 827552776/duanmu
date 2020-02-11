package com.louis.kitty.admin.sevice.impl;


import com.louis.kitty.admin.dao.WeldingIntOutMapper;
import com.louis.kitty.admin.model.Welding;
import com.louis.kitty.admin.sevice.WeldingIntOutService;
import com.louis.kitty.core.page.ColumnFilter;
import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeldingIntOutServiceImpl implements WeldingIntOutService {
    @Autowired
    private WeldingIntOutMapper weldingIntOutMapper;
    @Override
    public int save(Welding record) {
        if(record.getId() == null || record.getId() == 0) {
            return weldingIntOutMapper.insertSelective(record);
        }
        return weldingIntOutMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(Welding record) {
        return 0;
    }

    @Override
    public int delete(List<Welding> records) {
        return 0;
    }

    @Override
    public Welding findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("name");
//        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("intTime");
//        ColumnFilter columnFilter2 = pageRequest.getColumnFilter("endDate");
        if( columnFilter !=null) {
            return MybatisPageHelper.findPage(pageRequest, weldingIntOutMapper, "findPageByName", columnFilter.getValue());
        }
        return MybatisPageHelper.findPage(pageRequest, weldingIntOutMapper);
    }
    @Override
    public PageResult findPage1(PageRequest pageRequest){
        ColumnFilter columnFilter = pageRequest.getColumnFilter("type");
        if(columnFilter != null) {
            return MybatisPageHelper.findPage1(pageRequest, weldingIntOutMapper, "findPageByType", columnFilter.getValue());
        }
        return MybatisPageHelper.findPage1(pageRequest, weldingIntOutMapper);
    }

    @Override
    public PageResult findPageAb(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("type");
        if(columnFilter != null) {
            return MybatisPageHelper.findPageAb(pageRequest, weldingIntOutMapper, "findPageByType", columnFilter.getValue());
        }
        return MybatisPageHelper.findPageAb(pageRequest, weldingIntOutMapper);
    }

    @Override
    public PageResult findPageT(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("type");
        if(columnFilter != null) {
            return MybatisPageHelper.findPageT(pageRequest, weldingIntOutMapper, "findPageByType", columnFilter.getValue());
        }
        return MybatisPageHelper.findPageT(pageRequest, weldingIntOutMapper);
    }

}
