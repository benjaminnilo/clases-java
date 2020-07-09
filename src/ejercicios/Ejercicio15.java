package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio15 {
	public static void main(String[] args) {
		int numero;
		
		do {
			
			String texto= JOptionPane.showInputDialog("Introduce un numero");
			numero=Integer.parseInt(texto);
			
		} while (numero<=0);
		System.out.println("El numero " + numero +  " es mayo a 0");
	}
}
