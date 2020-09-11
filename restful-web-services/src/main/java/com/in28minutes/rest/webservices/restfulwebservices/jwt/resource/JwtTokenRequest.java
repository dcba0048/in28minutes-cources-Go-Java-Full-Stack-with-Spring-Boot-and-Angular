package com.in28minutes.rest.webservices.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class JwtTokenRequest implements Serializable {

	private static final long serialVersionUID = -5616176897013108345L;

	private String username;
	private String password;
	
//	{"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU5ODYwMDU5MiwiaWF0IjoxNTk3OTk1NzkyfQ.FpI0wNnmOGe_gam1AXHquSZqIvfTSW7h36S8FSu5zMBjUPPj09pcBQKZGsHkDQAOsw5mtm1KrJlerWs61UbO8w"}

	public JwtTokenRequest() {
		super();
	}

	public JwtTokenRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}