package com.boot.externalAPI_GET;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PlanetAPIService 
{


	RestTemplate rst;
	
	public PlanetAPIService(@Qualifier("restTemplatePlanet")RestTemplate rst) {
		super();
		this.rst = rst;
	}

	public List<PlanetAPIResponse> getPlanetData(String name) {
        String url = PlanetsAPI.API_URL + name;
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Api-Key", PlanetsAPI.API_KEY);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<List<PlanetAPIResponse>> response = rst.exchange(url, HttpMethod.GET, entity, new ParameterizedTypeReference<List<PlanetAPIResponse>>() {});

        return response.getBody();
    }

}
