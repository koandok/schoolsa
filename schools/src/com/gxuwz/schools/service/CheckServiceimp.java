package com.gxuwz.schools.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gxuwz.schools.dao.CheckDao;
import com.gxuwz.schools.entity.AttendanceList;
import com.gxuwz.schools.entity.AttendanceSheet;
@Transactional
public class CheckServiceimp implements CheckService {
	CheckDao checkDao;
	
	public boolean save(AttendanceSheet attendanceSheet){
		return checkDao.save(attendanceSheet);
	}

	public List<AttendanceList> list(String cid,String num){
		return checkDao.list(cid,num);
	}
	public List<AttendanceSheet> sheetlist(){
		return checkDao.sheetlist();
	}
	//set
	public void setCheckDao(CheckDao checkDao) {
		this.checkDao = checkDao;
	}
}
