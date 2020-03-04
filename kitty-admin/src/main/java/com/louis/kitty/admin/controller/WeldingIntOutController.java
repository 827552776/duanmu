package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.model.Welding;
import com.louis.kitty.admin.model.WeldingManage;
import com.louis.kitty.admin.sevice.WeldingIntOutService;
import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 库存管理模块
 */
@RestController
@RequestMapping("weldingIn")
public class WeldingIntOutController {
    @Autowired
    private WeldingIntOutService weldingIntOutService;
    /**
     * 分页查询
     */
    @PostMapping(value = "/find")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(weldingIntOutService.findPage(pageRequest));
    }
    @PostMapping(value = "/find1")
    public HttpResult findPage1(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(weldingIntOutService.findPage1(pageRequest));
    }
    @PostMapping(value = "/findAb")
    public HttpResult findPageAb(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(weldingIntOutService.findPageAb(pageRequest));
    }
    @PostMapping(value = "/findT")
    public HttpResult findPageT(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(weldingIntOutService.findPageT(pageRequest));
    }
    /**
     * 删除
     */
    @PostMapping(value="/delete")
    public HttpResult delete(@RequestBody List<Welding> record) {
        return HttpResult.ok(weldingIntOutService.delete(record));
    }
    /**
     * 新增
     */
    @PostMapping(value="/save")
    public HttpResult save(@RequestBody Welding record) {
        return HttpResult.ok(weldingIntOutService.save(record));
    }
  //联合查询焊材模具
    @PostMapping(value="/queryTogeter")
    public HttpResult queryTogeter(@RequestBody OrderMain orderMain) {
        return HttpResult.ok(weldingIntOutService.queryTogeter(orderMain));
    }
}

