package com.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entites.Rating;
import com.boot.repo.RatingRepo;

@Service
public class RatingService 
{
	@Autowired
	RatingRepo rr;
	
	public Rating createRating(Rating r1)
	{
		return rr.save(r1);
	}
	
	public List<Rating> getAllRatings()
	{
		return rr.findAll();
	}
	
	public List<Rating> getRatingByUserId(String id)
	{
		return rr.findByUserId(id);
	}
	
	public List<Rating> getRatingByHotelId(String id)
	{
		return rr.findByHotelId(id);
	}
	
}
