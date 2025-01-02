package com.boot.dao;

import org.springframework.data.repository.CrudRepository;

import com.boot.entites.OneToOne.Book;

public interface OneToOneRepository extends CrudRepository<Book, Integer>
{

	public Book findById(int id);
}
