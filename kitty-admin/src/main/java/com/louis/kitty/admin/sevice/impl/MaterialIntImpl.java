package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.MaterialIntMapper;
import com.louis.kitty.admin.model.AccessMaterial;
import com.louis.kitty.admin.sevice.MaterialInt;
import com.louis.kitty.core.page.ColumnFilter;
import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MaterialIntImpl implements MaterialInt {
    @Autowired
    private MaterialIntMapper materialIntMapper;
    @Override
    public int save(AccessMaterial record) {
        return 0;
    }

    @Override
    public int delete(AccessMaterial record) {
        return 0;
    }

    @Override
    public int delete(List<AccessMaterial> records) {
        return 0;
    }

    @Override
    public AccessMaterial findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("name");
        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("mName");
        ColumnFilter columnFilter2 = pageRequest.getColumnFilter("remarks");
        ColumnFilter columnFilter3 = pageRequest.getColumnFilter("com");
        ColumnFilter columnFilter4 = pageRequest.getColumnFilter("qianTime");
        ColumnFilter columnFilter5 = pageRequest.getColumnFilter("houTime");
        if(columnFilter != null && columnFilter1 !=null && columnFilter2 !=null && columnFilter3 !=null && columnFilter4 !=null && columnFilter5 !=null) {
            return MybatisPageHelper.findPage(pageRequest, materialIntMapper, "findPageByNameAndMName", columnFilter.getValue(),columnFilter1.getValue(),
                    columnFilter2.getValue(),columnFilter3.getValue(),columnFilter4.getValue(),columnFilter5.getValue());
        }
        return MybatisPageHelper.findPage(pageRequest, materialIntMapper);
    }
}
