package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.data.InterestRate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class LoanService {

	@Autowired
	private RestTemplate restTemplate;

	private static final String SERVICE_NAME = "loan-service";
	private static final String RATE_SERVICE_URL = "http://localhost:9001/rates/";
	
	@CircuitBreaker(name = SERVICE_NAME, fallbackMethod = "getDefaultLoans")
	public InterestRate getInterestRatesByType(String type) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<InterestRate> entity = new HttpEntity<>(null, headers);
		ResponseEntity<InterestRate> response = restTemplate.exchange((RATE_SERVICE_URL + type), HttpMethod.GET, entity,
				InterestRate.class);
		return response.getBody();
	}
	
	public InterestRate getDefaultLoans(Exception e) {
	    return new InterestRate();
	}

}
