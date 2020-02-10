package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.OrderMainMapper;
import com.louis.kitty.admin.dao.PartsMapper;
import com.louis.kitty.admin.model.Filter;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.model.Parts;
import com.louis.kitty.admin.sevice.PartsService;
import com.louis.kitty.core.page.ColumnFilter;
import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartsServiceImpl implements PartsService{
    int n = 0;
    @Autowired
    private PartsMapper partsMapper;
    @Autowired
    private OrderMainMapper orderMainMapper;
    @Override
    public int save(Parts record) {
        return partsMapper.insert(record);
    }

    @Override
    public int delete(Parts record) {
        return 0;
    }

    @Override
    public int delete(List<Parts> records) {
        return 0;
    }

    @Override
    public Parts findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {

        ColumnFilter columnFilter = pageRequest.getColumnFilter("name");
        if(columnFilter.getValue() != "") {
            return MybatisPageHelper.findPage(pageRequest, partsMapper, "findPageBy", columnFilter.getValue());
        }
        return MybatisPageHelper.findPage(pageRequest, partsMapper);
    }
    @Override
    public PageResult findPage1(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("name");
        if(columnFilter.getValue() != "") {
            return MybatisPageHelper.findPage(pageRequest, partsMapper, "findPageByLabel", columnFilter.getValue());
        }
        return MybatisPageHelper.findPage1(pageRequest, partsMapper);
    }
    @Override
    public int saveCraft(Parts parts) {
        return partsMapper.updateCraft(parts);
    }
    @Override
    public int saveCraftbefor(Parts parts) {
        parts.setFlow(parts.getInputValue());
        return partsMapper.updateCraftbefor(parts);
    }
    @Override
    public int savePurch(Parts parts) {
        return partsMapper.insertPurch(parts);
    }

    @Override
    public String queryCraft(Parts parts) {
         Long id=  parts.getId();
         return partsMapper.queryCraft(id);
    }
    @Override
    public List<Parts> queryParts(OrderMain orderMain) {
       String fid = orderMain.getId();
        return partsMapper.queryParts(fid);
    }
    @Override
    public List<Parts> findPagePp(Filter filter) {
        String name = filter.getName();
        String mouldNm = filter.getMouldNm();
        return partsMapper.findPagePp(name,mouldNm);
    }
    @Override
    public List<Parts> findPageD(Filter filter) {
        String name = filter.getName();
        String mouldNm = filter.getMouldNm();
        return partsMapper.findPageD(name,mouldNm);
    }

    @Override
    public List<Parts> findPageDn(Filter filter) {
        String name = filter.getName();
        String mouldNm = filter.getMouldNm();
        return partsMapper.findPageDn(name,mouldNm);
    }

    @Override
    public int updatePick(Parts parts) {
        Long id = parts.getId();
        return partsMapper.updatePick(id);
    }

    @Override
    public int updateStsC(Parts parts) {

        return partsMapper.updateStsC(parts);
    }
    @Override
    public int updateStsB(Parts parts) {
        Long id = parts.getId();
        return partsMapper.updateStsB(id);
    }
    @Override
    public int updateStsA(Parts parts) {
        Long id = parts.getId();
        return partsMapper.updateStsA(id);
    }
    @Override
    public Integer updateStsD(Parts parts) {
        Long id = parts.getId();
        String fId = parts.getfId();
         partsMapper.updateStsD(id);
         Integer total = partsMapper.queryByFid(fId);
         Integer totalD = partsMapper.queryByFidd(fId);
         if(total==totalD){
             orderMainMapper.updateStsD(fId);
         }
         return 0;
    }
    @Override
    public int deleteParts(Parts parts) {
       Long id = parts.getId();
        return partsMapper.deleteParts(id);
    }

    @Override
    public PageResult findPageQc(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("name");
        if(columnFilter.getValue() != "") {
            return MybatisPageHelper.findPage(pageRequest, partsMapper, "findPageByQc", columnFilter.getValue());
        }
        return MybatisPageHelper.findPageQc(pageRequest, partsMapper);
    }

    @Override
    public PageResult findPagePr(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("name");
        if(columnFilter.getValue() != "") {
            return MybatisPageHelper.findPage(pageRequest, partsMapper, "findPageByPr", columnFilter.getValue());
        }
        return MybatisPageHelper.findPagePr(pageRequest, partsMapper);
    }

    @Override
    public PageResult findPagePi(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("name");
        if(columnFilter.getValue() != "") {
            return MybatisPageHelper.findPage(pageRequest, partsMapper, "findPageByPi", columnFilter.getValue());
        }
        return MybatisPageHelper.findPagePi(pageRequest, partsMapper);
    }

    @Override
    public int fixRetrn(Parts parts) {
        n = partsMapper.updateStsAA(parts);
        return n;
    }

    @Override
    public int fix(Parts parts) {
        parts.setId(null);
        return partsMapper.insertStsD(parts);
    }
}
