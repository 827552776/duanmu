package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.constants.SysConstants;
import com.louis.kitty.admin.model.MaterialManage;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.model.TrStockManage;
import com.louis.kitty.admin.sevice.MaterialManageService;
import com.louis.kitty.admin.util.FileUtils;
import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.List;

/**
 * 库存管理模块
 */
@RestController
@RequestMapping("material")
public class MaterialManageController {
    @Autowired
    private MaterialManageService materialManageService;
    /**
     * 分页查询
     */
    @PostMapping(value = "/find")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(materialManageService.findPage(pageRequest));
    }
    @PostMapping(value = "/findZI")
    public HttpResult findPageZI(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(materialManageService.findPageZI(pageRequest));
    }
    @PostMapping(value = "/findAb")
    public HttpResult findPageAb(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(materialManageService.findPageAb(pageRequest));
    }
    @PostMapping(value="/delete")
    public HttpResult delete(@RequestBody List<MaterialManage> record) {
        return HttpResult.ok(materialManageService.delete(record));
    }
    /**
     * 新增
     */
    @PostMapping(value="/save")
    public HttpResult save(@RequestBody MaterialManage record) {
        Long a = record.getIntNumber();
        Long b= record.getOutNumber();
        if((record.getNumber()+a-b)>record.getTypeNumber()){
            record.setType(0);
        }else {
            record.setType(1);
        }
        //无外协,全出库的状态为1
        if(record.getOutStatus() == 0 && (record.getNumber()-b) == 0){
            record.setPerStatus(1);
        }else if(record.getOutStatus() == 0 && record.getNumber()>(record.getNumber()-b) && (record.getNumber()-b)> 0){
            record.setPerStatus(2);//无外协,未完全出库状态为1
        }else {
            record.setPerStatus(0);//无出库
        }
        //外协回来
        if(record.getOutStatus() == 1 && (record.getTotalOut()-a) == 0){
            record.setOutStatus(0);
            record.setTotalOut(record.getTotalOut()-a);
        }else {
            record.setTotalOut(record.getTotalOut()-a);
        }
        record.setNumber(record.getNumber()+a-b);
        record.setIntNumber((long) 0);
        record.setOutNumber((long) 0);
        return HttpResult.ok(materialManageService.save(record));
    }
    /**
     * 导出Excel
     */
    @PostMapping(value = "/exportExcel")
    public void exportExcelUser(@RequestBody PageRequest pageRequest, HttpServletResponse res){
        File file = materialManageService.createUserExcelFile(pageRequest);
        FileUtils.downloadFile(res,file,file.getName());
    }
    //模具和材料联合查询
    @PostMapping(value = "/queryTogeter")
    public HttpResult queryTogeter(@RequestBody OrderMain orderMain) {
        return HttpResult.ok(materialManageService.queryTogeter(orderMain));
    }
}

