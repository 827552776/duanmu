package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.model.TrStockManage;
import com.louis.kitty.admin.sevice.TrSrockManageService;
import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 库存管理模块
 */
@RestController
@RequestMapping("stock")
public class TrStockManageController {
    @Autowired
    private TrSrockManageService trSrockManageService;
    /**
     * 分页查询
     */
    @PostMapping(value = "/stock")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(trSrockManageService.findPage(pageRequest));
    }
    /**
     * 新增
     */
    @PostMapping(value="/save")
    public HttpResult save(@RequestBody TrStockManage record) {
        int a = record.getInNumber();
        int b = record.getOutNumber();
        int c= record.getTrNumber();
        int d = a-b+c;
        if(d>record.getTypeNumber()){
            record.setType(0);
        }else{
            record.setType(1);
        }
        System.out.println(a);
        System.out.println(d);
        record.setTrNumber(d);
        record.setInNumber(0);
        record.setOutNumber(0);
        return HttpResult.ok(trSrockManageService.save(record));
    }
}

