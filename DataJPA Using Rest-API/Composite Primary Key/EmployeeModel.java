package com.boot.compositePrimaryKey;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="CompositeEmployee")
public class EmployeeModel 
{
	@EmbeddedId
	EmployeePrimaryKeys id;
	String name;
	String email;
	String phone;
	
	
	public EmployeePrimaryKeys getId() {
		return id;
	}
	public void setId(EmployeePrimaryKeys id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
