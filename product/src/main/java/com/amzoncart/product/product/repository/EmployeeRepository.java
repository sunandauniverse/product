package com.amzoncart.product.product.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amzoncart.product.product.entity.Employee;
@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	String save(String employee);

}
