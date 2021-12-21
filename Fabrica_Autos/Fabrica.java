package Fabrica_Autos;

import Carros.Carros;
import Carros.Enzo_Ferrari;
import Carros.Mustang;

public class Fabrica {

	public static Carros Construir(String tipo) {

		switch (tipo) {

		case "Ferrari":
			return new Enzo_Ferrari();
		case "Mustang":
			return new Mustang();

		default:
			return null;
		}

	}

}
