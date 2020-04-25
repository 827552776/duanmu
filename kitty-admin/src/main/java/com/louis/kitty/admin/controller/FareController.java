package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.model.Fare;
import com.louis.kitty.admin.model.Help;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.sevice.FareService;
import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fare")
public class FareController {
    @Autowired
    private FareService fareService;
    @PostMapping(value="/save")
    public HttpResult save(@RequestBody Fare fare){
        int result = 0;
        result = fareService.save(fare);
        return HttpResult.ok(result);
    }
    @PostMapping(value="/query")
    public HttpResult query(@RequestBody Fare fare){
        return HttpResult.ok(fareService.query(fare));
    }

    @PostMapping(value="/queryTogeter")
    public HttpResult queryTogeter(@RequestBody OrderMain orderMain){
        return HttpResult.ok(fareService.queryTogeter(orderMain));
    }
    @PostMapping(value = "/find")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(fareService.findPage(pageRequest));
    }
    @PostMapping(value = "/find1")
    public HttpResult findPage1(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(fareService.findPage1(pageRequest));
    }
}
