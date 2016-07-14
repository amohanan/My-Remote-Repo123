package com.flp.ems.domain;
public class Employee {
	
	
	String name;
    String kinid;
	String emailid;
	String phoneno;
	//String address;
	String dob;
	String doj;
	String departmentid;
	String department;
	String project;
	String role;
	
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKinid() {
		return kinid;
	}
	public void setKinid(String kinid) {
		this.kinid = kinid;
	}
	public String getEmailid() {
		return emailid;
	}
	public String getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(String departmentid) {
		this.departmentid = departmentid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", kinid=" + kinid + ", emailid=" + emailid + ", phoneno=" + phoneno
				+ "," + ", dob=" + dob + ", doj=" + doj + ", department=" + department + ", project="
				+ project + ", role=" + role + "]";
	}
	}
