package ejercicios;

public class Ejercicio08 {
	public static void main(String[] args) {
		
		for (int i = 0; i<=10; i++) {
			if(i > 5) {
				break;
			}
			System.out.println("el valor de i es: " + i);
		}
		System.out.println("\nHas salido del bucle");
	}
}
