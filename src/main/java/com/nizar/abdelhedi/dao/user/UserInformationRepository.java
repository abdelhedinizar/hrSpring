package com.nizar.abdelhedi.dao.user;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nizar.abdelhedi.entities.user.UserInformation;

public interface UserInformationRepository extends JpaRepository<UserInformation, Long>{

}
