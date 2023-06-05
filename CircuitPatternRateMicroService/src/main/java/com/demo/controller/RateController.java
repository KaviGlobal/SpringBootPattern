package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Rate;
import com.demo.service.RateService;

@RestController
public class RateController {
	
	@Autowired
	private RateService rateService;
	
	@GetMapping(path = "/rates/{type}") 
	//@PathVariable --> Annotation can be used to handle template variables in the request URI mapping 
	//and set them as method parameters
	 public Rate getInterestRatesByType(@PathVariable("type") String type) {
		return rateService.getInterestRatesByType(type);
	 }
	
}
