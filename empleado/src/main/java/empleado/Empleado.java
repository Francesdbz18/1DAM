package empleado;

public class Empleado {
    private String nombre;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado () {

    }

    public Empleado (String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
}
