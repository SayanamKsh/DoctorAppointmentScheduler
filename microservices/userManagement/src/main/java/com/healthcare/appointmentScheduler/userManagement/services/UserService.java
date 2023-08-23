package com.healthcare.appointmentScheduler.userManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.appointmentScheduler.userManagement.entity.User;
import com.healthcare.appointmentScheduler.userManagement.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	public Optional<User> getUserById(int id) {
		return userRepository.findById(id);
	}
	public List<User> createUsers(List<User> users) {
		return userRepository.saveAll(users);
	}
	public Optional<User> deleteUserById(int id) {
		Optional<User> user=getUserById(id);
		userRepository.deleteById(id);
		return user;
	}

	
}
