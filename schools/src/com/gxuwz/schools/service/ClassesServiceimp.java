package com.gxuwz.schools.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gxuwz.schools.dao.ClassesDao;
import com.gxuwz.schools.dao.DepDao;
import com.gxuwz.schools.entity.*;
@Transactional
public class ClassesServiceimp implements ClassesService {
	ClassesDao classesDao;
	
	public Classes getone(String id){
		return classesDao.getone(id);
	
	}

	public List<Classes> get(String id){
		return classesDao.get(id);
	}
	
	public void delete(Classes entity){
		classesDao.delete(entity);
	}
	
	public List<Classes> list() {
		return classesDao.list();
	}
	
	public void save(Classes entity){
		classesDao.save(entity);
	}
	
	public void update(Classes entity){
		classesDao.update(entity);
	}


	
	//get set
	public ClassesDao getClassesDao() {
		return classesDao;
	}

	public void setClassesDao(ClassesDao classesDao) {
		this.classesDao = classesDao;
	}
}