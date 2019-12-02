package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.Parts;
import com.louis.kitty.core.service.CurdService;

public interface PartsService extends CurdService<Parts> {
    int saveCraft(Parts parts);
    String queryCraft(Parts parts);
}
