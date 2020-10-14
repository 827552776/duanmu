package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.OrderOut;
import com.louis.kitty.admin.model.Out;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderOutMapper {
    List<OrderOut> findPageOut();
    List<OrderOut> findPageByCustAndmName(@Param(value="cust") String cust,
                                          @Param(value = "mouldNm") String mouldNm);
    int insertOut(Out out);
}
