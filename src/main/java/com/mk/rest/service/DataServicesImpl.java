package com.mk.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mk.rest.dao.DataDao;
import com.mk.rest.entity.Employee;

@Service
@Transactional(readOnly = true)
public class DataServicesImpl implements DataServices {
	
	@Autowired
	private DataDao dataDao;

	@Transactional
	public long save(Employee employee) {
		return dataDao.save(employee);
	}

	@Transactional
	public List<Employee> list() {
		return dataDao.list();
	}

	@Transactional
	public void delete(long id) {
		dataDao.delete(id);
		
	}

	public List<Employee> positionList() {
		return dataDao.positionList();
	}
	
	
}
