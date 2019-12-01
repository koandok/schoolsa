package com.gxuwz.schools.dao;

import java.util.List;

import com.gxuwz.schools.entity.ChoseCourse;
import com.gxuwz.schools.entity.Teacher;

public interface CourseDao {


	public void delete(ChoseCourse course);


	public ChoseCourse get(String cid, String tid);

	
	public void save(ChoseCourse course);

	void update(ChoseCourse course);

	List<ChoseCourse> findAll(String tid);

	public List<ChoseCourse> get(String tid);
}
