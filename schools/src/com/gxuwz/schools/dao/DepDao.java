package com.gxuwz.schools.dao;

import java.util.List;

import com.gxuwz.schools.entity.Department;

public interface DepDao {
	public Department getone(String id);

	public List<Department> get(String id);
	
	public void delete(Department entity);
	
	public List<Department> list();
	
	public void save(Department entity);
	
	public void update(Department entity);

}
