package com.gxuwz.schools.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.gxuwz.schools.entity.ChoseCourse;
import com.gxuwz.schools.entity.Teacher;

public class CourseDaoImp extends BaseDao implements CourseDao {
	/**
	 * 查看全部
	 */
	@Override
	public List<ChoseCourse> findAll(String tid) {
		List<ChoseCourse> result = new ArrayList<>();
		String hql="from ChoseCourse where tID=?";
		Query query=getSession().createQuery(hql);
		query.setString(0, tid);
		return query.list();

	}
	
	/**
	 * 删除
	 */
	@Override
	public void delete(ChoseCourse course){
			getSession().delete(course);;
		
	}
	

	/***
	 * 查看单个
	 */
	@Override
	public ChoseCourse get(String cid, String tid ){
		String hql="from ChoseCourse where cid=? and tid=?";
		Query query=getSession().createQuery(hql);
		query.setString(0, cid);
		query.setString(1, tid);
		List list= query.list();
		if(!list.isEmpty()){
			return (ChoseCourse)list.get(0);
		}
		else{
		return null;}
	}
	
	
	/**
	 * 通过老师ID查询
	 * @param tid
	 * @return
	 */
	public List<ChoseCourse> get(String tid){
		String hql="from ChoseCourse where tid=?";
		Query query=getSession().createQuery(hql);
		query.setString(0, tid);
			return query.list();
	}
	
	
	@Override
	public void update(ChoseCourse course){
		getSession().update(course);
	}
	@Override
	public void save(ChoseCourse choseCourse){
		getSession().save(choseCourse);
	}
}
