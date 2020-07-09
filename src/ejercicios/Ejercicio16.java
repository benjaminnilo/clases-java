package ejercicios;

import java.util.Scanner;

public class Ejercicio16 {
	
//	Escribe una aplicación con un String que contenga una contraseña cualquiera. 
//	Después se te pedirá que introduzcas la contraseña, con 3 intentos. 
//	Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo “Enhorabuena”. 
//	Piensa bien en la condición de salida 
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
