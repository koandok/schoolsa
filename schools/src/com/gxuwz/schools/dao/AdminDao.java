package com.gxuwz.schools.dao;


import com.gxuwz.schools.entity.Admin;
public interface AdminDao {
	public boolean login(String adminid, String password, String type);
}
