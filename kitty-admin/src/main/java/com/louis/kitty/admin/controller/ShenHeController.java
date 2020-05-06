package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.model.ShenHe;
import com.louis.kitty.admin.model.WeldingManage;
import com.louis.kitty.admin.sevice.ShenHeService;
import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ShenHe")
public class ShenHeController {
    @Autowired
    private ShenHeService shenHeService;
    /**
     * 分页查询
     */
    @PostMapping(value = "/find")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(shenHeService.findPage(pageRequest));
    }
    /**
     * 删除
     */
    @PostMapping(value="/delete")
    public HttpResult delete(@RequestBody List<ShenHe> record) {
        return HttpResult.ok(shenHeService.delete(record));
    }
    /**
     * 新增
     */
    @PostMapping(value="/save")
    public HttpResult save(@RequestBody ShenHe record) {
        return HttpResult.ok(shenHeService.save(record));
    }
}
