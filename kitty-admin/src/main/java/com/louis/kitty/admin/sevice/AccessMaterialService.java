package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.AccessMaterial;
import com.louis.kitty.admin.model.AccessStock;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import com.louis.kitty.core.service.CurdService;

import java.util.List;

public interface AccessMaterialService extends CurdService<AccessMaterial> {
    PageResult findPageAb(PageRequest pageRequest);
    List<AccessMaterial> queryTogeter(OrderMain orderMain);
}
