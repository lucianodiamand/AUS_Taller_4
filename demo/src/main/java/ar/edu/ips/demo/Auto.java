package ar.edu.ips.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Auto {

	public Auto() {
		System.out.println("Creo un auto");
	}
	
	@Autowired
	@Qualifier(value = "MotorV8")
	private Motor m;

	public void setMotor(Motor m) {
		this.m = m;
	}

	public Motor getMotor() {
		return m;
	}

	public void getSopa() {

	}

}
