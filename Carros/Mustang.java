package Carros;

import Strategy.Motor600;
import Strategy.Motor900;
import Strategy.VelocidadMustang;

public class Mustang implements Carros {
	
	VelocidadMustang vm = new VelocidadMustang();

	@Override
	public void marca() {
		System.out.println("Marca: Ford");
		
	}

	@Override
	public void velocidad(String Motor) {
		
			if (Motor == "Motor600") {
				System.out.println(Motor);
				vm.setMiMotor(new Motor600());
				vm.Velocidad();
			}
			else {
				System.out.println(Motor);
				vm.setMiMotor(new Motor900());
				vm.Velocidad();
			}	
		
	}
	
	@Override
	public String tipo() {
		
		return "Mustang";
	}
	

}
