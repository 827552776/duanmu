package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.HelpMapper;
import com.louis.kitty.admin.model.Core;
import com.louis.kitty.admin.model.Help;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.model.Parts;
import com.louis.kitty.admin.sevice.HelpService;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelpServiceImpl implements HelpService{
    @Autowired
    private HelpMapper helpMapper;
    int num = 0;
    @Override
    public int save(Help help) {
         Long id = help.getId();
         if(id == null){
             num = helpMapper.insert(help);
         }else{
             num = helpMapper.update(help);
         }
        return num;
    }

    @Override
    public int delete(Help record) {
        return 0;
    }

    @Override
    public int delete(List<Help> records) {
        return 0;
    }

    @Override
    public Help findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }

    @Override
    public List<Help> query(Core core) {
        String fId = core.getId();
        return helpMapper.query(fId);
    }

    @Override
    public List<Help> queryTogeter(OrderMain orderMain) {
        String id = orderMain.getId();
        return helpMapper.queryTogeter(id);
    }
}
