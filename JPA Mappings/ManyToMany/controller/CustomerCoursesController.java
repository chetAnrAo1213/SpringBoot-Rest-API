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

import com.boot.entites.ManyToMany.Customer;
import com.boot.services.CustomerCourses;

@RestController
public class CustomerCoursesController 
{
	
	@Autowired
	CustomerCourses cucs;
	
	@PostMapping("/postCustomer")
	public ResponseEntity<Customer> addUser(@RequestBody Customer c1)
	{
		try
		{
			Customer user = this.cucs.insertRecord(c1);
			if(user!=null)
			{
                 return ResponseEntity.of(Optional.of(user));
			}
			else
			{
				return ResponseEntity.of(Optional.of(user));
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return ResponseEntity.status(500).build();
		}
	}
	
	@PutMapping(value="/postCustomer/{id}")
	public ResponseEntity<Customer> updateUser(@PathVariable("id") int userId,@RequestBody Customer c1)
	{
		try
		{
			Customer user = this.cucs.updateRecord(c1,userId);
			if(user!=null)
			{
                 return ResponseEntity.of(Optional.of(user));
			}
			else
			{
				return ResponseEntity.of(Optional.of(user));
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return ResponseEntity.status(500).build();
		}
	}
	
	
	@GetMapping("/getCustomer/{id}")
	public ResponseEntity<Optional<Customer>> getById(@PathVariable("id") int ids) 
	{
		try
		{
		  Optional<Customer> i=  this.cucs.selectbyid(ids);
		   if(i!=null)
			  return ResponseEntity.ok().body(i);
		   else
			   return ResponseEntity.of(Optional.of(i));
	    }
		catch (Exception e) 
		{
			return ResponseEntity.status(500).build();
		}
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<Iterable<Customer>> findall()
	{
		try
		{
			Iterable <Customer> i= this.cucs.selectAll();	
			if(i!=null)
			{
				return ResponseEntity.of(Optional.of(i));
			}
			else
			{
				return ResponseEntity.of(Optional.of(i));
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return ResponseEntity.status(500).build();
		}
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public ResponseEntity<Customer> delete(@PathVariable("id")  int did)
	{
		try
		{
			this.cucs.deleteById(did);
			return ResponseEntity.status(200).build();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return ResponseEntity.status(500).build();
		}
	}
}
