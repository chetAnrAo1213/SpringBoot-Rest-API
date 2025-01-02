package com.boot.entites.ManyToMany;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Courses_ManyToMany")
public class Courses 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String title;
	private String name;
	private int chapters;
	private int fees;
	
	@JsonIgnore
	@ManyToMany(mappedBy="courses",fetch = FetchType.LAZY)
	private List<Customer> customers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChapters() {
		return chapters;
	}

	public void setChapters(int chapters) {
		this.chapters = chapters;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Courses(int id, String title, String name, int chapters, int fees, List<Customer> customers) {
		super();
		this.id = id;
		this.title = title;
		this.name = name;
		this.chapters = chapters;
		this.fees = fees;
		this.customers = customers;
	}

	public Courses() {
		super();
	}
	
	
}
