package com.boot.controllers;

import java.util.List; 
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.models.Book;
import com.boot.service.BookService;

@RestController
public class DbController 
{
	
	@Autowired
	BookService bs;
	
	@GetMapping("/getAllBooksResponse")
	public ResponseEntity<List<Book>> getBook()
	{
		List<Book> i= bs.getAllBooks();
		if(i.size()<=0)
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		else
			return ResponseEntity.of(Optional.of(i));
			 
	}
	
	@GetMapping("/getResponse/{id}")
	public ResponseEntity<Book> getSingleBook(@PathVariable("id") int id)
	{
		Book b1=this.bs.getSingleBook(id);
		if(b1==null)
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		else
			return ResponseEntity.of(Optional.of(b1));
	}
	
	@PostMapping("/insertResponse")
	public ResponseEntity<Book> insertBook(@RequestBody Book book)
	{
         Book b=this.bs.addBook(book);
         if(b==null)
        	 return ResponseEntity.status(500).build();
         else
        	 return ResponseEntity.of(Optional.of(b));
	}
	
	
	@DeleteMapping("/deleteResponse/{id}")
	public ResponseEntity<Void> deleteBook(@PathVariable("id") int id)
	{
		try 
		{
			this.bs.deleteSingleBook(id);	
			return ResponseEntity.status(204).build();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return ResponseEntity.status(500).build();
		}
	}
	
	@PutMapping("/updateResponse/{id}")
	public ResponseEntity<Book> updateBood(@PathVariable("id") int id,@RequestBody Book b) {		
		try
		{
			this.bs.updateBook(b,id);	
			return ResponseEntity.ok().body(b);
		} 
		catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(500).build();
		}
		
	}
}
