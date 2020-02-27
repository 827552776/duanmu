package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.model.MaterialManage;
import com.louis.kitty.admin.model.WeldingManage;
import com.louis.kitty.admin.sevice.WeldingManageService;
import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

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
     * 删除
     */
    @PostMapping(value="/delete")
    public HttpResult delete(@RequestBody List<WeldingManage> record) {
        return HttpResult.ok(weldingManageService.delete(record));
    }
    /**
     * 新增
     */
    @PostMapping(value="/save")
    public HttpResult save(@RequestBody WeldingManage record) {
        double a = record.getIntNumber();
        double b= record.getOutNumber();
        double c=0.00;
        if((record.getNumber()+a-b)>record.getTypeNumber()){
            record.setType((long) 0);
        }else {
            record.setType((long) 1);
        }
        record.setNumber(record.getNumber()+a-b);
        record.setIntNumber(0);
        record.setOutNumber(0);
        return HttpResult.ok(weldingManageService.save(record));
    }
}

