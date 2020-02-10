package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.UnquMapper;
import com.louis.kitty.admin.model.Unqu;
import com.louis.kitty.admin.sevice.UnquService;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnquServiceImpl implements UnquService{
    @Autowired
    private UnquMapper unquMapper;
    @Override
    public int save(Unqu unqu) {
        return unquMapper.insert(unqu);
    }

    @Override
    public int delete(Unqu record) {
        return 0;
    }

    @Override
    public int delete(List<Unqu> records) {
        return 0;
    }

    @Override
    public Unqu findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }

    @Override
    public List<Unqu> query(Unqu unqu) {
       Integer fId = unqu.getfId();
        return unquMapper.query(fId);
    }
}
