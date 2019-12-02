package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.Parts;

import java.util.List;

public interface PartsMapper {
    int insert(Parts parts);
    List<Parts> findPage();
    int saveCraft(Parts parts);
    String queryCraft(Long id);
}
