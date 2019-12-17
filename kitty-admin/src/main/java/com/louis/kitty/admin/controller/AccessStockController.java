package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.model.AccessStock;
import com.louis.kitty.admin.sevice.AccessStockService;

import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("access")
public class AccessStockController {
    @Autowired
    private AccessStockService accessStockService;

    /**
     * 分页查询
     * @param pageRequest
     * @return
     */
    @PostMapping(value = "/access")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(accessStockService.findPage(pageRequest));
    }
    /**
     * 出库（新增/修改）
     */
    @PostMapping(value = "/save")
    public HttpResult save(@RequestBody AccessStock record) {
        return HttpResult.ok(accessStockService.save(record));
    }
    /**
     * 出库（新增/修改）
     */
    @PostMapping(value = "/saveConfirm")
    public HttpResult saveConfirm(@RequestBody AccessStock record) {
        int a = 1;
        record.setState((long) a);
        return HttpResult.ok(accessStockService.save(record));
    }
}
