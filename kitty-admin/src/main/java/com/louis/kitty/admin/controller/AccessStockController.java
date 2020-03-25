package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.model.AccessStock;
import com.louis.kitty.admin.model.TrStockManage;
import com.louis.kitty.admin.sevice.AccessStockService;

import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

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
     * 自用出库分页查询
     * @param pageRequest
     * @return
     */
    @PostMapping(value = "/accessAb")
    public HttpResult findPageAb(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(accessStockService.findPageAb(pageRequest));
    }

    /**
     * 外售出库分页查询
     * @param pageRequest
     * @return
     */
    @PostMapping(value = "/access1")
    public HttpResult findPage1(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(accessStockService.findPage1(pageRequest));
    }
    /**
     * 删除
     */
    @PostMapping(value="/delete")
    public HttpResult delete(@RequestBody List<AccessStock> record) {
        return HttpResult.ok(accessStockService.delete(record));
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
