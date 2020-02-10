package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.MaterialZiMapper;
import com.louis.kitty.admin.model.Material;
import com.louis.kitty.admin.sevice.MaterialZiSrevice;
import com.louis.kitty.core.page.ColumnFilter;
import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MaterialZiServiceImpl implements MaterialZiSrevice {
    @Autowired
    private MaterialZiMapper materialZiMapper;
    @Override
    public int save(Material record) {
        if(record.getId() == null || record.getId() == 0) {
            return materialZiMapper.insertSelective(record);
        }
        return materialZiMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(Material record) {
        return 0;
    }

    @Override
    public int delete(List<Material> records) {
        return 0;
    }

    @Override
    public Material findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("label");
        if(columnFilter != null) {
            return MybatisPageHelper.findPage(pageRequest, materialZiMapper);
        }
        return MybatisPageHelper.findPage(pageRequest, materialZiMapper);
    }

    @Override
    public List<Material> findAll() {
        List<Material> materials = new ArrayList<>();
        materials = materialZiMapper.findAll();
        return materials;
    }
}
