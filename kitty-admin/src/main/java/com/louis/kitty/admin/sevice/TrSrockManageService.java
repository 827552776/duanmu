package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.TrStockManage;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import com.louis.kitty.core.service.CurdService;

public interface TrSrockManageService extends CurdService<TrStockManage> {
    PageResult findPageAb(PageRequest pageRequest);
}
