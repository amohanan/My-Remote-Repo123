package com.flp.ems.dao;

import com.flp.ems.domain.Employee;

public interface IEmployeeDao {
void AddEmployee(Employee e);
void ModifyEmployee();
void RemoveEmployee();
void SearchEmployee();
}
