package herencia;

public class Main {
    public static void main(String[] args) {
        Alumno borjita = new Alumno("Borja", "777", 21, 69420);
        System.out.println(borjita.nombre+" "+borjita.apellido+", "+borjita.edad+", "+ borjita.getNIA());
    }
}