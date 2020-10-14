package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.model.OrderOut;
import com.louis.kitty.admin.sevice.OrderOutService;
import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("out")
public class OrderOutController {
    @Autowired
    private OrderOutService orderOutService;
    //查询(出库记录)
    @PostMapping(value = "/findPageOutQuery")
    public HttpResult findPageOutQuery(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(orderOutService.findPageOutQuery(pageRequest));
    }
}
