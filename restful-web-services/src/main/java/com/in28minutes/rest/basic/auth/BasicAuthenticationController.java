package com.in28minutes.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {

	// http://localhost:8080/hello-world-bean
	@GetMapping(path = "/basicauth")
	public AuthenticationBean helloWorldBean() {
//		throw new RuntimeException("Some error has Happened! Contact Support at ***-***");
		return new AuthenticationBean("You are authenticated");
	}
	
}
