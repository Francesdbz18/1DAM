package tareaclase;

public class Persona {
    protected String nombre;
    protected String dni;
    protected String fechaNacimiento;

    public Persona () {}
// fechaNacimiento debe ser LocalDateTime...
    public Persona(String nombre, String dni, String fechaNacimiento) throws Exception {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
