package com.louis.kitty.admin.dao;



import com.louis.kitty.admin.model.Welding;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface WeldingIntOutMapper {
    int deleteByPrimaryKey(Long id);
    List<Welding> findPage();
    List<Welding> findPageAb();
    List<Welding> findPage1();
    List<Welding> findPageT();
    int insertSelective(Welding record);
    List<Welding> findPageByName(@Param(value="name") String name,@Param(value="qianTime") String qianTime,@Param(value="houTime") String houTime);
    int updateByPrimaryKeySelective(Welding record);
    List<Welding> findPageByAll(@Param(value="name") String name,@Param(value="mouldName") String mouldName,@Param(value="model") String model,@Param(value="zu") String zu,
                                @Param(value="qianTime") String qianTime,@Param(value="houTime") String houTime);
    List<Welding> findPageByNameAndModel(@Param(value="name") String name,@Param(value="deCompany") String deCompany,@Param(value="model") String model,
                                         @Param(value="qianTime") String qianTime,@Param(value="houTime") String houTime );
    List<Welding> findPageByDeCompany(@Param(value="name") String name,@Param(value="deCompany") String deCompany,@Param(value="model") String model,
                                      @Param(value="qianTime") String qianTime,@Param(value="houTime") String houTime);
    List<Welding> queryTogeter(String id);
}
