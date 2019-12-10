package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.model.Fare;
import com.louis.kitty.admin.model.Help;
import com.louis.kitty.admin.sevice.FareService;
import com.louis.kitty.core.http.HttpResult;
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
}
