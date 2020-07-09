package ejercicios;

public class Ejercicio07 {
	public static void main(String[] args) {
		
		System.out.println("\nDe menor a mayor\n");

		for (int increment=0; increment<=3; increment++) {
			System.out.println("El valor es: " + increment);
		}
		
		System.out.println("\nDe mayor a menor\n");
		
		for (int decrement=5; decrement>=0; decrement--) {
			System.out.println("El valor es: " + decrement);
		}
		
		System.out.println("\nSaltar de 2 en 2\n");
		
		for (int i=0; i<=10; i+=2) {
			System.out.println("El valor es: " + i);
		}
	}
}
