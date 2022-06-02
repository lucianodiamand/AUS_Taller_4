package ar.edu.ips.taller4.tpback.tpback.controllers;

import java.util.Set;

import lombok.Data;

@Data
public class SignupRequest {

	private String username;
	
	private String email;

	private String password;
	
	private Set<String> role;

}
