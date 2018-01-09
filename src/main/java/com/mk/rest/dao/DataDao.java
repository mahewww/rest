package com.mk.rest.dao;

import java.util.List;


import com.mk.rest.entity.Employee;

public interface DataDao {
	
	long save(Employee employee);
	List<Employee> list();
	void delete(long id);
	List<Employee> positionList();


}
