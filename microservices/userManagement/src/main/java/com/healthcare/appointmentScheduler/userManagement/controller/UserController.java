package com.healthcare.appointmentScheduler.userManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.appointmentScheduler.userManagement.entity.User;
import com.healthcare.appointmentScheduler.userManagement.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/{id}")
	public Optional<User> getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@PostMapping("/createUsers")
	public List<User> createUsers(@RequestBody List<User> users) {
		return userService.createUsers(users);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUserById(@PathVariable int id) {
		userService.deleteUserById(id);
		return "Successfully Deleted";
	}
}
