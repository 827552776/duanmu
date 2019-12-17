package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.AccessMaterialMapper;
import com.louis.kitty.admin.model.AccessMaterial;
import com.louis.kitty.admin.sevice.AccessMaterialService;
import com.louis.kitty.core.page.ColumnFilter;
import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessMaterialServiceImpl implements AccessMaterialService {
    @Autowired
    private AccessMaterialMapper accessMaterialMapper;
    @Override
    public int save(AccessMaterial record) {
        if(record.getId() == null || record.getId() == 0) {
            return accessMaterialMapper.insertSelective(record);
        }
        return accessMaterialMapper.updateByPrimaryKeySelective(record);
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
        ColumnFilter columnFilter = pageRequest.getColumnFilter("label");
        if(columnFilter != null) {
            return MybatisPageHelper.findPage(pageRequest, accessMaterialMapper, "findPageByLabel", columnFilter.getValue());
        }
        return MybatisPageHelper.findPage(pageRequest, accessMaterialMapper);
    }

}
