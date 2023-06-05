package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.data.InterestRate;
import com.demo.service.LoanService;


@RestController
public class LoanController {
	
	@Autowired
	private LoanService loanService;
	
	@GetMapping(path = "/loan/getLoansRateByType")	
	 public InterestRate getInterestRatesByType(@RequestParam("type") String type) {
		return loanService.getInterestRatesByType(type);
	 }
	
}
