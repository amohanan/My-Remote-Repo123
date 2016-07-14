package com.flp.ems.service;

import java.util.HashMap;
//import java.util.Map;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Employee;
import com.flp.ems.view.UserInteraction;

public class EmployeeServiceImpl implements IEmployeeService{
Employee e = new Employee();
EmployeeDaoImplForList edifl = new EmployeeDaoImplForList();	
@Override
	public void AddEmployee(HashMap emap) {
		// TODO Auto-generated method stub
		e.setName((String) emap.get("Name"));
		e.setEmailid((String) emap.get("Email id"));
		e.setPhoneno((String) emap.get("Phone number"));
		e.setDob((String) emap.get("Date of Birth"));
		e.setDoj((String) emap.get("Date of Joining"));
		//e.setDepartmentid((String) emap.get("Department Id"));
		e.setDepartment((String) emap.get("Department name"));
		e.setProject((String) emap.get("Project name"));
		e.setRole((String) emap.get("Role"));
		System.out.println(e.toString());
		edifl.AddEmployee(e);
	}

	@Override
	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SearchEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}

	




}
