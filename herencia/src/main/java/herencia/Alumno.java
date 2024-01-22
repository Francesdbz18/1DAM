package herencia;

public class Alumno extends Persona {
    private int NIA;

    public Alumno(String nombre, String apellido, int edad, int NIA) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.NIA = NIA;
    }

    public int getNIA() {
        return NIA;
    }

    public void setNIA(int NIA) {
        this.NIA = NIA;
    }

    public void imprimirCabecera() {
        System.out.println("________________________________________________________");
        System.out.println("|       ALUMNO          | EDAD |            NIA        |");
        System.out.println("________________________________________________________");
    }

    public void imprimirAlumno() {
        System.out.println();
    }
}
