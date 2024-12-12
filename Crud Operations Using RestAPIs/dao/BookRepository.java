package com.boot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>
{
   public Book findById(int id);
}
