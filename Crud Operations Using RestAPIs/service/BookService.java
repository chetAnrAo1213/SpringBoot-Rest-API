package com.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.boot.dao.BookRepository;
import com.boot.models.Book;
import java.util.List;

@Service
public class BookService 
{

	@Autowired
    BookRepository br;

    /*              Get             */
    
    public List<Book> getAllBooks() 
    {
    	Iterable<Book> all =this.br.findAll();
        return (List<Book>)all;
    }

    public Book getSingleBook(int id) 
    {
		Book b1=this.br.findById(id);
		return b1;
	}    

    /*               Post                */
    public Book addBook(Book b)
    {
    	Book res=this.br.save(b);
    	return res;
    }
    
    /*               Delete                */
    public void deleteSingleBook(int id) 
    {
        Book b1 = this.br.findById(id);
        this.br.delete(b1);
    }
    
    /*               Put                */

	public void updateBook(Book i, int id) 
	{
		i.setId(id);
		this.br.save(i);
	}
}
