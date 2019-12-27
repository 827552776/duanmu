package com.louis.kitty.admin.dao;



import com.louis.kitty.admin.model.Welding;

import java.util.List;

public interface WeldingIntOutMapper {
    List<Welding> findPage();
    List<Welding> findPageAb();
    int insertSelective(Welding record);

    int updateByPrimaryKeySelective(Welding record);
}
