package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.sevice.MaterialInt;
import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("MaterialInt")
public class MaterialIntController {
    @Autowired
    private MaterialInt materialInt;

    /**
     * 分页查询
     * @param pageRequest
     * @return
     */
    @PostMapping(value = "/find")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(materialInt.findPage(pageRequest));
    }
}
