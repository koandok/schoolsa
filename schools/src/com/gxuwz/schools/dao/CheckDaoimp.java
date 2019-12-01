package com.gxuwz.schools.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.gxuwz.schools.entity.AttendanceList;
import com.gxuwz.schools.entity.AttendanceSheet;
import com.gxuwz.schools.entity.ChoseCourse;
import com.gxuwz.schools.util.DateUtil;
import com.gxuwz.schools.util.RandomUtil;

public class CheckDaoimp extends BaseDao implements CheckDao {
	DateUtil dateUtil = new DateUtil();
	
	public List<AttendanceList> list(String cid,String num){
		RandomUtil randUtil = new RandomUtil();
		String hql="from AttendanceList where cid=?";
		Query query=getSession().createQuery(hql);
		query.setString(0, cid);
		List<AttendanceList> list = query.list();
		if(num==null||num.equals("0" )){
			return list;	
		}else{
			
			if(Integer.parseInt(num)>list.size()){				
			return null;	
			}else{
			List<AttendanceList> list2 = new ArrayList<AttendanceList>();
			int[] reult = randUtil.randomArray(0, list.size()-1, Integer.parseInt(num));
			for(int i : reult){
				list2.add((AttendanceList)list.get(i)) ;
			}
			return list2;
			}
	}
	
	}
	
	
	public List<AttendanceSheet> sheetlist(){
		String hql="from AttendanceSheet where 1=1";
		Query query=getSession().createQuery(hql);
		List<AttendanceSheet> list = query.list();
		return list;
	}
	

	
	
	public boolean checkone(String cid,String sid,String time){
		String hql="from AttendanceSheet where cid=? and sid=? and ctime=?";
		Query query=getSession().createQuery(hql);
		query.setString(0, cid);
		query.setString(1, sid);
		query.setString(2, time);
		List list = query.list();
		if(!list.isEmpty()){
			return false;
		}else{
			return true;
		}
	}
	
	
	
	public boolean save(AttendanceSheet attendanceSheet){
		
		attendanceSheet.setCtime(dateUtil.DateNow());
		if(checkone(attendanceSheet.getCid(),attendanceSheet.getSid(),attendanceSheet.getCtime())){
		getSession().save(attendanceSheet);
		return true;
		}else{
			return false;
		}
		
	}
}
