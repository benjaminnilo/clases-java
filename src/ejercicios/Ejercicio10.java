package ejercicios;

public class Ejercicio10 {
	public static void main(String[] args) {
				
		// La diferencia entre un bucle while y Do While es que:
		// el Do while primero se ejecuta minetras que el while primero tiene la condición  
		
		int x = 25;
		int y = 25;
		
		while(y < 25) {
			y = y + 5;
			System.out.println("Lacuenta es: "+ y);
		}
		
		do {
			x = x + 5;
			System.out.println("La cuenta es: " + x);
		}while(x < 25);
	}
}
