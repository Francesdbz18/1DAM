package RadioBorja.Radio ;

import java.util.Scanner;

public class Radio {
	Scanner scanner = new Scanner (System.in);
	private final static int frecuenciaMin = 80;
	private final static int frecuenciaMax = 108;
	private double frecuencia;
	private final double variacion = 0.5;
	
	public void setFrecuencia(double frecuencia) {
		while (frecuencia<frecuenciaMin || frecuencia>frecuenciaMax) {
			System.out.println("Error: frecuencia fuera del rango. Intentalo de nuevo.");
			System.out.println("Ingrese la frecuencia");
			frecuencia = scanner.nextDouble();
		}
		this.frecuencia = frecuencia;
	}
	
	
	//Get & Set
	public double getFrecuencia() {
		return frecuencia;
	}
	
	/* public void setFrecuencia() {
		this.frecuencia = frecuencia;
	} */
	
	public static int getFrecuenciaMin() {
		return frecuenciaMin;
	}
	
	public static int getFrecuenciaMax() {
		return frecuenciaMax;
	}
	
	//Metodos propios
	public double aumentarFrecuencia(double frecuencia, double variacion) {
		frecuencia = frecuencia + variacion;
		return frecuencia;
	}
	
	public double reducirFrecuencia(double frecuencia, double variacion) {
		frecuencia = frecuencia - this.variacion;
		return frecuencia;
	}
	
	public void mostrarFrecuencia() {
		System.out.println("La frecuencia es: "+frecuencia);
	}
	

}
