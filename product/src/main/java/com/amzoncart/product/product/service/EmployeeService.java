package com.amzoncart.product.product.service;




import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.amzoncart.product.product.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	
	Employee updateEmployee(Employee employee);
	
	List<Employee> fetchAllEmployee();
	
	String deleteEmployee(long emptid);
	
	List<Employee> saveAllEmployees(List<Employee>employees);
	
	List<Employee> fetchBasedonSalary();
	
	List<Employee> fetchBasedonCompany();
	
	List<Employee> fetchBasedOnAge();
	
	List<Employee> fetchBasedonloacationandCompany();
	
	List<Employee> fetchhighestsalary();
	
	List<Employee> lowesttsalary();

	String duplicateempname(String employee);
	







}
