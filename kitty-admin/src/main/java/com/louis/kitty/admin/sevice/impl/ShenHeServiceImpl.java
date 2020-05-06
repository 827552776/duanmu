package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.ShenHeMapper;
import com.louis.kitty.admin.dao.WeldingManageMapper;
import com.louis.kitty.admin.model.ShenHe;
import com.louis.kitty.admin.model.WeldingManage;
import com.louis.kitty.admin.sevice.ShenHeService;
import com.louis.kitty.admin.sevice.WeldingManageService;
import com.louis.kitty.core.page.ColumnFilter;
import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShenHeServiceImpl implements ShenHeService {
   @Autowired
   private ShenHeMapper shenHeMapper;
   @Override
    public int save(ShenHe record) {
        if(record.getId() == null || record.getId() == 0) {
            return shenHeMapper.insertSelective(record);
        }
        return shenHeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(ShenHe record) {
        return shenHeMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<ShenHe> records) {
        for(ShenHe record:records){
            delete(record);
        }
        return 1;
    }

    @Override
    public ShenHe findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("name");
//        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("source");
        if(columnFilter != null) {
            return MybatisPageHelper.findPage(pageRequest, shenHeMapper, "findPageByNameAndSource", columnFilter.getValue());
        }
        return MybatisPageHelper.findPage(pageRequest, shenHeMapper);
    }

}
