package com.ivankimanoos.springboot.cruddemo.dao;

import java.util.List;

import com.ivankimanoos.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void saveEmployee(Employee theEmployee);
	
	public void deleteEmployee(int theId);
}












