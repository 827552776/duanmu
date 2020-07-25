package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.Material;
import com.louis.kitty.admin.model.MaterialManage;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import com.louis.kitty.core.service.CurdService;

import java.io.File;
import java.util.List;

public interface MaterialManageService extends CurdService<MaterialManage> {
    PageResult findPageAb(PageRequest pageRequest);
    PageResult findPageZI(PageRequest pageRequest);
    File createUserExcelFile (PageRequest pageRequest);
    List<MaterialManage> queryTogeter(OrderMain orderMain);
}
