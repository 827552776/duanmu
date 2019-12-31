package com.louis.kitty.admin.controller;

import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.sevice.OrderMainService;
import com.louis.kitty.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderMainController {
    @Autowired
    private OrderMainService orderMainService;
    //保存
    @PostMapping(value="/save")
    public HttpResult save(@RequestBody OrderMain main){
        int result = 0;
        result = orderMainService.save(main);
        return HttpResult.ok(result);
    }
    //删除
    @PostMapping(value="/delete")
    public HttpResult delete(@RequestBody List<OrderMain> record) {
        return HttpResult.ok(orderMainService.delete(record));
    }
    //查询(锻造)
    @PostMapping(value="/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(orderMainService.findPage(pageRequest));
    }
    //查询
    @PostMapping(value="/findPageQuery")
    public HttpResult findPageQuery(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(orderMainService.findPageQuery(pageRequest));
    }
    //查询(铸造）
    @PostMapping(value="/findPageZhu")
    public HttpResult findPageZhu(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(orderMainService.findPageZhu(pageRequest));
    }

    //查询状态A和B
    @PostMapping(value="/findPageAb")
    public HttpResult findPageAb(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(orderMainService.findPageAb(pageRequest));
    }
    @PostMapping(value="/updateSts")
    public HttpResult updateSts(@RequestBody OrderMain main){
        int result = 0;
        result = orderMainService.updateSts(main);
        return HttpResult.ok(result);
    }

    @PostMapping(value="/updateStsC")
    public HttpResult updateStsC(@RequestBody OrderMain main){
        int result = 0;
        result = orderMainService.updateStsC(main);
        return HttpResult.ok(result);
    }
    @GetMapping(value="/queryPrimaryKey")
    public HttpResult queryPrimaryKey(){
        return HttpResult.ok(orderMainService.queryPrimaryKey());
    }

}
