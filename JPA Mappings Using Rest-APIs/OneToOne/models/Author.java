package com.boot.entites.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Author_Mapping")
public class Author 
{

	@Id
	@Column(name="Id")
	int id;
	
	@Column(name="Author_Name")
	String name;
	
	@Column(name="Author_DOB")
	String dob;
	
	@OneToOne(mappedBy = "author")
	
	@JsonBackReference
	Book books;

	public Author() {
		super();
	}

	public Author(int id, String name, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Book getBooks() {
		return books;
	}

	public void setBooks(Book books) {
		this.books = books;
	}
	
	
}
