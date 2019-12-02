package com.louis.kitty.admin.sevice;

import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import com.louis.kitty.core.service.CurdService;
import com.louis.kitty.admin.model.OrderMain;
import org.springframework.core.annotation.Order;

import java.util.List;

public interface OrderMainService extends CurdService<OrderMain> {
        int updateSts(OrderMain main);
        int updateStsC(OrderMain main);
        PageResult findPageAb(PageRequest pageRequest);


}
