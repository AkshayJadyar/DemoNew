package com.demo.service;

import com.demo.model.Employee;

public interface EmlpoyeeServiceIntf {

	public Employee postEmployee(Employee employee);

	public Employee getEmployeeById(Integer id);
	
	public Employee updateEmployee(Employee employee);
	
	public String deleteEmployee(Integer id);
	
	
}
