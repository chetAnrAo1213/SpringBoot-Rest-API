package com.boot.auditing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuditingController 
{
	
	@Autowired
	AudtingService ads;
	
	@PostMapping("/addEmployee")
	public String insertUser(@RequestBody AudtingRequest<AudtingModel> req) {
		
		return ads.saveUser(req);
	}
	
	
	@PutMapping("update/{id}/{sal}")
	public String updateUser(@PathVariable("id") int id,@PathVariable("sal") double salary, @RequestBody AudtingRequest<AudtingModel> req) 
	{	
		return ads.updateUser(id, salary, req);
	}
	
}
