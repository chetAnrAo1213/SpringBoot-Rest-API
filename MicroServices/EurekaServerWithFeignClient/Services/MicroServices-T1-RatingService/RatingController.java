package com.boot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.entites.Rating;
import com.boot.services.RatingService;

@RestController
@RequestMapping("/RatingService")
public class RatingController 
{
	
	@Autowired
	RatingService rs;
	
	@PostMapping("/insert")
	public ResponseEntity<Rating> create(@RequestBody Rating rating)
	{
		return ResponseEntity.of(Optional.of(rs.createRating(rating)));
	}
	
	@GetMapping("/getRatingByUserId/{id}")
	public ResponseEntity<List<Rating>> getByUserId(@PathVariable("id") String id)
	{
		return ResponseEntity.of(Optional.of(rs.getRatingByUserId(id)));
	}
	
	@GetMapping("/getRatingByHotelId/{id}")
	public ResponseEntity<List<Rating>> getByHotelId(@PathVariable("id") String id)
	{
		return ResponseEntity.of(Optional.of(rs.getRatingByHotelId(id)));
	}
	
	@GetMapping("/getData")
	public ResponseEntity<List<Rating>> getAll()
	{
		return ResponseEntity.of(Optional.of(rs.getAllRatings()));
	}
}
