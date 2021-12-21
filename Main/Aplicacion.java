package Main;

import java.util.Scanner;

import Carros.Carros;
import Fabrica_Autos.Fabrica;

public class Aplicacion {

	public static void main(String[] args) {

		int opcion = 0;
		int motor = 0;
		String auto1 = "Ferrari";
		String auto2 = "Mustang";
		String Motor600 = "Motor600";
		String Motor900 = "Motor900";
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("\nBIENVENIDO A LA AGENCIA FORD/FERRAR\n\n");
			System.out.println("\nSELECCION DE AUTO\n1)Enzo Ferrari\n2)Mustang\nOpcion: ");
			opcion = entrada.nextInt();

			switch (opcion) {

			case 1:
				Carros c = Fabrica.Construir(auto1);

				do {
					System.out.println("\nSELECCION DE MOTOR\n1)Motor 600\n2)Motor 900\nOpcion: ");
					motor = entrada.nextInt();
					
					System.out.println("\n\n Detalles generales\n");
					switch (motor) {

					case 1:
						c.marca();
						c.velocidad(Motor600);
						break;

					case 2:
						c.marca();
						c.velocidad(Motor900);
						break;

					default:
						motor = 0;
					}
				} while (motor <= 0);

				System.out.println("Tipo: " + c.tipo());

				break;
			case 2:
				Carros c2 = Fabrica.Construir(auto2);
				
				do {
					System.out.println("\nSELECCION DE MOTOR\n1)Motor 600\n2)Motor 900\nOpcion: ");
					motor = entrada.nextInt();
                    
					System.out.println("\n\n Detalles generales\n");
					switch (motor) {

					case 1:
						c2.marca();
						c2.velocidad(Motor600);
						break;

					case 2:
						c2.marca();
						c2.velocidad(Motor900);
						break;

					default:
						motor = 0;
					}
				} while (motor <= 0);

				System.out.println("Tipo: " + c2.tipo());
				break;
			default:
				opcion = 0;
			}

		} while (opcion <= 0);

	}

}
