package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.model.AccessMaterial;
import com.louis.kitty.admin.model.AccessStock;
import com.louis.kitty.admin.model.MaterialManage;
import com.louis.kitty.admin.model.OrderMain;
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

import java.util.List;

@RestController
@RequestMapping("accessMaterial")
public class AccessMaterialController {
    @Autowired
    private AccessMaterialService accessMaterialService;
    @Autowired
    private AccessMaterialIntService accessMaterialIntService;

    /**
     * 自用出库记录分页查询
     * @param pageRequest
     * @return
     */
    @PostMapping(value = "/findAb")
    public HttpResult findPageAb(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(accessMaterialService.findPageAb(pageRequest));
    }
    /**
     * 外协出库记录分页查询
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
        System.out.println(record.getIntType());
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
     * 删除
     */
    @PostMapping(value="/delete")
    public HttpResult delete(@RequestBody List<AccessMaterial> record) {
        return HttpResult.ok(accessMaterialService.delete(record));
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

    @PostMapping(value = "/queryTogeter")
    public HttpResult queryTogeter(@RequestBody OrderMain orderMain) {
        return HttpResult.ok(accessMaterialService.queryTogeter(orderMain));
    }
}
