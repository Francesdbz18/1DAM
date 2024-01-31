package tareaclase;

import javax.swing.JOptionPane;

public class Profesor extends Persona {

    private String cuentaBancaria;
    private double nomina;

    /**
     * Constructor vacío para Profesor.
     */
    public Profesor() {

    }

    /**
     * Constructor de Profesor.
     * @param nombre
     * @param dni
     * @param cuentaBancaria
     * @param nomina
     * @param fechaNacimiento
     * @throws Exception
     */
    public Profesor(String nombre, String dni, String cuentaBancaria, double nomina, String fechaNacimiento) throws Exception {
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

    public void imprimirProfesor () {
        String imprimir = "Nombre: "+ super.getNombre() + "\n Nómina: "  + getNomina()+ "\nCuenta: " + getCuentaBancaria() + "\nFecha nac: " + super.getFechaNacimiento() + "DNI: "+ super.getDni();
        JOptionPane.showMessageDialog(null, imprimir);
    }
}
