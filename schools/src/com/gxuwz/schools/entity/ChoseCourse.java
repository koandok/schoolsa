package com.gxuwz.schools.entity;

/**
 * ChoseCourse entity. @author MyEclipse Persistence Tools
 */

public class ChoseCourse implements java.io.Serializable {

	// Fields

	private Integer id;
	private String cid;
	private String tid;
	private String room;
	private String ctime;
	private String cpeople;
	private Integer credit;
	private Integer chour;
	private String cname;
	private String tname;

	// Constructors

	/** default constructor */
	public ChoseCourse() {
	}

	/** minimal constructor */
	public ChoseCourse(String cid, String tid) {
		this.cid = cid;
		this.tid = tid;
	}

	/** full constructor */
	public ChoseCourse(String cid, String tid, String room, String ctime, String cpeople, Integer credit, Integer chour,
			String cname, String tname) {
		this.cid = cid;
		this.tid = tid;
		this.room = room;
		this.ctime = ctime;
		this.cpeople = cpeople;
		this.credit = credit;
		this.chour = chour;
		this.cname = cname;
		this.tname = tname;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCid() {
		return this.cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getTid() {
		return this.tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getRoom() {
		return this.room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getCtime() {
		return this.ctime;
	}

	public void setCtime(String ctime) {
		this.ctime = ctime;
	}

	public String getCpeople() {
		return this.cpeople;
	}

	public void setCpeople(String cpeople) {
		this.cpeople = cpeople;
	}

	public Integer getCredit() {
		return this.credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public Integer getChour() {
		return this.chour;
	}

	public void setChour(Integer chour) {
		this.chour = chour;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

}