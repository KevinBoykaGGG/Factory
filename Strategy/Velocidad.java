package Strategy;

public abstract class Velocidad {

	private Motor MiMotor;
	
	public void setMiMotor(Motor m) {
		this.MiMotor=m;
		
	}
	
	public void Velocidad() {
		this.MiMotor.velocidad();
	}
}
