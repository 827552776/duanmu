package com.louis.kitty.admin.dao;



import com.louis.kitty.admin.model.WaiXie;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WaiMapper {

    List<WaiXie> findPage1();
    List<WaiXie> findPageByMould(@Param(value="mould") String mould,@Param(value="name") String name, @Param(value="qianTime") String qianTime,
                                 @Param(value="houTime") String houTime);
}
