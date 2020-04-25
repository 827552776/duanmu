package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.YunFei;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YunMapper {

    List<YunFei> findPage();
    List<YunFei> findPageByMouldAndTime(@Param(value="mould") String mould,
                                        @Param(value="qianTime") String qianTime,
                                        @Param(value="houTime") String houTime);

}
