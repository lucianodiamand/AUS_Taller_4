package ar.edu.ips.demo;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "MotorV8")
@Scope(value="singleton")
public class MotorV8 implements Motor {

	public MotorV8() {
		System.out.println("Creo un motor V8");
	}
	
	@Override
	public int getCantidadValvulas() {
		return 8;
	}

}
