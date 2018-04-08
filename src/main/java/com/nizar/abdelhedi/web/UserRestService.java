package com.nizar.abdelhedi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nizar.abdelhedi.dao.user.UserRepository;
import com.nizar.abdelhedi.entities.user.User;

@RequestMapping("/")
@RestController
public class UserRestService {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public List<User> getUsers(){
		return userRepository.findAll();
	}


}
