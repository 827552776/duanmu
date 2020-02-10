package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.Check;
import com.louis.kitty.core.service.CurdService;

public interface CheckService extends CurdService<Check> {
    int save1(Check check);

}
