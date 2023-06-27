package com.amzoncart.product.product.controller;


import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amzoncart.product.product.entity.Employee;

import com.amzoncart.product.product.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


	@Autowired
	EmployeeService employeeService;

	@PostMapping
	@RequestMapping("/saveEmployee")
	Employee  saveEmployee(@RequestBody Employee employee){

		return employeeService.saveEmployee(employee);
	}
	@GetMapping
	@RequestMapping("/fetchallemployees")
	List<Employee> fetchallEmployees(){
		return employeeService.fetchAllEmployee();
	}

	@DeleteMapping
	@RequestMapping("/deleteemployee/{emptid}")
	String deleteemployee(@PathVariable long emptid) {

		return employeeService.deleteEmployee(emptid) ;

	}
	@PutMapping
	@RequestMapping("/updateEmployee")
	Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

	@PostMapping
	@RequestMapping("/saveallemployees")

	List<Employee> saveallemployees(@RequestBody List<Employee> employees){

		return employeeService.saveAllEmployees(employees);
	}


	@GetMapping
	@RequestMapping("/fetchBasedonloacationandCompany")
	List<Employee> fetchBasedonloacationandCompany() {
		return employeeService.fetchBasedonloacationandCompany();
	}

	@GetMapping
	@RequestMapping("/fetchBasedOnAge")
	List<Employee> fetchBasedOnAge(){

		return employeeService.fetchBasedOnAge();
	}
	@GetMapping
	@RequestMapping("/fetchBasedoncompany")
	List<Employee> fetchBasedoncompany(){

		return employeeService.fetchBasedonCompany();
	}

	@GetMapping
	@RequestMapping("/fetchBasedonsalary")
	List<Employee> fetchBasedonsalary(){

		return employeeService.fetchBasedonSalary();
	}

  @GetMapping
	@RequestMapping("/fetchhighestsalary")
	List<Employee> fetchhighestsalary(){

		return employeeService.fetchhighestsalary();
	}
  
  @GetMapping
	@RequestMapping("/fetchlowestsalary")
	List<Employee> fetchlowestsalary(){

		return employeeService.lowesttsalary();
		
		}
    @PostMapping
    @RequestMapping("/duplicateemp")
    
    String duplicateempname(@RequestBody String employee) {
    	
     return employeeService.duplicateempname(employee);
	  
  }
}
  