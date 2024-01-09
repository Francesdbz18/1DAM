package tareaindividuo;

public class Individuo {
    private String dni;
    private String nombre;
    private int fechaNacimiento;
    private int poblacion;

    public Individuo (String dni, String nombre, int fechaNacimiento) {
        super();
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        poblacion++;
    }
}