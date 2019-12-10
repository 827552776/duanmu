package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.Parts;

import java.util.List;

public interface PartsMapper {
    int insert(Parts parts);
    int insertStsC(Parts parts);
    List<Parts> findPage();
    List<Parts> findPageQc();
    List<Parts> findPagePr();
    int saveCraft(Parts parts);
    String queryCraft(Long id);
    List<Parts> queryParts(Long fid);
    int updateStsB(Long id);
    int updateStsA(Long id);
    int updateStsAA(Parts parts);
    int updateStsC(Long id);
    int deleteParts(Long id);
}
