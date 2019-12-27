package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.model.Welding;
import com.louis.kitty.admin.sevice.WeldingIntOutService;
import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 库存管理模块
 */
@RestController
@RequestMapping("weldingIn")
public class WeldingIntOutController {
    @Autowired
    private WeldingIntOutService weldingIntOutService;
    /**
     * 分页查询
     */
    @PostMapping(value = "/find")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(weldingIntOutService.findPage(pageRequest));
    }
    @PostMapping(value = "/findAb")
    public HttpResult findPageAb(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(weldingIntOutService.findPageAb(pageRequest));
    }
    /**
     * 新增
     */
    @PostMapping(value="/save")
    public HttpResult save(@RequestBody Welding record) {
        return HttpResult.ok(weldingIntOutService.save(record));
    }
}

