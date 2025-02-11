package com.boot.externalAPI_POST;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ExternalAPI/api")
public class CensorAPIController 
{
	
	@Autowired
	CensorAPIService api;
	
	@PostMapping("/censoredData")
	public  CensorAPIResponse passRawData(@RequestBody String sentence)
	{
		 return api.getCensoredWords(sentence);
		
	}
	
}
