package com.nizar.abdelhedi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nizar.abdelhedi.entities.EmployeeSZ;

public interface EmployeeRepository extends JpaRepository<EmployeeSZ, Long> {

}
