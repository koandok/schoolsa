package com.gxuwz.schools.entity;

/**
 * Classes entity. @author MyEclipse Persistence Tools
 */

public class Classes implements java.io.Serializable {

	// Fields

	private Integer id;
	private String classid;
	private String classes;
	private String depid;

	// Constructors

	/** default constructor */
	public Classes() {
	}

	/** full constructor */
	public Classes(String classid, String classes, String depid) {
		this.classid = classid;
		this.classes = classes;
		this.depid = depid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClassid() {
		return this.classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
	}

	public String getClasses() {
		return this.classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getDepid() {
		return this.depid;
	}

	public void setDepid(String depid) {
		this.depid = depid;
	}

}