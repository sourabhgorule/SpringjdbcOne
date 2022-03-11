package com.springjdbcOne.dao;

import java.util.List;

import com.springjdbcOne.bean.Employee;



public interface EmployeeDao {

public int saveRecord(Employee emp);
	
	public int updateRecord(Employee emp);
	
	public int deleteRecord(int id);
	
	public List<Employee> getAll();
	
}
