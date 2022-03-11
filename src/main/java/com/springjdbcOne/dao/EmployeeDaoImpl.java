package com.springjdbcOne.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbcOne.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	
	private JdbcTemplate template;
	
	
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int saveRecord(Employee emp) {
		
		String query="insert into employee values(?,?)";
		Object[] params= {emp.getId(),emp.getName()};
		int record = template.update(query,params);
	
		return record;
	}

	public int updateRecord(Employee emp) {
		
	
		
		return 0;
	}

	public int deleteRecord(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
