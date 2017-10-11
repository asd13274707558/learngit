package com.neusoft.entity;

import java.io.Serializable;

public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7457292321615262156L;
	String id;
	String pname ;// 商品名
	int  cid ;// ,-- 外键，引用自cate表中的cid
	String   pno ;// ,-- 货号
	String  pic ;// ,//-- 商品图片
	double price ;// , -- 商品价格
	int  online ;// -- 1:上线 0:下线
	String   pdetail ;// -- 商品详情
	
	
	public Product() {
		super();
	}
	
	public Product(String pname, int cid, String pno, String pic, double price, int online, String pdetail) {
		super();
		this.pname = pname;
		this.cid = cid;
		this.pno = pno;
		this.pic = pic;
		this.price = price;
		this.online = online;
		this.pdetail = pdetail;
	}

	
	
	public String getId() {
		return id;
	}

	public Product(String id, String pname, int cid, String pno, String pic, double price, int online, String pdetail) {
	super();
	this.id = id;
	this.pname = pname;
	this.cid = cid;
	this.pno = pno;
	this.pic = pic;
	this.price = price;
	this.online = online;
	this.pdetail = pdetail;
}

	
	public void setId(String id) {
		this.id = id;
	}

	public Product(String id, String pname, int cid) {
	super();
	this.id = id;
	this.pname = pname;
	this.cid = cid;
}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getOnline() {
		return online;
	}

	public void setOnline(int online) {
		this.online = online;
	}

	public String getPdetail() {
		return pdetail;
	}

	public void setPdetail(String pdetail) {
		this.pdetail = pdetail;
	}

	@Override
	public String toString() {
		return "Product [pname=" + pname + ", cid=" + cid + ", pno=" + pno + ", pic=" + pic + ", price=" + price
				+ ", online=" + online + ", pdetail=" + pdetail + "]";
	}
	
	
	

}
