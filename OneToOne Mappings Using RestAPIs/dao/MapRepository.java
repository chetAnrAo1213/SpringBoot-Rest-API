package com.boot.dao;

import org.springframework.data.repository.CrudRepository;

import com.boot.entites.Book;

public interface MapRepository extends CrudRepository<Book, Integer>
{

	public Book findById(int id);
}
