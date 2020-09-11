package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderTest {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		for(int i=1; i<=10; i++) {
			String encodedString = encoder.encode("password@!23#!");// password for ranga username
//			String encodedString = encoder.encode("dummy");// password for in28minutes username
			System.out.println(encodedString);
		}
		
		
	}
}
