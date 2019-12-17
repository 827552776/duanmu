package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.MaterialManage;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import com.louis.kitty.core.service.CurdService;

import java.io.File;

public interface MaterialManageService extends CurdService<MaterialManage> {
    PageResult findPageAb(PageRequest pageRequest);
    File createUserExcelFile (PageRequest pageRequest);
}
