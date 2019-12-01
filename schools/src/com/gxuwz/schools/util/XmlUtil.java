package com.gxuwz.schools.util;

import java.util.List;

import org.apache.poi.hssf.usermodel.*;

import com.gxuwz.schools.entity.AttendanceSheet;




public class XmlUtil {
	String[] excelHeader = {"课程ID","老师ID","学生ID","学生名字","班级","时间","状态"};  
    public HSSFWorkbook export(List<AttendanceSheet> list) {  
        HSSFWorkbook wb = new HSSFWorkbook();  
        HSSFSheet sheet = wb.createSheet("Student");  
        HSSFRow row = sheet.createRow((int) 0);  
        HSSFCellStyle style = wb.createCellStyle();  
        //style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
  
        for (int i = 0; i < excelHeader.length; i++) {  
            HSSFCell cell = row.createCell(i);  
            cell.setCellValue(excelHeader[i]);  
            cell.setCellStyle(style);  
            sheet.autoSizeColumn(i);  
         // sheet.SetColumnWidth(i, 100 * 256);  
        }  
  
        for (int i = 0; i < list.size(); i++) {  
            row = sheet.createRow(i + 1);  
            AttendanceSheet sheet1 = list.get(i);  
            row.createCell(0).setCellValue(sheet1.getCid());  
            row.createCell(1).setCellValue(sheet1.getTid());  
            row.createCell(2).setCellValue(sheet1.getSid());  
            row.createCell(3).setCellValue(sheet1.getSname());  
            row.createCell(4).setCellValue(sheet1.getClasses());  
            row.createCell(5).setCellValue(sheet1.getCtime());  
            row.createCell(6).setCellValue(sheet1.getStats());  
            
        }  
        return wb;  
    }  

}
