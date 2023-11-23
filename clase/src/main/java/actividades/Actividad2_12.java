package actividades;
import java.util.Scanner;
@SuppressWarnings("resource")
public class Actividad2_12 {
    public static void esBisiesto (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " es bisiesto.");
        } else {
            System.out.println(year + " no es bisiesto.");
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Ingrese el año: ");
        int year = teclado.nextInt();
        esBisiesto(year);
    }
}
