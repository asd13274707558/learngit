package com.neusoft.entity;

public class Cate {
	int cid;
	String cname;
	int pid;

	public Cate() {
		super();
	}

	public Cate(String cname, int pid) {
		super();
		this.cname = cname;
		this.pid = pid;
	}

	public Cate(int cid, String cname, int pid) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.pid = pid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "cid=" + cid + ", cname=" + cname + ", pid=" + pid;
	}

}
