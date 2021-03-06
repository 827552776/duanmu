package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.OrderMainMapper;
import com.louis.kitty.admin.dao.OrderOutMapper;
import com.louis.kitty.admin.model.*;
import com.louis.kitty.admin.sevice.OrderMainService;
import com.louis.kitty.core.page.ColumnFilter;
import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderMainServiceImpl implements OrderMainService {
    @Autowired
    private OrderMainMapper orderMainMapper;

    @Autowired
    private OrderOutMapper orderOutMapper;

    int num = 0;
    @Override
    public int save(OrderMain orderMain) {
        //获取id
        String id = orderMain.getId();
        String temp = orderMainMapper.select(id);

        if(temp == null){
            num = orderMainMapper.insert(orderMain);
        }else{
            num = orderMainMapper.update(orderMain);
        }
        return num;
    }

    @Override
    public int delete(OrderMain record) {

        return orderMainMapper.delete(record.getId());
    }

    @Override
    public int delete(List<OrderMain> records) {
        for(OrderMain record:records){
        delete(record);
        }
        return 1;
    }

    @Override
    public OrderMain findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("cust");
        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("mouldNm");
        ColumnFilter columnFilter4 = pageRequest.getColumnFilter("lotNo");
        ColumnFilter columnFilter2 = pageRequest.getColumnFilter("qianTime");
        ColumnFilter columnFilter3 = pageRequest.getColumnFilter("houTime");
        if(columnFilter != null&&columnFilter1 != null&&columnFilter4 != null) {
            return MybatisPageHelper.findPage(pageRequest,orderMainMapper,"findPageByLabel",columnFilter.getValue(),columnFilter1.getValue(),columnFilter4.getValue(),columnFilter2.getValue(),columnFilter3.getValue());
        } else {
            if (columnFilter2 != null && columnFilter3 != null) {
                return MybatisPageHelper.findPage(pageRequest, orderMainMapper, "findPageByLabel", columnFilter.getValue(), columnFilter1.getValue(), columnFilter4.getValue(), columnFilter2.getValue(), columnFilter3.getValue());
            }
            return MybatisPageHelper.findPage(pageRequest, orderMainMapper);
        }
    }
    @Override
    public PageResult findPageY(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("cust");
        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("mouldNm");
        if(columnFilter != null&&columnFilter1 != null) {
            return MybatisPageHelper.findPage(pageRequest,orderMainMapper,"findPageByY",columnFilter.getValue(),columnFilter1.getValue());
        } else {
            return MybatisPageHelper.findPageY(pageRequest, orderMainMapper);
        }
    }
    @Override
    public int updateSts(OrderMain main) {
      String id = main.getId();
        return orderMainMapper.updateStsB(id);
    }

    @Override
    public int updateWare(Ware ware) {
        OrderMain orderMain = new OrderMain();
        orderMain.setId(ware.getId());
        orderMain.setWareDate(ware.getWareDate());
        orderMain.setWareNum(ware.getWareNum());
        orderMain.setWareNo(ware.getWareNo());
        orderMainMapper.updateWare(orderMain);
        if(orderMainMapper.selectQuan(ware.getId()) == ware.getWareNum()){
            orderMainMapper.updateA1(ware.getId());
        }
        return 0;
    }

    @Override
    public int updateOut(Out out) {
        Integer a = out.getNumber();
        OrderMain orderMain = new OrderMain();
        orderMain.setId(out.getId());
        orderMain.setOutDate(out.getOutDate());
        orderMain.setOutNum(out.getOutNum()+a);
        orderMain.setOutNo(out.getOutNo());
        orderMain.setReQuantity(out.getReQuantity()-a);
        orderMainMapper.updateOut(orderMain);
        if(orderMainMapper.selectQuan(out.getId()) == out.getOutNum()+a){
            orderMainMapper.updateE(out.getId());
        }

        String id = orderMainMapper.selectPrimaryKey();
        out.setId(id);
        out.setCompany(out.getCompany());
        out.setCust(out.getCust());
        out.setDispatchNo(out.getDispatchNo());
        out.setLotNo(out.getLotNo());
        out.setMouldNm(out.getMouldNm());
        out.setOutDate(out.getOutDate());
        out.setOutNo(out.getOutNo());
        out.setOutNum(out.getNumber());
        out.setQuantity(out.getQuantity());
        out.setRemarks(out.getRemarks());
        out.setWareNo(out.getWareNo());
        out.setWareNum(out.getWareNum());
        orderOutMapper.insertOut(out);
        return 0;
    }

    @Override
    public int updateStsC(OrderMain main) {
        String id =main.getId();
        return orderMainMapper.updateStsC(id);
    }

    @Override
    public List<String> queryMoudles() {


        return orderMainMapper.queryMoudles();
    }

    @Override
    public PageResult findPageAb(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("mouldNm");

        if(columnFilter.getValue() != "") {
            return MybatisPageHelper.findPage(pageRequest, orderMainMapper, "findPageAboo", columnFilter.getValue());
        }
        return MybatisPageHelper.findPageAb(pageRequest, orderMainMapper);
    }

    @Override
    public PageResult findPageCom(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("cust");
        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("mouldNm");
        ColumnFilter columnFilter2 = pageRequest.getColumnFilter("qianTime");
        ColumnFilter columnFilter3 = pageRequest.getColumnFilter("houTime");
        if(columnFilter != null&&columnFilter1 != null&& columnFilter2 != null && columnFilter3 != null) {
            return MybatisPageHelper.findPage(pageRequest,orderMainMapper,"findPageByCom",columnFilter.getValue(),columnFilter1.getValue(), columnFilter2.getValue(), columnFilter3.getValue());
        }
            return MybatisPageHelper.findPageCom(pageRequest, orderMainMapper);
    }

    @Override
    public PageResult findPageZhu(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("cust");
        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("mouldNm");
        ColumnFilter columnFilter2 = pageRequest.getColumnFilter("lotNo");
        if(columnFilter != null&&columnFilter1 != null) {
            return MybatisPageHelper.findPage(pageRequest, orderMainMapper, "findPageZhuoo", columnFilter.getValue(),columnFilter1.getValue(),columnFilter2.getValue());
        }
        return MybatisPageHelper.findPageZhu(pageRequest, orderMainMapper);
    }

    @Override
    public PageResult findPageQuery(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("cust");
        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("mouldNm");
        if(columnFilter != null&&columnFilter1 != null) {
            return MybatisPageHelper.findPage(pageRequest, orderMainMapper, "findPageQueryoo", columnFilter.getValue(),columnFilter1.getValue());
        }
        return MybatisPageHelper.findPageQuery(pageRequest, orderMainMapper);

    }

    @Override
    public String queryPrimaryKey() {
        return orderMainMapper.selectPrimaryKey();
    }


}
