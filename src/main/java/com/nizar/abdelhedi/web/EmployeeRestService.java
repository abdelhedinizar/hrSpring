package com.nizar.abdelhedi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nizar.abdelhedi.dao.EmployeeRepository;
import com.nizar.abdelhedi.entities.EmployeeSZ;

@RequestMapping("/")
@RestController
public class EmployeeRestService{

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping(value="/employees",method=RequestMethod.GET)
	public List<EmployeeSZ> getEmployees(){
		return employeeRepository.findAll();
	}
}
