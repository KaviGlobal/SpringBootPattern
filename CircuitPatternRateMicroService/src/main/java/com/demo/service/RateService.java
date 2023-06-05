package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.demo.entities.Rate;
import com.demo.repositories.RateRepositories;

@Service
public class RateService {
	
	@Autowired
	private RateRepositories rateRepositories;
	
	 public Rate getInterestRatesByType(@PathVariable("type") String type) {
		 return rateRepositories.findByType(type).orElseThrow(()->new RuntimeException("Rate Not Found: " + type));
	 }
	
}
