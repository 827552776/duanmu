package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.Out;
import com.louis.kitty.admin.model.Ware;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import com.louis.kitty.core.service.CurdService;
import com.louis.kitty.admin.model.OrderMain;
import org.springframework.core.annotation.Order;

import java.util.List;

public interface OrderMainService extends CurdService<OrderMain> {
        int updateSts(OrderMain main);
        int updateWare(Ware ware);
        int updateOut(Out out);
        int updateStsC(OrderMain main);
        PageResult findPageAb(PageRequest pageRequest);
        PageResult findPageZhu(PageRequest pageRequest);
        PageResult findPageQuery(PageRequest pageRequest);
        String queryPrimaryKey();


}
