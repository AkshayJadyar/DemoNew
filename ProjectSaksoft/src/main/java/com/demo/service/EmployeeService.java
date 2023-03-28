package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;
import com.demo.repository.EmployeeDaoIntf;

@Service
public class EmployeeService implements EmlpoyeeServiceIntf {

	@Autowired
	private EmployeeDaoIntf employeeRepositoryInterf;

	@Override
	public Employee postEmployee(Employee employee) {
		Employee emp = employeeRepositoryInterf.save(employee);
		return emp;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		Employee emp2 = employeeRepositoryInterf.findById(id).orElse(null);

		return emp2;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee emp = employeeRepositoryInterf.findById(employee.getId()).orElse(employee);

		emp.setFname(employee.getFname());
		emp.setLname(employee.getLname());
		emp.setEmail(employee.getEmail());
		emp.setAge(employee.getAge());

		return employeeRepositoryInterf.save(emp);
	}

	@Override
	public String deleteEmployee(Integer id) {

		employeeRepositoryInterf.deleteById(id);

		return "Employee deleted successfully...";

	}

}
