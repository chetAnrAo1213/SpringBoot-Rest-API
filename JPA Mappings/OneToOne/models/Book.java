package com.boot.entites.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Book_Mapping")
public class Book 
{
	@Id
	@Column(name="Book_Id")
	int id;
	
	@Column(name="Book_Name")
	String name;
	
	@Column(name="Book_Year")
	String year;
	
	@OneToOne(cascade = CascadeType.ALL)
	@ElementCollection
	@JsonManagedReference
	Author author;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String name, String year, Author author) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.author = author;
	}

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

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {this.author = author;}
	
	
}
