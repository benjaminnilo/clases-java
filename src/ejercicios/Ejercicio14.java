package ejercicios;

import java.util.Scanner;

import javax.xml.ws.handler.MessageContext.Scope;

public class Ejercicio14 {

//Lee un número por teclado y comprueba que este numero es mayor o igual que cero, 
//si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
	
	public static void main(String[] args) {
		int numero;
		
		Scanner scanner =  new Scanner(System.in);
		
		do {
			System.out.println("Introduce un numero: ");
			numero = scanner.nextInt();
		} while (numero<=0);
		System.out.println("El numero " + numero +  " es mayo a 0");
	}
}
