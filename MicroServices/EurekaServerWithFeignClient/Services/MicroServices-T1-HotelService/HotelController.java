package com.boot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.entities.Hotel;
import com.boot.service.HotelService;

@Controller
@RequestMapping("/HotelService")
public class HotelController 
{
	
	@Autowired
	HotelService hs;
	
	@PostMapping("/insert")
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel h1) 
	{
		return ResponseEntity.status(200).body(hs.create(h1));
	}
	
	@GetMapping("/getData")
	public ResponseEntity<List<Hotel>> getData() 
	{
		return ResponseEntity.of(Optional.of(hs.getAll()));
	}
	
	@GetMapping("/getData/{id}")
	public ResponseEntity<Hotel> getDataById(@PathVariable("id") String id)
	{
		return ResponseEntity.of(Optional.of(hs.getById(id)));
	}

}