package com.louis.kitty.admin.util;

import com.louis.kitty.common.utils.IOUtils;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.*;

/**
 * POI相关操作
 *
 */
public class PoiUtils {
    /**
     * 生成Excel文件
     *
     */
    public static File createExcelFile(Workbook workbook,String fileName){
        OutputStream stream = null;
        File file = null;
        try {
        file = File.createTempFile(fileName,".xlsx");
        stream = new FileOutputStream(file.getAbsoluteFile());
        workbook.write(stream);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            IOUtils.closeQuietly(workbook);
            IOUtils.closeQuietly(stream);
        }
        return file;
    }
}
