package com.boot.compositePrimaryKey;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompositeKeyService 
{
	@Autowired
	CompositeKeyRepo ckr;
	
	public EmployeeModel insert(EmployeeModel emp)
	{
		EmployeeModel emp1 = this.ckr.save(emp);
		return emp1;
	}
	
	public List<EmployeeModel>  select()
	{
		Iterable<EmployeeModel> i = this.ckr.findAll();
		return (List<EmployeeModel>)i;
	}

}
