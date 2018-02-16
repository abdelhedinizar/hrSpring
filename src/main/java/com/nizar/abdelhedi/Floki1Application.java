package com.nizar.abdelhedi;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

import com.nizar.abdelhedi.dao.CycleRepository;
import com.nizar.abdelhedi.dao.EmployeeRepository;
import com.nizar.abdelhedi.entities.CycleSZ;
import com.nizar.abdelhedi.entities.EmployeeSZ;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class Floki1Application implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private CycleRepository cycleRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Floki1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeRepository.save(new EmployeeSZ(12607504,"Nizar","Abdelhedi","CVP","Ingenieur Informatique"));
	
	}
	
	
}
