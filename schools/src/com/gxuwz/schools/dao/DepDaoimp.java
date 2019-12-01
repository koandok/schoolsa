package com.gxuwz.schools.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.gxuwz.schools.entity.Department;

public class DepDaoimp extends BaseDao implements DepDao {

	@Override
	public List<Department> list(){
		String hql="from Department where 1=1";
		Query query=getSession().createQuery(hql);
		return query.list();

	}
	

	@Override
	public void delete(Department course){
			getSession().delete(course);;
		
	}
	


	@Override
	public Department getone(String id ){
		String hql="from Department where depid=?";
		Query query=getSession().createQuery(hql);
		query.setString(0, id);
		System.out.println("+++++++++++++++"+id);
		List list= query.list();
		if(!list.isEmpty()){
			return (Department)list.get(0);
		}
		else{
		return null;}
	}
	
	

	public List<Department> get(String id){
		String hql="from Department where id=?";
		Query query=getSession().createQuery(hql);
		query.setString(0, id);
			return query.list();
	}
	
	
	@Override
	public void update(Department entry){
		getSession().update(entry);
	}
	@Override
	public void save(Department entry){
		getSession().save(entry);
	}
}
