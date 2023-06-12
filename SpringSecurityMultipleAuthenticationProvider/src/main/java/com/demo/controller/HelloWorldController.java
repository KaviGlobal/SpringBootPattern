package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class HelloWorldController {

	@GetMapping(path = "/hello/{type}")
	// @PathVariable --> Annotation can be used to handle template variables in the request URI mapping
	// and set them as method parameters
	public String sayHello(@PathVariable("type") String type) {
		return "hello " + type;
	}

}
