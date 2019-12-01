package com.gxuwz.schools.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.gxuwz.schools.entity.Department;
import com.gxuwz.schools.service.DepService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DepAction extends ActionSupport implements ModelDriven<Department>{
	Department dep = new Department();
	DepService depService;
	List<Department> list;
	

	public String list(){	
		list = depService.list();
		return "list";
	}

	public String delete(){
		HttpServletRequest request = ServletActionContext.getRequest();
		
		System.out.println(request.getParameter("depid"));
		dep.setDepid(request.getParameter("depid"));
		
		System.out.println("-"+dep.getDepid());
		dep = depService.getone(dep.getDepid());
		depService.delete(dep);	
		return list();
	}

	public String add(){
		depService.save(dep);
		return list();
	}
	
	public String get(){
		System.out.println("-"+dep.getDepid());
		dep = depService.getone(dep.getDepid());
		return "get";
	}

	public String update(){
		depService.update(dep);
		return list();
	}
	

	public String getbyID(){
		list = depService.list();
		return "list";
	}

	
	//get set

	@Override
	public Department getModel() {
		// TODO Auto-generated method stub
		return dep;
	}
	
	public List<Department> getList() {
		return list;
	}

	public void setList(List<Department> list) {
		this.list = list;
	}

	public void setDepService(DepService depService) {
		this.depService = depService;
	}
	
}
