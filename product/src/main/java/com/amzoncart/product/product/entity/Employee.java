package com.amzoncart.product.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee implements Comparable<Employee> {
	@Id
	@GeneratedValue
	@Column(name="emp_id")
	private long emptid;

	@Column(name="emp_name")
	private String empname;

	@Column(name="salary")
	private double salary;
	
	@Column(name="Age")
	private int Age;

	@Column(name="location")
	private String location;

	@Column(name="empcompany")
	private String empcompany;

	public long getEmptid() {
		return emptid;
	}

	public void setEmptid(long emptid) {
		this.emptid = emptid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmpcompany() {
		return empcompany;
	}

	public void setEmpcompany(String empcompany) {
		this.empcompany = empcompany;
	}

	@Override
	public int compareTo(Employee o) {
		if(this.getSalary()>o.getSalary()) {
	    	return 1;
		}
	    else if(this.getSalary()<o.getSalary()) {
	    	return -1;
	    }	
	    return 0;
		
    
	}

	

}
