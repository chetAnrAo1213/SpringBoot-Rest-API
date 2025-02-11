package com.boot.externalAPI_POST;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CensorAPIService 
{

	
	
	RestTemplate rst;
	
	public CensorAPIService(@Qualifier("restTemplateCensor") RestTemplate rst) {
		super();
		this.rst = rst;
	}

	public CensorAPIResponse getCensoredWords(String sentence) 
	{
        String url = CensorAPI.API_URL;
        
        HttpHeaders headers = new HttpHeaders();
        headers.add("apikey", CensorAPI.API_KEY);
        headers.setContentType(MediaType.TEXT_PLAIN); 
        
        String RequestBody = sentence;
        
        HttpEntity<String> entity = new HttpEntity<>(RequestBody, headers);

        ResponseEntity<CensorAPIResponse> response = rst.exchange(url, HttpMethod.POST, entity, CensorAPIResponse.class);

        return response.getBody();
    }

}
