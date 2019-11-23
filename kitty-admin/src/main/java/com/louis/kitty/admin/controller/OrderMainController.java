package com.louis.kitty.admin.controller;

import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.sevice.OrderMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderMainController {
    @Autowired
    private OrderMainService orderMainService;
    @PostMapping(value="/save")
    public HttpResult save(@RequestBody OrderMain main){
        int result = 0;
        result = orderMainService.save(main);
        return HttpResult.ok(result);
    }

}
