/*
 * Copyright (c) 2018. GRGBanking
 * @File: DepartmentService.java
 * @Description:
 * @Author: sunys
 * @Date: 18-6-27 上午12:50
 * @since:
 */

package com.syshlang.sssp.service;

import com.syshlang.sssp.entity.Department;
import com.syshlang.sssp.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Transactional(readOnly=true)
	public List<Department> getAll(){
		return departmentRepository.getAll();
	}
}
