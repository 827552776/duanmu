package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.AccessMaterialIntMapper;
import com.louis.kitty.admin.model.AccessMaterial;
import com.louis.kitty.admin.sevice.AccessMaterialIntService;
import com.louis.kitty.core.page.ColumnFilter;
import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessMaterialIntServiceImpl implements AccessMaterialIntService {
    @Autowired
    private AccessMaterialIntMapper accessMaterialIntMapper;
    @Override
    public int save(AccessMaterial record) {
        if(record.getId() == null || record.getId() == 0) {
            return accessMaterialIntMapper.insertSelective(record);
        }
        return accessMaterialIntMapper.updateByPrimaryKeySelective(record);
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
        return null;
    }

    @Override
    public PageResult findPageT(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("name");
        if(columnFilter != null) {
            return MybatisPageHelper.findPageT(pageRequest, accessMaterialIntMapper, "findPageByName", columnFilter.getValue());
        }
        return MybatisPageHelper.findPageT(pageRequest, accessMaterialIntMapper);
    }
    @Override
    public PageResult findPage1(PageRequest pageRequest){
        ColumnFilter columnFilter = pageRequest.getColumnFilter("type");
        if(columnFilter != null) {
            return MybatisPageHelper.findPage1(pageRequest, accessMaterialIntMapper, "findPageByType", columnFilter.getValue());
        }
        return MybatisPageHelper.findPage1(pageRequest, accessMaterialIntMapper);
    }

}
