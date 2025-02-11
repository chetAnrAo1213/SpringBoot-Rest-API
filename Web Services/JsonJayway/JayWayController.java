package com.boot.JsonJayway;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/JayWay/api")
public class JayWayController 
{
	@Autowired
	JayWayService jws;
	
	@GetMapping("/getNews/{id}")
	public List<List<String>>  getNews(@PathVariable("id") String query)
	{
		return this.jws.getData(query);
	}
}
