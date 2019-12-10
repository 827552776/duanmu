package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.model.SysDict;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMainMapper {
    int insert(OrderMain record);
    List<OrderMain> select(Long id);
    int update(OrderMain record);
    int delete(Long id);
    List<OrderMain> findPage();
    List<OrderMain> findPageAb();
    List<OrderMain> findPageAboo(@Param(value="dispatchNo") String dispatchNo);
    List<OrderMain> query(String lotNo,String custNm,String dispatchNo);
    int updateStsB(Long id);
    int updateStsC(Long id);
    List<OrderMain> findPageByLabel(@Param(value="cust") String cust);
}
