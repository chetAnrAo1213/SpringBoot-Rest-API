package com.boot.JsonJayway;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jayway.jsonpath.JsonPath;

@Service
public class JayWayService 
{

	RestTemplate rest;

	public JayWayService(@Qualifier("restTemplateJayWay") RestTemplate rest) {
		super();
		this.rest = rest;
	}
	
	
	public List<List<String>> getData(String query)
	{
		String url = JayWayAPI.url+query;
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-ACCESS-KEY", JayWayAPI.API_KEY);
		
		HttpEntity<String> entity = new HttpEntity<>(headers);
		
		ResponseEntity<String> json = rest.exchange(url, HttpMethod.GET,entity,String.class);
		String json_Response = json.getBody();
	
		return jsonToRaw(json_Response);
	}
	
	
	public List<List<String>> jsonToRaw(String json)
	{
	   
	    List<String> RawTitle = JsonPath.read(json, "$..results[*].title");
	    List<String> RawUrl = JsonPath.read(json, "$..results[*].source_url");

	    
	    List<List<String>> response = new ArrayList<>();
	    response.add(RawTitle); 
	    response.add(RawUrl);    
	    
	    return response;
	}

	
}
