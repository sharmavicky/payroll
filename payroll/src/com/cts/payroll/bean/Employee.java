package com.cts.payroll.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Employee {

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [skills=");
		builder.append(skills);
		builder.append(", id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", dob=");
		builder.append(dob);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", address=");
		builder.append(address);
		builder.append(", department=");
		builder.append(department);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

	private String skills;
	private int id;
	private String name;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dob;
	private float salary;
	private String gender;
	private Address address;
	private Department department;
	private String email;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

}
