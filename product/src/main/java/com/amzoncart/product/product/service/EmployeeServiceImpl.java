package com.amzoncart.product.product.service;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amzoncart.product.product.entity.Employee;

import com.amzoncart.product.product.repository.EmployeeRepository;



@Service

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;


	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Optional<Employee> employeenew = employeeRepository.findById(employee.getEmptid());
		if(employeenew.isPresent()) {
			if(employee.getEmptid() == employeenew.get().getEmptid()) {
				return employeeRepository.save(employee);

			}
		}
		return employee;
	}

	@Override
	public List<Employee> fetchAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public String deleteEmployee(long emptid) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(emptid); 
		return "Your record is deleted sucessfully";
	}

	@Override
	public List<Employee> saveAllEmployees(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employeeRepository.saveAll(employees);
	}


	@Override
	public List<Employee> fetchBasedonSalary() {
		List<Employee> employees = employeeRepository.findAll();
		List<Employee> salary=new ArrayList<Employee>();
  
		for(Employee employee : employees) {
			if(employee.getSalary() > 50000.0) {
				salary.add(employee);
			}
		}
		
		return salary;

	}

	@Override
	public List<Employee> fetchBasedonCompany() {
		List<Employee> employees = employeeRepository.findAll();
		List<Employee> empcompany=new ArrayList<Employee>();

		for(Employee employee : employees ) {
			if(employee.getEmpcompany().equalsIgnoreCase("capgemini")) {
				empcompany.add(employee);
			}
		}
		return empcompany ;

	}

	@Override
	public List<Employee> fetchBasedOnAge() {
		List<Employee> employees = employeeRepository.findAll();
		List<Employee> empBasedAge=new ArrayList<Employee>();

		for(Employee employee : employees ) {
			if(employee.getAge() < 25) {
				empBasedAge.add(employee);
			}
		}

		return empBasedAge;
	}

	@Override
	public List<Employee> fetchBasedonloacationandCompany() {
		List<Employee> employees = employeeRepository.findAll();
		List<Employee> locationandcompany=new ArrayList<Employee>();

		for(Employee employee : employees) {
			if(employee.getLocation().equalsIgnoreCase("Bangalore")&& employee.getEmpcompany().equalsIgnoreCase("wipro")) {
				locationandcompany.add(employee);
				
			}
		}
		return locationandcompany;

	}

	
	@Override
	public List<Employee> fetchhighestsalary() {
		List<Employee> employees = employeeRepository.findAll();
		List<Employee> highestSalary=new ArrayList<>();
		Employee max=Collections.max(employees);
   
                max.getSalary();
                highestSalary.add(max);
                return highestSalary;
	}

	@Override
	public List<Employee> lowesttsalary() {
		List<Employee> employees = employeeRepository.findAll();
		List<Employee> lowestSalary=new ArrayList<>();
		Employee min=Collections.min(employees);
   
                min.getSalary();
                lowestSalary.add(min);
                return lowestSalary;
	}

	@Override
	public String duplicateempname(String employee) {
		
		List<Employee> employees = employeeRepository.findAll();
		List<String> e=new ArrayList<>();
		Set<String> duplicateempname=new LinkedHashSet<>();
         for (String name : e) {
        	 if (duplicateempname.add(name)==false) {
        		 return "this name is already exists";
        	 }
        		 }
        
         return employeeRepository.save(employee);
 
		}
	 
}



