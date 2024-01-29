package tareaclase;

import java.time.LocalDateTime;

public class Alumno extends Persona {
    private LocalDateTime edad;

    public Alumno() {}

    public Alumno(String nombre, String dni, LocalDateTime fechaNacimiento, LocalDateTime edad) throws Exception {
        super(nombre, dni, fechaNacimiento);
        this.edad = edad;
    }
    
    public LocalDateTime getEdad() {
        return edad;
    }

    public void setEdad(LocalDateTime edad) {
        this.edad = edad;
    }

}
