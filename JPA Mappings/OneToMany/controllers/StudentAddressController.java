package com.boot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.entites.OneToMany.Student;
import com.boot.services.StudentAddressService;

@RestController
public class StudentAddressController {

	@Autowired
	StudentAddressService sar;
	
	@PostMapping("/ManyPost")
	public ResponseEntity<Student> post(@RequestBody Student s1)
	{
		try
		{
		 	Student post = this.sar.insertStudent(s1);
		 	return ResponseEntity.status(200).build();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return ResponseEntity.status(500).build();
		}
	}
	
	@PutMapping("/ManyPut/{id}")
	public ResponseEntity<Student> put(@RequestBody Student s1,@PathVariable("id") int id)
	{
		try
		{
		 	Student post = this.sar.updateStudent(s1,id);
		 	if(post!=null)
		 		return ResponseEntity.status(200).body(s1);
		 	else
		 		return ResponseEntity.status(404).build();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return ResponseEntity.status(500).build();
		}
	}
	
	@GetMapping("getMany/{id}")
	public ResponseEntity<Optional<Student>> getSingle(@PathVariable int id)
	{
		try 
		{
		     Optional<Student> s1 =this.sar.getById(id);	
		     if(s1!=null)
		     return ResponseEntity.status(200).body(s1);
		     else
		    	 return ResponseEntity.status(404).build();
		} 
		catch (Exception e) 
		{
			 return ResponseEntity.status(500).build();
		}
	}
	
	
	@GetMapping("/getManyAll")
	public ResponseEntity<List<Student> > getSingle()
	{
		try 
		{
			List<Student>  s1 =this.sar.getAll();
		     if(s1!=null)
		     return ResponseEntity.status(200).body(s1);
		     else
		    	 return ResponseEntity.status(404).build();
		} 
		catch (Exception e) 
		{
			 return ResponseEntity.status(500).build();
		}
	}
	
	
	@DeleteMapping("/deleteMany/{id}")
	public ResponseEntity<Student> delete(@PathVariable int id)
	{
		try 
		{
		     this.sar.delete(id);
		    	 return ResponseEntity.status(200).build();
		} 
		catch (Exception e) 
		{
			 return ResponseEntity.status(500).build();
		}
	}
}
