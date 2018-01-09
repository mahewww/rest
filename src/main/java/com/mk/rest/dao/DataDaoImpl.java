package com.mk.rest.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mk.rest.entity.Employee;

@Repository
public class DataDaoImpl implements DataDao {

	@Autowired
	private SessionFactory sessionFactory;

	public long save(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
		return employee.getId();
	}

	public List<Employee> list() {

		Session currentSession = sessionFactory.getCurrentSession();
		Query<Employee> theQuery = currentSession.createQuery("from employee", Employee.class);
		List<Employee> employee = theQuery.getResultList();
		return employee;
	}
	
	public List<Employee> positionList(){
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Employee> theQuery = currentSession.createQuery("SELECT position, COUNT(*) FROM employee group by position");
		List<Employee> employee = theQuery.getResultList();
		return employee;
	}

	public void delete(long id) {
		Session session = sessionFactory.getCurrentSession();
		Employee employee = session.byId(Employee.class).load(id);
		session.delete(employee);

	}

}
