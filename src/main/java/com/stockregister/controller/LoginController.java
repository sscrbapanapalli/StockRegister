package com.stockregister.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stockregister.model.Login;
@RestController
@RequestMapping("/login")
public class LoginController {
	
	 @RequestMapping("/")
	    String hello() {
	        return "Hello World Spring Boot!";
	    }
	 @CrossOrigin(origins = "http://localhost:4200")
	 @RequestMapping(method = RequestMethod.POST, value = "/login", consumes = "application/json")
	 public ResponseEntity <String> login(@RequestBody Login session) {
			//ApiResponse<String> response = sessionManagerService.stopSession(sessionState);
		  if("Ramesh".equalsIgnoreCase(session.getUserName()) && "Ramesh".equalsIgnoreCase(session.getPassword()))
			return new ResponseEntity<String>("Successghfgjh", HttpStatus.OK);
		 else
			 return new ResponseEntity<String>("Failure", HttpStatus.NOT_FOUND);
		}

}
