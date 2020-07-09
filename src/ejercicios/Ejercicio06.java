package ejercicios;

public class Ejercicio06 {
	public static void main(String[] args) {
	
		String[] marca = {"BMW","Toyota","Nissan","Kia","Fiat", "For"};
		
		int iLength = marca.length;
		System.out.println("La longitud del array es: " + iLength);
		
		String sBMW = marca[0];
		System.out.println("El primer valor del array es: " + sBMW);
		
		String Fiat = marca[4];
		System.out.println("El ultimo valor del array es: " + Fiat);
		
		String ultimoValor = marca[marca.length -1];
		System.out.println("El ultimo valor del array es: " + ultimoValor);
		
		for(int i=0; i<= marca.length -1; i++) {
			System.out.println("La posición "+ i +" es la siguiente marca: " + marca[i]);
		}
	}
}
