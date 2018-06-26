/*
 * Copyright (c) 2018. GRGBanking
 * @File: DepartmentRepository.java
 * @Description:
 * @Author: sunys
 * @Date: 18-6-27 上午12:50
 * @since:
 */

package com.syshlang.sssp.repository;

import com.syshlang.sssp.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import javax.persistence.QueryHint;
import java.util.List;


public interface DepartmentRepository extends JpaRepository<Department, Integer>{

	@QueryHints({@QueryHint(name=org.hibernate.ejb.QueryHints.HINT_CACHEABLE,value="true")})
	@Query("FROM Department d")
	List<Department> getAll();
	
}
