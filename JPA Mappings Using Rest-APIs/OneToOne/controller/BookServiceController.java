package com.boot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.entites.OneToOne.Book;
import com.boot.services.BookServices;

@RestController
public class BookServiceController 
{
	
	@Autowired
	BookServices bs;
	
	@PostMapping("/insert")
	public ResponseEntity<Book> postBook(@RequestBody Book b1)
	{
		try
		{
		  Book b=this.bs.insertRecord(b1);
		  if(b==null)
		  return ResponseEntity.of(Optional.of(b));
			  
		}
		catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(500).build();
		}
		  return ResponseEntity.ok().build();
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<Book> updateBook(@RequestBody Book b1)
	{
		try
		{
		  Book b=this.bs.updateRecord(b1);
		  if(b==null)
		  return ResponseEntity.of(Optional.of(b));
			  
		}
		catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(500).build();
		}
		  return ResponseEntity.ok().body(b1);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Book> deleteRecord(@PathVariable int id)
	{
		try
		{
			this.bs.deleteRecord(id);
			return ResponseEntity.status(200).build();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return ResponseEntity.status(500).build();
		}
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Book> get(@PathVariable int  id)
	{
		try
		{
			Book b1 =this.bs.getBookById(id);
			return ResponseEntity.of(Optional.of(b1));
		}
		catch (Exception e) 
		{
			return ResponseEntity.status(500).build();
		}
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Book>> getall()
	{
		try
		{
			List<Book> b1 =this.bs.getAll();
			return ResponseEntity.of(Optional.of(b1));
		}
		catch (Exception e) 
		{
			return ResponseEntity.status(500).build();
		}
	}
}
