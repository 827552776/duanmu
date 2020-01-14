package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.AccessMaterial;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import com.louis.kitty.core.service.CurdService;

public interface AccessMaterialIntService extends CurdService<AccessMaterial> {
    PageResult findPage1(PageRequest pageRequest);
    PageResult findPageT(PageRequest pageRequest);
}
