package com.nizar.abdelhedi.dao.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nizar.abdelhedi.entities.user.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
