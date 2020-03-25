package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.AccessStock;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccessStockMapper {
    List<AccessStock> findPage();
    List<AccessStock> findPageAb();
    List<AccessStock> findPage1();
    int deleteByPrimaryKey(Long id);
    int insertSelective(AccessStock record);
    List<AccessStock> findPageByNameAndType(@Param(value="name") String name, @Param(value="type") String type,@Param(value="xiType") String xiType,
                                            @Param(value="modeBy") String modeBy,  @Param(value="qianTime") String qianTime,@Param(value="houTime") String houTime);
    List<AccessStock> findPageByNameAnd(@Param(value="name") String name, @Param(value="type") String type,@Param(value="xiType") String xiType,
                                        @Param(value="modeBy") String modeBy , @Param(value="qianTime") String qianTime,@Param(value="houTime") String houTime);
    int updateByPrimaryKeySelective(AccessStock record);
    List<AccessStock> findPageByName(@Param(value="name") String name, @Param(value="type") String type,@Param(value="xiType") String xiType,
                                     @Param(value="qianTime") String qianTime,@Param(value="houTime") String houTime);
}
