package com.gxuwz.schools.dao;

import java.util.List;

import com.gxuwz.schools.entity.Classes;

public interface ClassesDao {
	public Classes getone(String id);

	public List<Classes> get(String id);
	
	public void delete(Classes entity);
	
	public List<Classes> list();
	
	public void save(Classes entity);
	
	public void update(Classes entity);

}
