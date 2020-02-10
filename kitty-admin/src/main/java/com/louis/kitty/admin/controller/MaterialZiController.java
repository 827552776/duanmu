package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.model.BCustomer;
import com.louis.kitty.admin.model.Material;
import com.louis.kitty.admin.sevice.MaterialZiSrevice;
import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("MaterialZi")
public class MaterialZiController {
    @Autowired
    private MaterialZiSrevice materialZiSrevice;
    /**
     * 分页查询
     * @param pageRequest
     * @return
     */
    @PostMapping(value = "/find")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(materialZiSrevice.findPage(pageRequest));
    }
    //保存
    @PostMapping(value="/save")
    public HttpResult save(@RequestBody Material material) {
        return HttpResult.ok(materialZiSrevice.save(material));
    }
    @GetMapping(value = "/findMaterial")
    public HttpResult findMaterial(){
        return  HttpResult.ok(materialZiSrevice.findAll());
    }

}
