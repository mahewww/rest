package com.mk.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mk.rest.entity.Employee;
import com.mk.rest.service.DataServices;

@RestController
public class EmpController {

	@Autowired
	DataServices dataServices;

	@PostMapping("/employee")
	public ResponseEntity<?> save(@RequestBody Employee employee) {
		long id = dataServices.save(employee);
		return ResponseEntity.ok().body("New employee has been saved with ID:" + id);
	}

	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> list() {
		List<Employee> employees = dataServices.list();
		return ResponseEntity.ok().body(employees);
	}

	@DeleteMapping("/employee/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") long id) {
		dataServices.delete(id);
		return ResponseEntity.ok().body("Employee has been deleted successfully.");
	}
	
	@GetMapping("/employee/position")
	public ResponseEntity<List<Employee>> positionList() {
		List<Employee> employees = dataServices.positionList();
		return ResponseEntity.ok().body(employees);
	}

}
