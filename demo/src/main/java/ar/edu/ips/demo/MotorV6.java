package ar.edu.ips.demo;

import org.springframework.stereotype.Component;

@Component(value = "MotorV6")
public class MotorV6 implements Motor {

	public MotorV6() {
		System.out.println("Creo un motor V6");
	}
	
	@Override
	public int getCantidadValvulas() {
		return 6;
	}

}
