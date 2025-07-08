package com.boot.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.boot.entites.Rating;

@FeignClient(name="MICROSERVICES-T1-RATINGSERVICE")
public interface RatingService 
{
	@GetMapping("/RatingService/getRatingByUserId/{id}")
	public Rating[] getData(@PathVariable("id") String id);
}
