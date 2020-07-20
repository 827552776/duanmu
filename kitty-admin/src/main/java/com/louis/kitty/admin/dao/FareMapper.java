package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.Fare;
import com.louis.kitty.admin.model.YunFei;


import java.util.List;

public interface FareMapper {
    int save(Fare fare);
    int update(Fare fare);
    List<Fare> query(String fId);

}
