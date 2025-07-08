package com.boot.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.boot.entites.Rating;

@Repository
public interface RatingRepo extends MongoRepository<Rating,String>
{
	public List<Rating> findByUserId(String id);
	public List<Rating> findByHotelId(String id);
}
