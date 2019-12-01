package com.gxuwz.schools.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.gxuwz.schools.entity.Classes;
import com.gxuwz.schools.service.ClassesService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ClassesAction extends ActionSupport implements ModelDriven<Classes>{
	Classes entity = new Classes();
	ClassesService classesService;
	List<Classes> list;
	

	public String list(){	
		list = classesService.list();
		return "list";
	}

	public String delete(){
		HttpServletRequest request = ServletActionContext.getRequest();
		System.out.println(entity.getClassid());
		
		entity = classesService.getone(entity.getClassid());
		classesService.delete(entity);	
		return list();
	}

	public String add(){
		classesService.save(entity);
		return list();
	}
	
	public String get(){
		entity = classesService.getone(entity.getClassid());
		return "get";
	}

	public String update(){
		classesService.update(entity);
		return list();
	}
	

	public String getbyID(){
		list = classesService.list();
		return "list";
	}

	
	//get set

	@Override
	
	
	public Classes getModel() {
		// TODO Auto-generated method stub
		return entity;
	}
	
	public void setClassesService(ClassesService classesService) {
		this.classesService = classesService;
	}

	public List<Classes> getList() {
		return list;
	}

	public void setList(List<Classes> list) {
		this.list = list;
	}


	
}
