package radiofm;
/**
* Clase RadioFM, que representa una emisora de radio con su nombre y frecuencia.
*/
public class RadioFM {
	private double frecuencia;
    private String nombre;

    /**
     * Constructor que crea un objeto RadioFM con nombre y número de frecuencia.
     * @param nombre Cadena de caracteres con el nombre de la emisora.
     * @param frecuencia Frecuencia en número de la emisora.
     */
    public RadioFM (String nombre, double frecuencia) {
        this.nombre = nombre;
        this.frecuencia = frecuencia;
    }

    /**
    * Obtiene la frecuencia de la emisora.
    * @return Frecuencia.
    */
    public double getFrecuencia() {
        return frecuencia;
    }

    /**
     * Establece la frecuencia de la emisora.
     * @param frecuencia
     */
    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }
    
    /**
    * Obtiene el nombre de la emisora.
    * @return Nombre.
    */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la emisora.
     * @param nombre
     */
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
} //fin class
