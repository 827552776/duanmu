package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.model.SysDict;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMainMapper {
    int insert(OrderMain record);
    String select(String id);
    int update(OrderMain record);
    int delete(String id);
    List<OrderMain> findPage();
    List<OrderMain> findPageQuery();
    List<OrderMain> findPageAb();
    List<OrderMain> findPageAboo(@Param(value="mouldNm") String mouldNm);
    List<OrderMain> query(String lotNo,String custNm,String dispatchNo);
    int updateStsB(String id);
    int updateStsC(String id);
    List<OrderMain> findPageByLabel(@Param(value="cust") String cust,@Param(value = "mouldNm") String mouldNm);
    List<OrderMain> findPageZhuoo(@Param(value="cust") String cust,@Param(value = "mouldNm") String mouldNm);
    List<OrderMain> findPageQueryoo(@Param(value="cust") String cust,@Param(value = "mouldNm") String mouldNm);
    String selectPrimaryKey();
}
