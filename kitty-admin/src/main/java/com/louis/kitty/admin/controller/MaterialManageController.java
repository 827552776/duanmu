package com.louis.kitty.admin.controller;

import com.louis.kitty.admin.constants.SysConstants;
import com.louis.kitty.admin.model.MaterialManage;
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
}

