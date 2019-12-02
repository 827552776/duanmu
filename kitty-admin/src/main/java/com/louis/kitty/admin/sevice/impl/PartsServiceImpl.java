package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.PartsMapper;
import com.louis.kitty.admin.model.Parts;
import com.louis.kitty.admin.sevice.PartsService;
import com.louis.kitty.common.utils.StringUtils;
import com.louis.kitty.core.page.ColumnFilter;
import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.apache.commons.lang.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartsServiceImpl implements PartsService{
    @Autowired
    private PartsMapper partsMapper;
    @Override
    public int save(Parts record) {
        return partsMapper.insert(record);
    }

    @Override
    public int delete(Parts record) {
        return 0;
    }

    @Override
    public int delete(List<Parts> records) {
        return 0;
    }

    @Override
    public Parts findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {

        ColumnFilter columnFilter = pageRequest.getColumnFilter("name");
        if(columnFilter.getValue() != "") {
            return MybatisPageHelper.findPage(pageRequest, partsMapper, "findPageByLabel", columnFilter.getValue());
        }
        return MybatisPageHelper.findPage(pageRequest, partsMapper);
    }

    @Override
    public int saveCraft(Parts parts) {

        return partsMapper.saveCraft(parts);
    }

    @Override
    public String queryCraft(Parts parts) {
         Long id=  parts.getId();
         return partsMapper.queryCraft(id);
    }
}
