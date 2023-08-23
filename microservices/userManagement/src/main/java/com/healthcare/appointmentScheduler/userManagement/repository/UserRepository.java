package com.healthcare.appointmentScheduler.userManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.appointmentScheduler.userManagement.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	
	
}
