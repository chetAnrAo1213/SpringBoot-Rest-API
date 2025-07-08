package com.boot.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.boot.entites.Hotel;

@FeignClient(name="MICROSERVICES-T1-HOTELSERVICE")
public interface HotelSerivce 
{
	@GetMapping("/HotelService/getData/{id}")
	public Hotel getHotelData(@PathVariable("id") String id);
}