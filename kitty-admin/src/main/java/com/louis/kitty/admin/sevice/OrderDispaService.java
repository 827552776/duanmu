package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.OrderDispa;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.core.service.CurdService;

public interface OrderDispaService extends CurdService<OrderDispa> {
    OrderDispa query(OrderMain orderMain);

}
