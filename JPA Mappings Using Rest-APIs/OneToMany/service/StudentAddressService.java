package com.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.OneToManyRepository;

import com.boot.entites.OneToMany.Student;

@Service
public class StudentAddressService 
{
	
	@Autowired
	OneToManyRepository onerep;
	
	
	public Student insertStudent(Student s1)
	{
		Student insert = null;
		try 
		{
			insert = this.onerep.save(s1);
		}
		catch (Exception e) 
		{
		  e.printStackTrace();
		}

		return insert;
	}
	
	public Student updateStudent(Student s1,int id)
	{
		Optional<Student> i = this.onerep.findById(id);
		Student user = i.get();
		user.setName(s1.getName());
		user.setBranch(s1.getBranch());
		user.setAd(s1.getAd());
		this.onerep.save(user);
		return user;
	}
	
	public Optional<Student> getById(int id)
	{
		    Optional<Student> s1 = this.onerep.findById(id);
		    return s1;	
	}
	
	public List<Student> getAll()
	{
		List<Student>  s1 = (List<Student>)this.onerep.findAll();
		    return s1;	
	}
	
	public void delete(int id)
	{
		this.onerep.deleteById(id);
	}
}
