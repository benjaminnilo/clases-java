package ejercicios;

public class Ejercicio05 {
	public static void main(String[] args) {
			
		String sDia = "Jueves";
		
		int iDia = 6; 
		
		if(iDia==1) {
			System.out.println("Hoy es lunes");
		}else if(iDia==2){
			System.out.println("Hoy es Martes");
		}else if(iDia==3){
			System.out.println("Hoy es Miercoles");
		}else if(iDia==4){
			System.out.println("Hoy es Jueves");
		}else if(iDia==5){
			System.out.println("Hoy es Viernes");
		}else if(iDia==6){
			System.out.println("Hoy es Sabado");
		}else {
			System.out.println("Hoy es Domingo");
		}
		
		switch (sDia) {
		case "Lunes":
			System.out.println("Hoy es lunes");
			break;
		case "Martes":
			System.out.println("Hoy es Martes");
			break;
		case "Miercoles":
			System.out.println("Hoy es Miercoles");
			break;
		case "Jueves":
			System.out.println("Hoy es Jueves");
			break;
		case "Viernes":
			System.out.println("Hoy es Viernes");
			break;
		case "":
			System.out.println("Hoy es Sabado");
			break;

		default:
			System.out.println("Hoy es Domingo");
			break;
		}
		
	}
}
