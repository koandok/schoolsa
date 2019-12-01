package com.gxuwz.schools.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.gxuwz.schools.entity.Classes;

public class ClassesDaoimp extends BaseDao implements ClassesDao {

	@Override
	public List<Classes> list(){
		String hql="from Classes where 1=1";
		Query query=getSession().createQuery(hql);
		return query.list();

	}
	

	@Override
	public void delete(Classes course){
			getSession().delete(course);;
		
	}
	


	@Override
	public Classes getone(String id ){
		String hql="from Classes where classid=?";
		Query query=getSession().createQuery(hql);
		query.setString(0, id);
		List list= query.list();
		if(!list.isEmpty()){
			return (Classes)list.get(0);
		}
		else{
		return null;}
	}
	
	

	public List<Classes> get(String id){
		String hql="from Classes where classid=?";
		Query query=getSession().createQuery(hql);
		query.setString(0, id);
			return query.list();
	}
	
	
	@Override
	public void update(Classes entry){
		getSession().update(entry);
	}
	@Override
	public void save(Classes entry){
		getSession().save(entry);
	}
}
