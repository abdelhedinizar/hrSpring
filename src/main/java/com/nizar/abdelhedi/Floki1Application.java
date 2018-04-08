package com.nizar.abdelhedi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

import com.nizar.abdelhedi.dao.CycleRepository;
import com.nizar.abdelhedi.dao.EmployeeRepository;
import com.nizar.abdelhedi.dao.user.SkillsRepository;
import com.nizar.abdelhedi.dao.user.UserInformationRepository;
import com.nizar.abdelhedi.dao.user.UserRepository;
import com.nizar.abdelhedi.entities.CycleSZ;
import com.nizar.abdelhedi.entities.EmployeeSZ;
import com.nizar.abdelhedi.entities.user.Skills;
import com.nizar.abdelhedi.entities.user.User;
import com.nizar.abdelhedi.entities.user.UserInformation;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class Floki1Application implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private CycleRepository cycleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserInformationRepository informationRepository;
	
	@Autowired
	private SkillsRepository skillsRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Floki1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//	employeeRepository.save(new EmployeeSZ(12607504,"Nizar","Abdelhedi","CVP","Ingenieur Informatique"));
	
		User nizar = new User("nizar", "nizarpassword");
			Skills skill = new Skills("Java");
		Skills skill1 = new Skills("Android");
		List<Skills> skills = new ArrayList<>();
		skills.add(skill);skills.add(skill1);
		UserInformation nizarInformation = new UserInformation("Tunisia", "software engineer", "Sopra hr", "1 ans");
     		nizarInformation.setSkills(skills);
		    nizar.setUserInformation(nizarInformation);
		  
	//		nizarInformation.setUser(nizar);
	//	informationRepository.save(nizarInformation);
		userRepository.save(nizar);
			
		
		
		
	}
	
	
}
