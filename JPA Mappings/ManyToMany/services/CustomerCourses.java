package com.boot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.ManyToManyRepository;
import com.boot.entites.ManyToMany.Customer;

@Service
public class CustomerCourses 
{
	
	@Autowired
	private ManyToManyRepository cust;

	public Customer insertRecord(Customer c1)
	{
		Customer user = this.cust.save(c1);
		return user;
	}
	
	public Customer updateRecord(Customer c1,int i)
	{
		Optional<Customer> cuser = this.cust.findById(i);
		Customer user = cuser.get();
		 if(user!=null) 
		 {
			 user.setId(i);
			 user.setName(c1.getName());
			 user.setDept(c1.getDept());
			 user.setAge(c1.getAge());
			 user.setCourses(c1.getCourses());
			 this.cust.save(user);
		 }
		 else
			 return null;
		 
		 return user;
	}
	
	public Optional<Customer> selectbyid(int id)
	{
	   Optional<Customer> i= this.cust.findById(id);	
	   return i;
	}
	
	public Iterable<Customer> selectAll()
	{
	   Iterable<Customer> i= this.cust.findAll();	
	   return i;
	}
	
	public void deleteById(int id)
	{
		 this.cust.deleteById(id);
	}
}
