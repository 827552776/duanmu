package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.AccessStock;

import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import com.louis.kitty.core.service.CurdService;

public interface AccessStockService extends CurdService<AccessStock> {
    PageResult findPageAb(PageRequest pageRequest);
}
