package com.louis.kitty.admin.sevice.impl;

import com.louis.kitty.admin.dao.MaterialManageMapper;
import com.louis.kitty.admin.model.MaterialManage;
import com.louis.kitty.admin.model.OrderMain;
import com.louis.kitty.admin.sevice.MaterialManageService;
import com.louis.kitty.admin.util.PoiUtils;
import com.louis.kitty.core.page.ColumnFilter;
import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class MaterialManageServiceImpl implements MaterialManageService {
   @Autowired
   private MaterialManageMapper materialManageMapper;
   @Override
    public int save(MaterialManage record) {
        if(record.getId() == null || record.getId() == 0) {
            return materialManageMapper.insertSelective(record);
        }
        return materialManageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(MaterialManage record) {
        return materialManageMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<MaterialManage> records) {
        for(MaterialManage record:records){
            delete(record);
        }
        return 1;
    }

    @Override
    public MaterialManage findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("name");
        ColumnFilter columnFilter1 = pageRequest.getColumnFilter("mName");
        if(columnFilter != null && columnFilter1 !=null) {
            return MybatisPageHelper.findPage(pageRequest, materialManageMapper, "findPageByNameAndmName", columnFilter.getValue(),columnFilter1.getValue());
        }
        return MybatisPageHelper.findPage(pageRequest, materialManageMapper);
    }

    @Override
    public PageResult findPageAb(PageRequest pageRequest) {
        ColumnFilter columnFilter = pageRequest.getColumnFilter("label");
        if(columnFilter != null) {
            return MybatisPageHelper.findPageAb(pageRequest, materialManageMapper, "findPageByLabel", columnFilter.getValue());
        }
        return MybatisPageHelper.findPageAb(pageRequest, materialManageMapper);
    }
    @Override
    public File createUserExcelFile (PageRequest pageRequest){
       PageResult pageResult = findPage(pageRequest);
       return createUserExcelFile(pageResult.getContent());
    }

    @Override
    public List<MaterialManage> queryTogeter(OrderMain orderMain) {
       String id = orderMain.getId();
        return materialManageMapper.queryTogeter(id);
    }

    public static File createUserExcelFile(List<?> records){
       if(records == null){
           records = new ArrayList<>();
       }
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet();
        Row row0 = sheet.createRow(0);
        int columnIndex = 0;
        row0.createCell(columnIndex).setCellValue("NO");
        row0.createCell(columnIndex).setCellValue("ID");
        row0.createCell(columnIndex).setCellValue("模具名称");
        row0.createCell(columnIndex).setCellValue("名称");
        row0.createCell(columnIndex).setCellValue("数量");
        row0.createCell(columnIndex).setCellValue("尺寸");
        row0.createCell(columnIndex).setCellValue("价格");
        row0.createCell(columnIndex).setCellValue("对账信息");
        row0.createCell(columnIndex).setCellValue("发票信息");
        row0.createCell(columnIndex).setCellValue("备注");
        row0.createCell(columnIndex).setCellValue("创建人");
        for(int i = 0 ; i < records.size() ; i++){
            MaterialManage materialManage = (MaterialManage) records.get(i);
            Row row = sheet.createRow(i +1);
            for (int j = 0;j < columnIndex + 1;j++){
                row.createCell(j);
            }
            columnIndex = 0;
            row.getCell(columnIndex).setCellValue(i+1);
            row.getCell(columnIndex).setCellValue(materialManage.getId());
            row.getCell(columnIndex).setCellValue(materialManage.getmName());
            row.getCell(columnIndex).setCellValue(materialManage.getName());
            row.getCell(columnIndex).setCellValue(materialManage.getNumber());
            row.getCell(columnIndex).setCellValue(materialManage.getSize());
            row.getCell(columnIndex).setCellValue(materialManage.getSize());
            row.getCell(columnIndex).setCellValue(materialManage.getState());
            row.getCell(columnIndex).setCellValue(materialManage.getInvoice());
            row.getCell(columnIndex).setCellValue(materialManage.getRemarks());
            row.getCell(columnIndex).setCellValue(materialManage.getCreateBy());
//            row.getCell(++columnIndex).setCellValue(DateTimeUtils.getDateTime(materialManage.getCreateTime()));

        }
        return PoiUtils.createExcelFile(workbook,"download_user");
    }
}
