package actividades;

import java.util.Scanner;
@SuppressWarnings("resource")

public class Actividad03 {
    public static String rangoIM() {
        String enrango;
        char a;
        Scanner teclado = new Scanner (System.in);
        System.out.print("Introduzca la primera letra: ");
        a = teclado.next().charAt(0);
        if ((a>104&&a<110) || (a > 72 && a < 78) ) {
            enrango = "Está dentro del rango.";
        } else {
            enrango = "No está dentro del rango.";
        }
        return enrango;
    }
    public static void main (String[] args) {
        String rango = rangoIM();
        System.out.println(rango);
    }
}
