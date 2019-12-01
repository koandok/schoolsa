package com.gxuwz.schools.action;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.struts2.ServletActionContext;

import com.gxuwz.schools.dao.CheckDao;
import com.gxuwz.schools.entity.AttendanceList;
import com.gxuwz.schools.entity.AttendanceSheet;
import com.gxuwz.schools.service.CheckService;
import com.gxuwz.schools.util.XmlUtil;

public class XmlAction extends HttpServlet {

	CheckDao checkDao;
		
	public void out() {
		List<AttendanceSheet> atsheetlist = new ArrayList<AttendanceSheet>();
		atsheetlist =	checkDao.sheetlist();
		HttpServletResponse response = ServletActionContext.getResponse();
		XmlUtil xml =new XmlUtil();
        HSSFWorkbook wb = xml.export(atsheetlist);
        response.setContentType("application/vnd.ms-excel");  
        response.setHeader("Content-disposition", "attachment;filename=xml.xls");  
        try {
        OutputStream ouputStream = response.getOutputStream();  
    
			wb.write(ouputStream);
			ouputStream.flush();
			ouputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  

	}

	public void setCheckDao(CheckDao checkDao) {
		this.checkDao = checkDao;
	}
	
	
}
