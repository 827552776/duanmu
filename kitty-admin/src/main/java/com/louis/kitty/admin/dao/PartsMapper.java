package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.model.Parts;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PartsMapper {
    int insert(Parts parts);
    int insertStsD(Parts parts);
    List<Parts> findPage();
    List<Parts> findPage1();
    List<Parts> findPageQc();
    List<Parts> findPagePr();
    List<Parts> findPagePi();
    List<Parts> findPagePp(String name,String mouldNm);
    List<Parts> findPageD(String name,String mouldNm);
    List<Parts> findPageBy(@Param(value="name") String name);
    List<Parts> findPageByQc(@Param(value="name") String name);
    List<Parts> findPageByPr(@Param(value="name") String name);
    List<Parts> findPageByPi(@Param(value="name") String name);
    List<Parts> findPageByLabel(@Param(value="name") String name);
    int updateCraft(Parts parts);
    int updateCraftbefor(Parts parts);
    int insertPurch(Parts parts);
    String queryCraft(Long id);
    List<Parts> queryParts(String fid);
    int updatePick(Long id);
    int updateStsC(Long id);
    int updateStsB(Long id);
    int updateStsA(Long id);
    int updateStsAA(Parts parts);
    int updateStsD(Long id);
    int deleteParts(Long id);
}
