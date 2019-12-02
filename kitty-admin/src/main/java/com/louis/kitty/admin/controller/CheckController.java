package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.model.Check;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.sevice.CheckService;
import com.louis.kitty.core.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("check")
public class CheckController {
    @Autowired
    private CheckService checkService;
    @PostMapping(value="/save")
    public HttpResult save(@RequestBody Check check){
        int result = 0;
        result = checkService.save(check);
        return HttpResult.ok(result);
    }
}
