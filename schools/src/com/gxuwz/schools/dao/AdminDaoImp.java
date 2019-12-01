package com.gxuwz.schools.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.gxuwz.schools.entity.Admin;
public class AdminDaoImp extends BaseDao implements AdminDao {
	
	//µÇÂ¼·½·¨
	@Override
	public boolean login(String adminid, String password, String type) {
		
		String hql="";

		if(type.equals("C")){
			hql="from Admin where adminId=? and password=?";
		}if(type.equals("B")){
			hql="from Teacher where tID=? and password=?";
		}else{
			hql="from Student where sID=? and password=?";
		}
		Query query=getSession().createQuery(hql);
		query.setString(0, adminid);
		query.setString(1, password);
		List list= query.list();
		if(!list.isEmpty()){
			return true;
		}
		else{
		return false;}
	}
}
