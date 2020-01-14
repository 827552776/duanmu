package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.model.AccessMaterial;
import com.louis.kitty.admin.model.AccessStock;
import com.louis.kitty.admin.sevice.AccessMaterialIntService;
import com.louis.kitty.admin.sevice.AccessMaterialService;
import com.louis.kitty.admin.sevice.AccessStockService;
import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("accessMaterial")
public class AccessMaterialController {
    @Autowired
    private AccessMaterialService accessMaterialService;
    @Autowired
    private AccessMaterialIntService accessMaterialIntService;

    /**
     * 分页查询
     * @param pageRequest
     * @return
     */
    @PostMapping(value = "/find")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(accessMaterialService.findPage(pageRequest));
    }
    /**
     *
     */
    @PostMapping(value = "/findA")
    public HttpResult findPageA(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(accessMaterialIntService.findPageT(pageRequest));
    }
    @PostMapping(value = "/findR")
    public HttpResult findPage1(@RequestBody PageRequest pageRequest){
        return HttpResult.ok(accessMaterialIntService.findPage1(pageRequest));
    }
    /**
     * 出库（新增/修改）
     */
    @PostMapping(value = "/save")
    public HttpResult save(@RequestBody AccessMaterial record) {
        return HttpResult.ok(accessMaterialService.save(record));
    }
    /**
     * 出库确认
     */
    @PostMapping(value = "/saveConfirm")
    public HttpResult saveConfirm(@RequestBody AccessMaterial record) {
        int a = 1;
        String str ="";
        str = String.valueOf(a);
        record.setType(str);
//        record.setState((long) a);
        return HttpResult.ok(accessMaterialService.save(record));
    }
    /**
     * 入库确认
     */
    /**
     * 出库（新增/修改）
     */
    @PostMapping(value = "/saveConfirmInt")
    public HttpResult saveConfirmInt(@RequestBody AccessMaterial record) {
        int a = 3;
        String str ="";
        str = String.valueOf(a);
        record.setType(str);
//        record.setState((long) a);
        return HttpResult.ok(accessMaterialService.save(record));
    }
}
