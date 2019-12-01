package com.gxuwz.schools.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gxuwz.schools.dao.DepDao;
import com.gxuwz.schools.entity.*;
@Transactional
public class DepServiceimp implements DepService {
	DepDao depDao;
	
	public Department getone(String id){
		return depDao.getone(id);
	
	}

	public List<Department> get(String id){
		return depDao.get(id);
	}
	
	public void delete(Department entity){
		depDao.delete(entity);
	}
	
	public List<Department> list() {
		return depDao.list();
	}
	
	public void save(Department entity){
		depDao.save(entity);
	}
	
	public void update(Department entity){
		depDao.update(entity);
	}
	
	//get set
	public void setdepDao(DepDao depDao) {
		this.depDao = depDao;
	}
	public void setDepDao(DepDao depDao) {
		this.depDao = depDao;
	}
}