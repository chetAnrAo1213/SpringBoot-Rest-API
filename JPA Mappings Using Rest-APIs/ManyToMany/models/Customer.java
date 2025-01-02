package com.boot.entites.ManyToMany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_ManyToMany")
public class Customer 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int age;
	private String dept;
	
	
	@ManyToMany(fetch =  FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="Customer_Course_Table",
			   joinColumns= {
			                 @JoinColumn(name="customer_id",referencedColumnName = "id")		
			               },
			   inverseJoinColumns = {
					         @JoinColumn(name="courses_id",referencedColumnName = "id")
			   })
	private List<Courses> courses;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	public Customer(int id, String name, int age, String dept, List<Courses> courses) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.courses = courses;
	}

	public Customer() {
		super();
	}
	
	

}
