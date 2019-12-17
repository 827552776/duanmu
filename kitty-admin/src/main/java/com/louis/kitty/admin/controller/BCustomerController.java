package com.louis.kitty.admin.controller;
import com.louis.kitty.admin.model.BCustomer;
import com.louis.kitty.admin.model.BaseModel;
import com.louis.kitty.admin.model.CustomerParam;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.sevice.BCustomerService;
import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 客户信息模块
 */
@RestController
@RequestMapping("customer")
public class BCustomerController {
    @Autowired
     private BCustomerService bCustomerService;
    /**
     * 分页查询
     */
    @PostMapping(value="/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(bCustomerService.findPage(pageRequest));
    }
    @PostMapping(value="/query")
    public HttpResult query(@RequestBody CustomerParam customerParam) {
        return HttpResult.ok(bCustomerService.query(customerParam));
    }
    //删除
    @PostMapping(value="/delete")
    public HttpResult delete(@RequestBody List<BCustomer> record) {
        return HttpResult.ok(bCustomerService.delete(record));
    }
    //保存
    @PostMapping(value="/save")
    public HttpResult save(@RequestBody BCustomer bCustomer) {
        return HttpResult.ok(bCustomerService.save(bCustomer));
    }
}
