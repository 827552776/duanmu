package com.louis.kitty.admin.controller;
import com.louis.kitty.admin.model.Parts;
import com.louis.kitty.admin.sevice.PartsService;
import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    //保存工艺编制信息
    @PostMapping(value="/saveCraft")
    public HttpResult saveCraft(@RequestBody Parts parts){
        int result = 0;
        result = partsService.saveCraft(parts);
        return HttpResult.ok(result);
    }
    //查询工艺流程
    @PostMapping(value="/queryCraft")
    public HttpResult queryCraft(@RequestBody Parts parts){
        return HttpResult.ok(partsService.queryCraft(parts));
    }
}
