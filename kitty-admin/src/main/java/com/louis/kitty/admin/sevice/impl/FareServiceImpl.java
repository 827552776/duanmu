package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.FareMapper;
import com.louis.kitty.admin.dao.WaiMapper;
import com.louis.kitty.admin.dao.YunMapper;
import com.louis.kitty.admin.model.Fare;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.sevice.FareService;
import com.louis.kitty.core.page.ColumnFilter;
import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FareServiceImpl implements FareService{
    @Autowired
    private FareMapper fareMapper;
    @Autowired
    private YunMapper yunMapper;
    @Autowired
    private WaiMapper waiMapper;
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
        return fareMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<Fare> records) {
        for (Fare record:records){
            delete(record);
        }
        return 1;
    }

    @Override
    public Fare findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("mould");
        ColumnFilter columnFilter3 = pageRequest.getColumnFilter("logis");
        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("qianTime");
        ColumnFilter columnFilter2 = pageRequest.getColumnFilter("houTime");
//        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("mName");
        if(columnFilter != null && columnFilter3 !=null) {
            return MybatisPageHelper.findPage(pageRequest, yunMapper, "findPageByMouldAndTime", columnFilter.getValue(),columnFilter3.getValue(),columnFilter1.getValue(),columnFilter2.getValue());
        } else{
            if(columnFilter1 != null  && columnFilter2 !=null){
                return MybatisPageHelper.findPage(pageRequest, yunMapper, "findPageByMouldAndTime", columnFilter.getValue(),columnFilter3.getValue(),columnFilter1.getValue(),columnFilter2.getValue());
            }
            return MybatisPageHelper.findPage(pageRequest, yunMapper);
        }
    }
    @Override
    public PageResult findPage1(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("mould");
        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("name");
        ColumnFilter columnFilter2 = pageRequest.getColumnFilter("qianTime");
        ColumnFilter columnFilter3 = pageRequest.getColumnFilter("houTime");
//        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("mName");
        if(columnFilter != null  && columnFilter1 !=null) {
            return MybatisPageHelper.findPage1(pageRequest, waiMapper, "findPageByMould", columnFilter.getValue(),columnFilter1.getValue(),columnFilter2.getValue(),columnFilter3.getValue());
        } else{
            if(columnFilter2 != null  && columnFilter3 !=null){
                return MybatisPageHelper.findPage1(pageRequest, waiMapper, "findPageByMould", columnFilter.getValue(),columnFilter1.getValue(),columnFilter2.getValue(),columnFilter3.getValue());
            }
            return MybatisPageHelper.findPage1(pageRequest, waiMapper);
        }

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
