package com.boot.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entities.Hotel;
import com.boot.repo.HotelRepo;

@Service
public class HotelService 
{
	@Autowired
	HotelRepo hr;
	
	public Hotel create(Hotel h1)
	{
		String id = UUID.randomUUID().toString();
		h1.setId(id);
		return hr.save(h1);
	}
	
	public List<Hotel> getAll()
	{
		return hr.findAll();
	}
	
	public Hotel getById(String id)
	{
		return hr.getById(id);
	}
}
