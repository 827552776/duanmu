package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.model.OrderDispa;
import com.louis.kitty.admin.sevice.OrderDispaService;
import com.louis.kitty.core.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dispa")
public class OrderDispaController {
    @Autowired
    private OrderDispaService orderDispaService;
    @PostMapping(value="/save")
    public HttpResult save(@RequestBody OrderDispa dispa){
        int result = 0;
        result = orderDispaService.save(dispa);
        return HttpResult.ok(result);
    }
}
