package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class HelloWorldController {

	@Autowired
	LdapTemplate ldapTemplate;
	
	@GetMapping(path = "hello")
	// @PathVariable --> Annotation can be used to handle template variables in the request URI mapping
	// and set them as method parameters
	public String sayHello() {
		return "hello " + ldapTemplate.getContextSource().getReadOnlyContext().DNS_URL;
	}

}
