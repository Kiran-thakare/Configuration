package com.collections;

public class Course {

	private int id;
	private String cname;
	private int fess;

	public Course(int id, String cname, int fess) {
		super();
		this.id = id;
		this.cname = cname;
		this.fess = fess;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return cname;
	}

	public void setName(String cname) {
		this.cname = cname;
	}

	public int getFess() {
		return fess;
	}

	public void setFess(int fess) {
		this.fess = fess;
	}

}
