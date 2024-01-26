package herencia;

public class Profesor extends Persona {
    enum especialidad {INFORMATICA,ADMIN,FINANZAS};
    private especialidad especialidad;

    public Profesor(String nombre, String apellido, int edad, especialidad especialidad) {
        super(nombre, apellido, edad);
        this.especialidad = especialidad;

    }

    public especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public void imprimirCabecera() {
        System.out.println("________________________________________________________");
        System.out.println("|      PROFESOR        | EDAD |         ESPECIALIDAD   |");
        System.out.println("________________________________________________________");
    }

    public void imprimirProfesor () {
        System.out.println(super.getNombre() + " " + super.getApellido() + ", " + super.getEdad() + ", " + this.especialidad);
    }
    @Override
    public String toString() {
        return "info. del profesor: \nNombre y Apellido: "+ super.getNombre() + " " + super.getApellido()+"\nEdad: "+ super.getEdad() + "\nEspecialidad: " + especialidad;
    }  
}
