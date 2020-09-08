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
    List<OrderMain> findPageY();
    List<OrderMain> findPageCom();
    List<OrderMain> findPageQuery();
    List<OrderMain> findPageAb();
    List<OrderMain> findPageAboo(@Param(value="mouldNm") String mouldNm);
    List<OrderMain> query(String lotNo,String custNm,String dispatchNo);
    int updateStsB(String id);
    int updateA1(String id);
    int updateE(String id);
    int updateStsC(String id);
    List<OrderMain> findPageByLabel(@Param(value="cust") String cust,
                                    @Param(value = "mouldNm") String mouldNm,
                                    @Param(value = "lotNo") String lotNo,
                                    @Param(value = "qianTime") String qianTime,
                                    @Param(value = "houTime") String houTime);
    List<OrderMain> findPageByY(@Param(value="cust") String cust,
                                    @Param(value = "mouldNm") String mouldNm);
    List<OrderMain> findPageByCom(@Param(value="cust") String cust,
                                  @Param(value = "mouldNm") String mouldNm,
                                  @Param(value = "qianTime") String qianTime,
                                  @Param(value = "houTime") String houTime);
    List<OrderMain> findPageZhuoo(@Param(value="cust") String cust,
                                  @Param(value = "mouldNm") String mouldNm,
                                  @Param(value = "lotNo") String lotNo);
    List<OrderMain> findPageQueryoo(@Param(value="cust") String cust,@Param(value = "mouldNm") String mouldNm);
    String selectPrimaryKey();
    int updateStsD(String id);
    int updateWare(OrderMain orderMain);
    int updateOut(OrderMain orderMain);
    int selectQuan(String id);
    List<String> queryMoudles();
}
