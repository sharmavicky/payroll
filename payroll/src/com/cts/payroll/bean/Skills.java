package com.cts.payroll.bean;

public class Skills {
	public Skills() {
		super();
	}

	@Override
	public String toString() {
		return "Skills [id=" + id + ", name=" + name + "]";
	}

	private int id;
	private String name;

	

	public Skills(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
