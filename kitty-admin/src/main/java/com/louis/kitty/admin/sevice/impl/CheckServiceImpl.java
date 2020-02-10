package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.CheckMapper;
import com.louis.kitty.admin.model.Check;
import com.louis.kitty.admin.sevice.CheckService;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CheckServiceImpl implements CheckService {
    @Autowired
    private CheckMapper checkMapper;
    @Override
    public int save(Check record) {
        return checkMapper.save(record);
    }

    @Override
    public int delete(Check record) {
        return 0;
    }

    @Override
    public int delete(List<Check> records) {
        return 0;
    }

    @Override
    public Check findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }

    @Override
    public int save1(Check check) {
        return checkMapper.save1(check);
    }
}
