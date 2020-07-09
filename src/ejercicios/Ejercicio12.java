package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
// Pide 2 números y muestra cual es el mayor, el menor, o si son iguales
	
	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un numero");
		num1 = scanner.nextInt();
		
		System.out.println("Introduce otro numer");
		num2 = scanner.nextInt();
		
		if (num1==num2) {
			System.out.println("son iguales");
		}else if (num1>num2) {
			System.out.println("El mayor es: " + num1);
		}else {
			System.out.println("El menor es: " + num1);
		}
	}

}
