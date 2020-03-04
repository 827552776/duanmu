package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.Core;
import com.louis.kitty.admin.model.Help;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.model.Parts;
import com.louis.kitty.core.service.CurdService;

import java.util.List;

public interface HelpService extends CurdService<Help> {
    List<Help> query(Core core);
    List<Help> queryTogeter(OrderMain orderMain);
}
