package com.boot.service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.boot.entites.Hotel;
import com.boot.entites.Rating;
import com.boot.entites.UserEntity;
import com.boot.feign.HotelSerivce;
import com.boot.feign.RatingService;
import com.boot.repo.UserRepo;
import com.netflix.discovery.converters.Auto;

@Service
public class UserService 
{
	@Autowired
	UserRepo ur;
	
	@Autowired
	RestTemplate res;
	
	@Autowired
	HotelSerivce hs;
	
	@Autowired
	RatingService rs;
	
	public UserEntity saveUser(UserEntity ue)
	{
		String unqId = UUID.randomUUID().toString();
		ue.setUserId(unqId);
		return ur.save(ue);
	}
	
	public List<UserEntity> getAllUsers()
	{
		return ur.findAll();
	}
	
	public UserEntity getUserById(String id)
	{
		UserEntity user =  ur.getUserById(id);
		//Rating[] ratingArray = res.getForObject("http://MICROSERVICES-T1-RATINGSERVICE/RatingService/getRatingByUserId/"+id, Rating[].class);		
		Rating[] ratingArray = rs.getData(id);		
		List<Rating> ratings = Arrays.asList(ratingArray);
		
		for(Rating i:ratings)
		{
			//Hotel data = res.getForObject("http://MICROSERVICES-T1-HOTELSERVICE/HotelService/getData/" + i.getHotelId(),Hotel.class);
			Hotel data = hs.getHotelData(i.getHotelId());
			i.setHotel(data);
		}
		user.setRatings(ratings);
		return user;
	}
}
