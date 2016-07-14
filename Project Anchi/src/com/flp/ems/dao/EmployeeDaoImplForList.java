package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.List;

import com.flp.ems.domain.Employee;

public class EmployeeDaoImplForList implements IEmployeeDao{
	List<Object> elist = new ArrayList<Object>();

	@Override
	public void AddEmployee(Employee e) {
		// TODO Auto-generated method stub
		elist.add(e);
		System.out.println(elist);
		
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
	

}
