package ejercicios;

import java.util.Scanner;

import javax.xml.ws.handler.MessageContext.Scope;

public class Ejercicio14 {

//Lee un n�mero por teclado y comprueba que este numero es mayor o igual que cero, 
//si no lo es lo volver� a pedir (do while), despu�s muestra ese n�mero por consola.
	
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
