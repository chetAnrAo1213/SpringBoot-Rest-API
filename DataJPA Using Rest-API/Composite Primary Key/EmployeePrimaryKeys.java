package com.boot.compositePrimaryKey;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class EmployeePrimaryKeys implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	int id;
	int deptId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	
}
