package com.naga.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class IBANController {

	
	  @Value("${message:Default Hello}") private String message;
	  
	  @GetMapping("/msg") private String getMessage() { return "Hi...."+message; }
	  
	  @Value("${user.role:Default Role}") private String role;
	  
	  
	  
	  @GetMapping(value="/whoami/{username}") public String
	  whoamI(@PathVariable("username") String username) { return "Hello "+username+
	  " role "+role; }
	 
//	@Value("${database.url}")
	@Value("${user.role:Default Role}")
	private String url;
	@Value("${database.username}")
	private String username;
	@Value("${database.password}")
	private String password;
	@Value("${database.environment}")
	private String env;
	
	@GetMapping("/database")
	private String getDatabaseDetails() {
		return "url is : "+url;
	}
}
