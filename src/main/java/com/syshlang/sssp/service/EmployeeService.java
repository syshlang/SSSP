/*
 * Copyright (c) 2018. GRGBanking
 * @File: EmployeeService.java
 * @Description:
 * @Author: sunys
 * @Date: 18-6-27 上午12:50
 * @since:
 */

package com.syshlang.sssp.service;


import com.syshlang.sssp.entity.Employee;
import com.syshlang.sssp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Transactional
	public void delete(Integer id){
		employeeRepository.delete(id);
	}
	
	@Transactional(readOnly=true)
	public Employee get(Integer id){
		return employeeRepository.findOne(id);
	}
	
	@Transactional
	public void save(Employee employee){
		if(employee.getId() == null){
			employee.setCreateTime(new Date());
		}
		employeeRepository.saveAndFlush(employee);
	}
	
	@Transactional(readOnly=true)
	public Employee getByLastName(String lastName){
		return employeeRepository.getByLastName(lastName);
	}
	
	@Transactional(readOnly=true)
	public Page<Employee> getPage(int pageNo, int pageSize){
		PageRequest pageable = new PageRequest(pageNo - 1, pageSize);
		return employeeRepository.findAll(pageable);
	}
}
