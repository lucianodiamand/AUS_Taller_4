package ar.edu.ips.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.ips.demo.Auto;

@RestController
public class AutoRest {

	@Autowired
	private Auto auto;
	
	@GetMapping("/auto")
	public Auto getAuto() {
		return auto;
	}

}
