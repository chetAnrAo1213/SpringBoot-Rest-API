package com.boot.entites.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_One2Many")
public class Student 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Student_Id")
    int id;

    @Column(name = "Student_name")
    String name;

    @Column(name = "Student_branch")
    String branch;

    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Address_Id") 
    //@JsonManagedReference
    private Address ad;

    // Getters and Setters
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) { 
        this.branch = branch;
    }

	public Address getAd() {
		return ad;
	}

	public void setAd(Address ad) {
		this.ad = ad;
	}

    
}
