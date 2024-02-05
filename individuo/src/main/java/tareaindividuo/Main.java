package tareaindividuo;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception{
        /* Individuo alumno1 = new Individuo("111111", "Juanito Alimaña", 1975, 2024, 1.8);
        Individuo alumno2 = new Individuo("111011", "Pedro Navaja", 1945, 2024, 1.8);
        Individuo alumno3 = new Individuo("111111", "Madame Kalalú", 1985, 2024, 1.8);
        Individuo alumno4 = new Individuo("111111", "Ligia Elena", 1969, 2024, 1.80);
        System.out.println("Población: "+Individuo.getPoblacion());
        System.out.println(alumno4.getEdad()); */

        DNI juan = new DNI();
        juan.establecer(JOptionPane.showInputDialog("Introduzca su DNI"));
        System.out.println("El NIF es: "+juan.obtenerNIF());

        DNI sara = new DNI();
        sara.establecer(Integer.parseInt(JOptionPane.showInputDialog("Introduzca su NIF")));
        String NIF = sara.obtenerNIF();
        System.out.println(NIF);
    }
}
