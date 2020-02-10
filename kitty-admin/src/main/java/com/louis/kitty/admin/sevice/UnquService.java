package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.Unqu;
import com.louis.kitty.core.service.CurdService;

import java.util.List;

public interface UnquService extends CurdService<Unqu> {
            List<Unqu> query(Unqu unqu);

}
