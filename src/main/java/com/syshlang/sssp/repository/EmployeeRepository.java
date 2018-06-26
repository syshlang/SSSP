/*
 * Copyright (c) 2018. GRGBanking
 * @File: EmployeeRepository.java
 * @Description:
 * @Author: sunys
 * @Date: 18-6-27 上午12:50
 * @since:
 */

package com.syshlang.sssp.repository;


import com.syshlang.sssp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee getByLastName(String lastName);
	
}
