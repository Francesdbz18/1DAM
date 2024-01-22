package herencia;

public class Profesor extends Persona {
    enum especialidad {INFORMATICA,ADMIN,FINANZAS};
    private especialidad especialidad;

    public Profesor(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.especialidad = especialidad;

    }

    public especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
