package tareaindividuo;

public class Individuo { //TODO: edad, altura
    private String dni;
    private String nombre;
    private int fechaNacimiento;
    private static int poblacion;
    private static int edad;
    private double altura;

    public Individuo (String dni, String nombre, int fechaNacimiento, int anyo, double altura) {
        super();
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        poblacion++;
        edad = anyo - fechaNacimiento;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public static int getPoblacion () {
        return poblacion;
    }
    public static void setPoblacion(int poblacion) {
        Individuo.poblacion = poblacion;
    }

    public int getEdad () {
        return edad;
    }

    public static void setEdad(int edad) {
        Individuo.edad = edad;
    }

    public double getAltura () {
        return altura;
    }
    public void setAltura (double altura) {
        this.altura = altura;

    }

}