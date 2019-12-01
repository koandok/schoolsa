package com.gxuwz.schools.entity;

/**
 * AttendanceSheet entity. @author MyEclipse Persistence Tools
 */

public class AttendanceSheet implements java.io.Serializable {

	// Fields

	private Integer id;
	private String tid;
	private String cid;
	private String sid;
	private String stats;
	private String sname;
	private String ctime;
	private String classes;

	// Constructors

	/** default constructor */
	public AttendanceSheet() {
	}

	/** minimal constructor */
	public AttendanceSheet(String tid, String cid, String sid) {
		this.tid = tid;
		this.cid = cid;
		this.sid = sid;
	}

	/** full constructor */
	public AttendanceSheet(String tid, String cid, String sid, String stats, String sname, String ctime,
			String classes) {
		this.tid = tid;
		this.cid = cid;
		this.sid = sid;
		this.stats = stats;
		this.sname = sname;
		this.ctime = ctime;
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

	public String getStats() {
		return this.stats;
	}

	public void setStats(String stats) {
		this.stats = stats;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCtime() {
		return this.ctime;
	}

	public void setCtime(String ctime) {
		this.ctime = ctime;
	}

	public String getClasses() {
		return this.classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

}