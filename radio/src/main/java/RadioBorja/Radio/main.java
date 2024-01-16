package RadioBorja.Radio;

import java.util.Scanner;

public class main {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Radio radioFM = new Radio();
		
		System.out.println("Introduzca la frecuencia deseada: ");
		double frecuenciaInicial = scanner.nextDouble();
		radioFM.setFrecuencia(frecuenciaInicial);
		int tipo = 0;
		
		/*System.out.println("¿Qué tipo de radio quieres?, Elige 1 para AM o 2 para FM");
		tipo = scanner.nextInt();*/
		
		do {
			System.out.println("1. Subir frecuencia");
			System.out.println("2. Bajar frecuencia");
			System.out.println("3. Mostrar frecuencia");
			System.out.println("4. Salir");
			System.out.println("Ingrese una opcion");
			
			switch(tipo) {
			case 1:
				radioFM.aumentarFrecuencia(frecuenciaInicial, tipo);
			break;
			case 2:
				radioFM.reducirFrecuencia(frecuenciaInicial, tipo);
			break;
			case 3: System.out.println("Frecuencia actual: "+radioFM.getFrecuencia()+"FM");
			break;
			case 4:
				System.out.println("Saliendo del programa");
			break;
			default:
				System.out.println("Opcion invalida. Intentelo de nuevo.");
			
			}
		}while (tipo!=4);
		
		
	}


}
