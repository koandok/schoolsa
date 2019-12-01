package com.gxuwz.schools.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gxuwz.schools.entity.ChoseCourse;
import com.gxuwz.schools.entity.Teacher;
public interface CourseService {
	public List<ChoseCourse> list(String tid);

	public void delete(ChoseCourse course);
	public void save(ChoseCourse course);
	public void update(ChoseCourse course);
	public ChoseCourse get(String cid, String tid);
	public List<ChoseCourse> get(String tid);

	
}
