package com.louis.kitty.admin.controller;
import com.louis.kitty.admin.sevice.BCustomerService;
import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
