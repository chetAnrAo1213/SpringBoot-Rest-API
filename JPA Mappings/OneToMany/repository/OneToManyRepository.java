package com.boot.dao;

import org.springframework.data.repository.CrudRepository;

import com.boot.entites.OneToMany.Student;

public interface OneToManyRepository extends CrudRepository<Student, Integer>{
	

}
