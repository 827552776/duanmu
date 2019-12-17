package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.WeldingManageMapper;
import com.louis.kitty.admin.model.WeldingManage;
import com.louis.kitty.admin.sevice.WeldingManageService;
import com.louis.kitty.core.page.ColumnFilter;
import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeldingManageServiceImpl implements WeldingManageService {
   @Autowired
   private WeldingManageMapper weldingManageMapper;
   @Override
    public int save(WeldingManage record) {
        if(record.getId() == null || record.getId() == 0) {
            return weldingManageMapper.insertSelective(record);
        }
        return weldingManageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(WeldingManage record) {
        return 0;
    }

    @Override
    public int delete(List<WeldingManage> records) {
        return 0;
    }

    @Override
    public WeldingManage findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("label");
        if(columnFilter != null) {
            return MybatisPageHelper.findPage(pageRequest, weldingManageMapper, "findPageByLabel", columnFilter.getValue());
        }
        return MybatisPageHelper.findPage(pageRequest, weldingManageMapper);
    }

    @Override
    public PageResult findPageAb(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("label");
        if(columnFilter != null) {
            return MybatisPageHelper.findPageAb(pageRequest, weldingManageMapper, "findPageByLabel", columnFilter.getValue());
        }
        return MybatisPageHelper.findPageAb(pageRequest, weldingManageMapper);
    }
}
