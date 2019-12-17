package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.Fare;

import java.util.List;

public interface FareMapper {
    int save(Fare fare);
    List<Fare> query(String fId);
}
