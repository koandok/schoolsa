package com.gxuwz.schools.service;

import com.gxuwz.schools.entity.Admin;

public interface AdminService {
	String login(String adminid, String password, String type);
}
