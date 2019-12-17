package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.model.Help;
import com.louis.kitty.admin.model.Unqu;
import com.louis.kitty.admin.sevice.UnquService;
import com.louis.kitty.core.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("unqu")
public class UnquController {
    @Autowired
    private UnquService unquService;
    @PostMapping(value="/save")
    public HttpResult save(@RequestBody Unqu unqu){
        int result = 0;
        result = unquService.save(unqu);
        return HttpResult.ok(result);
    }

}
