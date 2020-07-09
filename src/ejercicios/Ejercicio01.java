package ejercicios;

public class Ejercicio01 {

	public static void main(String[] args) {

		// System.out.println("La suma es: " + sumar(5,10));
		// System.out.println("La resta es: " + restar(10, 5));
		
		String valor1 = "palabra";
		int valor2 = 1232342321;
		boolean valor3 = true;
		double valor4 = 0.14;
		
		String[] valor5 = {"Hola","123","A"};
		
		System.out.println("El valor de la primera posicion es: " + valor5[0]);
		System.out.println("El valor de la segunda posicion es: " + valor5[1]);
		System.out.println("El valor de la tercera posicion es: " + valor5[2]);
		
		int[] valor6 = {123, 123, 1232};
		System.out.println("El valor de la primera posicion es: " + valor6[0]);
		System.out.println("El valor de la segunda posicion es: " + valor6[1]);
		System.out.println("El valor de la tercera posicion es: " + valor6[2]);
	}


	public static int sumar(int param1, int param2) {
		int result = param1 + param2;
		return result;
	}
	
	public static int restar(int param1, int param2) {
		int result = param1 - param2;
		return result;
	}
}
