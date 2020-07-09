package ejercicios;

import java.util.Scanner;

public class Ejercicio16 {
	
//	Escribe una aplicaci�n con un String que contenga una contrase�a cualquiera. 
//	Despu�s se te pedir� que introduzcas la contrase�a, con 3 intentos. 
//	Cuando aciertes ya no pedir� mas la contrase�a y mostrara un mensaje diciendo��Enhorabuena�. 
//	Piensa bien en la condici�n de salida 
//	(3 intentos y si acierta sale, aunque le queden intentos).
	
	public static void main(String[] args) {

		String clave = "holaMundo";
		String pass;
		
		boolean acierto = false;
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 3 && !acierto ; i++) {
			System.out.println("Introduce la clave: ");
			pass = scanner.next();
			
			if (pass.equals(clave)) {
				System.out.println("Enhorabuena");
				acierto=true;
			}
		}
	}
}
