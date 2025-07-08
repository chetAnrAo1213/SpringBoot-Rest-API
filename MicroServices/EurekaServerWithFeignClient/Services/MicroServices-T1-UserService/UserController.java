package com.boot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.boot.entites.UserEntity;
import com.boot.service.UserService;

@RestController
@RequestMapping("/userService")
public class UserController 
{
	@Autowired
	UserService us;
	
	@PostMapping("/insertUser")
	public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user)
	{
		UserEntity ue = us.saveUser(user);
		return ResponseEntity.of(Optional.of(ue));
	}
	
	@GetMapping("/getUser/{id}")
	public ResponseEntity<UserEntity> getUserById(@PathVariable String id)
	{
		UserEntity ue = us.getUserById(id);
		return ResponseEntity.of(Optional.of(ue));
	}
	
	@GetMapping("/getAllUsers")
	public ResponseEntity<List<UserEntity>> getAllUsers()
	{
		List<UserEntity> data = us.getAllUsers();
		return ResponseEntity.of(Optional.of(data));
	}
}