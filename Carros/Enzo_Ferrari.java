package Carros;

import Strategy.Motor600;
import Strategy.Motor900;
import Strategy.VelocidadFerrari;

public class Enzo_Ferrari implements Carros {
	
	VelocidadFerrari vf = new VelocidadFerrari();
	
	@Override
	public void marca() {
		System.out.println("Marca: Ferrari");
		
	}

	@Override
	public void velocidad(String Motor) {
		
		if (Motor == "Motor600") {
			System.out.println(Motor);
			vf.setMiMotor(new Motor600());
			vf.Velocidad();
		}
		else {
			System.out.println(Motor);
			vf.setMiMotor(new Motor900());
			vf.Velocidad();
		}
		
		
	}

	@Override
	public String tipo() {
		
		return "Enzo Ferrari";
	}
	

}
