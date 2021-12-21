package Carros;

public interface Carros {
	
	//compania que lo fabrica//
	public void marca();
	//depende del tipo de motor//
	public void velocidad(String Motor);
	//Nombre del auto que fabrica//
	public String tipo();

}
