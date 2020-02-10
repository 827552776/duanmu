package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.WeldingManageMapper;
import com.louis.kitty.admin.model.MaterialManage;
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
        return weldingManageMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<WeldingManage> records) {
        for(WeldingManage record:records){
            delete(record);
        }
        return 1;
    }

    @Override
    public WeldingManage findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("name");
        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("source");
        if(columnFilter != null && columnFilter1 !=null) {
            return MybatisPageHelper.findPage(pageRequest, weldingManageMapper, "findPageByNameAndSource", columnFilter.getValue(),columnFilter1.getValue());
        }
        return MybatisPageHelper.findPage(pageRequest, weldingManageMapper);
    }

    @Override
    public PageResult findPageAb(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("label");
        if(columnFilter != null) {
            return MybatisPageHelper.findPageAb(pageRequest,weldingManageMapper, "", columnFilter.getValue());
        }
        return MybatisPageHelper.findPageAb(pageRequest, weldingManageMapper);
    }
}
