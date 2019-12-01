package com.gxuwz.schools.entity;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable {

	// Fields

	private Integer id;
	private String depid;
	private String depname;

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** full constructor */
	public Department(String depid, String depname) {
		this.depid = depid;
		this.depname = depname;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepid() {
		return this.depid;
	}

	public void setDepid(String depid) {
		this.depid = depid;
	}

	public String getDepname() {
		return this.depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

}