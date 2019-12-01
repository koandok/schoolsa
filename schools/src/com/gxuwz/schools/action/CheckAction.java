package com.gxuwz.schools.action;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.struts2.ServletActionContext;

import com.gxuwz.schools.dao.CheckDao;
import com.gxuwz.schools.entity.AttendanceList;
import com.gxuwz.schools.entity.AttendanceSheet;
import com.gxuwz.schools.service.CheckService;
import com.gxuwz.schools.util.DateUtil;
import com.gxuwz.schools.util.XmlUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CheckAction extends ActionSupport {
		CheckService checkService;
		AttendanceList attendacne;
		AttendanceSheet attendanceSheet;
		List<AttendanceList> atlist;
		List<AttendanceSheet> atsheetlist;

		/**
		 * 显示班级名单
		 * @return
		 */
		public String list(){	
			HttpServletRequest request = ServletActionContext.getRequest();
			System.out.println(request.getParameter("num"));
			atlist=checkService.list(request.getParameter("cid"),request.getParameter("num"));
			if(atlist==null){
				return "error";
			}
			return "list";
		}
		
		public String add(){
			HttpServletRequest request = ServletActionContext.getRequest();
			attendanceSheet.setTid((String)request.getSession().getAttribute("adminid"));
			if(checkService.save(attendanceSheet)){
				return "return";
			}else{
			return "error";}
		}
		/**
		 * 考勤名单显示
		 * @return
		 */
		public String xmllist(){
			atsheetlist = checkService.sheetlist();
			return "xmllist";
		}
		
		
		
		//get set
		
		public CheckService getCheckService() {
			return checkService;
		}

		public List<AttendanceList> getAtlist() {
			return atlist;
		}

		public void setAtlist(List<AttendanceList> atlist) {
			this.atlist = atlist;
		}



		public List<AttendanceSheet> getAtsheetlist() {
			return atsheetlist;
		}



		public void setAtsheetlist(List<AttendanceSheet> atsheetlist) {
			this.atsheetlist = atsheetlist;
		}



		public void setCheckService(CheckService checkService) {
			this.checkService = checkService;
		}

		public AttendanceList getAttendacne() {
			return attendacne;
		}

		public void setAttendacne(AttendanceList attendacne) {
			this.attendacne = attendacne;
		}

		public AttendanceSheet getAttendanceSheet() {
			return attendanceSheet;
		}

		public void setAttendanceSheet(AttendanceSheet attendanceSheet) {
			this.attendanceSheet = attendanceSheet;
		}

}
