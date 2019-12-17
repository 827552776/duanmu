package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.Help;

import java.util.List;

public interface HelpMapper {
    int insert(Help help);
    List<Help> query(Long fId);
    int update(Help help);
}
