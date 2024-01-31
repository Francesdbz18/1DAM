package tareaclase;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class Alumno extends Persona {
    private int edad;
    /**
     * Constructor vacío para Alumno.
     */
    public Alumno () {

    }
    /**
     * Constructor de alumno.
     * @param nombre
     * @param dni
     * @param fechaNacimiento
     * @param edad
     * @throws Exception
     */
    public Alumno(String nombre, String dni, String fechaNacimiento, int edad) throws Exception {
        super(nombre, dni, fechaNacimiento);
        this.edad = edad;
    }
    
    /**
     * @return edad en entero.
     */
    public int getEdad() {
        int anyo = 0, mes = 0, dia= 0;
        LocalDate fechaHoy = LocalDate.now();
		LocalDate fechaNacimiento = LocalDate.of(anyo, mes, dia);
		Period periodo = Period.between(fechaNacimiento, fechaHoy);
        edad = periodo.getYears();
        return edad;
    }

    /**
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Imprime la información del alumno.
     */
    public void imprimirAlumno () {
        String imprimir = "Nombre: " + super.getNombre() + "\nEdad: "  + getEdad() + "\n DNI:" +super.getDni() + "\n Fecha nac: " + super.getFechaNacimiento();
        JOptionPane.showMessageDialog(null, imprimir);
    }

}
