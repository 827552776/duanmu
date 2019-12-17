package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.model.WeldingManage;
import com.louis.kitty.admin.sevice.WeldingManageService;
import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 库存管理模块
 */
@RestController
@RequestMapping("welding")
public class WeldingManageController {
    @Autowired
    private WeldingManageService weldingManageService;
    /**
     * 分页查询
     */
    @PostMapping(value = "/find")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(weldingManageService.findPage(pageRequest));
    }
    @PostMapping(value = "/findAb")
    public HttpResult findPageAb(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(weldingManageService.findPageAb(pageRequest));
    }
    /**
     * 新增
     */
    @PostMapping(value="/save")
    public HttpResult save(@RequestBody WeldingManage record) {
        Long a = record.getIntNumber();
        Long b= record.getOutNumber();
        if((record.getNumber()+a-b)>record.getTypeNumber()){
            record.setType((long) 0);
        }else {
            record.setType((long) 1);
        }
        record.setNumber(record.getNumber()+a-b);
        record.setIntNumber((long) 0);
        record.setOutNumber((long) 0);
        return HttpResult.ok(weldingManageService.save(record));
    }
}

