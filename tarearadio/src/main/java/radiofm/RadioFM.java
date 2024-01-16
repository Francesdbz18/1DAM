package radiofm;

import java.util.Scanner;

public class RadioFM {
	private final static int frecuenciaMin = 80;
	private final static int frecuenciaMax = 108;
	private double frecuencia;
	private final double variacion = 0.5;
	
	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}
	
	
	//Get & Set
	public double getFrecuencia() {
		return frecuencia;
	}
	
	public void setFrecuencia() {
		this.frecuencia = frecuencia;
	}
	
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
		frecuencia = frecuencia - variacion;
		return frecuencia;
	}
	
	public void mostrarFrecuencia() {
		System.out.println("La frecuencia es: "+frecuencia);
	}

    /* EMISORAS:
     * - RADIO MARCA: 103.5 FM
     * - HIT FM: 89.9 FM
     * - CADENA DIAL: 91.7 FM
     * - BOM RADIO: 105.1 FM
     * - COPE: 106.3 FM
     * - LOS40 DANCE: 92.4 FM
     */
}
