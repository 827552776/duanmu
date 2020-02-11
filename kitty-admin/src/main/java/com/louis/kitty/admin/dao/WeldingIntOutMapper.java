package com.louis.kitty.admin.dao;



import com.louis.kitty.admin.model.Welding;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface WeldingIntOutMapper {
    List<Welding> findPage();
    List<Welding> findPageAb();
    List<Welding> findPage1();
    int insertSelective(Welding record);
    List<Welding> findPageByName(@Param(value="name") String name);
    int updateByPrimaryKeySelective(Welding record);
}
