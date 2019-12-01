package com.gxuwz.schools.service;

import java.util.List;


import org.springframework.transaction.annotation.Transactional;

import com.gxuwz.schools.dao.CourseDao;
import com.gxuwz.schools.entity.ChoseCourse;
import com.gxuwz.schools.entity.Teacher;
@Transactional
public class CourseServiceImp implements CourseService {
	public CourseDao courseDao;
	


	
	public ChoseCourse get(String cid, String tid){
		return courseDao.get(cid,  tid);
	
	}

	public List<ChoseCourse> get(String tid){
		return courseDao.get(tid);
	}
	
	public void delete(ChoseCourse course){
		courseDao.delete(course);
	}
	
	public List<ChoseCourse> list(String tid) {
		return courseDao.findAll(tid);
	}
	
	public void save(ChoseCourse course){
		courseDao.save(course);
	}
	
	public void update(ChoseCourse course){
		courseDao.update(course);
	}
	
	//get set
	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}
}
