package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.Fare;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.model.YunFei;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import com.louis.kitty.core.service.CurdService;

import java.util.List;

public interface FareService extends CurdService<Fare> {
    List<Fare> query(Fare fare);
    List<Fare> queryTogeter(OrderMain orderMain);
    PageResult findPage(PageRequest pageRequest);
    PageResult findPage1(PageRequest pageRequest);
}
