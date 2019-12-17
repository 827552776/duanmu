package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.WeldingManage;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import com.louis.kitty.core.service.CurdService;

public interface WeldingManageService extends CurdService<WeldingManage> {
    PageResult findPageAb(PageRequest pageRequest);
}
