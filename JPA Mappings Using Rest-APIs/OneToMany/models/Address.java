package com.boot.entites.OneToMany;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Address_One2Many")
public class Address 
{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Address_Id")
    int id;

    @Column(name = "Address_state")
    String state;

    @Column(name = "Address_Street")
    String street;

 
    @OneToMany(mappedBy = "ad", cascade = CascadeType.ALL)
    //@JsonBackReference
    @JsonIgnore
    private List<Student> stu = new ArrayList<>();




    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

	public List<Student> getStu() {
		return stu;
	}

	public void setStu(List<Student> stu) {
		this.stu = stu;
	}

    
}
