package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.Material;
import com.louis.kitty.core.service.CurdService;

import java.util.List;

public interface MaterialZiSrevice extends CurdService<Material> {
    List<Material> findAll();
}
