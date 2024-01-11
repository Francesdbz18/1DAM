package tareaindividuo;

public class Individuo { //TODO: edad, altura
    private String dni;
    private String nombre;
    private int fechaNacimiento;
    private static int poblacion;

    public Individuo (String dni, String nombre, int fechaNacimiento) {
        super();
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        poblacion++;
    }
    public String getDni() {
        return dni;
    }
    public void setDni() {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre() {
        this.nombre = nombre;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento() {
        this.fechaNacimiento = fechaNacimiento;
    }

    public static int getPoblacion () {
        return poblacion;
    }
    public static void setPoblacion() {
        Individuo.poblacion = poblacion;
    }
}