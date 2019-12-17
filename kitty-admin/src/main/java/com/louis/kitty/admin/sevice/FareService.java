package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.Fare;
import com.louis.kitty.core.service.CurdService;

import java.util.List;

public interface FareService extends CurdService<Fare> {
    List<Fare> query(Fare fare);
}
