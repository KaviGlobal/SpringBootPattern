package com.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entities.Rate;
import com.demo.repositories.RateRepositories;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class CircuitPatternRateMicroServiceApplication {
	
	@Autowired
	private RateRepositories rateRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CircuitPatternRateMicroServiceApplication.class, args);
	}
	
	@PostConstruct
    public void setupData() {
      rateRepository.saveAll(Arrays.asList(
         Rate.builder().id(1).type("PERSONAL").rateValue(10.0).build(),
         Rate.builder().id(2).type("Personal").rateValue(11.0).build(),
         Rate.builder().id(3).type("HOUSING").rateValue(8.0).build(),
         Rate.builder().id(4).type("housing").rateValue(9.0).build(),
         Rate.builder().id(5).type("personal").rateValue(9.0).build(),
         Rate.builder().id(6).type("home").rateValue(19.0).build()
         
      ));
   }
	 
}
