package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.Filter;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.model.Parts;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import com.louis.kitty.core.service.CurdService;

import java.util.List;

public interface PartsService extends CurdService<Parts> {
    int saveCraft(Parts parts);
    int saveCraftbefor(Parts parts);
    int savePurch(Parts parts);
    String queryCraft(Parts parts);
    List<Parts> queryParts(OrderMain orderMain);
    List<Parts> findPagePp(Filter filter);
    List<Parts> findPageD(Filter filter);
    List<Parts> findPageDn(Filter filter);
    int updatePick(Parts parts);
    int updateStsC(Parts parts);
    int updateStsB(Parts parts);
    int updateStsA(Parts parts);
    int updateStsD(Parts parts);
    int deleteParts(Parts parts);
    PageResult findPageQc(PageRequest pageRequest);
    PageResult findPagePr(PageRequest pageRequest);
    PageResult findPagePi(PageRequest pageRequest);
    PageResult findPage1(PageRequest pageRequest);
    int fixRetrn(Parts parts);
    int fix(Parts parts);
}
