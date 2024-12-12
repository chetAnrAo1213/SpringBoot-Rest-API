package com.boot.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.boot.dao.MapRepository;
import com.boot.entites.Book;

@Service
public class BookServices 
{
	@Autowired
	MapRepository rep;
	
	public Book insertRecord(Book b1)
	{
		Book b=this.rep.save(b1);
		return b;
	}
	
	public Book updateRecord(Book b1)
	{
		Book b=this.rep.save(b1);
		return b;
	}
	
	public void deleteRecord(int id)
	{
		Book b1 = this.rep.findById(id);
		this.rep.delete(b1);
	}
	
	public Book getBookById(int id)
	{
		Book b1 =this.rep.findById(id);
		return b1;
	}
	
	public List<Book> getAll()
	{
		List<Book> l1 = (List<Book>) this.rep.findAll();
		return l1;
	}
}
