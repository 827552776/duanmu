package com.louis.kitty.admin.controller;
import com.louis.kitty.admin.model.Filter;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.model.Parts;
import com.louis.kitty.admin.sevice.PartsService;
import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("parts")
public class PartsController {
    @Autowired
    private PartsService partsService;
    @PostMapping(value="/save")
    public HttpResult save(@RequestBody Parts parts){
        int result = 0;
        result = partsService.save(parts);
        return HttpResult.ok(result);
    }
    //查询
    @PostMapping(value="/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(partsService.findPage(pageRequest));
    }
    @PostMapping(value="/findPage1")
    public HttpResult findPage1(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(partsService.findPage1(pageRequest));
    }
    //查询质检
    @PostMapping(value="/findPageQc")
    public HttpResult findPageQc(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(partsService.findPageQc(pageRequest));
    }
    //查询生产采购
    @PostMapping(value="/findPagePr")
    public HttpResult findPagePr(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(partsService.findPagePr(pageRequest));
    }
    //查询车间领料
    @PostMapping(value="/findPagePi")
    public HttpResult findPagePi(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(partsService.findPagePi(pageRequest));
    }
    //查询生产进程
    @PostMapping(value="/findPagePp")
    public HttpResult findPagePp(@RequestBody Filter filter) {
        return HttpResult.ok(partsService.findPagePp(filter));
    }
    //查询待入库合格品部件
    @PostMapping(value="/findPageD")
    public HttpResult findPageD(@RequestBody Filter filter) {
        return HttpResult.ok(partsService.findPageD(filter));
    }
    //查询待入库合格品部件
    @PostMapping(value="/findPageDn")
    public HttpResult findPageDn(@RequestBody Filter filter) {
        return HttpResult.ok(partsService.findPageDn(filter));
    }
    //修改工艺流程
    @PostMapping(value="/saveCraft")
    public HttpResult saveCraft(@RequestBody Parts parts){
        int result = 0;
        result = partsService.saveCraft(parts);
        return HttpResult.ok(result);
    }
    //保存工艺编制信息
    @PostMapping(value="/saveCraftbefor")
    public HttpResult saveCraftbefor(@RequestBody Parts parts){
        int result = 0;
        result = partsService.saveCraftbefor(parts);
        return HttpResult.ok(result);
    }
    //查询工艺流程
    @PostMapping(value="/queryCraft")
    public HttpResult queryCraft(@RequestBody Parts parts){
        return HttpResult.ok(partsService.queryCraft(parts));
    }
    //查询部件信息
    @PostMapping(value="/queryParts")
    public HttpResult queryParts(@RequestBody OrderMain orderMain){
        return HttpResult.ok(partsService.queryParts(orderMain));
    }
    //已领料
    @PostMapping(value="/updatePick")
    public HttpResult updatePick(@RequestBody Parts parts){
        return HttpResult.ok(partsService.updatePick(parts));
    }
    //更改部件生产状态
    @PostMapping(value="/updateStsC")
    public HttpResult updateStsC(@RequestBody Parts parts){
        return HttpResult.ok(partsService.updateStsC(parts));
    }
    //更改部件生产状态
    @PostMapping(value="/updateStsA")
    public HttpResult updateStsA(@RequestBody Parts parts){
        return HttpResult.ok(partsService.updateStsA(parts));
    }
    //更改部件生产状态
    @PostMapping(value="/updateStsB")
    public HttpResult updateStsB(@RequestBody Parts parts){
        return HttpResult.ok(partsService.updateStsB(parts));
    }
    //更改部件生产状态
    @PostMapping(value="/updateStsD")
    public HttpResult updateStsD(@RequestBody Parts parts){
        return HttpResult.ok(partsService.updateStsD(parts));
    }
    //标件退回
    @PostMapping(value="/fixRetrn")
    public HttpResult fixRetrn(@RequestBody Parts parts){
        return HttpResult.ok(partsService.fixRetrn(parts));
    }
    //标件合格品
    @PostMapping(value="/fix")
    public HttpResult fix(@RequestBody Parts parts){
        return HttpResult.ok(partsService.fix(parts));
    }
    //删除部件
    @PostMapping(value="/deleteParts")
    public HttpResult deleteParts(@RequestBody Parts parts){
        return HttpResult.ok(partsService.deleteParts(parts));
    }
    //保存临时采购单
    @PostMapping(value="/savePurch")
    public HttpResult savePurch(@RequestBody Parts parts){
        int result = 0;
        result = partsService.savePurch(parts);
        return HttpResult.ok(result);
    }
}
