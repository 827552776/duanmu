package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.model.Welding;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import com.louis.kitty.core.service.CurdService;

import java.util.List;

public interface WeldingIntOutService extends CurdService<Welding> {
    PageResult findPage1(PageRequest pageRequest);
    PageResult findPageAb(PageRequest pageRequest);
    PageResult findPageT(PageRequest pageRequest);
    List<Welding> queryTogeter(OrderMain orderMain);
}
