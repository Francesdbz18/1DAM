package radiofm;

public class RadioFM {
	private double frecuencia;
    private String nombre;

    public RadioFM () {

    }
    public RadioFM (String nombre, double frecuencia) {
        this.nombre = nombre;
        this.frecuencia = frecuencia;
    }

    public double getFrecuencia() {
        return frecuencia;
    }
    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }
    	
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /* EMISORAS:
     * - HIT FM: 89.9 FM
     * - CADENA DIAL: 91.7 FM
     * - LOS40 DANCE: 92.4 FM
     * - RADIO MARCA: 103.5 FM
     * - BOM RADIO: 105.1 FM
     * - COPE: 106.3 FM
     */

     // Robao: Radio.inicio=(Radio.inicio+1+radio.length)% radio.length; System.out.println("Emisora: "+radio[Radio.inicio].getNombre()+" su frecuencia es: "+radio[Radio.inicio].getFrecuencia());
}
