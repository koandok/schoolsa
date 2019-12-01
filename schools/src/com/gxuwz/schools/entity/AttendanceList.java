package com.gxuwz.schools.entity;

/**
 * AttendanceList entity. @author MyEclipse Persistence Tools
 */

public class AttendanceList implements java.io.Serializable {

	// Fields

	private Integer id;
	private String tid;
	private String cid;
	private String sid;
	private String sname;
	private String classes;

	// Constructors

	/** default constructor */
	public AttendanceList() {
	}

	/** minimal constructor */
	public AttendanceList(String tid, String cid, String sid) {
		this.tid = tid;
		this.cid = cid;
		this.sid = sid;
	}

	/** full constructor */
	public AttendanceList(String tid, String cid, String sid, String sname, String classes) {
		this.tid = tid;
		this.cid = cid;
		this.sid = sid;
		this.sname = sname;
		this.classes = classes;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTid() {
		return this.tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getCid() {
		return this.cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getClasses() {
		return this.classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

}