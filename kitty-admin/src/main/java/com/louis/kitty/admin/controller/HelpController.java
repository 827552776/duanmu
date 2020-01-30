package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.model.Check;
import com.louis.kitty.admin.model.Core;
import com.louis.kitty.admin.model.Help;
import com.louis.kitty.admin.model.Parts;
import com.louis.kitty.admin.sevice.HelpService;
import com.louis.kitty.core.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("help")
public class HelpController {
    @Autowired
    private HelpService helpService;
    @PostMapping(value="/save")
    public HttpResult save(@RequestBody Help help){
        int result = 0;
        result = helpService.save(help);
        return HttpResult.ok(result);
    }
    @PostMapping(value="/query")
    public HttpResult query(@RequestBody Core core){
        return HttpResult.ok(helpService.query(core));
    }
}
