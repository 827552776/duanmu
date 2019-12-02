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
        return HttpResult.ok(trSrockManageService.save(record));
    }
}

