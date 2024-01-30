package tareaclase;

import java.time.LocalDate;
import java.time.Period;

public class Alumno extends Persona {
    private int edad;

    public Alumno(String nombre, String dni, String fechaNacimiento, int edad) throws Exception {
        super(nombre, dni, fechaNacimiento);
        this.edad = edad;
    }
    
    public int getEdad() {
        int anyo = 0, mes = 0, dia= 0;
        LocalDate fechaHoy = LocalDate.now();
		LocalDate fechaNacimiento = LocalDate.of(anyo, mes, dia);
		Period periodo = Period.between(fechaNacimiento, fechaHoy);
        edad = periodo.getYears();
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
