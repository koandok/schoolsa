package com.gxuwz.schools.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gxuwz.schools.entity.ChoseCourse;
import com.gxuwz.schools.entity.Teacher;
import com.gxuwz.schools.service.CourseService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CourseAction extends ActionSupport implements ModelDriven<ChoseCourse> {
	
	ChoseCourse course = new ChoseCourse();
	private Teacher teacher=new Teacher();
	CourseService courseService;
	List<ChoseCourse> courselist;
	
	
	/**
	 * ¡–±Ìœ‘ æ
	 * @return
	 */
	public String course(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();	
		String adminid = (String)session.getAttribute("adminid");
		courselist = courseService.list(adminid);
		return "courselist";
	}

	public String delete(){
		try{
		course = courseService.get(course.getCid(),course.getTid());
		courseService.delete(course);
		}catch(Exception e){
			e.printStackTrace();}
		return course();
	}

	public String add(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();	
		String adminid = (String)session.getAttribute("adminid");
		course.setTid(adminid);
		courseService.save(course);
		return course();
	}
	
	public String get(){
		HttpServletRequest request = ServletActionContext.getRequest();
		course = courseService.get(course.getCid(),course.getTid());
		request.setAttribute("course", course);
		return "get";
	}

	public String update(){
		courseService.update(course);
		return course();
	}
	

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getbyID(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();	
		String adminid = (String)session.getAttribute("adminid");
		courselist = courseService.list(adminid);
		return "checklist";
	}
	
	
	
	
	//get set model
	@Override
	public ChoseCourse getModel() {
		// TODO Auto-generated method stub
		return course;
	}
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	public List<ChoseCourse> getCourselist() {
		return courselist;
	}

	public void setCourselist(List<ChoseCourse> courselist) {
		this.courselist = courselist;
	}
}
