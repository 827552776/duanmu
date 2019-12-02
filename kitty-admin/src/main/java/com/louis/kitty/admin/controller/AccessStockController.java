package com.louis.kitty.admin.controller;

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
    @PostMapping(value = "/access")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(accessStockService.findPage(pageRequest));
    }
}
