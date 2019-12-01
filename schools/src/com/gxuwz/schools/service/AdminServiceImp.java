package com.gxuwz.schools.service;


import com.gxuwz.schools.dao.AdminDao;
import com.gxuwz.schools.entity.Admin;

public class AdminServiceImp implements AdminService {
	public AdminDao adminDAO;
	public void setAdminDAO(AdminDao adminDAO) {
		this.adminDAO = adminDAO;
	}

	@Override
	public String login(String adminid,String password,String type) {
		String A = "logout";
		if(adminDAO.login(adminid,password,type)){
			if(type.equals("A")){
				A = "stu_index";
			}if(type.equals("B")){
				A = "tex_index";
			}if(type.equals("C")){
				System.out.println("??="+type);
				A = "user_index";
			}
		}
		return A;
	}


}
