package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		int numero;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		numero = scanner.nextInt();
		
		if (numero < 0) {
			System.out.println("El numero " + numero + " es negativo\n");
		}else {
			System.out.println("El numero " + numero + " es positivo\n");
		}
		
		if(numero%2==0){
			System.out.println("El numero " + numero + " es par\n");
		}else {
			System.out.println("El numero " + numero + " es impar\n");
		}
	}
	
	// Pide 2 números y muestra cual es el mayor, el menor, o si son iguales

}
