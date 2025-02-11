package com.boot.Versioning;

public class VersioningModel 
{
	
	String FirstName;
	String LastName;
	public VersioningModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VersioningModel(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	
}
