package com.gxuwz.schools.dao;

import java.util.List;

import com.gxuwz.schools.entity.AttendanceList;
import com.gxuwz.schools.entity.AttendanceSheet;

public interface CheckDao {
	public boolean save(AttendanceSheet attendanceSheet);
	public List<AttendanceList> list(String cid, String num);
	public List<AttendanceSheet> sheetlist();
}
