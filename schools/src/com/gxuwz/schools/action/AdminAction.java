package com.gxuwz.schools.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gxuwz.schools.entity.Admin;
import com.gxuwz.schools.service.AdminServiceImp;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminAction extends ActionSupport {
    private AdminServiceImp  adminService;
	/**
	 * µÇÂ¼
	 * @return
	 * @throws Exception
	 */
	public String login()throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();	
		
		//È¡Öµ
		String adminId = request.getParameter("adminId");
		String password = request.getParameter("password");
		String type = request.getParameter("type");
		session.setAttribute("adminid", adminId);
		return adminService.login(adminId,password,type);
	}

	//get set model
	public AdminServiceImp getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminServiceImp adminService) {
		this.adminService = adminService;
	}

}