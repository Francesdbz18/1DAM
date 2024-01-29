package tareaclase;

import java.time.LocalDateTime;

public class Profesor extends Persona {

    private String cuentaBancaria;
    private double nomina;

    public Profesor() {

    }
    public Profesor(String nombre, String dni, LocalDateTime fechaNacimiento, String cuentaBancaria, double nomina) throws Exception {
        super(nombre, dni, fechaNacimiento);
        this.cuentaBancaria = cuentaBancaria;
        this.nomina = nomina;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public double getNomina() {
        return nomina;
    }

    public void setNomina(double nomina) {
        this.nomina = nomina;
    }

    
}
