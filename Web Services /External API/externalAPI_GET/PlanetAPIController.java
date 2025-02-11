package com.boot.externalAPI_GET;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ExternalAPI/api")
public class PlanetAPIController 
{
	
	@Autowired
	PlanetAPIService api;
	
	@GetMapping("/PlanetDataOf/{name}")
	public  List<PlanetAPIResponse> getData(@PathVariable("name") String name)
	{
		 return api.getPlanetData(name);
		
	}
	
}
