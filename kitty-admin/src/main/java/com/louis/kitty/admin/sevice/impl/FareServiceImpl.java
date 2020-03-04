package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.FareMapper;
import com.louis.kitty.admin.model.Fare;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.sevice.FareService;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FareServiceImpl implements FareService{
    @Autowired
    private FareMapper fareMapper;
    @Override
    public int save(Fare fare) {
        Long id = fare.getId();
        if(id == null) {
            return fareMapper.save(fare);
        }else{
            return fareMapper.update(fare);
        }
    }

    @Override
    public int delete(Fare record) {
        return 0;
    }

    @Override
    public int delete(List<Fare> records) {
        return 0;
    }

    @Override
    public Fare findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }

    @Override
    public List<Fare> query(Fare fare) {
        String fId = fare.getfId();

        return fareMapper.query(fId);
    }

    @Override
    public List<Fare> queryTogeter(OrderMain orderMain) {
        String id = orderMain.getId();
        return fareMapper.query(id);
    }
}
