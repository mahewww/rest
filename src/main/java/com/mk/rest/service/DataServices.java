package com.mk.rest.service;

import java.util.List;

import com.mk.rest.entity.Employee;

public interface DataServices {
	long save(Employee employee);
	List<Employee> list();
	void delete(long id);
	List<Employee> positionList();
}
